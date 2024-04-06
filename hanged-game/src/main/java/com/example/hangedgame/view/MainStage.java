package com.example.hangedgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainStage extends Stage {

    private static MainStage INSTANCE;
    private Object startController;

    public MainStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/hanged-game/start-screen.fxml"));
        Parent root = loader.load();
        startController = loader.getController();
        Scene scene = new Scene(root);
        setTitle("Ahorcado");
        setResizable(false);
        setScene(scene);
        show();
    }

    public Object getStartController(){
        return startController;
    }

    public static MainStage getInstance() throws IOException{
        return MainStage.INSTANCE = new MainStage();
    }

    public static void deleteInstance() {
        MainStage.INSTANCE.close();
        MainStage.INSTANCE = null;
    }

    private static class MainMenuHolder {
        private static MainStage INSTANCE;
    }
}
