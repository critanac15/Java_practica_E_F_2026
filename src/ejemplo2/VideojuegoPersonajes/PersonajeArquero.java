package ejemplo2.VideojuegoPersonajes;

public class PersonajeArquero extends Personaje{
    int Punteria;
    String Tipo_flecha;
    public void RegistrarDatos(String Nombre_,String Genero_,double Estatura_,String Combo_,int Punteria_,String Tipo_flecha_)
    {
        super.Registrar(Nombre_,Genero_,Estatura_,Combo_);
        this.Punteria=Punteria_;
        this.Tipo_flecha=Tipo_flecha_;
    }
    public void MostrarDatos()
    {
        super.Mostrar();
        System.out.println("Punteria: "+Punteria);
        System.out.println("Tipo de Flecha: "+Tipo_flecha);
    }
}
