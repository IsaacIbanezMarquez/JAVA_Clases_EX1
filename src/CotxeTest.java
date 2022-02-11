import java.util.Scanner;

public class CotxeTest
{

//1. Crea una classe Cotxe que tingui els atributs model i matrícula,
// i els corresponents mètodes set i get per a cada un.
//
//Crea una altra classe CotxeTest amb un main on es creïn 2 objectes
// de tipus Cotxe i es provin els seus mètodes set i get.

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        Cotxe cotxe2 = new Cotxe();
        Cotxe cotxe1 = new Cotxe();


        System.out.println("Introduce numero de matricula del coche1: ");

        cotxe1.setMatricula(sc.nextInt());

        System.out.println("Introduce el modelo del coche1: ");

        cotxe1.setModel(sc.next());

        System.out.println("" +
                "");
        System.out.println("COCHE2:");
        System.out.println("" +
                "");

        System.out.println("Introduce numero de matricula del coche2: ");

        cotxe2.setMatricula(sc.nextInt());

        System.out.println("Introduce el modelo del coche2: ");

        cotxe2.setModel(sc.next());

        System.out.println("" +
                "");

        System.out.println("Coche1: " + "Matrícula: " + cotxe1.getMatricula() + "| Modelo: " + cotxe1.getModel());

        System.out.println("" +
                "");

        System.out.println("Coche2: " + "Matrícula: " + cotxe2.getMatricula() + "| Modelo: " + cotxe2.getModel());


    }

}
