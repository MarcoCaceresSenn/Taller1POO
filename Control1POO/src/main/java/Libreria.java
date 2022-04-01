import java.util.ArrayList;

public class Libreria {
    //atributos generales
    private String titulo;
    private String autor;
    private int precio;
    private int codigoIdentificador;
    //arraylist de los diferentes tipos de elementos.
    private ArrayList<Revista> revistas = new ArrayList<>();
    private ArrayList<Manual> manuales = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();

    //constructor con parámetros
    public Libreria(String titulo, String autor, int precio, int codigoIdentificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.codigoIdentificador = codigoIdentificador;
    }
    //constructor vacío
    public Libreria(){

    }

    //setter y getters necesarios

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //agregar to string para mostrar los datos

    @Override
    public String toString() {
        return "Libreria{" +
                "revistas=" + revistas +
                ", manuales=" + manuales +
                ", libros=" + libros +
                '}';
    }

    //agregar revista y mostrar-------------------------------------------------------------------------------------
    public void addRevista(Revista rev){
        revistas.add(rev);
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }
    //--------------------------------------------------------------------------------------------------------------
    //agregar manuales y mostrar------------------------------------------------------------------------------------
    public void addManual(Manual manual){
        manuales.add(manual);
    }

    public ArrayList<Manual> getManuales() {
        return manuales;
    }
    //---------------------------------------------------------------------------------------------------------------
    //agregar libros y mostrar---------------------------------------------------------------------------------------
    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    //----------------------------------------------------------------------------------------------------------------
}
