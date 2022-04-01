import java.util.Arrays;

public class Revista extends Libreria{
    private String[] tematicas ={"entretenimiento","hobbies","farándula","investigación científica","otro"};

    public Revista(String titulo, String autor, int precio, int codigoIdentificador, String[] tematicas) {
        super(titulo, autor, precio, codigoIdentificador);
        this.tematicas = tematicas;
    }

    public Revista(String[] tematicas) {
        this.tematicas = tematicas;
    }

    public Revista(){

    }

    public String[] getTematicas() {
        return tematicas;
    }

    public void setTematicas(String[] tematicas) {
        this.tematicas = tematicas;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "tematicas=" + Arrays.toString(tematicas) +
                '}';
    }
}
