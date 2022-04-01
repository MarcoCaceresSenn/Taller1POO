import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //registrar usuarios------------------------------------------------------------------------------------------
        System.out.println("usted es ¿Cliente o Vendedor?");
        System.out.println("\n1: cliente"+"\n2: vendedor");


        //Libreria----------------------------------------------------------------------------------------------------
        int respuesta = 1;

        while (respuesta == 1) {
            System.out.println("¿desea registrar o visualizar algún elemento?(en caso contrario digíte '0' para salir)");
            System.out.println("1: registrar" + "\n2:visualizar");
            respuesta = leer.nextInt();
            if (respuesta == 1) {
                System.out.println("¿Qué desea registrar?");
                System.out.println("1: Revista." + "\n2: Manual." + "\n3: Libro.");
                int elección = leer.nextInt();
                switch (elección) {
                    case 1:
                        Registro regRev = new Registro();
                        regRev.registrarRevista();
                        respuesta = 1;
                        break;
                    case 2:
                        Registro regMan = new Registro();
                        regMan.registrarManual();
                        respuesta = 1;
                        break;
                    case 3:
                        Registro regLib = new Registro();
                        regLib.registrarLibro();
                        respuesta = 1;
                    default:
                        System.out.println("respuesta inválida, vuelva a intentar");
                        respuesta = 1;break;
                }
            }
            else{
                if(respuesta == 2){
                    System.out.println("\n¿Qué desea visualizar?");
                    System.out.println("1: Revista." + "\n2: Manual." + "\n3: Libro.");
                    int elección = leer.nextInt();
                    switch (elección) {
                        case 1:
                            Visualizar verRev = new Visualizar();
                            verRev.verRevista();
                            respuesta = 1;
                            break;
                        case 2:
                            Visualizar verMan = new Visualizar();
                            verMan.verManual();
                            respuesta = 1;
                            break;
                        case 3:
                            Visualizar verLib = new Visualizar();
                            verLib.verLibros();
                            respuesta = 1;
                            break;
                        default:
                            System.out.println("respuesta inválida, vuelva a intentar");
                            respuesta = 1;
                            break;
                    }
                }
            }
        }
    }
}
