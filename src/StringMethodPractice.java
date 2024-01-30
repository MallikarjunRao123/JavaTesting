public class StringMethodPractice {

    public static void main(String[] args) {
        String str = "Welcome to the phonepe";

        // chracterAt methods used Returns the character at the specified index (position)
        char ch = str.charAt(0);
        System.out.println(ch);
        //Splits a string into an array of substrings
        String [] str1 = str.split(" ");
        for (String st:str1) {
            System.out.println(st);
        }
        // startsWith() -Checks whether a string starts with specified characters (boolean)\
        System.out.println(str.startsWith("We"));
        System.out.println(str.endsWith("pe"));

        //subSequence() -This method behaves similar to the substring() method. The only difference is that it returns a CharSequence rather than a String.
        // Internally, the subSequence() method calls the substring() method. The returning CharSequence can be explicitly cast into a String object.
//beginIndex − This is the value of begin index, inclusive.
//endIndex − This is the value of the end index, exclusive.
        System.out.println(str.subSequence(0, 7));

        //substring() -Returns a new string which is the substring of a specified string
        System.out.println(str.substring(6));

        //trim() -Removes whitespace from both ends of a string

        //toCharArray()	-Converts this string to a new character array
         char [] c = str.toCharArray();
// concat () -method appends (concatenate) a string to the end of another string.

        System.out.println(str.toLowerCase());

        //compareTO()
        String myStr1 = "hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.equalsIgnoreCase(myStr2));
        //replace ()-

        System.out.println(myStr1.replace('l', 'H'));


    }
}
