import java.sql.SQLOutput;
import java.util.Scanner;

public class CondtionStatementDemo {


    public static void main(String[] args) {

//        int marks = 65;
//        if (marks <50){
//            System.out.println("Fail");
//        } else if (marks>=50 && marks<60) {
//            System.out.println( "D grade");
//        }else if ( marks>=60 && marks<70){
//            System.out.println("c garade");
//        } else if (marks>=70 && marks<80) {
//            System.out.println("b grade");
//        } else if (marks>=80 && marks<90) {
//            System.out.println("A Grade");
//        } else if (marks>=90 &&marks<100) {
//            System.out.println("A+ GRADE");
//        }else {
//            System.out.println("invalid");
//
//        }
//        int totalMarks = sc.nextInt();
//        float myPer = totalMarks / 5;
////
//        if (myPer >= 90.0) {
//            System.out.print("Grade A");
//        } else if (myPer >= 80.0) {
//            System.out.print("Grade B");
//        } else if (myPer >= 70.0) {
//            System.out.print("Grade C");
//        } else if (myPer >= 60.0){
//            System.out.print("Grade D");
//    }else{
//            System.out.print("Grade F");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of copies to be printed:");
//            int noOfCopies = sc.nextInt();
//            if (noOfCopies > 0 && noOfCopies <= 100) {
//                double perCopyPrice = 0.30;
//                System.out.println("per copy price :" + "$" + perCopyPrice);
//                double totalCost = noOfCopies * perCopyPrice;
//                System.out.println("total cost :" + "$" + totalCost);
//
//            } else {
//            System.out.println("dummy");

         //Scanner s = new Scanner(System.in);
       // System.out.println("enter the quantity");
//        int x = s.nextInt();
//        if ((x*100)>1000){
//            System.out.println("Discount :"+ (0.1*x*100)+"  Total cost : "+(x*100 - (0.1*x*100)));
//        }else {
//            System.out.println("no discount");
//        }
        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        //Ask user for their salary and year of service and print the net bonus amount.
//        Scanner s = new Scanner(System.in);
//       System.out.println("Enter the salary");
//       int salary = s.nextInt();
//       System.out.println("Enter num of years");
//        int experience  =s.nextInt();
//         if (experience >5){
//            double bonus = 0.05;
////             System.out.println("Bonus : "+ (salary*bonus)+ "\n" +"Total salary : " + (salary*bonus+salary));
//         }else{
//
//             System.out.println("not eligible for bonus");
//         }
      //  A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
      //  Ask user for quantity
      //  Suppose, one unit will cost 100.
      //  Judge and print total cost for user.


//        A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
//                INPUT : 1234        OUTPUT : 4321
//                INPUT : 5982        OUTPUT : 2895

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        String freverse ="";
        String num = s.next();
        char [] numbers = num.toCharArray();
        for (int i =numbers.length-1 ;i>=0; i--){
         freverse=freverse+(numbers [i]);
        }
        System.out.println(freverse);



        }
    }







