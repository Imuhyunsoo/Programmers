package CodingBasicTraining;

public class SimpleLogicalOperation {

    public static boolean operation(boolean x1, boolean x2, boolean x3, boolean x4) {

        return (x1 | x2) & (x3 | x4);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(operation(false, true, true, true));
        System.out.println(operation(true, false, false, false));
    }
}
