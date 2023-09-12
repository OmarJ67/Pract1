public class Habitacion {
    private int numero;
    private double precioPorNoche;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public double calcularTotal(int numeroDeNoches) {
        if (numeroDeNoches >= 0) {
            return precioPorNoche * numeroDeNoches;
        }
        return 0; // Manejo de valor negativo de numeroDeNoches
    }

    public void mostrarInformacion() {
        System.out.println("Número de habitación: " + numero);
        System.out.println("Precio por noche: $" + precioPorNoche);
    }

   
    }