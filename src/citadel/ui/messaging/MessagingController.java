/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citadel.ui.messaging;

import citadel.ui.main.DashboardController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
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
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Kapersky Guru
 */
public class MessagingController implements Initializable {

    private AnchorPane messagePortal;
    @FXML
    private AnchorPane messageOverview;
    private JFXButton btn;
    @FXML
    private JFXRadioButton rdoTextMessage;
    @FXML
    private ToggleGroup messageType;
    @FXML
    private JFXRadioButton rdoEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //  createPages();

    }

    private void setNode(Node node) {
        messagePortal.getChildren().clear();
        messagePortal.getChildren().add((Node) node);

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

            //list = FXMLLoader.load(getClass().getResource("/modules/Profile.fxml"));
            messageOverview = FXMLLoader.load(getClass().getResource("/citadel/ui/messaging/Messaging.fxml"));
            //home = FXMLLoader.load(getClass().getResource("/citadel/ui/members/overview/memberdashboard.fxml"));
            //set up default node on page load
            //setNode(home);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
