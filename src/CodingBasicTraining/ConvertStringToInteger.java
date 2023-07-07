package CodingBasicTraining;

public class ConvertStringToInteger {

    public static int change(String n_str) {

        // 制限事項
        if (n_str.length() < 1 | n_str.length() > 5) {
            return -1;
        }

        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(change("10"));
        System.out.println(change("8542"));
    }
}
