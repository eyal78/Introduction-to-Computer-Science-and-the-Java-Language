import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter the temperature:");
        double t1=scan.nextDouble();
        System.out.println("please enter the Unit of measure:");
        String unit=scan.next();
        if(unit.equals("f")||unit.equals("F"));
            System.out.println(t1);
        System.out.println(unit);
    }
}
