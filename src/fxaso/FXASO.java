package fxaso;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alfian
 */
public class FXASO extends Application {
    
    Stage window;
    Scene scene, scene1, mainScene;
    Parent root;
    
    public static Boolean isSplashLoaded = false;
    
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        
        root = FXMLLoader.load(getClass().getResource("game.fxml"));
        
        mainScene = new Scene(root);

        
        window.setScene(mainScene);
        window.setTitle("Sad Jhon");
        window.show();
  
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
