package CodingBasicTraining;

public class ConditionString {

    public static int isCondition(String ineq, String eq, int n, int m) {

        //　制限事項
        if (n < 1 | m < 1 | n > 100 | m > 100) {
            return -1;
        }

        switch (ineq + eq) {
            case ">=" :
                return n >= m ? 1 : 0;
            case "<=" :
                return n <= m ? 1 : 0;
            case ">!" :
                return n > m ? 1 : 0;
            case "<!" :
                return n < m ? 1 : 0;
        }
        return 0;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(isCondition("<", "=", 20, 50));
        System.out.println(isCondition(">", "!", 41, 78));
    }
}
