package ejemplo2.EmpresaIndustria;

public class Industria {
    private String NombreInd;
    private Empresa emp;

    public void Registrar()
    {
        int RUC;
        String NmEmp;
        float PrdT;

        System.out.print("Ingrese el nombre de la industris: ");
        NombreInd=leercadena.lectura();
        System.out.print("Ingrese el nombre de la empresa: ");
        NmEmp=leercadena.lectura();
        System.out.print("Ingrese el RUC de la empresa: ");
        RUC=Integer.parseInt(leercadena.lectura());
        System.out.print("Ingrese produccion de la empresa: ");
        PrdT=Float.parseFloat(leercadena.lectura());
        emp= new Empresa(NmEmp,RUC,PrdT);
    }
    public String ConsultarEmp()
    {
        String Datos;
        Datos=emp.Consultar();
        return "los datos de la empresa son: "+Datos;
    }
    public String TotalProducto()
    {
        float total;

        total=emp.DevolverProducto();
        return "el total de productos es: "+total;
    }
}
