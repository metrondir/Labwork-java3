import java.util.Scanner;
public class  Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Введіть ширину основи прямокутного паралелепіпеда в см:");
        double c = scan.nextDouble();
        System.out.println("Введіть довжину прямокутного паралелепіпеда в см:");
        double d = scan.nextDouble();
        System.out.println("Введіть висоту прямокутного паралелепіпеда в см:");
        double h = scan.nextDouble();
        System.out.println("Введіть довжину ребра куба см:");
        double a = scan.nextDouble();


        Solid rectsolid;
        rectsolid = new RectSolid(c, d,h);
        Solid cube;
        cube = new Cube(a);

        double square_rect_solid = rectsolid.GetVolume();
        System.out.println("Volume of RectSolid: " + square_rect_solid);
        double square_cube = cube.GetVolume();
        System.out.println("Volume of Cube: " + square_cube);
    }
}

abstract class Solid {
    abstract double GetVolume();
}
class RectSolid extends Solid {
    double C;
    double D;
    double H;


    RectSolid(double C, double D,double H) {
        this.C = C;
        this.D = D;
        this.H = H;

    }
    @Override
    double GetVolume() {
        return C*D*H;
    }
}

class Cube extends Solid {
    double A;

    Cube(double A) {
        this.A = A;
    }
    @Override
    double GetVolume() {
        return A*A*A;
    }
}