import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArray {
    /* static boolean isPrime(int n)
     {
         // Corner case
         if (n <= 1)
             return false;

         // Check from 2 to n-1
         for (int i = 2; i < n; i++)
             if (n % i == 0)
                 return false;

         return true;
     }*/
    public static void main(String[] args) {
        // Write a Java program to remove duplicate elements from an array.

       /* int [] myarray = {10,22,10,11,22};
        ArrayList <Integer> unique = new ArrayList<Integer>();
         for (int i =0; i<myarray.length;i++){
               boolean isPresent = false;
             for(int j = 0; j<unique.size(); j++ ) {
                 if (myarray[i] == unique.get(j)) {
                     isPresent = true;
                 }
             }
             if (isPresent == false) {
                 unique.add(myarray[i]);
         }

}
        System.out.println(unique);*/

        // Java: Find the common elements between two arrays of integers

        /*int [] array1 = {4,7,8,9,10};
        int [] array2 = {6,5,7,8,10};
        if(array1.length ==array2.length){
            for (int i= 0; i<array1.length ; i++){
                for (int j = 0 ; j<array2.length;j++){
                    if(array1[i]==array2[j]){
                        System.out.println(" i values "+ array1 [i] +"j values : " +array2[j]);
                    }
                }
            }
        }*/

//14. Write a Java program to find common elements between two arrays (string values).
        /*String [] emparray = {"chandu","RAVI","ARJUN","SIVA"};
        String [] emparray2 = {"chandu","mallikarjun","SIVA","RAVI"};
        for (int k =0 ;k<emparray.length;k++){
            for (int l=0;l< emparray2.length; l++ ){
                if (emparray[k]==emparray2[l]){
                    System.out.println("cOMMNA VLAUE :  "+ emparray[k] +  "  commn  : "+emparray2[l] );
                }
            }
        }*/
//10. Write a Java program to find the maximum and minimum value of an array.
/*        int [] maxMinArray  = {7,10,55,1,10};
        int max = maxMinArray[0];
        int min = maxMinArray[0];

        for (int i=0 ; i<maxMinArray.length;i++) {
        if(maxMinArray[i]>max){
          max= maxMinArray[i];
         }
      if(maxMinArray[i]<min){
          min = maxMinArray[i];
            }
        }
        System.out.println( " :   " + max);
        System.out.println( " :   " + min);*/

//Write a Java program to find the second largest element in an array
/* int [] largest ={55,78,98,100,45};
 int temp ;

 for (int i =0; i< largest.length;i++){
     for (int j = i+1; j< largest.length; j++){
         if (largest[i]>largest[j]){
              temp = largest[i];
             largest[i] = largest[j];
             largest[j] = temp;
         }
     }

 }
 System.out.println("Third second largest number is:: "+largest[largest.length-2]);*/

//18. Write a Java program to find the second smallest element in an array.
       /* int [] smallest ={55,48,78,10,45};
        int temp ;

        for (int i =0; i< smallest.length;i++){
            for (int j = i+1; j< smallest.length; j++){
                if (smallest[i]<smallest[j]){
                    temp = smallest[i];
                    smallest[i] = smallest[j];
                    smallest[j] = temp;
                }
            }

        }
        System.out.println("Third second largest number is:: "+smallest[smallest.length-1]);
*/
        //11. Write a Java program to reverse an array of integer values.
      /*  int [] reverse = {9,8,7,6,5,4};
        int length = reverse.length-1;
        for (int i=length; i>=0;i--){
            System.out.println(reverse[i]);
        }
*/
// Write a program to find the prime numbuner in array elements
     /*   int [] primeNum = {10,5,9,12,13,15,9};
        int temp;
        int count =0;
        for(int i = 0; i<primeNum.length ; i++) {
                if (isPrime(primeNum[i])) {
                    count++;
                }

            }
        System.out.println(isPrime());




            }
*/


        //9. Write a Java program to insert an element (specific position) into an array.


    }


}



