package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    public void initialize() // on first run name field is empty
    {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    public void onButtonClicked(ActionEvent e)
    {
        if(e.getSource().equals(helloButton))
        {
            System.out.println("Hello, " + nameField.getText());
        }
        else if(e.getSource().equals(byeButton))
        {
            System.out.println("Goodbye, " + nameField.getText());
        }
        System.out.println("The following button was pressed: " + e.getSource());
    }

    public void handleKeyReleased() // checks if name field is empty and if true - disables buttons
    {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        // .trim() deletes empty spaces, so that the buttons don't activate on a spacebar

        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}
