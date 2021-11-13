import java.util.Random;
	import java.util.Scanner;
	
//your grade is 4.5/5
//fix class name to match file name ( Main should be RockPaperSe )
	public class Main {
	    public static void RockPaperSe(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        String computerPlays = "rps";
	       Random rnd = new Random();
	          do{
	            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
	           
	                String player= scan.nextLine();
	          
	               player =player.toLowerCase();
	         
	                char   player1 = player.charAt(0);
	                 
	              
	            if( player1 != 's' && player1 != 'r' && player1 != 'p'){
	                
	                     break;
	                     }
	                 
	            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
	                
	              if ( player1  == computerChoice  ){
	              System.out.println(  " is tie: user choice:"  + player1+ " computerChoice:" +  computerChoice); }
	                else if ( (player1 =='s' &&  computerChoice == 'p'  ) || ( player1 == 'p' && computerChoice == 'r') || (player1 =='r' && computerChoice == 's' )){
	              System.out.println("user wins: computerChoice:"+computerChoice+ "playr choice :"+player  ) ; 
	                
	              }
	            
	            else {
	       System.out.println("computer wins computerChoice:"+ computerChoice +  "playr choice:"+ player1);
	           }
	               
	            System.out.println("\n\n");
	        }while(true);
	              
	           
	   }       
	}
