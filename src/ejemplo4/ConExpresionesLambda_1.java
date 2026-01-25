package ejemplo4;

public class ConExpresionesLambda_1 {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        OperacionS s=()-> System.out.println("la suma es: "+(a+b));
        s.sumar();
    }
}
