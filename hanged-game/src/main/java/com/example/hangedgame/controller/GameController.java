import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;

public class GameController {
    @FXML
    private HBox hboxLayout;
    @FXML
    private TextField secretWordTextField;

    private SecretWord secretWord;

    @FXML
    void onHandleButtonActionStart(ActionEvent event) {
        secretWord = new SecretWord(secretWordTextField.getText().trim());

        for (int i=0; i<secretWord.getWord().length(); i++){
            TextField wordTxt = new TextField();
            hboxLayout.getChildren().add(wordTxt);
            keyPressed(wordTxt, i);
        }
    }

    private void keyPressed(TextField wordTxt, int position){
        wordTxt.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                String letter = keyEvent.getText().trim();
                String[] arrayWord = secretWord.getArrayWord();
                System.out.println(letter + " " + arrayWord[position]);
            }
        });
    }
}
