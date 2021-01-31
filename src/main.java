
import java.util.Scanner;
import java.util.Stack;
import javax.sound.midi.Soundbank;


public class main {
  public static void playStack(Stack<Integer> A,Stack<Integer> B){
        int n1=0;
        int n2=0;
        
        if (!A.isEmpty()) {
            for(Integer i:A){n1=i;}

            for(Integer i:B){n2=i;}
            if (n1<n2 || n2==0) {B.push(A.pop());
            }
            else{System.err.println("ERROR! You can not move this disk.");}
        }        
        else{ System.err.println(A+" Tower is empty! Choose another stack");}     
              
    }
    public static  void printTower(Stack<Integer> X, Stack<Integer> Y,Stack<Integer> Z){
        
        System.out.print("Tower X: ");
        for(Integer i:X){
            System.out.print(i+",");
        }
        System.out.print("Tower Y: ");
        for(Integer i:Y){
            System.out.print(i+",");
        }
        System.out.print("Tower Z: ");
        for(Integer i:Z){
            System.out.print(i+",");
        }            
        
    } 
    public static void main(String[] args) { 
        
        Stack<Integer> X = new Stack<Integer>();
        Stack<Integer> Y = new Stack<Integer>();
        Stack<Integer> Z = new Stack<Integer>();
        
        
        System.out.println("Write the size of disks:");
        Scanner scanner= new Scanner(System.in);
        int disksize=scanner.nextInt();
         
        for (int i = disksize; i>=1; i--) {
            X.push(i);
        }       
        
        String options="Stack-Selection\n"  +"1)Move X-Y\n"  + "2)Move Y-X\n" + 
            "3)Move X-Z\n"+ "4)Move Z-X\n"  +"5)Move Y-Z\n" +"6)Move Z-Y\n";
        System.out.println(options);

        printTower(X, Y, Z);
        while (true) {        
            System.out.println("Choose a move:");
            System.out.println("");
            int select = scanner.nextInt();
            if (select==1) {
                playStack(X, Y);
                printTower(X, Y, Z);
                       
            }
            else if (select==2) {
                playStack(Y, X);
                printTower(X, Y, Z);
                     
            }
            else if (select==3) {
                playStack(X, Z);
                printTower(X, Y, Z); 
            }
            else if (select==4) {
                playStack(Z, X);
                printTower(X, Y, Z);
            }            
            else if (select==5) {
                playStack(Y, Z);
                printTower(X, Y, Z);
            }            
            else if (select==6) {
                playStack(Z, Y);
                printTower(X, Y, Z);
            }             
            
            else{
                System.out.println("Selection error choose between 1-6");
            
            }
        }
   }
}
