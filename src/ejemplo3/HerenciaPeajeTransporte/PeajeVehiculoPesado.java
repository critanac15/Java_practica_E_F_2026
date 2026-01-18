package ejemplo3.HerenciaPeajeTransporte;

public final class PeajeVehiculoPesado extends PeajeVehiculo{
    int ejes;
    //encabezado del constructor
    public PeajeVehiculoPesado(int ejes_ )
    {
        this.ejes=ejes_;//asignacion de valores
    }
    //Se llama al metodo abstracto de la clase PeajeVehiculo
    @Override
    public double CalcularTarifa() {
        return tarifa*ejes;//se retorna este valor
    }
}
