package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();

        Controller controller = loader.getController();
        controller.listArtists();

        primaryStage.setTitle("MusicDB-JFX");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception
    {
        super.init();

        if(!DataSource.getInstance().open())
        {
            System.out.println("Couldn't connect to DataBase.");
            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception
    {
        super.stop();
        DataSource.getInstance().close();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
