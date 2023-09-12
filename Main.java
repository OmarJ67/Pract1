public class Main {
    public static void main(String[] args) {
        Habitacion habitacionIndividual = new HabitacionIndividual(101, 120.0, true);
        Habitacion habitacionDoble = new HabitacionDoble(202, 180.0, 2);
        Habitacion habitacionSuite = new HabitacionSuite(402, 1000.0, true);
        Habitacion habitacionFamiliar = new HabitacionFamiliar(308, 250.0, true, true);

        System.out.println("Información de la Habitación Individual:");
        habitacionIndividual.mostrarInformacion();
        System.out.println("Costo total de la estadía: $" + habitacionIndividual.calcularTotal(5));
        System.out.println();

        System.out.println("Información de la Habitación Doble:");
        habitacionDoble.mostrarInformacion();
        System.out.println("Costo total de la estadía: $" + habitacionDoble.calcularTotal(3));
        System.out.println();

        System.out.println("Información de la Habitación Suite:");
        habitacionSuite.mostrarInformacion();
        System.out.println("Costo total de la estadía: $" + habitacionSuite.calcularTotal(7));
        System.out.println();

        System.out.println("Información de la Habitación Familiar:");
        habitacionFamiliar.mostrarInformacion();
        System.out.println("Costo total de la estadía: $" + habitacionFamiliar.calcularTotal(4));
        System.out.println();
    }
}

