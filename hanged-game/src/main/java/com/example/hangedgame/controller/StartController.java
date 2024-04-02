import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class StartController {
    @FXML
    private ImageView image1;

    @FXML
    private TextField wordSelector;



    @FXML
    void onHandleButtonActionStart(ActionEvent event) throws IOException {
//        secretWord = new SecretWord(secretWordTextField.getText().trim());
//
//        for (int i=0; i<secretWord.getWord().length(); i++){
//            TextField wordTxt = new TextField();
//            hboxLayout.getChildren().add(wordTxt);
//            keyPressed(wordTxt, i);
//        }
        MainMenuStage.deleteInstance();
        GameStage.getInstance();
    }
}
