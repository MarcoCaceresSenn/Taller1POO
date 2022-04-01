public class Visualizar {
    public Visualizar(){

    }
    public void verRevista(){
    Libreria r1 = new Revista();
        System.out.println(r1.getRevistas());
    }
    public void verManual(){
        Libreria m1 = new Manual();
        System.out.println(m1.getManuales());
    }
    public void verLibros(){
        Libreria l1 = new Libro();
        System.out.println(l1.getLibros());
    }
}
