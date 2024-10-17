
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Coach
 */
public class Controller {
    
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
     
    
    public void submit(ActionEvent event){
    System.out.println("Submitted");
    
    // Validate TextField references
        if (nameTextField == null || ageTextField == null || emailTextField == null) {
            showErrorAlert("Initialization Error", "One or more input fields are not initialized.");
            return;
        }
        
    // Retrieve input and trim whitespace
        String name = nameTextField.getText().trim();
        String age = ageTextField.getText().trim();
        String email = emailTextField.getText().trim();
    
    // Validate inputs
        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            showErrorAlert("Input Error", "Empty fields must be filled out! check *name or *Age");
            return;
            }
        
        // Validate age is a number
        if (!age.matches("\\d+")) {
            showErrorAlert("Input Error", "Age must be a valid number.");
            return;
        }
        
         // Validate email format (basic regex)
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            showErrorAlert("Input Error", "Email must be in a valid format.");
            return;
        }

          // Create a popup alert with submitted details
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted!");
        alert.setHeaderText("Thank you");
        alert.setContentText("Submitted Details:\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
        alert.showAndWait();
    }
    
     private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}