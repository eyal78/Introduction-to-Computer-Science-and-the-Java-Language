import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args)
    {
        double c=0,k=0,f=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter the temperature:");
        double t1=scan.nextDouble();
        System.out.println("please enter the Unit of measure:");
        String unit=scan.next();
        if(unit.equals("f"))
        {
           c=(5*(t1-32))/9;
           k=c+273.15;
           f=t1;
        }
        else 
        if(unit.equals("c")) 
        {
           k=c+273.15;
           f=(9*(k-273.15))/5+32;
           c=t1;
        } 
        else 
        if(unit.equals("k"))
        {
           k=t1;
           f=(9*(k-273.15))/5+32;
           c=5*(f-32)/9;
        } 
        else
            System.out.println("There is an error with the temperature unit");
        System.out.println(c+" c");
        System.out.println(t1+" f");
        System.out.println(k+" k");
    }
}
