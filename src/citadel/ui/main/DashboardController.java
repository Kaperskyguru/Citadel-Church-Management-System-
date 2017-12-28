package citadel.ui.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;
import javafx.animation.FadeTransition;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane holderPane;

    private AnchorPane home, add, list;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createPages();
    }

    //Set selected node to a content holder
    private void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }
    //Load all fxml files to a cahce for swapping

    private void createPages() {
        try {
            home = FXMLLoader.load(getClass().getResource("/citadel/ui/overview/dashboard.fxml"));
            //list = FXMLLoader.load(getClass().getResource("/modules/Profile.fxml"));
            //add = FXMLLoader.load(getClass().getResource("/modules/Register.fxml"));

            //set up default node on page load
            setNode(home);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void openHome(MouseEvent event) {
        setNode(home);
    }

}
