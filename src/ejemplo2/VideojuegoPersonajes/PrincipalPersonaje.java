package ejemplo2.VideojuegoPersonajes;



public class PrincipalPersonaje {

    public static void main(String[] args) {
        //declaracion de variables
        int op,punteria,filo;
        String nombre,combo,genero,espada,flecha;
        double estatura;
        PersonajeArquero arq=new PersonajeArquero();
        PersonajeEspadachin esp=new PersonajeEspadachin();
        do {
            System.out.println("\n\t=======Personajes=========");
            System.out.println("1. Arquero");
            System.out.println("2. Espadachin");
            System.out.println("3. Salir");
            while (true)
            {
                try
                {
                    System.out.print("ingrese una opciion: ");
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
            switch (op)
            {
                case 1:
                {
                    //validacion de datos
                    while (true)
                    {
                        System.out.print("ingrese el nombre: ");
                        nombre=leercadena.lectura();
                        if(nombre.trim().isEmpty() || !nombre.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            break;
                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese el genero: ");
                        genero=leercadena.lectura();
                        if(genero.trim().isEmpty() || !genero.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            //validacion de genero
                            if(!genero.toUpperCase().equals("FEMENINO") && !genero.toUpperCase().equals("MASCULINO"))
                            {

                            }else {
                                break;
                            }
                        }
                    }
                    while(true)
                    {
                        System.out.print("LLeva combo? (si/no): ");
                        combo=leercadena.lectura();
                        if(combo.trim().isEmpty() || !combo.matches("^[a-zA-Z\\s]+$"))
                        {
                        }else {
                            if(!combo.toUpperCase().equals("SI") && !combo.toUpperCase().equals("NO"))
                            {

                            }else{
                                break;
                            }
                        }
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese la estatura: ");
                            estatura=Double.parseDouble(leercadena.lectura());
                            if(estatura<1 || estatura>3)
                            {

                            }else {
                                break;
                            }
                        }catch (NumberFormatException e)
                        {

                        }
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese la punteria(0-10) : ");
                            punteria=Integer.parseInt(leercadena.lectura());
                            if(punteria<1 || punteria>10)
                            {

                            }else {
                                break;
                            }
                        }catch (NumberFormatException e)
                        {

                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese el tipo de flecha: ");
                        flecha=leercadena.lectura();
                        if(flecha.trim().isEmpty() || !flecha.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            break;
                        }
                    }
                    arq.RegistrarDatos(nombre,genero,estatura,combo,punteria,flecha);
                    arq.MostrarDatos();
                }break;
                case 2:
                {
//validacion de datos
                    while (true)
                    {
                        System.out.print("ingrese el nombre: ");
                        nombre=leercadena.lectura();
                        if(nombre.trim().isEmpty() || !nombre.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            break;
                        }
                    }
                    while(true)
                    {
                        System.out.print("ingrese el genero: ");
                        genero=leercadena.lectura();
                        if(genero.trim().isEmpty() || !genero.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            //validacion de genero
                            if(!genero.toUpperCase().equals("FEMENINO") && !genero.toUpperCase().equals("MASCULINO"))
                            {

                            }else {
                                break;
                            }
                        }
                    }
                    while(true)
                    {
                        System.out.print("LLeva combo? (si/no): ");
                        combo=leercadena.lectura();
                        if(combo.trim().isEmpty() || !combo.matches("^[a-zA-Z\\s]+$"))
                        {
                        }else {
                            if(!combo.toUpperCase().equals("SI") && !combo.toUpperCase().equals("NO"))
                            {

                            }else{
                                break;
                            }
                        }
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese la estatura: ");
                            estatura=Double.parseDouble(leercadena.lectura());
                            if(estatura<1 || estatura>3)
                            {

                            }else {
                                break;
                            }
                        }catch (NumberFormatException e)
                        {

                        }
                    }

                    while(true)
                    {
                        System.out.print("ingrese el tipo de espada: ");
                        espada=leercadena.lectura();
                        if(espada.trim().isEmpty() || !espada.matches("^[a-zA-Z\\s]+$"))
                        {

                        }else {
                            break;
                        }
                    }
                    while(true)
                    {
                        try
                        {
                            System.out.print("ingrese el tipo de filo(0-10) : ");
                            filo=Integer.parseInt(leercadena.lectura());
                            if(filo<1 || filo>10)
                            {

                            }else {
                                break;
                            }
                        }catch (NumberFormatException e)
                        {

                        }
                    }
                    esp.RegistrarDatos(nombre,genero,estatura,combo,espada,filo);
                    esp.MostrarDatos();
                }break;
                case 3:
                {
                    System.out.println("Hasta luego");
                }break;
            }
        }while(op!=3);

    }
}
