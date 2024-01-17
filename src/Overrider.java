public class Overrider extends Overload2 {


    public void dog(String s) {

        System.out.println("Dog name :" +s);

    }

    @Override
    public void display() {
        System.out.println("this display the super class");
    }


    public static void main(String[] args) {

        Overrider  rider = new Overrider();
        rider.dog("Lambridog");
        System.out.println();


    }
}
