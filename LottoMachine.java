
public class LottoMachine
{
   int numBalls;
   int numSelected;
   int [] balls;
   int [] selectedBalls;
   
   public LottoMachine (int n)
   {
       numBalls = n;
       balls = new int[n];
       for (int i = 0; i < n; i++) //initialize array
	   balls[i] = i+1;
   }
   
   public int getNumBalls()
   {
       return numBalls;
   }
   public void setNumBalls (int n)
   {
         numBalls =n;
   }
   public int getNumSelected()
   {
       return numSelected;
   }
   public void setNumSelected (int n)
   {
       numSelected = n;
   }
   public int[] selectBalls()
   {   int numChosen = 0;
       int[] chosen = new int [numSelected];
       for (int i = 0; i < numSelected; i++)
       {
	   int index = (int)(Math.random()* (numBalls-numChosen));
	   numChosen++;
	   chosen [i] = balls[index];
	   for (int j = index; j < numBalls-numChosen; j++)//slide up
               balls[j] = balls[j+1];
       }
       return chosen;
   }
}
