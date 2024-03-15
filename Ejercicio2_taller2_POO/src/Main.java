public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        Empleado empleado1 = new EmpleadoPermanente("Alejandro Estrada",24,1,2800000,3);
        Empleado empleado2 = new EmpleadoTemporal("David", 18,2,2500000,"15/03/2024");

        gestionEmpleados.agregarEmpleado(empleado1);
        gestionEmpleados.agregarEmpleado(empleado2);

        gestionEmpleados.mostrarEmpleados();

        gestionEmpleados.eliminarEmpleado(1);

        System.out.println("\nDespués de eliminar:");
        gestionEmpleados.mostrarEmpleados();

    }
}