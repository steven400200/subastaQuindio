

package co.edu.uniquindo.proyectosubastaquindio.controllersView;


import co.edu.uniquindo.proyectosubastaquindio.model.Producto;
import co.edu.uniuindio.crudproducto.model.enums.tipoArticulo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import co.edu.uniquindo.proyectosubastaquindio.controller.CrudProductoController;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CrudProductoControllerView implements Initializable {


    private Producto p1=new Producto();
    ObservableList<Producto> productos;
    ArrayList<Producto> listaProdcutos;








    @FXML
    private DatePicker dateFechaFinal;

    @FXML
    private DatePicker dateFechaInical;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnImportar;

    @FXML
    private ComboBox<tipoArticulo> comboTipoProducto;



    @FXML
    private ImageView imgFoto;

    @FXML
    private ImageView imgLupa;

    @FXML
    private Label lblDescripcion;

    @FXML
    private Label lblFcehaInicial;

    @FXML
    private Label lblFechaInicial;

    @FXML
    private Label lblNombreAnunciante;

    @FXML
    private Label lblNombreProducto;

    @FXML
    private Label lblTipoProducto;

    @FXML
    private Label lblUrlFoto;

    @FXML
    private Label lblValor;

    @FXML
    private Pane paneBotones;

    @FXML
    private Pane paneCampos;

    @FXML
    private Pane panePrincipal;

    @FXML
    private Pane paneTable;

    @FXML
    private TableView<Producto> tableDatos;
    @FXML
    private TableColumn<Producto, String> columnaUno;
    @FXML
    private TableColumn<Producto, String> columnaDos;
    @FXML
    private TableColumn<Producto, String> columnaTres;
    @FXML
    private TableColumn<Producto, String> columnaCuatro;

    @FXML
    private TableColumn<Producto, String> columnaCinco;
    @FXML
    private TableColumn<Producto, String> columna6;
    @FXML
    private TableColumn<Producto, String> columna7;
    @FXML
    private TableColumn<Producto, String> columna8;




    @FXML
    private TextField txtBuscador;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtNombreAnunciante;

    @FXML
    private TextField txtNombreProducto;

    @FXML
    private TextField txtUrlFoto;

    @FXML
    private TextField txtValor;
    @FXML
    private TextField txtFechaInicial;
    SelectionModel<Producto> selectionModel;

    // Obtiene la fila seleccionada
    Producto productoSeleccionado;


    @FXML
    void Actualizar(ActionEvent event) {
        txtNombreProducto.setDisable(false);



        p1.setDescripcion(txtDescripcion.getText());
        p1.setNombreAnunciante(txtNombreAnunciante.getText());
        p1.setFechaPublicacion(dateFechaInical.getValue());
        p1.setFechaFinalizacion(dateFechaFinal.getValue());
        p1.setTipo_Articulo(comboTipoProducto.getValue());
        p1.setUrlFoto(txtUrlFoto.getText());
        float valorInicial=0;
        String valorTexto = txtValor.getText();
        if (!valorTexto.isEmpty() ) {
            try {
                valorInicial = Float.parseFloat(valorTexto);
                // Realiza la operación con "valor" aquí
            } catch (NumberFormatException e) {
                System.out.println(e+"falta rellenar campo valor inicial");
            }
        }
        p1.setValorInicial(valorInicial);


        Producto p=this.tableDatos.getSelectionModel().getSelectedItem();
        if(p==null)
        {

            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Debes seleccionar un producto");
            alert.showAndWait();

        }else {
            if (!(CrudProductoController.verificarProductoCreado(p1.getNombreProducto()))) {
                CrudProductoController.buscarProducto(p1);
                listaProdcutos=CrudProductoController.llenarObservableTabla();
                productos.clear();
                productos.addAll(listaProdcutos);
                tableDatos.refresh();
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("se actualizo el producto"+ p1.getNombreProducto());
                alert.showAndWait();

            }
        }

    }


    @FXML
    void agregar(ActionEvent event) {
        String  nombreProducto= txtNombreProducto.getText();
        String  descripcion= txtDescripcion.getText();
        String  nombreAnunciante= txtNombreAnunciante.getText();
        String urlFoto=txtUrlFoto.getText();
        LocalDate fechaInicial = dateFechaInical.getValue();
        LocalDate fechaFinal=dateFechaFinal.getValue();
        tipoArticulo a1=comboTipoProducto.getValue();
        System.out.println(a1+" "+fechaInicial+" "+fechaFinal);
        float valorInicial=0;
        String valorTexto = txtValor.getText();
         if (!valorTexto.isEmpty() ) {
            try {
                 valorInicial = Float.parseFloat(valorTexto);
                // Realiza la operación con "valor" aquí
            } catch (NumberFormatException e) {
                System.out.println(e+"falta rellenar campo valor inicial");
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("En el campo valor inical no se puede agregar letras");
                alert.showAndWait();
            }
        } else {
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Debes rellenar el campo de valor inicial");
            alert.showAndWait();
        }
        if(CrudProductoController.verificarProductoCreado(nombreProducto)){
            CrudProductoController.guardarProducto(nombreProducto,descripcion,nombreAnunciante,fechaInicial,fechaFinal,valorInicial,a1,urlFoto);
            productos = FXCollections.observableArrayList();
          productos.addAll(CrudProductoController.llenarObservableTabla());

          columnaUno.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombreProducto"));
          columnaDos.setCellValueFactory(new PropertyValueFactory<Producto, String>("descripcion"));
          columnaTres.setCellValueFactory(new PropertyValueFactory<Producto,String>("nombreAnunciante"));
          columnaCuatro.setCellValueFactory(new PropertyValueFactory<Producto,String>("valorInicial"));
          columnaCinco.setCellValueFactory(new PropertyValueFactory<Producto, String>("fechaPublicacion"));
          columna6.setCellValueFactory(new PropertyValueFactory<Producto, String>("fechaFinalizacion"));
          columna7.setCellValueFactory(new PropertyValueFactory<Producto,String>("tipo_Articulo"));
          columna8.setCellValueFactory(new PropertyValueFactory<Producto,String>("urlFoto"));

          tableDatos.setItems(productos);

        }



    }

    @FXML
    void eliminar(ActionEvent event) {
        Producto p=this.tableDatos.getSelectionModel().getSelectedItem();
        if(p==null)
        {
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Debes seleccionar un producto");
            alert.showAndWait();

        }else {
            SelectionModel<Producto> selectionModel = tableDatos.getSelectionModel();
            Producto productoSeleccionado = selectionModel.getSelectedItem();
            // Aquí puedes acceder a las propiedades del producto seleccionado
            String nombreProducto= productoSeleccionado.getNombreProducto();
            CrudProductoController.eliminarProdcuto(p1);
            listaProdcutos=CrudProductoController.llenarObservableTabla();
            productos.clear();
            productos.addAll(listaProdcutos);
            tableDatos.refresh();



        }

    }

    @FXML
    void importar(ActionEvent event) {




    }
    @FXML
    void selccionar(MouseEvent event) {

        Producto p=this.tableDatos.getSelectionModel().getSelectedItem();
        if(p==null)
        {
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Debes seleccionar un producto");
            alert.showAndWait();

        }else {
            SelectionModel<Producto> selectionModel = tableDatos.getSelectionModel();
            Producto productoSeleccionado = selectionModel.getSelectedItem();
            txtNombreProducto.setDisable(true);
            // Aquí puedes acceder a las propiedades del producto seleccionado
            String nombreProducto= productoSeleccionado.getNombreProducto();
            String descripcion = productoSeleccionado.getDescripcion();
            String valorInical= productoSeleccionado.getValorInicial()+"";
            String nombreAnunciante= productoSeleccionado.getNombreAnunciante();
            LocalDate fechaInicial=productoSeleccionado.getFechaPublicacion();
            LocalDate fechaFinal = productoSeleccionado.getFechaFinalizacion();
            tipoArticulo tipo= productoSeleccionado.getTipo_Articulo();
            String url= productoSeleccionado.getUrlFoto();


            p1.setNombreProducto(nombreProducto);




            txtNombreProducto.setText(nombreProducto);
            txtDescripcion.setText(descripcion);
            txtValor.setText(valorInical);
            txtNombreAnunciante.setText(nombreAnunciante);
            dateFechaFinal.setValue(fechaFinal);
            dateFechaInical.setValue(fechaInicial);
            comboTipoProducto.setValue(tipo);
            txtUrlFoto.setText(url);



        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        comboTipoProducto.getItems().addAll(tipoArticulo.values());

    }
}

