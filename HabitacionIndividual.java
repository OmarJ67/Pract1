public class HabitacionIndividual extends Habitacion {
   private boolean tieneVistaAlMar;

public HabitacionIndividual(int numero, double precioPorNoche, boolean tieneVistaAlMar) {
    super(numero, precioPorNoche);
    this.tieneVistaAlMar = tieneVistaAlMar;
}
public boolean tieneVistaAlMar() {
    return tieneVistaAlMar;
}
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tiene vista al mar:"+ (tieneVistaAlMar ? "Si" : "No" ));
}
}
