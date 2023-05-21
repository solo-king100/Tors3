import java.util.ArrayList;

public class ListsAndArr {
    public static void main(String[] args) {
        ArrayList<Integer>teger=new ArrayList<>();
        ArrayList<String>word=new ArrayList<>();
        ArrayList<Boolean>nor=new ArrayList<>();

        teger.add(34);
        teger.add(99);
        teger.add(1);

        word.add("fly");
        word.add("flap");
        word.add("bird");

        nor.add(true);
        nor.add(false);
        nor.add(false);

        printString(word);

        System.out.println(printInteger(teger));
        System.out.println(printAverage(teger));
    }

    private static void printString(ArrayList<String>word){
        System.out.println(word);
    }

    private static int printInteger(ArrayList<Integer>teger){
        int sum=0;
        for (int i:teger) {
            sum+=i;


        }
        return sum;
    }

    private static int printAverage(ArrayList<Integer>teger){
        int average=0;
        int b=(teger.size());
        for (int i:teger) {
            average=(average+i)/b;


        }
        return average;
    }

}
