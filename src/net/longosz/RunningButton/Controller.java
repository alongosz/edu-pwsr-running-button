package net.longosz.RunningButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
}
