public class Main {
    public static void main(String[] args) {

        printtlfPalindrome("Den laks skal ned");

    }
    private static void printtlfPalindrome(String a){
        String reversedA = new StringBuilder(a).reverse().toString();
        if(a.equalsIgnoreCase(reversedA)){
            System.out.println(a+" is a palindrome.");
        }else{
            System.out.println(a+ " is not a palindrome;");
        }

    }
}