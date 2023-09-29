package co.edu.uniquindo.proyectosubastaquindio.controllersView;

import javafx.application.Application;
import javafx.css.Stylesheet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SubastaQuindioAplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SubastaQuindioAplication.class.getResource("productoView.fxml"));
        // Importa el archivo CSS

        // Agregar la hoja de estilo CSS desde el paquete "css"



        Scene scene = new Scene(fxmlLoader.load(), 866, 591);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}