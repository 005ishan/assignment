package Assignment;


    import java.util.ArrayList;
import java.util.Scanner;

public class task10 {
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    int vowelCount = 0;
    int ConsonantCount = 0;
    String string1;
    ArrayList<Character> consonants = new ArrayList<>();

    ten(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a set of characters");
        string1 = scan.nextLine();
        scan.close();
        for (char c = 'a'; c < 'z'; c++) {
            boolean isVowel = false;
            
            for (char vowel : vowels) {
                if (c == vowel) {
                    isVowel = true;
                }
            }
            // adding the consonants to array
            if (!isVowel) {
                consonants.add(c);
            }
        }
    }

    public static void main(String[] args) {

        ten ten = new ten();

        System.out.println("Number of vowels: " + ten.CountVowels());
        System.out.println("Number of consonants: " + ten.countConsonants());
        
    }

    public int CountVowels() {
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);

            for (char vowel : vowels) {
                if (c == vowel) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    public int countConsonants() {
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);

            for (char consonant : consonants) {
                if (c == consonant) {
                    ConsonantCount++;
                }
            }
        }
        return ConsonantCount;
    }
}
