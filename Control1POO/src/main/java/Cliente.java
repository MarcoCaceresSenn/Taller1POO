import java.util.ArrayList;

public class Cliente extends Usuario{
    private String fechaDeCumpleaños;
    ArrayList<Cliente>clientes = new ArrayList<>();

    public Cliente(String nombre, int rut, String fechaDeCumpleaños) {
        super(nombre, rut);
        this.fechaDeCumpleaños = fechaDeCumpleaños;
    }

    public String getFechaDeCumpleaños() {
        return fechaDeCumpleaños;
    }

    public void setFechaDeCumpleaños(String fechaDeCumpleaños) {
        this.fechaDeCumpleaños = fechaDeCumpleaños;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
