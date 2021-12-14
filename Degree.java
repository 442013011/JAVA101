import java.util.Scanner;
class Degree{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
     float G;
      System.out.println("Enter your G");
      G =scan.nextFloat();
      
     if(G<= 100 && G>=90 ){
     System.out.println(G+": is A");}
     else if ( G<90 && G >= 80){
     System.out.println(G+ ": is B");}
     else if ( G<80 && G>=70){
      
       System.out.println(G+" is c");}
      
       else if (G<70 && G>= 60){
     
       System.out.println(G+"is D");}
      
       else if (G<60){
      
           System.out.println("sorry your fail");
       }
        
           else{
              System.out.println("Error"); 
           }
  }
}
