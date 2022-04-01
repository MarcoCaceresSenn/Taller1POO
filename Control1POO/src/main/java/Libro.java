public class Libro extends Libreria{
   private int edadMínimaRecomendada;


    public Libro(String titulo, String autor, int precio, int codigoIdentificador, int edadMínimaRecomendada) {
        super(titulo, autor, precio, codigoIdentificador);
        this.edadMínimaRecomendada = edadMínimaRecomendada;
    }

    public Libro(int edadMínimaRecomendada) {
        this.edadMínimaRecomendada = edadMínimaRecomendada;
    }

    public Libro(){

    }

    public int getEdadMínimaRecomendada() {
        return edadMínimaRecomendada;
    }
}
