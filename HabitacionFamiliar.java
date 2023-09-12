public class HabitacionFamiliar extends Habitacion {
private  boolean tieneSala;
private  boolean tieneBañoCompleto;
public HabitacionFamiliar(int numero, double precioPorNoche, boolean tieneSala, boolean tieneBañoCompleto) {
    super(numero, precioPorNoche);
    this.tieneSala = tieneSala;
    this.tieneBañoCompleto = tieneBañoCompleto;
}
public boolean tieneSala()  {
    return tieneSala;
}
public boolean tieneBañoCompleto()  {
    return tieneBañoCompleto;
}
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tiene sala"+ (tieneSala ? "Si": "No"));
    System.out.println("Tiene baño completo" + (tieneBañoCompleto ? "Si": "No"));
}

}
