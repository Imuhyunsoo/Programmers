package CodingBasicTraining;

public class IntegerPart {

    public static int doubleToInt(double flo) {

        // 制限事項
        if (flo < 0 | flo > 100) {
            return -1;
        }

        return (int) flo;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(doubleToInt(1.42));
        System.out.println(doubleToInt(69.32));
    }
}
