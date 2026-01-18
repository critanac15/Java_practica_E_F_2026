package ejemplo3.HerenciaAlumno;

public class AlumnoUniv extends Alumno{
    private String Facultad;
    public void RegistrarDatos(int Codigo_n,String Nombre_n,String Facultad_n)
    {
        super.Registrar(Codigo_n,Nombre_n);
        this.Facultad=Facultad_n;
    }
    public void MostrarDatos()
    {
        super.Mostrar();
        System.out.println("Facultad: "+Facultad);
    }
}
