package ejemplo3.HerenciaAlumno;

public class Alumno {
    private int Codigo;
    private String Nombre;

    public void Registrar(int Codigo_n,String Nombre_n)
    {
        this.Codigo=Codigo_n;
        this.Nombre=Nombre_n;
    }
    public void Mostrar()
    {
        System.out.println("Codigo: "+Codigo);
        System.out.println("Nombre: "+Nombre);
    }
}
