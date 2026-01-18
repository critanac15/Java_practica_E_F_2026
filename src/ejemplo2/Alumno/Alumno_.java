package ejemplo2.Alumno;

public class Alumno_ {
    private String Nombre;
    private int Edad;
    private static int NumeroTotal=0;
    public void Registrar()
    {
        System.out.print("ingrese el nombre: ");
        this.Nombre=leercadena.lectura();
        //Validacion de datos de tipo entero
        while (true)
        {
            //utilizacion de try-catch
            try
            {
                System.out.print("ingrese la edad: ");
                this.Edad=Integer.parseInt(leercadena.lectura());
                break;
            }catch (NumberFormatException e)
            {
                System.out.println("error");
            }
        }

        NumeroTotal++;//Incrementa en 1
    }
    public void Mostrar()
    {
        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+Edad);

    }
    //Algo que todos los objetos tendran, algo propio de una clase
    public static int getNumeroTotal()
    {
        return NumeroTotal;
    }

}
