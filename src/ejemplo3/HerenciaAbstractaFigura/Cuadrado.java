package ejemplo3.HerenciaAbstractaFigura;

public final class Cuadrado extends Figura {
    public int lado;
    public Cuadrado(int lado)
    {
        this.lado=lado;
    }

    @Override
    public double area() {
        return (lado*lado);
    }
}
