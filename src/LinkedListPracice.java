import java.util.LinkedList;

public class LinkedListPracice {
    public static void Addelementstoa_LinkedList() {

        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);
    }

    public static void Access_LinkedList_elements() {

        LinkedList<String> languages = new LinkedList<>();

        // add elements in the linked list
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // get the element from the linked list
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

    }

    public static void Remove_element_from_LinkedList() {
        LinkedList<String> languages = new LinkedList<>();
        // add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Kotlin");
        System.out.println("LinkedList: " + languages);

        // remove elements from index 1
        String str = languages.remove(1);
        System.out.println("Removed Element: " + str);

        System.out.println("Updated LinkedList: " + languages);
    }

    public static void Iterating_through_LinkedList() {
        // Creating a linked list
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("LinkedList: " + animals);

        // Using forEach loop
        System.out.println("Accessing linked list elements:");
        for (String animal : animals) {
            System.out.print(animal);
            System.out.print(", ");

        }


    }


}