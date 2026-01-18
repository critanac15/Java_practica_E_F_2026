package ejemplo2.VideojuegoPersonajes;

public class PersonajeEspadachin extends Personaje{
    String Tipo_espada;
    int Tipo_filo;
    public void RegistrarDatos(String Nombre_,String Genero_,double Estatura_,String Combo_,String Tipo_espada_,int Tipo_filo_)
    {
        //asignacion de valores
        super.Registrar(Nombre_,Genero_,Estatura_,Combo_);
        this.Tipo_espada=Tipo_espada_;
        this.Tipo_filo=Tipo_filo_;
    }
    public void MostrarDatos()
    {
        super.Mostrar();
        System.out.println("Tipo de espada: "+Tipo_espada);
        System.out.println("Tipo de filo: "+Tipo_filo);
    }
}
