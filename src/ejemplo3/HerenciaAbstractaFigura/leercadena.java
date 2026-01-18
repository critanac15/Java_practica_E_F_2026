package ejemplo3.HerenciaAbstractaFigura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leercadena {
    private static BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
    public static String lectura()
    {
        try
        {
            return dato.readLine();
        }catch (IOException e)
        {
            return "";
        }
    }
}
