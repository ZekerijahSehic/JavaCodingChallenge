import java.util.List;
import java.util.stream.Collectors;

public class VowelsAndConsonants {
    public static void main(String args[]){

        VowelsAndConsonantsCounter("Intern looking for intership");

        VowelsAndConsonantsCounterStream("Intern looking for intership");

    }

    public static void VowelsAndConsonantsCounter(String input){

        int vowels = 0;
        int consonants = 0;

        String vowelsCharacters = "aeiou";

        String normalizedInput = input.toLowerCase().trim();
        char[] normalizedArray = normalizedInput.toCharArray();

        for (char v : normalizedArray) {
            if( vowelsCharacters.indexOf(v) != -1 ) {
                vowels++;
            } else if (v != ' '){
                consonants++;
            }
        }

        System.out.println("There are " + vowels + " volwes in " + input);
        System.out.println("There are " + consonants + " constans in " + input);
    }

    public static void  VowelsAndConsonantsCounterStream(String input){

        String vowelsCharacters = "aeiou";
        String normalizedInput = input.toLowerCase().trim();

        List<Integer> letters = normalizedInput.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowels = letters.stream()
                .filter(c -> vowelsCharacters.indexOf(c) != -1)
                .count();

        long consonants = letters.stream().count() - vowels;

        System.out.println("There are " + vowels + " volwes in " + input);
        System.out.println("There are " + consonants + " constans in " + input);


    }



}
