import java.util.ArrayList;

public class Vendedor extends Usuario{
    private String fechaDeContrato;
    private ArrayList<Vendedor> vendedores = new ArrayList<>();

    public Vendedor(String nombre, int rut, String fechaDeContrato) {
        super(nombre, rut);
        this.fechaDeContrato = fechaDeContrato;
    }

    public String getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(String fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}
