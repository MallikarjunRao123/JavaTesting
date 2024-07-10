import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;

public class PractiveStacks {

    public static void removeallElementsfromanArrayListPresentinAnotherArrayList() {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("English");
        languages.add("Spanish");
        languages.add("Germany");
        ArrayList<String> lang2 = new ArrayList<>();
        lang2.add("Java");
        lang2.add("Spanish");
        lang2.add("Germany");
        languages.removeAll(lang2);

        System.out.println(languages);
    }
public static void removeallElementsfromanArrayListPresentinaHashSet (){

    ArrayList<Integer> num = new ArrayList<>();
    num.add(2);
    num.add(4);
    num.add(5);
    num.add(6);
    HashSet <Integer> test1 = new HashSet<>();
    test1.add(4);
    test1.add(5);
    num.removeAll(test1);

    System.out.println(num);

    }

public  static void testing(){

    ArrayList<Integer> randomNumbers = new ArrayList<>();

    // add element to the arraylist
    randomNumbers.add(22);
    randomNumbers.add(13);
    randomNumbers.add(35);
    randomNumbers.add(13);
    randomNumbers.add(40);
//it will remove first occurance of the numbers
   // boolean b = randomNumbers.remove(Integer.valueOf(13));
  //  System.out.println(randomNumbers.size());

    for (int i =0 ;i< randomNumbers.size(); i++){

        int ss= randomNumbers.get(i);

        System.out.println(ss);

    }

}

public static void sortingArraylisths(){
    //sort the order ib assendinbg format
    ArrayList<String> al = new ArrayList<>(Arrays.asList("Chandu","TEST","HJASDJH","AJSD","ASD"));
    System.out.println(al.size());
    String [] strf= new String[al.size()];
    strf= al.toArray(strf);
    System.out.println(Arrays.toString(strf));

    Collections.sort(al,Collections.reverseOrder());
    Collections.sort(al);
    //System.out.println(languages);
}
    public static void howtoCloneFromOneArrayListToAnother(){
        ArrayList<Integer> arrls = new ArrayList<>();
        arrls.add(16);
        arrls.add(32);
        arrls.add(48);
//Clomning arraylisy from one list to anotehr arraylist
        ArrayList<Integer> list2 = (ArrayList<Integer>) arrls.clone();
        System.out.println(list2);
        for (Integer ihd : list2) {
            System.out.println(ihd);
        }
    }

    public static void ArrayListtoArrayMethodwithParameter(){
        ArrayList <String> arr = new ArrayList<>(Arrays.asList("chandy","ramu","kinds","ahsdhd"));
    System.out.println(arr);

    }

    public static void consectivenumber(){
        int arr[] = {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
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

    public static void main(String[] args) {

        //  removeallElementsfromanArrayListPresentinAnotherArrayList();
        // sortingArraylisths();
        //  howtoCloneFromOneArrayListToAnother();
        consectivenumber();


    }

}
