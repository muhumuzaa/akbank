module com.example.akbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires java.desktop;

    opens com.example.akbank to javafx.fxml;
    exports com.example.akbank;
    exports com.example.akbank.Controllers.Admin;
    exports com.example.akbank.Controllers.Client;
    exports com.example.akbank.Models;
    exports com.example.akbank.Views;
    exports com.example.akbank.Controllers;
    opens com.example.akbank.Controllers to javafx.fxml;


}