import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestingWhileCondition {
    public static void main(String[] args) {
        // 1.print the 1 to 100 values
       /* int i =1;
        while(i<=100){
            System.out.println("Print thei value:"+ i);
            i++;
        }*/
//2.print the even numberer between range 200 and 500
    /*    int range1 = 200;
        int range2= 500;

        while (range1 <= range2){
            if (range1 %2 !=0){
                System.out.println("The range value: "+range1);
            }
            range1++;
        }*/
 /* int i =50;
  int b = 150;
  int count =0;

  while (i<=b){
      if (b%i==0){
         // System.out.println(i);
          count++;

      }
      i++;
   if (count ==2){
       System.out.println("thisis is prime number :");
   }
else {
       System.out.println("not prime :");

   }*/
        //3. print primer number between 50 to 150
  /* int a = 50;
   int b = 150;
   for (int i = a ; i<=b;i++){
       boolean isPrime = true;
       for(int j= 2; j<=Math.sqrt(i);j++){
           if (i%j ==0){
               isPrime =false;
               break;
           }
       }
       if(isPrime && i>1){
           System.out.println(i);
       }
   }*/

        //print the prime number
       /* int i,count;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=25;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }
}*/
        // print the odd number between 20 to 25
     /*   int a = 200;
        int b = 25 ;
        while(a>=b){
      if (a%2 !=0){
          System.out.println(a);
      }
       a--;
        }*/
// sum of even number between 40 to 80
      /*  int n = 40;
        int k= 80;
        int r =-0;
       int sum =0;
        while(n<=k){
            if (n%2 ==0){
                sum += n;
                System.out.println(n);
            }
            n++;
        }
        System.out.println("the sum : "+sum);
*/
// reverse string using for loop
    /*    String original , reverse ="";

        System.out.println("Enter the string to reversed");
        Scanner sc = new Scanner(System.in);
        original =sc.nextLine();
        int length =original.length();

        for (int i =length-1 ; i>0;i--){
            reverse = reverse+original.charAt(i);
        }
        System.out.println(reverse);*/
        // Airthemactic operation on two numbers
       /* Scanner sc =new Scanner(System.in);
        System.out.println("Entehr the char value1");
        double num1 , num2;
         num1 = sc.nextDouble();
        System.out.println("Entehr the char value2");
         num2 = sc.nextDouble();
        System.out.println("Entehr the operator");
         char operator = sc.next().charAt(0);

         switch(operator){
             case '+' :
                 System.out.println("Addition of two numers : " + (num1+num2) );
                 break;
             case '-' :
                 System.out.println("This is subtraction : " + (num1-num2));
                 break;

             case '*' :
                 System.out.println("This is multiplied : " + (num1*num2));
                 break;
             default:
                 System.out.println("entered invalid input");

       }*/
        /*Scanner val = new Scanner(System.in);
        System.out.println("Enter the week days");
        int dayNum = val.nextInt();

    switch (dayNum){
        case 1 :
        System.out.println(" This is Monday :" +dayNum);
        break;
        case 2 :
            System.out.println("This is tuesday :" +dayNum);
            break;
        case 3 :
            System.out.println("This is Wednesday :" +dayNum);
            break;
        case 4 :
            System.out.println("This is thursday :" +dayNum);
            break;
        case 5 :
            System.out.println("This is friday :" +dayNum);
            break;
        case 6 :
            System.out.println("This is sataurday :" +dayNum);
            break;
        case 7 :
            System.out.println("This is sunday :" +dayNum);
            break;
        default:
            System.out.println("invalid numebr");
        }
    if (dayNum >=5 && dayNum<=7){
    System.out.println("Hurray week off, lets enjoy : " +dayNum);
}
  else {
    System.out.println("out of week");
}*/
// gender or male
        // Scanner sc = new Scanner(System.in);
     /*System.out.println("enter the gender");
     char gender = sc.next().charAt(0);
     switch (gender){

         case 'M' :
             System.out.println("Gender is Male : " + gender);
             break;
         case 'F' :
             System.out.println("Gender is Female :"+ gender);
             break;
         case 'T' :
             System.out.println("gender is transgender :" +gender);
             break;
         default:
             System.out.println("invalid gender");
     }*/

        //even or odd number
        /*System.out.println("Enter the value");
        int num =sc.nextInt();
        switch (num%2){
            case 0:
                System.out.println("this even number");
                break;
            case 1:
                System.out.println("this is odd");
                break;
        }*/
        // 1,3,5,7,8,10,12  - 31days
        //  4,6,8,11 - 30 days

       /* int mon = 0 ;
        int days = 0;
        System.out.println("Enter the month");
         mon = sc.nextInt();

         switch (mon){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println("These months having 31 days : "+mon);
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println("These months having 30 days : "+mon);
                 break;
             case 2 :
                 days = 28;
                 System.out.println("this month havcing 28 days");
                 break;
             default:
                 System.out.println("please enter valid month from 1 to 12");
         }*/
//Write a program to check whether a person is eligible to vote or Not using switch statement
       /* int age ;
        System.out.println("Enter the age");
        age =sc.nextInt();
        int res = age>=18?1:0;
        switch (res){

            case 0:
                System.out.println("He is not eligible for vote");
                break;
                case 1:
                    System.out.println("he is  eligible for vote");
                    break;

            default:
                System.out.println("please enter valid age");

        }*/


    }}









