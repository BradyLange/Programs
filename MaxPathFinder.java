/*
 * Brady Lange
 * 5/14/18
 * This program finds the longest path that nodes of the same label have
 */

class MaxPathFinder 
{
   public int MaxPath(int[] A, int[] E) {
       //N = amount of nodes
       //A = labels for nodes
       //E = Edges

       //Lengths of the arrays
       int ALen = A.length;
       int ELen = E.length;

       //Keeping track of the values that are the same
       int val = 0;
       //Finding the max amount of labels that are the same
       int max = 0;
       //Group the labels
       for(int i = 0; i < ALen; i++)
       {
           for(int k = 0; k < ALen; k++)
           {
               if(A[i] == A[k])
                   ++val;
               if(val > max)
                   max = val;
           }
           //Reset the label tracker
           val = 0;  
       }

       //Return the max value of lables minus 1 since N nodes will always have 1 less edge (E = N-1)
       return max - 1;
   }
}
