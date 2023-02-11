import java.util.Scanner;
public class cube {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("lenghtof cube ="  );
        double L = sc.nextDouble();
        double area1side ,areatotalcube,volume;
        area1side = L*L ;
        areatotalcube = 6*( L*L);
        volume = L*L*L ;
        System.out.println("Area of shaded area =" + area1side  );
        System.out.println("Area of shaded area =" + areatotalcube  );
        System.out.println("Area of shaded area =" + volume );
    }
}