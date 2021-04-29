package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableView;

public class Controller
{
    @FXML
    private TableView artistTable;

    @FXML
    private ProgressBar progressBar;

    @FXML
    public void listArtists()
    {
        Task<ObservableList<Artists>> task = new GetAllArtistsTask();
        artistTable.itemsProperty().bind(task.valueProperty());

        progressBar.progressProperty().bind(task.progressProperty());
        progressBar.setVisible(true);

        task.setOnSucceeded(e -> progressBar.setVisible(false));
        task.setOnFailed(e -> progressBar.setVisible(false));

        new Thread(task).start();
    }

    @FXML
    public void listAlbumsForArtists()
    {
        final Artists artists = (Artists) artistTable.getSelectionModel().getSelectedItem();
        if(artists == null)
        {
            System.out.println("NO ARTIST SELECTED");
            return;
        }

        Task<ObservableList<Albums>> task = new Task<ObservableList<Albums>>()
        {
            @Override
            protected ObservableList<Albums> call()
            {
                return FXCollections.observableArrayList(DataSource.getInstance()
                        .queryAlbumsForArtistId(artists.getId()));
            }
        };

        artistTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();

    }

    @FXML
    public void updateArtist()
    {
        final Artists artists = (Artists) artistTable.getItems().get(2);

        Task<Boolean> task = new Task<Boolean>()
        {
            @Override
            protected Boolean call() throws Exception
            {
                return DataSource.getInstance().updateArtistName(artists.getId(), "AC/DC");
            }
        };

        task.setOnSucceeded(e -> {
            if(task.valueProperty().get())
            {
                artists.setName("AC/DC");
                artistTable.refresh();
            }
        });

        new Thread(task).start();
    }
}

class GetAllArtistsTask extends Task
{
    @Override
    public ObservableList<Artists> call()
    {
        return FXCollections.observableArrayList(DataSource.getInstance().queryArtists(DataSource.ORDER_BY_ASC));
    }
}
