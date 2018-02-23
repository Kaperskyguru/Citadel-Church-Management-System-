package citadel.ui.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;
import javafx.animation.FadeTransition;
import javafx.fxml.*;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane holderPane;

    private AnchorPane home, members, messageOverview;
    @FXML
    private Label lblDashboard;
    @FXML
    private Label lblMember;
    @FXML
    private Label lblMessaging;
    @FXML
    private Label lblAttendance;
    @FXML
    private Label lblFinance;
    @FXML
    private Label lblAddressBook;
    @FXML
    private Label lblSermons;
    @FXML
    private Label lblGroups;
    @FXML
    private Label lblTestimony;
    @FXML
    private Label lblMinistry;
    @FXML
    private Label lblSongs;
    @FXML
    private Label lblActivity;
    @FXML
    private Label lblLibrary;

    private String lblHoverStyle = "-fx-background-color:#121E31;-fx-padding:9px;";
    private String lblUnHoverStyle = "-fx-background-color:#364150;-fx-padding:10px;";

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
        ft.setFromValue(0.2);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }
    //Load all fxml files to a cahce for swapping

    private void createPages() {
        try {
            home = FXMLLoader.load(getClass().getResource("/citadel/ui/overview/dashboard.fxml"));
            messageOverview = FXMLLoader.load(getClass().getResource("/citadel/ui/messaging/Messaging.fxml"));
            members = FXMLLoader.load(getClass().getResource("/citadel/ui/members/overview/memberdashboard.fxml"));

            //set up default node on page load
            setNode(home);
        } catch (IOException ex) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void openMenbers(MouseEvent event) {
        setNode(members);
    }

    @FXML
    private void openHome(MouseEvent event) {
        setNode(home);
    }

    @FXML
    private void openMessaging(MouseEvent event) {
        setNode(messageOverview);
    }

    @FXML
    private void removeHover(MouseEvent event) {
        if (event.getSource() == lblDashboard) {
            lblDashboard.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblMember) {
            lblMember.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblMessaging) {
            lblMessaging.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblAttendance) {
            lblAttendance.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblFinance) {
            lblFinance.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblAddressBook) {
            lblAddressBook.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblSermons) {
            lblSermons.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblSongs) {
            lblSongs.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblGroups) {
            lblGroups.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblTestimony) {
            lblTestimony.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblMinistry) {
            lblMinistry.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblSongs) {
            lblSongs.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblActivity) {
            lblActivity.setStyle(lblUnHoverStyle);
        } else if (event.getSource() == lblLibrary) {
            lblLibrary.setStyle(lblUnHoverStyle);
        }

    }

    @FXML
    private void displayHover(MouseEvent event) {
        if (event.getSource() == lblDashboard) {
            lblDashboard.setCursor(Cursor.CLOSED_HAND);
            lblDashboard.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblMember) {
            lblMember.setCursor(Cursor.CLOSED_HAND);
            lblMember.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblMessaging) {
            lblMessaging.setCursor(Cursor.CLOSED_HAND);
            lblMessaging.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblAttendance) {
            lblAttendance.setCursor(Cursor.CLOSED_HAND);
            lblAttendance.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblFinance) {
            lblFinance.setCursor(Cursor.CLOSED_HAND);
            lblFinance.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblAddressBook) {
            lblAddressBook.setCursor(Cursor.CLOSED_HAND);
            lblAddressBook.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblSermons) {
            lblSermons.setCursor(Cursor.CLOSED_HAND);
            lblSermons.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblTestimony) {
            lblTestimony.setCursor(Cursor.CLOSED_HAND);
            lblTestimony.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblMinistry) {
            lblMinistry.setCursor(Cursor.CLOSED_HAND);
            lblMinistry.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblSongs) {
            lblSongs.setCursor(Cursor.CLOSED_HAND);
            lblSongs.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblActivity) {
            lblActivity.setCursor(Cursor.CLOSED_HAND);
            lblActivity.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblLibrary) {
            lblLibrary.setCursor(Cursor.CLOSED_HAND);
            lblLibrary.setStyle(lblHoverStyle);
        } else if (event.getSource() == lblGroups) {
            lblGroups.setCursor(Cursor.CLOSED_HAND);
            lblGroups.setStyle(lblHoverStyle);
        }
    }

}
