package ejemplo4;

public class SinExpresionesLambda_1 {
    public static int sumar(int a,int b){

        int suma=a+b;
        return suma;
    }

    public static void main(String[] args) {
        int a,b,s;
        a=5;
        b=3;
        s=sumar(a,b);
        System.out.println("la suma es: "+s);
    }
}
