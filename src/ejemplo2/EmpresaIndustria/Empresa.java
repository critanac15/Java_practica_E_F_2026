package ejemplo2.EmpresaIndustria;

public class Empresa {
    private String Nombre;
    private int Ruc;
    private float ProdTotal;

    public Empresa(String Nomb,int NRUC,float PrdT)
    {
        this.Nombre=Nomb;
        this.Ruc=NRUC;
        this.ProdTotal=PrdT;
    }
    public float DevolverProducto()
    {
        return ProdTotal;
    }
    public String Consultar()
    {
        return "ruc: "+Ruc+"\tNombre:"+Nombre+"\tProduccion total: "+ProdTotal+"\n";
    }

}
