package ejemplo3.HerenciaAbstractaFigura;

public class PrincipalFigura {
    public static void main(String[] args) {
        int op, radio,lado;
        do {
            System.out.println("\t\t\tCalculando el area");
            System.out.println("1. Cuadrado");
            System.out.println("2. Circulo");
            System.out.println("3. Salir");
            while (true)
            {
                try
                {
                    System.out.print("ingrese una opcion: ");
                    op=Integer.parseInt(leercadena.lectura());
                    break;
                }catch (NumberFormatException e)
                {
                    System.out.println("error, ingrese solo numeros");
                }
            }
            switch (op)
            {
                case 1:
                {
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese el lado del cuadrado: ");
                            lado=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, digitos erroneos");
                        }
                    }
                    Cuadrado cua=new Cuadrado(lado);
                    System.out.println("el area es: "+cua.area());
                }break;
                case 2:
                {
                    while (true)
                    {
                        try
                        {
                            System.out.print("ingrese el radio: ");
                            radio=Integer.parseInt(leercadena.lectura());
                            break;

                        }catch (NumberFormatException e)
                        {
                            System.out.println("Error, digitos erroneos");
                        }
                    }
                    Circulo circ=new Circulo(radio);
                    System.out.println("el area es: "+circ.area());
                }break;
                case 3:
                {
                    System.out.println("hasta luego");
                }break;
            }
        }while(op!=3);
    }
}
