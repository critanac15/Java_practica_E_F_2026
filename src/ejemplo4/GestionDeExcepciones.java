package ejemplo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestionDeExcepciones {
    public static void main(String[] args) throws IOException {

        BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));



        try{
            System.out.print("ingrese el primer numero: ");
            float a=Integer.parseInt(dato.readLine());
            System.out.print("ingrese el segundo numero");
            float b=Integer.parseInt(dato.readLine());
            float resultado=a/b;

            System.out.println("el resultado es: "+resultado);
        }catch (NumberFormatException e){
            System.out.println("Se introdujeron caracteres no validos");
        }catch (ArithmeticException e){
            System.out.println("no se puede dividir entre cero");
        }finally {
            System.out.println("operacion terminada");
        }
    }
}
