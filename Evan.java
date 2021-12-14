import java.util.Scanner;
public class Evanorodd{
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
  
   int fd;
      fd =scan.nextInt();
    fd %=2;
    if(fd==0){
        System.out.print("even");
    }
    else{
        System.out.print("odd"); 
    }
}
    
}
