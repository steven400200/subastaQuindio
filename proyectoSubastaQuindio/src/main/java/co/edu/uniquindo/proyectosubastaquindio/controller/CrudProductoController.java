package co.edu.uniquindo.proyectosubastaquindio.controller;

import co.edu.uniquindo.proyectosubastaquindio.model.Producto;
import co.edu.uniuindio.crudproducto.model.enums.tipoArticulo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class CrudProductoController {

    static ArrayList<Producto> listaProductos = new ArrayList<>();


   static public  void guardarProducto(String nombreProdcuto, String descripcion, String nombreAnunciante, LocalDate fechaPublicacion, LocalDate fechaFinalizacion, float valorInicial, tipoArticulo tipo_Articulo,String url) {
        Producto producto = new Producto(nombreProdcuto, descripcion, nombreAnunciante, fechaPublicacion, fechaFinalizacion, valorInicial, tipo_Articulo,url);
        listaProductos.add(producto);
    }

   static public boolean verificarProductoCreado(String nombre) {

        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNombreProducto().equals(nombre)) {
                return false;

            }
        }
        return true;

    }
    static  public  ArrayList<Producto> llenarObservableTabla(){
       ArrayList<Producto>productos=new ArrayList<Producto>();
         productos= listaProductos;
         return productos;

    }

    static public void buscarProducto(Producto p1){
        for (int i = 0; i <listaProductos.size() ; i++) {
            if(listaProductos.get(i).getNombreProducto().equals(p1.getNombreProducto())){
                listaProductos.get(i).setDescripcion(p1.getDescripcion());
                listaProductos.get(i).setValorInicial(p1.getValorInicial());
                listaProductos.get(i).setNombreAnunciante(p1.getNombreAnunciante());
                listaProductos.get(i).setFechaPublicacion(p1.getFechaPublicacion());
                listaProductos.get(i).setFechaFinalizacion(p1.getFechaFinalizacion());
                listaProductos.get(i).setTipo_Articulo(p1.getTipo_Articulo());
                listaProductos.get(i).setUrlFoto(p1.getUrlFoto());


            }
        }


    }
    static public void eliminarProdcuto(Producto p1){
        for (int i = 0; i <listaProductos.size() ; i++) {
            if(listaProductos.get(i).getNombreProducto().equals(p1.getNombreProducto())){
                listaProductos.remove(i);
            }
        }




    }




}
