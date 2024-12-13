module com.example.final_project_submissin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_project_submissin to javafx.fxml;
    exports com.example.final_project_submissin;
}