package fxaso;

import java.io.IOException;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Alfian
 */
public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private AnchorPane root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if (!FXASO.isSplashLoaded) {
            loadSplashScreen();
        }
        
    }    
    
    private void loadSplashScreen() {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("op_1.xml"));
            root.getChildren().setAll(pane);
 
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(5), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);
             
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);
            
            fadeIn.play();
            fadeIn.setOnFinished((e) -> {
               fadeOut.play();
            });
            fadeOut.setOnFinished((e) -> {
                try {
                    AnchorPane pane2 = FXMLLoader.load(getClass().getResource("op_2.xml"));
                    root.getChildren().setAll(pane);

                } catch (IOException ex) {
                    Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
             
        } catch (IOException ex) {
            Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
