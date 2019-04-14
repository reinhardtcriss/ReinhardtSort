/**
 * Auto Generated Java Class.
 */
 //wut, i didn't forget how to into a class. Fak u. This is my class. 
 
 /*
 ReinhardtSort is an innefficient sorting algorithm. I was asleep in class the day we did bigO notation so 
 I don't remember how to calculate it so im not gonna, but from my experimentation
 it would seem that reinhardtsort sorts in exponential time! Without recursion! Wow! Worse than bubblesort! Worse than slowsort?
How it works:

from the second from the left in the list rightwards, 
if the number left of the index pointer is greater than the number at the index pointer
then yeet that sucka to the end of the list. 
in doing so, you have to shuffle the whole list from the index pointer to the end of the list into the space left of it. this nerfs the 
number that is larger and left of the index pointer, so it has to be saved in memory so that it can be copied in at the end of the list. 
Doing this, it requires a LOT of array accesses, but only one integer worth of memory space for stuff, and the pointers and so on. 

this sorting algorithm is not "stable" im pretty sure that it could rearrange numbers of the same value but I could be wrong. it
 certainly moves them about. 

however it doesn't use that pesky recursion! it is a simple nested for loop arrangement 
which merely cleverly re-sets its own pointer to make sure that if it completes an operation to check the list over again. 
this is important because like "bubblesort" it is reliant on list elements working their way towards the beginning in a sort of natural
 process. 
I think that technically speaking instead of re-setting the pointer to zero after a completed loop iteration it actually only needs to 
be re-set to the previous pointer value minus one, which would save a few compare operations each time, but even doing this I think it 
would still be in exponential time. 

the list is sorted when the pointer reaches the final value without making a change to the list.
 */
 
 
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
