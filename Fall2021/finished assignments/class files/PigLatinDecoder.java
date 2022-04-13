import java.util.Locale;
import java.util.Scanner;

public class PigLatinDecoder {

    /*
    public static void main(String[] args){
        String input = null;
        String pl;
        Scanner in = new Scanner(System.in);

        System.out.println("#####################");
        System.out.println("# Pig Latin Encoder #");
        System.out.println("#####################\n");

        System.out.println("Welcome to Anthony's Pig Latin Encoder!\n");
        System.out.print("Enter the word you would like to encode!: ");
        if(in.hasNextLine()){
            input = in.nextLine();
        }

        if(input != null){
            System.out.println("Your encoded word is: " + encoder(input));
        }

    }


    public static String encoder(String a){
        String pigLatin, root, prefix;
        int closestVowel = 100, vowelPos;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        for(int i = 0; i < 6; i++){
            vowelPos = a.toLowerCase().indexOf(vowels[i]);
            if(vowelPos < closestVowel && vowelPos >= 0){
                closestVowel = vowelPos;
            }
        }

        if(closestVowel > 0) {
            prefix = a.substring(0, closestVowel);
            root = a.substring(closestVowel);
            pigLatin = root + prefix + "ay";
        }else if(a.toLowerCase().charAt(0) == 'y'){
            prefix = a.substring(0, 1);
            root = a.substring(closestVowel + 1);
            pigLatin = root + prefix + "ay";
        }else {
            pigLatin = a + "ay";
        }
        return pigLatin;
    }

    */
}



/*
Write an application that accepts a word from a user and converts it to Pig Latin.
If a word starts with a consonant, the Pig Latin version removes all consonants from the
beginning of the word and places them at the end, followed by ay. For example, cricket becomes icketcray.
If a word starts with a vowel, the Pig Latin version is the original word with ay added to the end. For example,
apple becomes appleay. If y is the first letter in a word, it is treated as a consonant; otherwise, it is treated
as a vowel. For example, young becomes oungyay, but system becomes ystemsay. For this program, assume that the
user will enter only a single word consisting of all lowercase letters. Save the file as PigLatin.java.
 */