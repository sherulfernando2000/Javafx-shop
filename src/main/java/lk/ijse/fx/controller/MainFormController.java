package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public AnchorPane rootNode;

    public void btnDashBordOnAction(ActionEvent actionEvent) {
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);

        // set title to the stage
        stage.setTitle("Customer Form");

    }

    public void btnItemOnAction(ActionEvent actionEvent) {
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {

    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {

    }
}
