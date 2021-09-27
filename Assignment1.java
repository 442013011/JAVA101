import java.util.Scanner;
class Main {
 public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    float num1;
    float num2;
    System.out.println("Enter a num");
    num1 = myObj.nextfloat();
    System.out.println("Enter a num");
    num2 = myObj.nextfloat();
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    System.out.println(num1%num2);
    System.out.println(num1>num2);
    System.out.println(num1>=num2);
    System.out.println(num1<num2);
    System.out.println(num1<=num2);
    System.out.println(num1!=num2);
    System.out.println(num1==num2);
   }
 }
