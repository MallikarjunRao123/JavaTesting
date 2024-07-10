import javax.swing.*;
import java.awt.event.ItemEvent;
import java.net.Inet4Address;
import java.util.*;

public class ProblemSolving {
    public static void arrayElemenates_Duplicate_StringValues() {
        String[] arr = {"Nirmith", "Arjun", "Saket", "Saket", "Nirmith"};
        int count = 1;
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (String s : arr) {
            if (map1.containsKey(s)) {
                map1.put(s, map1.get(s) + 1);
            } else {
                map1.put(s, count);
            }
        }
        System.out.println(map1.entrySet());
    }

    public static void remove_continuous_occurrence_of_a_string_AAAABBBCCDDDD_Count() {
        String input = "AAAABBBCCDDDD";
        int threshold =3;
        Stack<Character> s = new Stack<>();
        char[] c = input.toCharArray();
        int count = 0;
        char lastChar ='=';
        for (char currChar : c) {
            if (count == threshold) {
                while (count != 0) {
                    s.pop();
                    count--;
                }
            }
            if (lastChar != currChar) {
                lastChar = currChar;
                count = 0;
            }
            count++;
            s.push(currChar);
        }
        if (count == threshold) {
            while (count != 0) {
                s.pop();
                count--;
            }
        }
        String out = "";
        while (!s.isEmpty()) {
            out = s.pop() + out;
        }
        System.out.println(out);
    }

    //grouoping anagarams

    //12) Write a Java program to reverse an array without using an additional array?
    public static void reverse_an_array_without_using_an_additional_array() {
        int[] arr = {12, 9, 21, 17, 33, 7};
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Check given number is Amstrong number or not
    public static void checkArmstrongNumber(int number) {
        int n = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            int lastDigitToThePower = 1;
            for (int i = 0; i < noOfDigits; i++) {
                lastDigitToThePower = lastDigitToThePower * lastDigit;
            }
            sum = sum + lastDigitToThePower;
            n = n / 10;
        }
        if (sum == number) {
            System.out.println(" Amstrong Number");
        } else {
            System.out.println("Not a amstrong number");
        }

    }

    //18) How to check whether one string is a rotation of another in Java?
    public static void findthe_most_frequent_element_in_an_array() {
        int[] arr = {6, 4, 6, 8, 9, 10, 5, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int element = 0;
        int frequency = 1;
        //Iterating through elementCountMap to get the most frequent element and its frequency
        Set<Map.Entry<Integer, Integer>> entryset = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entryset) {
            if (entry.getValue() > frequency) {
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }

        //Printing the most frequent element in array and its frequency
        if (frequency > 1) {
            System.out.println("Input Array : " + Arrays.toString(arr));
            System.out.println("The most frequent element : " + element);
        } else {
            System.out.println("Input Array : " + Arrays.toString(arr));
        }

    }


    //22) Write a Java program to find contiguous sub array with maximum sum?
    private static void getSubArrayWithMaxSum(int[] inputArray) {
        //Initializing bestSum to first element of input array and
        //bestStart and bestEnd to first index i.e 0
        int bestSum = inputArray[0];
        int bestStart = 0;
        int bestEnd = 0;
        //Initializing currentSum and currentStart to 0
        int currentSum = 0;
        int currentStart = 0;

        for (int i = 0; i < inputArray.length; i++) {
            //Adding current element to currentSum
            currentSum = currentSum + inputArray[i];
            //If currentSum becomes negative, clearing currentSum and
            //setting currentStart to next element
            if (currentSum < 0) {
                currentSum = 0;
                currentStart = i + 1;
            }
            // If currentSum exceeds bestSum, assigning currentSum to bestSum and
            //updating bestStart and bestEnd
            else if (currentSum > bestSum) {
                bestSum = currentSum;
                bestStart = currentStart;
                bestEnd = i;
            }
        }
        //Printing sub array with bestSum
        System.out.println("Input Array : " + Arrays.toString(inputArray));
        System.out.print("Continous Sub Array With Maximum Sum : ");
        System.out.print("[ ");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Sum : " + bestSum);
    }

    public static void occuranceofthewordInString() {
        String str = "good boy black moon good day boy moon";
        String[] str1 = str.split(" ");
        int count = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String words : str1) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words, count);
            }
        }
        System.out.println(map.entrySet());
        System.out.println("Occurence good word" + Collections.frequency(Collections.singleton("good"), Arrays.stream(str1).toList()));

    }

    public static void Howto_count_occurrencesof_each_characteri_string_inJava() {
        String str = "Java J2EE Java JSP J2EE";
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

    }

    public static void arrayElementCount() {
        int[] array = {6, 5, 7, 8, 9, 9, 10, 11, 4, 5};
        //Creating a HashMap object with elements of inputArray as keys and their count as values
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        //checking every element of the inputArray
        for (int i : array) {
            if (elementCountMap.containsKey(i)) {
                //If element is present in elementCountMap, incrementing it's count by 1
                elementCountMap.put(i, elementCountMap.get(i) + 1);
            } else {
                //If element is not present in elementCountMap,
                //adding this element to elementCountMap with 1 as it's value
                elementCountMap.put(i, 1);
            }
        }
        System.out.println("Input Array : " + Arrays.toString(array));
        System.out.println("Element Count : " + elementCountMap.entrySet());
    }

    public static void count_TheOccurance_OfSubString_IngiveString() {

        String str = "Good morning good day";
        String str2 = "good";
        int count = 0;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(str2)) {
                count++;
            }

        }
        System.out.println(str2 + " : " + count);
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void arrayInteger_DuplicateValues_Using_HashSet() {
        int[] arr2 = {1, 10, 3, 4, 8, 1, 1, 8, 6};
        int count = 1;
        HashSet<Integer> num = new HashSet<Integer>();
        for (Integer testdata : arr2) {
            if (num.contains(testdata)) {
                num.add(testdata);
            } else {
                num.add(testdata);
            }
        }
        System.out.println(num);
    }

    public static void finding_TheConsecutiveNumbers() {

        int[] arr3 = {0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 1) {
                count++;
                result = count;
            } else {
                if (count > result) {

                }
                count = 0;
            }
        }
        System.out.println("The consecutive nummber of 1 :" + result);
    }

    public static void bestTimetoSell_stoks_with_MaximumProfits() {
        int[] stocks = {7, 1, 10, 6, 12, 9};
        int Profit = 0;
        int buying = 0;
        int selling = 0;
        for (int i = 0; i < stocks.length; i++) {
            for (int j = i + 1; j < stocks.length; j++) {
                if ((stocks[j] - stocks[i]) > Profit) {
                    Profit = stocks[j] - stocks[i];
                    buying = stocks[i];
                    selling = stocks[j];
                }
            }
        }
        System.out.println("Maximum profit : " + Profit + " Bought@: " + buying + "  selling@ : " + selling);
    }

    public static void length_Of_TheLast_WordOfstrings() {
        String s = "Hello World";
        String[] my = s.split(" ");
        System.out.println(my[my.length - 1].length());

        String str = "   fly me   to   the moon  ";
        //string = str.replaceAll("\\s+"," ")
        // it will remove and first and last spaces
        str = str.trim();
        String[] sss = str.split(" ");
        System.out.println(sss[sss.length - 1].length());

        String s3 = "luffy is still joyboy";
        String[] data = s3.split(" ");
        System.out.println(data[data.length - 1].length());

    }

    public static void findTheMaximum_And_MinimumNumber() {
        int[] arr4 = {10, 9, 34, 4, 67, 89, 7};
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {

                max = arr4[i];
            } else {
                if (arr4[i] < min) {
                    min = arr4[i];
                }

            }
        }
        System.out.println("The maximum value : " + max);
        System.out.println("The maximum value : " + min);
    }

    public static void findThe_SecondLargest_ElementInArray() {
        int[] arr5 = {19, 46, 30, 25, 28, 48, 90};
        int temp;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = i + 1; j < arr5.length; j++) {
                if (arr5[i] > arr5[j]) {
                    temp = arr5[i];
                    arr5[i] = arr5[j];
                    arr5[j] = temp;

                }
            }

        }
        System.out.println("The second highest element in array : " + arr5[arr5.length - 1]);
    }

    public static void findTheEven_Or_OddNumber() {
        int i = 23;
        if (i % 2 == 0) {
            System.out.println("This is the even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void fidThePrimeNumber_BetweenTwoNumbers() {
        int count;
        for (int i = 25; i <= 150; i++) {
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

    public int verifytheVowelCharacters(String str) {
        str = "w3resource";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
                System.out.println(str.charAt(i));
            }
        }
        return count;
    }

    public static void verifyThe_StringOpenAndClosingBrackets() {
        String str = "[()]{}{[()()]()}";
        char ch[] = str.toCharArray();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                stk.push(ch[i]);
            }

            if (ch[i] == ')' && stk.peek().equals('(')) {
                stk.pop();
            }
            if (ch[i] == '}' && stk.peek().equals('{')) {
                stk.pop();
            }
            if (ch[i] == ']' && stk.peek().equals('[')) {
                stk.pop();
            }
        }
        System.out.println(stk.isEmpty());
    }

    public static void anagram_findmaximumNumberOfStringPairs() {
        String str[] = {"cd", "ac", "dc", "ca", "zz"};
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                String revr = reverse(str[j]);
                if (str[i].equalsIgnoreCase(revr)) {
                    count++;
                }
            }
        }
        System.out.println("the matching value count :" + count);
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void findTheSecondlowestMinimumNumber() {
        int[] arr = {10, 8, 9, 2, 5, 7};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);

    }

    public static void leftArrayRotation(int noOfRotation) {
        int[] arr = {5, 6, 7, 10, 9};
        while (noOfRotation != 0) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            noOfRotation--;
        }
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void righttArrayRotation(int noOfRotation) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int k = 1; k <= noOfRotation; k++) {
            int lastIndex = arr.length - 1;
            int temp = arr[lastIndex];
            for (int i = lastIndex; i >= 1; i--) {
                arr[i] = arr[lastIndex - 1];
                lastIndex--;
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void printSubArray() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "");
                }
                System.out.println();
            }
        }
    }

    public static void verifyMin_Max() {
        int temp;
        int arr[] = {5, 3, 0, 9, 2};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max + "" + "\n" + min);

    }

    public static void verifyPalindrome_Not() {
        String original = "LOL";
        String rev2 = reverse(original);

        if (original.equalsIgnoreCase(rev2)) {

            System.out.println("This is plaindrome");
        } else {

            System.out.println("This is not the palindrome");
        }

    }

    public static void verifyGivenNumberPlaindromeOrNot() {
        int r;
        int sum = 0;
        int temp;
        int n = 121;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }

    }

    public static void sepearateVowelsAndString() {
        String str = "matesing raoj ajou";
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {

            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                sb.append(ch[i]);
            }
            if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {

                sb1.append(ch[i]);
            }
        }
        System.out.println(sb + " \n" + sb1);
    }


    public static int length_of_longest_substr(String s) {
        int result = 0;
        Map<Character, Integer> hash_map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hash_map.containsKey(ch)) {
                i = Math.max(hash_map.get(ch), i);
            }
            result = Math.max(result, j - i + 1);
            hash_map.put(ch, j + 1);
            j++;
        }
        System.out.println(result);
        return result;
    }

    public static void reversenameAndOccuranceOfCount() {
        String str = "mallikarjunraooruganti";
        String rev = "";
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reverse String" + rev);
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("occurnace of a : " + count);
    }


    public static void How_to_remove_duplicate_elements_from_ArrayList_in_Java() {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("mallikarjun");
        arraylist.add("rao");
        arraylist.add("mallikarjun");
        HashSet<String> set = new HashSet<>(arraylist);
        ArrayList<String> test = new ArrayList<>(set);
        System.out.println(test);
    }

    public static void verifyClosetPrimerNumberforGivenNumber() {
        int n = 25 - 1;
        int count = 0;
        while (!isPrime(n) || !(count == 0)) {
            if (isPrime(n))
                count++;
            n--;
        }
        System.out.println(n);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number; i++) {
            if (number == i)
                return true;
            if (number % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
//        roara();
        remove_continuous_occurrence_of_a_string_AAAABBBCCDDDD_Count();

    }

}

