package ejemplo3.HerenciaPeajeTransporte;

public abstract class PeajeVehiculo {
    //Asignacion de la tarifa para ambos Vehiculos
    //protected para que solo sean disponibles para las clases hijas
    protected double tarifa=6.60;
    //Se crea una funcion abstracta
    public abstract double CalcularTarifa();
}
