package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Fahrzeugparkmanager extends Application {
    @Override
    public void start(Stage managerStage) throws Exception {
        managerStage.setTitle("Fahrzeugparkmanager");
        managerStage.getIcons().add(new Image("logo.png"));

        //Menu Bar
        MenuBar menuBar = new MenuBar();
        Menu vehicles = new Menu("Fahrzeuge");
        MenuItem create = new MenuItem("Fahrzeug erfassen");
        MenuItem list = new MenuItem("Fahrzeuge auflisten");
        Menu applikation = new Menu("Applikation");
        MenuItem close = new MenuItem("Schliessen");
        MenuItem logout = new MenuItem("Ausloggen");
        applikation.getItems().addAll(logout, close);
        vehicles.getItems().addAll(create, list);
        menuBar.getMenus().addAll(applikation, vehicles);

        //Onclick Menu
        logout.setOnAction(actionEvent -> {
            managerStage.close();
        });

        //root
        BorderPane rootLayout = new BorderPane();
        rootLayout.setTop(menuBar);

        managerStage.setScene(new Scene(rootLayout, 500, 300));
        managerStage.show();
    }

    private Scene listCars() {
        return null;
    }
}
