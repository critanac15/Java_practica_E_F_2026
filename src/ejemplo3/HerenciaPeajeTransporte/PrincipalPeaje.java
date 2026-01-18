package ejemplo3.HerenciaPeajeTransporte;

public class PrincipalPeaje {
    public static void main(String[] args) {
        int op;
        String vehiculo_ligero,vehiculo_pesado;
        do {
            System.out.println("\n=====Peaje de Transportistas S.A.C =========");
            System.out.println("1. Vehiculo Ligero");
            System.out.println("2. Vehiculo Pesado");
            System.out.println("3. Salir");
            //validacion de datos
            while (true)
            {
                try
                {
                    System.out.print("ingrese una opcion: ");
                    op=Integer.parseInt(leercadena.lectura());
                    if(op<1 || op>3)
                    {

                    }else {
                        break;
                    }
                }catch (NumberFormatException e)
                {

                }
            }
            //Para relacionar el dato ingresado por OP
            switch (op)
            {
                case 1:
                {
                    int ejes_ligeros=2;
                    PeajeVehiculoLigero lig=new PeajeVehiculoLigero(ejes_ligeros);//Se crea un nuevo objeto llamado Lig
                    System.out.println("\t\tTotal: "+ String.format("%.2f",lig.CalcularTarifa()));//se redondea a dos decimales
                }break;
                case 2:
                {
                    int ejes_pesados;
                    //Validacion de datos
                    while (true)
                    {
                        try
                        {
                            System.out.print("cantidad de ejes: ");
                            ejes_pesados=Integer.parseInt(leercadena.lectura());
                            if (ejes_pesados<2 || ejes_pesados>6)
                            {

                            }else {
                                break;
                            }
                        }catch (NumberFormatException e)//Para que solo se admitan Numeros
                        {

                        }
                    }
                    PeajeVehiculoPesado pes=new PeajeVehiculoPesado(ejes_pesados);//Se crea una nuevo objeto dandole la variable ejes_pesados
                    System.out.println("\t\tTotal: "+String.format("%.2f",pes.CalcularTarifa()));//String format para redondear a 2 decimales
                }break;
                case 3:
                {
                    System.out.println("Hasta la proxima");
                }break;
            }
        }while(op!=3);
    }
}
