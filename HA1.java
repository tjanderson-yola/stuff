 /*   A program to run the Lotto machine
  */
 
 public class HA1 
 {
  public static void main( String [] args )
  {
   LottoMachine  myMachine = new LottoMachine(10);
   int [] selections = new int [10];
   myMachine.setNumSelected(5);
   selections = myMachine.selectBalls();
   for (int i = 0; i < 5; i++)
       System.out.println(selections[i]+ "  ");
  }
 }

