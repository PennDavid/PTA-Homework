
import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

/*你写的代码将嵌入到这里*/
class RTriangle implements IShape {
    private double a,b;
    public RTriangle (double a,double b) {
        this.a=a;this.b=b;
    }

    @Override
    public double getArea() {
        return a*b*0.5;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(a*a+b*b)+a+b;
    }
}


public class Main {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
