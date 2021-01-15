package toDoList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller
{
    private List<ToDoItem> toDoItems;

    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    @FXML
    private BorderPane mainBorderPane;

    public void initialize()
    {
//        toDoItems = new ArrayList<>();
//
//        ToDoItem item1 = new ToDoItem("Item Description One", "Item Details One",
//                LocalDate.of(2021, Month.JANUARY, 1));
//
//        ToDoItem item2 = new ToDoItem("Item Description Two", "Item Details Two",
//                LocalDate.of(2021, Month.FEBRUARY, 2));
//
//        ToDoItem item3 = new ToDoItem("Item Description Three", "Item Details Three",
//                LocalDate.of(2021, Month.MARCH, 3));
//
//        ToDoItem item4 = new ToDoItem("Item Description Four", "Item Details Four",
//                LocalDate.of(2021, Month.APRIL, 4));
//
//        ToDoItem item5 = new ToDoItem("Item Description Five", "Item Details Five",
//                LocalDate.of(2021, Month.MAY, 5));
//
//        toDoItems.add(item1);
//        toDoItems.add(item2);
//        toDoItems.add(item3);
//        toDoItems.add(item4);
//        toDoItems.add(item5);
//
//        ToDoData.getInstance().setToDoItemsList(toDoItems);

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>()
        {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem oldValue, ToDoItem newValue)
            {
                if(newValue != null)
                {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());

                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d MMMM, yyyy");
                    deadlineLabel.setText(dateFormat.format(item.getDeadline()));
                }
            }
        });

        // this replaces >> onMouseClicked="#handleClickListView" << on line 14 from the fxml file - ListView
        // and the commented code a few lines down
        // it also fixes the error that was popping up when clicking on blank spaces with >> if(newValue != null) <<

        // toDoListView.getItems().setAll(toDoItems);
        // toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItemsObservableList());
        toDoListView.setItems(ToDoData.getInstance().getToDoItemsObservableList()); // replaces previous line
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void showNewItemDialog()
    {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New Item");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("toDoDialog.fxml"));

        try
        {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }
        catch(IOException e)
        {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK)
        {
            DialogController dialogController = fxmlLoader.getController();
            dialogController.processResults();
            // toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItemsObservableList()); // handled by observableList
            System.out.println("OK pressed");
        }
        else
        {
            System.out.println("Cancel pressed");
        }
    }

    public void handleClickListView()
    {
        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
    }
}
