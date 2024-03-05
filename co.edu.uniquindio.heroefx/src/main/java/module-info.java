module co.edu.uniquindio.heroefx.heroeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.heroefx.heroeapp to javafx.fxml;
    exports co.edu.uniquindio.heroefx.heroeapp;

    opens co.edu.uniquindio.heroefx.heroeapp.controller;
    exports co.edu.uniquindio.heroefx.heroeapp.controller;
}