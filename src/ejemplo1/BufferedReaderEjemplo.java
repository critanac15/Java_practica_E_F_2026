package ejemplo1;
import java.io.*;

public class BufferedReaderEjemplo
{
    public static void main(String[] args) throws IOException
    {
        //BufferedReader para leer textos
        BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
        int num1,num2,num3;
        System.out.print("ingrese un numero: ");
        num1=Integer.parseInt(dato.readLine());//Convierte el texto a entero
        System.out.print("ingrese el segundo numero: ");
        num2=Integer.parseInt(dato.readLine());
        num3=num1+num2;
        System.out.println("la suma es: "+num3);
    }
}