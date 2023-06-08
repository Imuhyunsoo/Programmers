package Introduction;

public class LengthOfOverlappingLineSegments {

    public static int getOverlappingLineSegments(int[][] lines) {

        // 制限事項
        if (lines.length != 3) {
            return -1;
        }

        int answer = 0;
        int startLine = lines[0][0];
        int finishList = lines[0][0];
        boolean a, b, c;

        for (int[] line : lines) {
            for (int i : line) {
                startLine = Math.min(startLine, i);
                finishList = Math.max(finishList, i);
            }
        }

        for (int position = startLine; position <= finishList; position++) {
            a = position >= lines[0][0] & (position + 1) <= lines[0][1];
            b = position >= lines[1][0] & (position + 1) <= lines[1][1];
            c = position >= lines[2][0] & (position + 1) <= lines[2][1];

            if (a & b | a & c | b & c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getOverlappingLineSegments(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(getOverlappingLineSegments(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(getOverlappingLineSegments(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }
}
