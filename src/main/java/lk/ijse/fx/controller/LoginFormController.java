package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.fx.db.CredentialDb;

import java.io.IOException;

public class LoginFormController {

    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(userName.equals(CredentialDb.USERNAME) && pw.equals(CredentialDb.PW)) {
            // navigate to the sample form
            //load scene graph to our java method
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/main_form.fxml"));
            Parent load = fxmlLoader.load();
            MainFormController controller = fxmlLoader.getController();
            controller.setUserName(userName);




            //set a scene to the scene graph
            Scene scene = new Scene(load);

            // get the primary stage from login actors
            Stage stage = (Stage) this.rootNode.getScene().getWindow();

            // set scene to the primary stage
            stage.setScene(scene);

            // set title to the stage
            stage.setTitle("Main Form");

            // get stage to the center
            stage.centerOnScreen();
        } else {
            new Alert(Alert.AlertType.ERROR, "Login Failed").show();
        }
    }
}
