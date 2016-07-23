import java.util.Scanner;


public class Test {

	
	public static void main(String[] args)  {
			int x,r=0;
			 Scanner in=new Scanner(System.in);
			 x=in.nextInt();
			 while(x!=0){
		 r=r*10+x%10;
			 x=x/10;
			 }
			 System.out.println(r);
		
}
}