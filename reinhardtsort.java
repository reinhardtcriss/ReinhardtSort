/**
 * Auto Generated Java Class.
 */
 //wut, i didn't forget how to into a class. Fak u. This is my class. 
 
 
import java.util.Random; // inna help with make the random number of things.
import java.util.Arrays; // i nee that for print statement
public class reinhardtsort {
  
  //uncomment this if you wan see it workie.
  public static void printarray(int[] toprint){
  // System.out.println(Arrays.toString(toprint)); 
  }
  
  //just a simple array of ten. 
  public static void sorttest(){
   int[] testArray = { 5, 2, 1, 1, 5, 7, 6, 8, 10, 9 };
   sortarray(testArray); 
  }
  
  //the big kahoochie
  public static void sortarray(int[] tosort){
	//0 is good. we like zero. 
    int n = 0;
    int n1 = 0;
    long count = 0;
    printarray(tosort);
	//from left to right, but not the first, always from the second
    for(int i = 1; i< tosort.length; i++){
	  //if the leftmost from where we just started is the biggest
      n = tosort[i-1];
      n1 = tosort[i];
      if(n > n1){
		//then save it, as (n) and then write everything from n+1 up into n up
        for(int j = i-1; j < (tosort.length -1); j++){
         tosort[j] = tosort[j+1];  
        }
		//place n at the END of the list. We will deal with you again later. 
        tosort[tosort.length-1] = n;
		//Start Over. 
        i = 0;
        printarray(tosort);
      }
	  //count the number of times this has been done
      count = count + 1;
    }
    System.out.println("THE COUNT IS");
    System.out.println(count);
   }
  
  //gen a random array of a seed and run the algorithm on it. 
  public static void sortrandarray(int numelements){
   Random rd = new Random();
   int[] sortme = new int[numelements];
   for(int i = 0; i< sortme.length; i++){
    sortme[i] =  rd.nextInt();
   }
   sortarray(sortme);
  }
  
  
    //same as the other but it returns your sorted array.
  public static int[] sortandreturn(int[] tosort){
	//0 is good. we like zero. 
    int n = 0;
    int n1 = 0;
    long count = 0;
    printarray(tosort);
	//from left to right, but not the first, always from the second
    for(int i = 1; i< tosort.length; i++){
	  //if the leftmost from where we just started is the biggest
      n = tosort[i-1];
      n1 = tosort[i];
      if(n > n1){
		//then save it, as (n) and then write everything from n+1 up into n up
        for(int j = i-1; j < (tosort.length -1); j++){
         tosort[j] = tosort[j+1];  
        }
		//place n at the END of the list. We will deal with you again later. 
        tosort[tosort.length-1] = n;
		//Start Over. 
        i = 0;
        printarray(tosort);
      }
	  //count the number of times this has been done
      count = count + 1;
    }
    //System.out.println("THE COUNT IS");
   // System.out.println(count);
	return tosort;
   }
  
  /* ADD YOUR CODE HERE */
  
}
