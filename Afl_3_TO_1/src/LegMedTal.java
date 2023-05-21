import java.util.Random;

public class LegMedTal {

    private static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    public static void main(String[] args) {
        divisible(20);
        getRandom();
        plusMinus(4);

    }
    private static void divisible(int a){
        for(int i=0;i<=100;i++){
            if(i % a==0){
                System.out.println(i);
            }
        }
    }

    private static int getRandom(){
       Random random=new Random();
       int element=random.nextInt(arr.length);
       return arr[element];
    }

    private static void plusMinus(int d){
        while(d>0) {
            System.out.println(d);
            d--;
            plusMinus(d);
        }

    }
}
