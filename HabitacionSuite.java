public class HabitacionSuite extends Habitacion {
    private boolean roomService;

    public HabitacionSuite(int numero, double precioPorNoche, boolean roomService) {
        super(numero, precioPorNoche);
        this.roomService = roomService;
    }
   public boolean roomService() {
       return roomService;
   }
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Cuenta con Room Service" + (roomService ? "Si": "No"));
} 

}
