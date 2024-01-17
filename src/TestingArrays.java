import java.util.Arrays;

public class TestingArrays {
    public static void main(String[] args) {

/*int [] numebrs = {4,6,4,7,8};
 int count =0;
        for(int i =0; i<=numebrs.length ; i++){
            if(numebrs[i]==4){
                numebrs[i] = 5;
            }
            System.out.println(numebrs[i]);

        }*/
        // Sorryingan array ascending order or descendign order

     /*   int numbers [] = {4,3,2,1};

        for (int i= 0 ; i<=numbers.length; i++){
            for (int j =i+1; j<=numbers.length;j++){
                if (numbers[i]>numbers[j]){
                    int temp = numbers[i] ;
                    numbers[i] = numbers[j];
                    numbers[i] =temp;
                }
            }
        }*/

        //String [] names = {"testin1", "rao","cahndu", "ramu"};

// find the maxmium number from array element
  /*      int arr[] = {12, 13, 1, 10, 34, 10};
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max <arr[i])
            {
                max = arr[i];
            }

        }

        System.out.print(max);*/


        // swapping between twi arrays

       /* int x [] = {1,2,3};
        int y [] = {4,5,7};
        int temp ;
        if (x.length !=y.length){
            System.out.println("out of the scope");
        } else {
            for(int i= 0 ; i<=x.length; i++){
                temp =x[i];
                x[i]= y[i];
                y[i] = temp;

                System.out.println(temp);
            }

        }

*/
/*

        int y[] = {2, 4, 3, 6, 9};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < y.length; i++) {
            if (y[i] % 2 == 0) {
                evenCount++;
            }
            if (y[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("even count :" + evenCount + "  oddcount:" + oddCount);
*/


 /* int test [] = {1,4,6,9,10};

  for (int i = 0; i<test.length; i++){
      for(int j=i+1; j< test.length;j++){
          if(test[i]+test[j]==15){
              System.out.println(" Printer the value = " +test[i] +" ="+test[j] );
          }

      }
  }*/

    /*    int test2 [] = {10, 2, 5, 7, 9};
        int test3 [] = {2, 5, 1, 9, 7};
        if (test2.length == test3.length) {
            for (int i = 0; i <test2.length; i++) {
                for (int j = 0; j < test3.length; j++) {
                    if (test2[i] == test3[j]) {

                        System.out.println("value= "+ test2[i]+" j value: "+test3[j]);

                    }

                }
            }

        }*/
        /*
         int assend [] = {1,4,6,9,10};
         int i = 0;
         int j = assend.length - 1;
          while(i < j) {
              int sum = assend[i] + assend[j];
              if(sum == 15) {
                  System.out.println("success= ");
                  break;
              }
              else if (sum < 15) {
                  i++;
              } else {
                  j--;
              }
          }*/

       /* int [] numbers= {1,2,3,4,5};
        int i=0;
        int j = numbers.length-1;

        // i = 0
        // j = 5 - 1 = 4
        // arr[i] = 1, arr[j] = 5

       while(i<j){

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j]= temp;
            i++;
            j--;

        }
        System.out.println( "printer reverse value ="+ Arrays.toString(numbers));
*/


// revese the strting

/*int num[] = {4,9,10,7,11};
int length = num.length-1 ;
for (int i =length; i>=0 ; i--){
    System.out.println(num[i]);

}*/

//  maxiimum consecutive ones

      /*  int maxNum [] = {0,1,1,1,1,0,0,1,1,1,0};

        int count = 0 ;
        int result=0;

        for (int i =0; i<maxNum.length ;i++){
            if (maxNum[i]==1){
                count ++;

            }
            else {
//                if (count > result){
//                    result = count;
//                }
                result = Math.max(count,result);

                count =0;

            }

        }
        System.out.println("" +result);
*//*
        int maxNum [] = {0,1,1,1,1,0,0,1,1,1,0};
        int i = 0 ;
        int count = 0 ;
        int result=0;
        while(i< maxNum.length){
            if (maxNum[i]==1) {
                count++;
            }
            else
                {
                    if (count>result)
                        result =count;
                    count =0;
                }

            i++;
            }
        System.out.println(result);


*/









        }

        }







