import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuStage extends Stage {

    private StartController startController;

    public MainMenuStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/hanged-game/start-screen.fxml"));
        Parent root = loader.load();
        startController = loader.getController();
        Scene scene = new Scene(root);
        setTitle("Ahorcado");
        setResizable(false);
        setScene(scene);
        show();
    }

    public GameController getGameController(){
        return gameController;
    }

    public static GameStage getInstance() throws IOException{
        return GameStageHolder.INSTANCE = new GameStage();
    }

    public static void deleteInstance() {
        GameStageHolder.INSTANCE.close();
        GameStageHolder.INSTANCE = null;
    }

    private static class GameStageHolder {
        private static GameStage INSTANCE;
    }
}
