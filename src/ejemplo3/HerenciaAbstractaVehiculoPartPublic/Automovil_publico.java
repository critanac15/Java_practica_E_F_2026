package ejemplo3.HerenciaAbstractaVehiculoPartPublic;

public class Automovil_publico extends Automovil{
    private final double depre_publico=0.6;
    public Automovil_publico(int costo)
    {
        super(costo);
    }

    @Override
    public double Depreciacion() {
        return super.Depreciacion()*depre_publico;
    }
}
