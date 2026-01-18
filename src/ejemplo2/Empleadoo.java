package ejemplo2;

public class Empleadoo {
    private String Nombre;
    private int Edad;
    public void Registrar(String Nombre_,int Edad_)
    {
        this.Nombre=Nombre_;
        this.Edad=Edad_;
    }
    public void Mostrar()
    {
        System.out.println("Nombre: "+Nombre+", Edad: "+Edad);
    }
}
