package Introduction;

import java.util.Objects;

public class Login {

    public static String tryLogin(String[] id_pw, String[][] db) {

        // Restrictions
        if (id_pw.length != 2 | db.length < 1 | db.length > 10) {
            return "ERROR";
        }

        for (String[] strings : db) {

            if (Objects.equals(strings[0], id_pw[0])) {

                if (Objects.equals(strings[1], id_pw[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }

    public static void main(String[] args) {

        String[] id_pw;
        String[][] db;

        // TEST CODE
        id_pw = new String[] {"meosseugi", "1234"};
        db = new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(tryLogin(id_pw, db));
        id_pw = new String[] {"programmer01", "15789"};
        db = new String[][] {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        System.out.println(tryLogin(id_pw, db));
        id_pw = new String[] {"rabbit04", "98761"};
        db = new String[][] {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        System.out.println(tryLogin(id_pw, db));
    }
}
