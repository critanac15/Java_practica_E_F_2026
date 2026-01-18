package ejemplo3.HerenciaAlumno;

public class AlumnoInst extends Alumno{
    private String Espc;
    public void RegistrarDatos(int Codigo_n,String Nombre_n,String Espc_n)
    {
        super.Registrar(Codigo_n,Nombre_n);
        this.Espc=Espc_n;

    }
    public void MostrarDatos()
    {
        super.Mostrar();
        System.out.println("Especialidad: "+Espc);
    }
}
