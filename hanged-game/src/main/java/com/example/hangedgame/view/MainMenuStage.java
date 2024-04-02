import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuStage extends Stage {

    private static MainMenuStage INSTANCE;
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

    public StartController getStartController(){
        return startController;
    }

    public static MainMenuStage getInstance() throws IOException{
        return MainMenuStage.INSTANCE = new MainMenuStage();
    }

    public static void deleteInstance() {
        MainMenuStage.INSTANCE.close();
        MainMenuStage.INSTANCE = null;
    }

    private static class MainMenuHolder {
        private static MainMenuStage INSTANCE;
    }
}
