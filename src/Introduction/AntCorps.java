package Introduction;

public class AntCorps {

    public static int solution(int hp) {

        int answer = 0;

        // Restrictions
        if (hp >= 0 & hp <= 1000) {

            answer = hp / 5;
            hp %= 5;
            answer += hp / 3;
            hp %= 3;
            answer += hp;
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }
}
