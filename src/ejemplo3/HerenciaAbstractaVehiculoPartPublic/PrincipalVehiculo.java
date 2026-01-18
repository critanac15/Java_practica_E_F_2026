package ejemplo3.HerenciaAbstractaVehiculoPartPublic;

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
                    int op2;
                    do {
                        System.out.println("1. Particular");
                        System.out.println("2. Publico");
                        System.out.println("3. Regresar");
                        while (true)
                        {
                            try
                            {
                                System.out.println("ingrese una opcion: ");
                                op2=Integer.parseInt(leercadena.lectura());
                                break;
                            }catch (NumberFormatException e)
                            {
                                System.out.println("error, ingrese de nuevo");
                            }
                        }
                        switch (op2)
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
                                Automovil_Particular part= new Automovil_Particular(costoInicial);

                                System.out.println("el costo Inicial es: "+costoInicial);
                                System.out.println("el costo de depreciacion es: "+part.Depreciacion());
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
                                Automovil_publico publi= new Automovil_publico(costoInicial);

                                System.out.println("el costo Inicial es: "+costoInicial);
                                System.out.println("el costo de depreciacion es: "+publi.Depreciacion());
                            }break;
                            case 3:
                            {

                            }break;
                        }
                    }while(op2!=3);
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
