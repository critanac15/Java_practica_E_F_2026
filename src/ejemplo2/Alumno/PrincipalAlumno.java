package ejemplo2.Alumno;

public class PrincipalAlumno {
    public static void main(String[] args) {
        //se crea un constructor
        Alumno_  alum=new Alumno_();
        alum.Registrar();
        alum.Mostrar();
        System.out.println("total: "+Alumno_.getNumeroTotal());
    }
}
