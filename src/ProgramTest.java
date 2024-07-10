import java.util.ArrayList;
import java.util.Arrays;

public class ProgramTest {
    public static void primenumbers() {

        int n = 29;
        boolean isprime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        System.out.println(isprime);
    }



    public static void primenumbers_givenrange() {
        int count;
        for (int i = 25; i <= 70; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }

    public static void conditionStatmentsAmongThreenumbers(int i, int j, int k) {
        int result = 0;
        if (i > j) {
            result = i;
        } else {
            result = j;
        }
        if (k > result) {
            System.out.println(result = k);
        }
        System.out.println(result);
    }

    public static void writeaJavaProgramtoswaptwonumbersusingthethirdvariable() {
        int x = 10;
        int y = 25;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x + "" + "\n" + "" + y);
    }
    public static void writeaJavaProgramtoswaptwonumbersWithoutusingthethirdvariable() {
        int x = 15;
        int y = 10;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " :" + y);
    }

    public static void WriteaJavaProgramtofindtheduplicatecharactersinastring() {

        String str = "mallikarjun rao";
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void WriteaJavaProgramtoremoveallwhitespacesfromastringwithusingreplace() {
        String str1 = "Saket Saurav        is a QualityAna    list";
        String str2 = str1.replaceAll("\\s", "");
        System.out.println(str2);
    }

    public static void WriteaJavaProgramtoremoveallwhitespacesfromastringwithoutusingreplace() {
        String str1 = "Saket Saurav        is a QualityAna    list";

        char[] ch = str1.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str1.length(); i++) {
            if ((ch[i] != ' ') && (ch[i] != '\t')) {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);

    }
    public static void convertFirstletterOfWordToUpperCase() {
        String  str = " come fly with me";
        char [] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i =0 ; i<str.length(); i++){
            if (ch[i] != ' '&& ch[i-1] == ' '){
                sb.append(Character.toUpperCase(ch[i]));
            } else {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);

    }


    public static void SeparateCharactersAndNumbers() {
        String inputString = "sh237gbfy73uh4h89ufnf89njfdbu";
        StringBuilder mychar = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            Character current = inputString.charAt(i);
            if (Character.isLetter(current)) {
                mychar.append(current);
            } else if (Character.isDigit(current)) {
                numbers.append(current);
            }
        }
        System.out.println(mychar.toString());
        System.out.println(numbers.toString());
    }




    public static void ElementsInAnArrayWhoseSumIsEqualToAGivenNumber() {
        int arr[] = {4, 5, 7, 11, 9, 13, 8, 12};
        int input = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == input) {
                    System.out.println(arr[i] + " :" + arr[j] + "= " + input);
                }
            }
        }
    }

    public static void FindContinuousSubArrayInArrayWhoseSumIsEqualToNumber() {

        //Initializing sum with the first element of the inputArray

        int inputArray[] = {12, 5, 31, 9, 21, 8};
        int inputNumber = 45;
        int sum = inputArray[0];
        //Initializing starting point with 0
        int start = 0;

        //Iterating through inputArray starting from second element

        for (int i = 1; i < inputArray.length; i++) {
            //Adding inputArray[i] to the current 'sum'
            sum = sum + inputArray[i];
            //If sum is greater than inputNumber then following loop is executed until
            //sum becomes either smaller than or equal to inputNumber
            while (sum > inputNumber && start <= i - 1) {
                //Removing starting elements from the 'sum'
                sum = sum - inputArray[start];
                //Incrementing start by 1
                start++;
            }
            //If 'sum' is equal to 'inputNumber' then printing the sub array
            if (sum == inputNumber) {
                System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");

                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void maxSubarrayGivenSize() {

        int arr[] = {2, 9, 31, -4, 21, 7};
        int k = 3;
        int Wsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            Wsum = Wsum + arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            Wsum = Wsum - arr[i - k] + arr[i];
            Maxsum = Math.max(Maxsum, Wsum);
        }

        System.out.println(Maxsum);
    }

    public static void Remove_characters_from_second_string_that_are_present_inthefirststring() {

        String firstString = "aeiou";
        String secondString = "Hello World";
        // Remove characters from second string that are present in the first string
        String result = secondString.replaceAll("[" + firstString + "]", "");
        System.out.println("Result: " + result);
    }

public static void removeCharactersGivenInFirstStringFromTheSecondString() {

    String str1 = "aeiou";
    String str2 = "HelloWorld";
    char [] ch = str1.toCharArray();
    char [] ch2= str2.toCharArray();
    StringBuilder result = new StringBuilder();

   for (int i =0 ;i<str1.length(); i++){
       for (int j =0 ; j<str2.length(); j++){


       }

   }


}


    public static void main(String[] args) {

    }
}
