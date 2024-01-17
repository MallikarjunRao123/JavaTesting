public class MethodOverLoading {

    public  int calculation(int a ,int b){

       int  result = a+b;
        return result;
    }
    public double calculation(double d , double f){
     double result1 = d*f;
        return result1 ;
    }
    public void calculation(float x, int y){
    float c ;
       c=  x*y;

        System.out.println(c);
    }



    public static void main(String[] args) {

        MethodOverLoading over = new MethodOverLoading();
       int result = over.calculation(5,8);
        over.calculation(2.5f, 10);
        double result1 = over.calculation(40.05 ,26.90);

        System.out.println(result);
        System.out.println(result1);






    }

}
