package comp.arrayOperations;
import java.util.Scanner;
public class ArrayInsertionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("enter no of eles");
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=scan.nextInt();
}
for(int value:a)
	System.out.println(value);
	}

}
