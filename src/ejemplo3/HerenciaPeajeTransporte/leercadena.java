package ejemplo3.HerenciaPeajeTransporte;
//Librerias importadas
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leercadena {
    //private para que solo sea usada por este archivo
    //static para que no sea modificado y pueda ser llamado
    private static BufferedReader dato= new BufferedReader(new InputStreamReader(System.in));
    public static String lectura(){
        try
        {
            return dato.readLine();

        }catch (IOException e)
        {
            return "";
        }
    }
}
