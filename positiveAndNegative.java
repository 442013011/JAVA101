import java .util.Scanner;

public class positiveAndNegative
{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in); 
    System.out.println("enter a decimal num ");
    float num= scan.nextFloat();
       if(num>= 0 ){
       System.out.println(num);
        System.out.print("positive");
       }
      else if(num <0){
        System.out.println(num);
       System.out.print("negative");
      }   
        
	}
}
