public class PartOfWord {
    public static void main(String[] args) {

        System.out.println(printPartOfWord("pneumonoultramicroscopicsilicovolcanoconiosis" ));

    }
    private static String printPartOfWord(String a){
        String subA2=a.substring(0,10);
        return subA2;
    }

}
