package ejemplo2.Alumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leercadena {
    //se crea Un atributo de clase Privado y Publico
    private static BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
    public static String lectura()
    {
        try
        {
            return dato.readLine();//Devuelve esto
        }catch (IOException e)//Para no permitir datos no Strings
        {
            return " ";//retorna vacio
        }
    }
}
