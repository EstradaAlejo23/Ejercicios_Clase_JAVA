import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes;

    //Metodo estatico -se llama sin instanciar la clase, sin el new
    private static int index = 1;

    //Constructor
    public Curso(String codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Scanner objScanner){
        objScanner.nextLine();

        System.out.println("Ingrese nombre del estudiante: ");
        String nombre = objScanner.nextLine();

        System.out.println("Ingresa el email del estudiante: ");
        String email = objScanner.nextLine();


        Estudiante objEstudiante = new Estudiante(index,nombre,email);
        index++;

        this.listaEstudiantes.add(objEstudiante);
        System.out.println("Estudiante agregado correctamente");

    }

    public void listarEstudiantes(){
        if (this.listaEstudiantes.isEmpty()){
            System.out.println("No hay estudiantes en el curso");
        }else{
            System.out.println("Lista de estudiantes del curso ".concat(this.nombre)); //Este this es el curso, nombre del curso

            for (Estudiante temporal:this.listaEstudiantes){
                System.out.println(temporal.toString());
            }
        }
    }

    public void eliminarEstudiante(Scanner objScanner){
        this.listarEstudiantes();

        System.out.println("Ingrese el id del estudiante a eliminar");
        int idEliminar = objScanner.nextInt();

        //elimina estudiante si su id es igual que el ingresado
        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar);

       //ternario
        System.out.println(!eliminado
                ? "No se pudo eliminar estudiante"
                : "Estudiante eliminado correctamente");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
