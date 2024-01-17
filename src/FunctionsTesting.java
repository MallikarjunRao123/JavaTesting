public class FunctionsTesting {
    public int additionOfTwoNumbers(int a , int b) {
        int min;
        if (a > b) {
            min = b;
            System.out.println( " b i the minimum value : "+  min);
        } else {
            min = a;
            System.out.println("a is the minimum : "+ min);
        }
        return min;
    }

    public int findSmalletNumber(int i, int j, int k) {
        int result =0;
        if (i<j) {
      result =i;
        } else {
            result = j;
        }
       if (k<result) {
           result = k;
        }
return result;
    }

public int avarageValue (int a, int b,int c){

        int result;
        int avg ;
        result = a+b+c;
        avg = result/3;

return avg;
}

public int vowelValues(String str){
       // str = "w3resource";
        int count =0;
        for (int i=0 ;i<str.length(); i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;
            }

        }
return count;
}

String name ;

public String getName(String name ){
        return name;
}
public void setName (String name){

    this.name= name;


}








    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how

        FunctionsTesting s = new FunctionsTesting();
        s.additionOfTwoNumbers(6,9);
        int result = s.findSmalletNumber(17,19,30);
        System.out.println(result);

        int avg = s.avarageValue(17,89,49);
        System.out.println(avg);

        int count =s.vowelValues("w3resource");
        System.out.println(count);
        }

    }

