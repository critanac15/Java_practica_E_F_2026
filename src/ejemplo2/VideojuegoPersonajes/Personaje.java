package ejemplo2.VideojuegoPersonajes;

public class Personaje {
    private String Nombre,Genero,Combo;
    private double Estatura;
    public void Registrar(String Nombre_,String Genero_,double Estatura_,String Combo_)
    {
        this.Nombre=Nombre_;
        this.Genero=Genero_;
        this.Estatura=Estatura_;
        this.Combo=Combo_;
    }
    public void Mostrar()
    {
        System.out.println("Nombre: "+Nombre+"  "+Estatura+"m");
        System.out.println("Genero: "+ Genero);
        System.out.println("Combo: "+Combo);
    }
}
