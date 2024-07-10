import java.util.Arrays;

public class ArraysInterviewPractice {

    public static void sortTheArrayAscendingOrder(){
        int [] arr = {2,6,5,1,9};
        int temp =0 ;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length ;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
public static void the_minimum_maximum_element_of_an_array(){
        int arr[] ={1,423,6,46,34,23,13,53,4};
     int max = arr[0];
     int min = arr[0];
     for (int i=1 ; i<arr.length; i++){
         if (arr[i]>max){
             max = arr[i];
         }else if(arr[i]<min){

             min = arr[i];
         }
     }
        System.out.println(min);
        System.out.println(max);
    }

    public static int removeDuplicateFromArray(int[] arr){
            int rd = 0;
            Arrays.sort(arr);
           for (int i=1; i< arr.length; i++){
           if (arr[rd] !=arr[i]){
             rd ++;
             arr[rd] = arr[i];
         }
 }
     return rd+1;

    }

public static void isSorted_Check_whetherArrayIsSortedOnot(){
        int arr[]  = {2,4,6,8,9};
        for (int i=1 ; i<arr.length; i++){
            if (arr[i] < arr [i-1]){
                System.out.println("Array is not sortyed");
            }else {
                System.out.println("Array is  sorted" + Arrays.toString(arr));
            }
        }
}
    public static void main(String[] args) {

      /*  int [] arr = {7, 3, 4, 3, 7,4, 15};
        int rd1 = removeDuplicateFromArray(arr);
        System.out.println();
        for(int i =0 ; i<rd1; i++){
            System.out.println(arr[i] + " ");
        }*/

        isSorted_Check_whetherArrayIsSortedOnot();
    }}