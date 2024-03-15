import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String option = "";
        int id = 0;
        Inventario objInventario = new Inventario();
        ProductoEspecifico productoEncontrado;

        do {
            option = JOptionPane.showInputDialog("Menu\n" +
                    "1. Agregar\n" +
                    "2. Eliminar \n" +
                    "3. Buscar por nombre\n" +
                    "4. Buscar por categoria\n" +
                    "5. Listar Inventario\n" +
                    "6. Salir\n"+
                    "Ingresa una opcion: ");

            switch (option){
                case "1":
                    id++;
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio"));
                    String categoria = JOptionPane.showInputDialog("Ingresa la categoria");
                    String marca = JOptionPane.showInputDialog("Ingresa la categoria");

                    ProductoEspecifico objProducto = new ProductoEspecifico(id,nombre,precio,categoria,marca);
                    objInventario.agregarProducto(objProducto);

                    break;

                case "2":
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id del producto a eliminar"));
                    objInventario.eliminarProducto(idEliminar);
                    objInventario.listarProductos();
                    break;

                case "3":
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del producto a buscar");
                    productoEncontrado = objInventario.buscarPorNombre(nombreBuscar);

                    if(productoEncontrado != null){
                        JOptionPane.showMessageDialog(null, "Producto Encontrado: \n" + productoEncontrado.toString());
                    }else{
                        JOptionPane.showMessageDialog(null,"El producto no fue encontrado");
                    }
                    break;

                case "4":
                    String categoriaBuscar = JOptionPane.showInputDialog("Ingrese la categoria a buscar");
                    productoEncontrado = objInventario.buscarPorCategoria(categoriaBuscar);

                    if(productoEncontrado != null){
                        JOptionPane.showMessageDialog(null, "Producto Encontrado: \n" + productoEncontrado.toString());
                    }else{
                        JOptionPane.showMessageDialog(null,"El producto no fue encontrado");
                    }
                    break;

                case "5":
                    objInventario.listarProductos();
                    break;
            }

        }while(!option.equals("6"));
    }
}