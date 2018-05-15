/*
 * Brady Lange
 * 5/14/18
 * This program finds substrings in a given string
 */

class SubstringFinder 
{
   public int substringFind(String A, String B) 
   {
       // A = Number of times it must be stated such that B is a substring of the repeated string (1 to 1000 in length)
       // B = Substring of A, return -1 if never can be a substring of the repeated (1 to 1000 in length)

       int i = 1;
       //Search for the substring B in the string A
       while(i != 1000 && A.length() <= 1000)
       {
          //If the substring is in A return the amount of times A has to duplicate to find it
           if(A.contains(B))
               return i;  
          //Concatnate A to itself
           A += A;
           i++;
       }
      
      //If the substring isn't found return negative 1
       return -1;

   }
}
