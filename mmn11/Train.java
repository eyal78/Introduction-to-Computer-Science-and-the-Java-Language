import java.util.Scanner;

public class Train 
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
		double x1,x2,deltaX;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the speed of train 1:");
		int v1=scan.nextInt();
		System.out.println("please enter the time of train 1:");
		double t1=scan.nextDouble();
		t1=t1/60;
		System.out.println("please enter the speed of train 2:");
		int v2=scan.nextInt();
		System.out.println("please enter the stime of train 2:");
		double t2=scan.nextDouble();
		t2=t2/60;
		x1=v1*t1;
		x2=v2*t2;
		deltaX=Math.abs(x1-x2);
		System.out.println("The distance between the train is "+deltaX+" km.");
		
	}
}
