module com.zsnails.lab.laboratoriolenguajes {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.zsnails.lab.laboratoriolenguajes to javafx.fxml;
    exports com.zsnails.lab.laboratoriolenguajes;
}