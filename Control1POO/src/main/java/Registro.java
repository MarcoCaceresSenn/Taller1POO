import java.util.Scanner;

public class Registro {
    Scanner leer = new Scanner(System.in);
    public Registro(){

    }
    public void registrarRevista(){
        System.out.println("Ingrese el nombre de la revista que quiere registrar(sin espacios)");
        String nRevista = leer.next();
        System.out.println("\ningrese el autor, editorial o el nombre de quien posea derechos de escritura de la revista(sin espacios)");
        String nAutor = leer.next();
        System.out.println("\ningrese el precio de la revista(en pesos chilenos)");
        int precioRevista = leer.nextInt();
        System.out.println("\ningrese el código con el cual se va a identificar este producto, por ejemplo: 123456789");
        int codRevista = leer.nextInt();
        System.out.println("\n¿Qué tipo de revista es?");
        System.out.println("\nentretenimiento"+"\nhobbies"+"\nfarándula"+"\ninvestigación científica"+"\notro(escríbalo)");
        System.out.println("\nNOTA IMPORTANTE: en caso de tener más de un tipo separe de esta forma 'tipo1,tipo2,etc'");
        String[] tipoRevista = {leer.next()};
        Revista rev = new Revista(nRevista,nAutor,precioRevista,codRevista,tipoRevista);

        //agregar revista a un arreglo-------------------------------------------------------------------------------
        Libreria agregarRevista = new Libreria();
        agregarRevista.addRevista(rev);
    }
    public void registrarManual(){
        System.out.println("Ingrese el nombre del manual que quiere registrar(sin espacios)");
        String nManual = leer.next();
        System.out.println("\ningrese el autor, editorial o el nombre de quien posea derechos de escritura sobre el manual(sin espacios)");
        String nAutor = leer.next();
        System.out.println("\ningrese el precio del manual(en pesos chilenos)");
        int precioManual = leer.nextInt();
        System.out.println("\ningrese el código con el cual se va a identificar este producto, por ejemplo: 123456789");
        int codManual = leer.nextInt();
        System.out.println("\n¿Cuál es el área de aplicación donde se puede usar útilmente este manual?");
        String[] areaAplicacion = {leer.next()};
        
        Manual man = new Manual(nManual,nAutor,precioManual,codManual,areaAplicacion);

        //agregar manual a un arreglo------------------------------------------------------------------------------
        Manual agregarManual = new Manual();
        agregarManual.addManual(man);
    }
    public void registrarLibro(){
        System.out.println("Ingrese el nombre del manual que quiere registrar(sin espacios)");
        String nLibro = leer.next();
        System.out.println("\ningrese el autor, editorial o el nombre de quien posea derechos de escritura sobre el manual(sin espacios)");
        String nAutor = leer.next();
        System.out.println("\ningrese el precio del manual(en pesos chilenos)");
        int precioLibro = leer.nextInt();
        System.out.println("\ningrese el código con el cual se va a identificar este producto, por ejemplo: 123456789");
        int codLibro = leer.nextInt();
        System.out.println("\ningrese la edad requerida recomendada para leer este libro");
        int edadRecom = leer.nextInt();

        Libro lib = new Libro(nLibro,nAutor,precioLibro,codLibro,edadRecom);

        //agregar libro a un arreglo----------------------------------------------------------------------------------
        Libro agregarLibro = new Libro();
        agregarLibro.addLibro(lib);
    }
}
