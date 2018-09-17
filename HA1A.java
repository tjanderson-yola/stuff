import java.util.*;

 public class HA1A
 {
  public static void main( String [] args )
  {
   LottoMachine  myMachine = new LottoMachine(10);
   int [] selections = new int [10];
	Scanner myScan = new Scanner(System.in);
	int n = myScan.nextInt(); 
   myMachine.setNumSelected(n);
   selections = myMachine.selectBalls();
   for (int i = 0; i < n; i++)
       System.out.print(selections[i]+ "  ");
  }
 }

