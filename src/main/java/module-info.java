module fr.hetic.javaexo {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.hetic.javaexo to javafx.fxml;
    exports fr.hetic.javaexo;
}