import java.util.*;

public class StringInterviewQuestions {
    public static void writeJavaPrograamToReverseEachWordInString() {
        String str = "this is javatpoint";
        String[] arr = str.split(" ");
        String rev = "";
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            rev = rev + reverseWord + " ";
        }
        System.out.println(rev);
    }
    public static String Removeall_consecutive_duplicates_from_the_string(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }
        int n = str.length();
        StringBuilder sb = new StringBuilder(n);
        sb.append(str.charAt(0));
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void removeDuplclicateCharactersFromString(){
        String str = "Mallikarjun";
        char [] chars = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }

    public static void HowtocheckPalindromeStringinJava() {
        String originalValue = "nitin";
        String rev = "";
        for (int i = originalValue.length() - 1; i >= 0; i--) {
            rev = rev + originalValue.charAt(i);
        }
        System.out.println(rev);
        if (originalValue.equalsIgnoreCase(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrone");
        }
    }

    public static void convertFirstletterOfWordToUpperCase_ifThereAreNoSpaces() {
        String str = "everyone loves java";
        char[] ch = str.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                if (foundSpace) {
                    ch[i] = Character.toUpperCase(ch[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        System.out.println(ch);
    }


//progaram to find fibanacci serioes
    public static  void fibanacciSeries(){
        int n1 =0;
        int n2=1;
        int n3 ;
        int count = 10;
        System.out.println(n1 +"" +n2);
        for (int i= 2; i<count; i++){
         n3 = n1+n2;
         System.out.println( "" + n3);
         n1=n2;
         n2= n3;

        }



    }

    public static void Javaprogramtoprintallwordswithevenlengthinthegivenstring(){
        String s = "This is a java language";
        String [] arr = s.split(" ");
        for (int i =0 ; i< arr.length; i++){
            int length = arr[i].length();
            if (length %2==0){
                System.out.println(arr[i]);
            }
        }
    }



    public static void main(String[] args) {
        fibanacciSeries();

    }
}
