import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option;

        do {
            System.out.println("""
            MENU DE OPCIONES
            1. Administrar estudiantes
            2. Administrar cursos
            3. Salir
            
            Ingrese una opcion:""");
            option = objScanner.nextInt();

            switch (option){
                case 1:
                    int option3;

                    do {
                        System.out.println("""
                                MENU DE ESTUDIANTES
                                1. Agregar estudiante a un curso
                                2. Listar todos los estudiantes de un curso
                                3. Eliminar estudiante de un curso
                                4. Salir
                                
                                Ingrese una opcion:""");

                        option3 = objScanner.nextInt();

                        switch (option3){
                            case 1:
                                objGestion.listarTodosLosCursos();

                                System.out.println("Ingresa el codigo del curso donde ingresara el nuevo estudiante: ");
                                String codigo = objScanner.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);

                                if (objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else{
                                    objCurso.agregarEstudiante(objScanner);
                                }

                                break;

                            case 2:
                                objGestion.listarTodosLosCursos();

                                System.out.println("Ingresa el codigo del curso donde ingresara el nuevo estudiante: ");
                                codigo = objScanner.next();

                                objCurso = objGestion.buscarCursoPorCodigo(codigo);

                                if (objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else{
                                    objCurso.listarEstudiantes();
                                }
                                break;

                            case 3://Eliminar estudiante de un curso
                                //1. Listar los cursos
                                objGestion.listarTodosLosCursos();

                                //2. Preguntar el codigo del curso
                                System.out.println("Ingresa el codigo del curso donde deseas eliminar el estudiante: ");
                                codigo = objScanner.next();

                                //3. Buscar el curso que tenga ese codigo
                                Curso objcurso  = objGestion.buscarCursoPorCodigo(codigo);
                                if (objcurso == null){
                                    System.out.println("El codigo ingresado no coincide con ningun curso");
                                }else{
                                    //4. Eliminar el estudiante de ese curso
                                    objcurso.eliminarEstudiante(objScanner);
                                }
                                break;
                        }

                    }while (option3 != 4);

                    break;

                case 2:
                    int option2;

                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Agregar curso
                                2. Listar cursos
                                3. Buscar por codigo
                                4. Salir
                                
                                Ingrese una opcion""");

                        option2 = objScanner.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.agregarCurso(objScanner);
                                break;

                            case 2:
                                objGestion.listarTodosLosCursos();
                                break;

                            case 3:
                                System.out.println("Ingresa el codigo del curso a buscar: ");
                                String codigo = objScanner.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);

                                if ( objCurso == null){
                                    System.out.println("No existe ningun curso con este codigo");
                                }else {
                                    System.out.println(objCurso);
                                }
                                break;

                        }

                    }while (option2 != 4);

                    break;

            }
        }while (option != 3);




        /*Ejercicio 3: Sistema de Gestión de Cursos
        Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
        abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones.

        Principios de POO aplicados: Abstracción, Polimorfismo.

                Requisitos:

        Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
        listaEstudiantes es un ArrayList de objetos Estudiante.
                Clase Estudiante: Con propiedades como id, nombre, y email.

                Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
        agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
        específico.*/



    }
}