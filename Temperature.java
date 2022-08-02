import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args)
    {
        double c=0,k=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter the temperature:");
        double t1=scan.nextDouble();
        System.out.println("please enter the Unit of measure:");
        String unit=scan.next();
        if(unit.equals("f"))
        {
           c=(5*(t1-32))/9;
           k=c+273.15;
           System.out.println(c+" c");
           System.out.println(t1+" f");
           System.out.println(k+" k");
        }
        else
           System.out.println("Not yet written");
    }
}
