package ust;
import java.util.Scanner;
public class ust {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir taban sayısı giriniz");
		int n=scanner.nextInt();
		System.out.println("Bir üst sayısı giriniz");
		int k=scanner.nextInt();
		int total=1;
	
		for(int i=1;i<=k;i++)
		{
			total*=n;
		
			
		}
		System.out.println(total);

	}

}
