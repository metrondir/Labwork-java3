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



        System.out.println("Volume of RectSolid: " + rectsolid.Volume());
        rectsolid.draw();
        System.out.println("Perimeter of RectSolid: " + rectsolid.Perimeter());
        System.out.println("Square of RectSolid: " + rectsolid.Square());
        System.out.println("Diagonal of RectSolid: " + rectsolid.Diagonal());


        System.out.println("Volume of Cube: " + cube.Volume());
        cube.draw();
        System.out.println("Perimeter of RectSolid: " + cube.Perimeter());
        System.out.println("Square of RectSolid: " + cube.Square());
        System.out.println("Diagonal of RectSolid: " + cube.Diagonal());

    }
}

abstract class Solid {
    abstract double Volume();
    abstract void draw();
    abstract double Perimeter();
    abstract double Square();
    abstract double Diagonal();
}
class RectSolid extends Solid {
    double C;
    double D;
    double H;
    @Override
    void draw(){
        System.out.println("Виклик методу draw()класу RectSolid");
    }
    @Override
    double Perimeter(){
      return 4*(D+C+H);
    }
    @Override
    double Square()
    {
        return 2*(C*D+D*H+C*H);
    }
    @Override
     double Diagonal()
     {
         return Math.sqrt(C*C+D*D+H*H);
     }

    RectSolid(double C, double D,double H) {
        this.C = C;
        this.D = D;
        this.H = H;

    }
    @Override
    double Volume() {
        return C*D*H;
    }
}

class Cube extends Solid {
    double A;
    @Override
    void draw()
    {
        System.out.println("Виклик методу draw()класу Cube");
    }
    @Override
    double Perimeter(){
        return 12*A;
    }
    @Override
    double Square()
    {
        return 6*(A*A);
    }
    @Override
    double Diagonal()
    {
        return Math.sqrt(3)*A;
    }


    Cube(double A) {
        this.A = A;
    }
    @Override
    double Volume() {
        return A*A*A;
    }
}