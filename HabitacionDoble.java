public class HabitacionDoble extends Habitacion{
    private int numeroDeCamas;

    public HabitacionDoble(int numero, double precioPorNoche, int numeroDeCamas) {
        super(numero, precioPorNoche);
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        super.mostrarInformacion();
        System.out.println("Número de Camas:" + numeroDeCamas);
    }

  
}
