import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        delta();

    }

    public static double Inputa() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        double a = Input.nextDouble();
        return a;
    }

//            System.out.println("Podaj b ");
//      double b=Input.nextDouble();
//            System.out.println("Podaj c");
//            double c=Input.nextDouble();
//return a;

    public static double Inputb() {
        Scanner Inputb = new Scanner(System.in);
        System.out.println("Podaj b: ");
        double b = Inputb.nextDouble();
        return b;
    }

    public static double Inputc() {
        Scanner Inputc = new Scanner(System.in);
        System.out.println("Podaj c: ");
        double c = Inputc.nextDouble();
        return c;
    }

    public static void delta() {
        double b = Inputa();
        double a = Inputb();
        double c = Inputc();
        double delta = ((b * b) * 4 * a * c);
        System.out.println("Delta wynosi " + delta);

        if (delta < 0) ;
        System.out.println("Delta mniejsza od zera - brak miejsc zerowych");

        double resoult = Math.sqrt(delta);
        if (delta > 0) {
            double x1 = (-b - resoult) / 2 * a;
            double x2 = (-b + resoult) / 2 * a;
            System.out.println("Funkcja ma dwa miejsca zerowe: " + " x1: " + x1 + " , x2: " + x2);
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("Funkcja ma jedno miejsce zerowe x0= " + x0);

        }

        //  System.out.println(Math.sqrt(delta));
    }
}







