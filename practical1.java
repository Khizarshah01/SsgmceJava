import java.util.*;
public class practical1
{
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  int n = myObj.nextInt();
		  if(n%2==0){
		      System.out.print("the given number is even");
		  }
		  else{
		      System.out.print("The given number is odd");
		  }
	}
}
