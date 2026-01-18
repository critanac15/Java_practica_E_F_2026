package ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaCajero
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
        int op=0;
        float num_deposito=0,cuenta=0,num_retiro=0;
        do {
            System.out.println("\n===Cajero ===\n");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("ingrese una opcion: ");
            while(true)
            {
                try{
                    op=Integer.parseInt(dato.readLine());
                    if(op<1 || op>4)
                    {
                        System.out.println("error, numero fuera de rango");
                    }else {
                        break;
                    }
                }catch (NumberFormatException e)
                {
                    System.out.println("error, sin letras pe");
                }
            }

            switch (op)
            {
                case 1:
                {

                    while(true)
                    {
                        try{
                            System.out.print("ingrese un monto a depositar");
                            num_deposito=Float.parseFloat(dato.readLine());
                            if(num_deposito<=0)
                            {
                                System.out.println("error, numero negativo");
                            }else {
                                cuenta = cuenta + num_deposito;
                                break;
                            }
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, sin letras");
                        }

                    }
                }break;
                case 2:
                {
                    if(cuenta==0)
                    {
                        System.out.println("saldo insuficiente");
                    }else {
                        while(true)
                        {
                            try
                            {
                                System.out.print("ingrese un monto a retiirar");
                                num_retiro = Float.parseFloat(dato.readLine());
                                if (num_retiro > cuenta) {
                                    System.out.println("error, numero grande");
                                } else {
                                    cuenta = cuenta - num_retiro;
                                    break;
                                }
                            }catch (NumberFormatException e)
                            {
                                System.out.println("error, no letras");
                            }

                        }
                    }

                }break;
                case 3:
                {
                    System.out.println("su saldo es: "+cuenta);
                }break;
                case 4:
                {
                   System.out.println("hasta luego");
                }break;
            }

        }while(op!=4);
    }
}