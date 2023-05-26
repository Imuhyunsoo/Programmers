package Introduction;

public class Morse {

    public static String decryption(String letter) {

        // Restrictions
        if (letter.length() == 0 | letter.length() > 1000) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = letter.split(" ");

        for (String value : letters) {
            char alphabet = 'a';
            for (String s : morse) {
                if (s.equals(value)) {
                    answer.append(alphabet);
                    break;
                }
                alphabet++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(decryption(".... . .-.. .-.. ---"));
        System.out.println(decryption(".--. -.-- - .... --- -."));
    }
}
