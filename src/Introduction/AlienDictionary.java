package Introduction;

import java.util.Arrays;

public class AlienDictionary {

    public static int getTest(String[] spell, String[] dic) {

        if (spell.length < 2 | spell.length > 10 | dic.length < 1 | dic.length > 10) {
            return -1;
        }

        int count;

        for (String value : dic) {
            count = spell.length;
            for (String s : spell) {
                if (value.contains(s)) {
                    count--;
                }
                if (count == 0) {
                    return 1;
                }
            }
        }

        return 2;
    }

    public static void main(String[] args) {

        String[] spell;
        String[] dic;

        // TEST CODE
        spell = new String[]{"p", "o", "s"};
        dic = new String[]{"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(getTest(spell, dic));
        spell = new String[]{"z", "d", "x"};
        dic = new String[]{"def", "dww", "dzx", "loveaw"};
        System.out.println(getTest(spell, dic));
        spell = new String[]{"s", "o", "m", "d"};
        dic = new String[]{"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(getTest(spell, dic));
    }
}
