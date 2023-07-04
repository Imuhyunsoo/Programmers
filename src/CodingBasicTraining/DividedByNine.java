package CodingBasicTraining;

import java.math.BigInteger;

public class DividedByNine {

    public static int divNine(String number) {

        // 制限事項
        if (number.length() < 1 | number.length() > 100000) {
            return -1;
        }

        BigInteger bigInteger = new BigInteger(number);

        return bigInteger.remainder(BigInteger.valueOf(9)).intValue();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(divNine("123"));
        System.out.println(divNine("78720646226947352489"));
    }
}
