import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count =0;

        String replacedText = word.replace("c=", ".");
        String replacedText2 = replacedText.replace("c-", ".");
        String replacedText3 = replacedText2.replace("dz=", ".");
        String replacedText4 = replacedText3.replace("d-", ".");
        String replacedText5 = replacedText4.replace("lj", ".");
        String replacedText6 = replacedText5.replace("nj", ".");
        String replacedText7 = replacedText6.replace("s=", ".");
        String replacedText8 = replacedText7.replace("z=", ".");

        // for(int i =0; i < replacedText8.length(); i++){
        //     if(replacedText8.charAt(i) == 'a'){
        //         count ++;
        //     }
        // }
        System.out.println(replacedText8.length());

    }

}