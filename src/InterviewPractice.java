import java.util.HashMap;
import java.util.HashSet;

public class InterviewPractice {

    public static void practice(){
        //consecutive numbers
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                result = count;
            } else {
                if (count > result) {
                }
                count = 0;
            }
        }
        System.out.println(result);
    }
    public static void practice2(){
        // identify duplicate values given array
        int[] arr2 = {1, 10, 3, 4, 8, 1, 1, 8, 6};
        HashSet<Integer> set = new HashSet<>();
        for (Integer  data: arr2){
            if (set.contains(data)){
                set.add(data);
            }else {

                set.add(data);
            }
        }
        System.out.println(set.toString());


    }
    public static void practice3(){
        String[] arr = {"Nirmith", "Arjun", "Saket", "Saket", "Nirmith"};
int count =1;
        HashMap<String , Integer> map = new HashMap<>();
        for (String str : arr){
            if (map.containsKey(str)){
                map.put(str ,map.get(str)+1);
            }else {

                map.put(str,count);
            }
        }
        System.out.println(map.entrySet());
    }

    public static String reverse(String str){
        String revers = "";
        for (int i=str.length()-1 ; i>=0; i--){
            revers = revers+ str.charAt(i);
        }
        System.out.println(revers);
        return revers;
    }
public static void usingHashMapfindmaximumNumberOfStringPairs(){
    String str[] = {"cd", "ac", "dc", "ca", "zz"};
    int count = 0;
    for (int i = 0 ;i < str.length; i++){
        for (int j = i + 1; j < str.length; j++){
            String rev = reverse(str[j]);
            if (str[i].equalsIgnoreCase(rev)){
                count++;
            }
        }

    }
    System.out.println("the matching value count :" + count);

}

public static void subarray(){
    int [] arr = {1,2,3,4,5};
    //print subarray

    for (int i =0 ; i<arr.length; i++){
        for (int j = i ; j < arr.length; j++){

            for (int k =i ; k<=j; k++){
                System.out.print(arr[k] +"");
            }
            System.out.println();
        }

    }

}

public static void palindrome(){
    String original = "arjun";
    String rev2 = reverse(original);
    if (rev2.equalsIgnoreCase(original)){
        System.out.println("This is plaindrome");
    }else {
        System.out.println("This is not plaindrome");
    }

}

public static void numberPalindrome(){
        int n = 101;
        int temp = n;
        int r ;
        int sum =0;

        while (n>0){
          r = n%10;
          sum = (sum*10)+r;
          n = n/10;
        }
        if (temp==sum){
            System.out.println("palindrome number ");

        }else {
            System.out.println("Not palindrome number ");


        }

}

    public static void main(String[] args) {

      //  practice();
        //practice3();
       // reverse("rao");
       // usingHashMapfindmaximumNumberOfStringPairs();

        palindrome();

    }
}
