package CodingBasicTraining;

public class ChangeToLowercase {

    public static String change(String myString) {

        // 制限事項
        if (myString.length() < 1 | myString.length() > 100000) {
            return "ERROR";
        }
        return myString.toLowerCase();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(change("aBcDeFg"));
        System.out.println("aaa");
    }
}
