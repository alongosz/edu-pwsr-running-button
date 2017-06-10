package net.longosz.RunningButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Pane restrictedArea;

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

        // far from perfect solution...
        source.setTranslateX(source.getLayoutX() - event.getX());
        source.setTranslateY(source.getLayoutY() - event.getY());
    }
}
