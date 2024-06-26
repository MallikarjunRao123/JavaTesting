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

    public static void arrayElemenates_UsingForLoop() {
        String[] arr = {"Nirmith", "Arjun", "Saket", "Saket", "Nirmith"};
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])) {
                map1.put(arr[i], map1.get(arr[i]) + 1);
            } else {
                map1.put(arr[i], 1);
            }
        }
        System.out.println(map1.entrySet());

    }

    public static void arrayIntege_DuplicateValues_Using_HashSet() {
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
        int i = 24;
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

    public static void findmaximumNumberOfStringPairs() {
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

    public static void usingHashMapfindmaximumNumberOfStringPairs(){
        String str[] = {"cd", "ac", "dc", "ca", "zz"};
        int count =0 ;

        HashMap <String ,Integer>  hashmp = new HashMap<>();
        for (int i=0; i< str.length;i++){

            String rev1= reverse(str[i]);

            if (hashmp.containsKey(rev1)){
               hashmp.put(rev1,hashmp.get(rev1)+1);

            }else {
                hashmp.put(str[i],0);

            }

        }
        System.out.println(hashmp.entrySet());
        for (Integer count1:hashmp.values()) {

            count=count+count1;

        }

        System.out.println(count);



    }



//nirmith
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {

            rev = rev + s.charAt(i);

        }
        return rev;
    }


    public static void main(String[] args) {
        // arrayElemenatesDuplicateStringValues();
        //arrayElemenatesUsingForLoop();
        //finding_TheConsecutiveNumbers();
        // arrayIntege_DuplicateValues_Using_HashSet();
        //bestTimetoSell_stoks_with_MaximumProfits();
        //length_Of_TheLast_WordOfstrings();
        // findTheMaximum_And_MinimumNumber();
        // findThe_SecondLargest_ElementInArray();
        // findTheEven_Or_OddNumber();
        // fidThePrimeNumber_BetweenTwoNumbers();
        //verifyThe_StringOpenAndClosingBrackets();
        //findmaximumNumberOfStringPairs();



    }
}
