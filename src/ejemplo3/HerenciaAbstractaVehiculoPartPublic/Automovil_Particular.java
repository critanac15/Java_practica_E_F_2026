package ejemplo3.HerenciaAbstractaVehiculoPartPublic;

public class Automovil_Particular extends Automovil{
    private final double depre_particular=0.3;
    public Automovil_Particular(int costo)
    {
        super(costo);
    }

    @Override
    public double Depreciacion() {
        return super.Depreciacion()*depre_particular;
    }
}

