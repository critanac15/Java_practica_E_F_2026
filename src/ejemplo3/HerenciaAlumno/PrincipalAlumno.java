package ejemplo3.HerenciaAlumno;



public class PrincipalAlumno {
    public static void main(String[] args) {
        int op,codigo;
        String facultad,especialidad,nombre;
        AlumnoUniv Univ=new AlumnoUniv();
        AlumnoInst Inst=new AlumnoInst();
        do {
            System.out.println("\t\t\tMenu de opciones\t\t");
            System.out.println("1. Alumno Instituto");
            System.out.println("2. Alumno Universidad");
            System.out.println("3. Salir");
            while(true)
            {
                try
                {
                    System.out.print("ingrese una opcion: ");
                    op=Integer.parseInt(leercadena.lectura());
                    break;
                }catch (NumberFormatException e)
                {
                    System.out.println("error, no ingrese letras");
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
                            System.out.print("ingrese el codigo: ");
                            codigo=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, digito erroneo");
                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese el Nombre: ");
                        nombre=leercadena.lectura();
                        if (nombre.trim().isEmpty() || nombre.matches("^[a-zA-Z\\s]+$"))
                        {
                            System.out.println("error, digitos erroneos");

                        }else {
                            break;
                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese la especialidad: ");
                        especialidad=leercadena.lectura();
                        if (especialidad.trim().isEmpty() || especialidad.matches("^[a-zA-Z\\s]+$"))
                        {
                            System.out.println("error, digitos erroneos");
                        }else{
                            break;
                        }

                    }
                    Inst.RegistrarDatos(codigo,nombre,especialidad);
                    Inst.MostrarDatos();
                }break;

                case 2:
                {
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese el codigo: ");
                            codigo=Integer.parseInt(leercadena.lectura());
                            break;
                        }catch (NumberFormatException e)
                        {
                            System.out.println("error, digito erroneo");
                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese el Nombre: ");
                        nombre=leercadena.lectura();
                        if(nombre.trim().isEmpty() || !nombre.matches("^[a-zA-Z\\s]+$"))
                        {
                            System.out.println("error, digitos erroneos");
                        }else {
                            break;
                        }


                    }
                    while (true)
                    {
                        System.out.print("ingrese la facultad: ");
                        facultad=leercadena.lectura();
                        if(facultad.trim().isEmpty() || !facultad.matches("^[a-zA-Z\\s]+$"))
                        {
                            System.out.println("error, digitos erroneos");
                        }else {
                            break;
                        }

                    }
                    Univ.RegistrarDatos(codigo,nombre,facultad);
                    Univ.MostrarDatos();
                }break;
                case 3:
                {
                    System.out.println("Hasta luego");
                }break;
            }

        }while(op!=3);

    }
}
