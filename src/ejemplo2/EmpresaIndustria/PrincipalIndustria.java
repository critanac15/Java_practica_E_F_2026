package ejemplo2.EmpresaIndustria;
public class PrincipalIndustria {
    public static void main(String[] args) {
        int op;
        Industria ind=new Industria();
        do {
            System.out.println("=====Menu Industria=====");
            System.out.println("1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("3. Saliir");
            while(true)
            {
                try
                {
                    System.out.print("ingrese una opcion: ");
                    op=Integer.parseInt(leercadena.lectura());
                    if(op<1 || op>3)
                    {
                        System.out.println("error, numero fuera de rango");
                    }else {
                        break;
                    }
                }catch (NumberFormatException e)
                {
                    System.out.println("error, digitos erroneos");
                }
            }
            switch (op)
            {
                case 1:
                {
                    ind.Registrar();
                }break;
                case 2:
                {
                    System.out.println("Reporte de la empresa:"+ind.ConsultarEmp()+ ind.TotalProducto());

                }break;
                case 3:{
                    System.out.println("HAsta luego");
                }
            }
        }while(op!=3);
    }
}

