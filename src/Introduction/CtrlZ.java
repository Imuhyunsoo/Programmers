package Introduction;

public class CtrlZ {

    public static int getCtrlZ(String s) {

        if (s.length() == 0 | s.length() > 200) {
            return -1;
        }

        String[] list = s.split(" ");
        int total = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("Z")) {
                total -= Integer.parseInt(list[i -1]);
            } else {
                total += Integer.parseInt(list[i]);
            }
        }

        return total;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getCtrlZ("1 2 Z 3"));
        System.out.println(getCtrlZ("10 20 30 40"));
        System.out.println(getCtrlZ("10 Z 20 Z 1"));
        System.out.println(getCtrlZ("10 Z 20 Z"));
        System.out.println(getCtrlZ("-1 -2 -3 Z"));
    }
}
