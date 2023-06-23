package CodingBasicTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DiceGame3 {

    public static int gameStart(int a, int b, int c, int d) {

        List<Integer> diceList = new ArrayList<>();
        diceList.add(a); diceList.add(b);
        diceList.add(c); diceList.add(d);

        TreeSet<Integer> diceTree = new TreeSet<>(diceList);
        boolean check = (a == b) && (c == d) || (a == c) && (b == d) || (a == d) && (b == c);

        // 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
        if (diceTree.size() == 1) {
            return 1111 * diceTree.last();
        }
        // 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
        else if (check) {
            if (a == b) {
                return (a + c) * (Math.abs(a - c));
            } else {
                return (a + b) * (Math.abs(a - b));
            }
        }
        // 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
        else if (diceTree.size() == 2) {

            Map<Integer, Long> countMap = diceList.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            long maxCount = countMap.values().stream()
                    .mapToLong(Long::valueOf)
                    .max()
                    .orElse(0L);

            int maxDuplicateValue = countMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == maxCount)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(0);

            int result = diceList.stream()
                    .filter(num -> countMap.get(num) < maxCount)
                    .collect(Collectors.toList()).get(0);
            return (10 * maxDuplicateValue + result) * (10 * maxDuplicateValue + result);
        }

        // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
        else if (diceTree.size() == 3) {
            if (a == b) {
                return c * d;
            } else if (a == c) {
                return b * d;
            } else {
                return a * d;
            }
        }
        // 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
        else {
            return diceTree.stream().min(Integer::compareTo).orElse(-1);
        }
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(gameStart(2, 2, 2, 2));
        System.out.println(gameStart(4, 1, 4, 4));
        System.out.println(gameStart(6, 3, 3, 6));
        System.out.println(gameStart(2, 5, 2, 6));
        System.out.println(gameStart(6, 4, 2, 5));
        System.out.println(gameStart(1, 1, 4, 1));
    }
}
