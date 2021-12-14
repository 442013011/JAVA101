import java.util.Scanner;
public class Largest {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Num1;
        float Num2;
        float Num3;
        System.out.println("Enter Num1");
        Num1 = scan.nextFloat();
        System.out.println("Enter Num2");
        Num2 = scan.nextInt();
        System.out.println("Enter Num3");
        Num3 = scan.nextFloat();

        if(Num1>Num2 && Num1>Num3 ){
        System.out.println("The largest score is" + Num1);
        }
        else if(Num2>Num1 && Num2>Num3 ){
        System.out.println("The largest score is  " + Num2);
        }
        else if(Num3>Num1 && Num3>Num2 ){
        System.out.println("The largest score is"+Num3);
        }
        
        }
        }
