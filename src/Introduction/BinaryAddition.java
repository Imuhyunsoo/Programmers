package Introduction;

public class BinaryAddition {



    public static String getAddToBinary(String bin1, String bin2) {

        // Restrictions
        if (bin1.length() < 1 | bin2.length() < 1 | bin1.length() > 10 | bin2.length() > 10) {
            return "ERROR";
        }

        int bin1ToInt = binaryStringToInt(bin1);
        int bin2ToInt = binaryStringToInt(bin2);

        return Integer.toBinaryString(bin1ToInt + bin2ToInt);
    }

    public static int binaryStringToInt(String bin) {

        int binaryCheck = 1;
        int total = 0;

        for (int i = bin.length(); i > 0; i--) {
            if(bin.charAt(i - 1) == '1') {
                total += binaryCheck;
            }
            binaryCheck *= 2;
        }

        return total;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getAddToBinary("10", "11"));
        System.out.println(getAddToBinary("1001", "1111"));



    }
}
