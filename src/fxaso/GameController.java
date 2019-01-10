package fxaso;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.LinkedList;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Alfian
 */
public class GameController implements Initializable {

    static LinkedList<String> things = new LinkedList<>();
    static LinkedList<String> llcities = new LinkedList<>();
    
    @FXML
    private Label name;
    @FXML
    private Label city;
    @FXML
    private Button accept;
    @FXML
    private void acceptButton(ActionEvent e){
        System.out.println(things.getFirst() + "'s card has been accepted!");
        things.removeFirst();
        llcities.removeFirst();
        name.setText(things.getFirst());
        city.setText(llcities.getFirst());
    }
    @FXML
    private void declineButton(ActionEvent e){
        System.out.println(things.getFirst() + "'s card has been declined!");
        things.removeFirst();
        llcities.removeFirst();
        name.setText(things.getFirst());
        city.setText(llcities.getFirst());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rollThings();
        
        name.setText(things.getFirst());
        city.setText(llcities.getFirst());
    }
    
    public static void rollThings() {
        String name, city;
        String names[] = {
            "Michael Roth",
            "James Ortiz",
            "Matthew Ferrell",
            "Jason Lin",
            "Joshua Douglas",
            "Jessica Davis",
            "Emily Smith",
            "Megan Johnson",
            "Elizabeth Miller",
            "Rebecca Wilson",
            "Sarah Williams",
            "Simi Brown",
            "Samantha Jackson",
            "Alan Jackson"
        };
        
        String cities[] = {
            "Malang",
            "Batu",
            "Jakarta",
            "Depok",
            "Jember Utara",
            "Semarang",
            "Madiun",
            "Banten",
            "Bogor",
            "Tangerang",
            "Bekasi",
            "Solo",
            "Suka Bumi",
            "Madura",
            "Denpasar"
        };
        
        for(int i = 0; i < 10; i++) {
            name = names[i];
            city = cities[new Random().nextInt(cities.length)];
            llcities.add(city);
            things.add(name);
        }
        
    }
    
    public static String getName(String name){
        
        
        return name;        
    }
    
}
