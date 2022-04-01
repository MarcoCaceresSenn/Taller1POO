public class Manual extends Libreria{
    private String[] areaAplicacion={"ingeniería","artes","comunicación","entretenimiento","otro(especifique)"};

    //constructor con todos los parametros
    public Manual(String titulo, String autor, int precio, int codigoIdentificador, String[] areaAplicacion) {
        super(titulo, autor, precio, codigoIdentificador);
        this.areaAplicacion = areaAplicacion;
    }

    public Manual(String[] areaAplicacion) {
        this.areaAplicacion = areaAplicacion;
    }

    public Manual(){

    }
    //getters y setters
    public String[] getAreaAplicacion() {
        return areaAplicacion;
    }

    public void setAreaAplicacion(String[] areaAplicacion) {
        this.areaAplicacion = areaAplicacion;
    }
}
