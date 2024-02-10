package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public AnchorPane rootNode;
    public Label lblUserName;

    public void btnDashBordOnAction(ActionEvent actionEvent) {
    }

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(rootNode);


       /* FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
        Object load = fxmlLoader.load();
        DashBordController controller = fxmlLoader.getController();
        controller.setUserName(userName);
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        stage.show();
        */




    }

    public void btnItemOnAction(ActionEvent actionEvent) {
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {

    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {

    }

    public void setUserName(String userName){
        lblUserName.setText( userName);

    }
}
