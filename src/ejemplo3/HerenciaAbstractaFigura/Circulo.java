package ejemplo3.HerenciaAbstractaFigura;

public final class Circulo extends Figura{
    public int radio;
    public Circulo(int radio)
    {
        this.radio=radio;
    }

    @Override
    public double area() {
        return (Math.PI*(Math.pow(radio,2)));
    }
}
