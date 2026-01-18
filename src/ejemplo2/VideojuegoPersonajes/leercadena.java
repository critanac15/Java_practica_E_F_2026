package ejemplo2.VideojuegoPersonajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leercadena {
    private final static BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
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
