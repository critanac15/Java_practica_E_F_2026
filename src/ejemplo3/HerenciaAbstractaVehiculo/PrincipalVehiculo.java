package ejemplo3.HerenciaAbstractaVehiculo;

public class PrincipalVehiculo {
    public static void main(String[] args) {
        int costoInicial,op;
        do {
            System.out.println("\t\t\tEmpresa de Transportes\t\t\t");
            System.out.println("1. Automovil");
            System.out.println("2. Bicecleta");
            System.out.println("3. Tren");
            System.out.println("4. Salir");
            while(true)
            {
                try
                {
                    System.out.println("Ingrese una opcion: ");
                    op=Integer.parseInt(leercadena.lectura());
                    break;
                }catch (NumberFormatException e)
                {
                    System.out.println("error, ingrese de nuevo");
                }
            }
            switch (op)
            {
                case 1:
                {
                    while (true)
                    {
                        try
                        {
                            System.out.print("ingrese el costo Inicial: ");
                            costoInicial=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, ingrese de nuevo");
                        }
                    }
                    Automovil auto=new Automovil(costoInicial);
                    System.out.println("el costo Inicial es: "+costoInicial);
                    System.out.println("el costo de depreciacion es: "+auto.Depreciacion());
                }break;
                case 2:
                {
                    while (true)
                    {
                        try
                        {
                            System.out.print("ingrese el costo Inicial: ");
                            costoInicial=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, ingrese de nuevo");
                        }
                    }
                    Bicicleta bici=new Bicicleta(costoInicial);
                    System.out.println("el costo Inicial es: "+costoInicial);
                    System.out.println("el costo de depreciacion es: "+bici.Depreciacion());
                }break;
                case 3:
                {
                    while (true)
                    {
                        try
                        {
                            System.out.print("ingrese el costo Inicial: ");
                            costoInicial=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, ingrese de nuevo");
                        }
                    }
                    Tren trencito=new Tren(costoInicial);
                    System.out.println("el costo Inicial es: "+costoInicial);
                    System.out.println("el costo de depreciacion es: "+trencito.Depreciacion());
                }break;
                case 4:
                {
                    System.out.println("Hasta Luegoo");
                }break;
            }
        }while(op!=4);
    }
}
