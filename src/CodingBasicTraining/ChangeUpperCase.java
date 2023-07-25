package CodingBasicTraining;

public class ChangeUpperCase {

    public static String change(String myString) {

        // 制限事項
        if (myString.length() < 1 | myString.length() > 100000) {
            return "ERROR";
        }

        return myString.toUpperCase();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(change("aBcDeFg"));
        System.out.println(change("AAA"));
    }
}
