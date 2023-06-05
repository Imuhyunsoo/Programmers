package Introduction;

public class ChickenCoupon {

    public static int getBonusChicken(int chicken) {

        // Restrictions
        if (chicken < 0 | chicken > 1000000) {
            return -1;
        }

        int coupon = chicken;
        int bonus = 0;

        while (coupon >= 10) {
            bonus += coupon / 10;
            coupon = coupon / 10 + coupon % 10;
        }

        return bonus;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getBonusChicken(0));
        System.out.println(getBonusChicken(100));
        System.out.println(getBonusChicken(1081));
    }
}
