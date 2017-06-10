package net.longosz.RunningButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane restrictedArea;

    @FXML
    private Button btnClose;

    @FXML
    void onClose(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void onMouseEnteredRestrictedArea(MouseEvent event) {
        Node source = (Node) event.getSource();
        double sourceX = source.getLayoutX();
        double sourceY = source.getLayoutY();
        double mouseX = event.getX();
        double mouseY = event.getY();

        source.setTranslateX(sourceX - mouseX);
        source.setTranslateY(sourceY - mouseY);
    }
}
