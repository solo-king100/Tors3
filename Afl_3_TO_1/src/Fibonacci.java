public class Fibonacci {
    public static void main(String[] args) {
        fibonnaci(1,1);

    }
    public static void fibonnaci(int a, int i){
        System.out.println(a+("\t"));
        int t=0;
        while(t<1000){
            t=a+i;

            fibonnaci(a,t);
        }
    }
}
