package ejemplo4;

public class ExpresionesLambda_1 {
    public static void main(String[] args) {

        //Definir la expresion lambda y guardarla en una variable de tipo runnable
        Runnable eje=() -> System.out.println(("Hola mundo"));

        //Llamar a la variable para que se ejecute
        eje.run();

    }
}
