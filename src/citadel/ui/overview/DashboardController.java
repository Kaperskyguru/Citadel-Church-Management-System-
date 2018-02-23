package citadel.ui.overview;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane home;
    @FXML
    private AnchorPane overviewPane;
    private JFXComboBox box;
    private JFXTextArea b;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void openHome(MouseEvent event) {
        setNode(home);
    }

    private void createPages() {
        try {
            home = FXMLLoader.load(getClass().getResource("/citadel/ui/overview/dashboard.fxml"));
            //list = FXMLLoader.load(getClass().getResource("/modules/Profile.fxml"));

            //set up default node on page load
            setNode(home);
        } catch (IOException ex) {
            Logger.getLogger(citadel.ui.main.DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setNode(Node node) {
        overviewPane.getChildren().clear();
        overviewPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

}
