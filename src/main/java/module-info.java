module lauren.colorchooserchallenge {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens lauren.colorchooserchallenge to javafx.fxml;
    exports lauren.colorchooserchallenge;
}