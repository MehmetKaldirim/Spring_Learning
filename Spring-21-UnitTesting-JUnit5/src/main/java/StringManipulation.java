import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.List;

public class StringManipulation {
    public static String word= "love";
    public static String concat(String a, String b){

        return a+b;
    }

    public int length (String a, String b){

        return (a+b).length();
    }

    public static boolean islovely(List<String> sentence){
        return sentence.contains(word);
    }

    public static char[] charArr( String str){
        return str.toCharArray() ;
    }

    public static String reverseOfString(String str){
        String reverse="";
        for (int l = 0; l <= str.length(); l++) {
            if(l == str.length()) throw new IndexOutOfBoundsException();
            reverse = "" + str.charAt(str.length()-l);
        }
        return reverse;
    }


}
