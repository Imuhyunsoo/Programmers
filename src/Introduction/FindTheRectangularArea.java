package Introduction;

import java.util.Arrays;

public class FindTheRectangularArea {

    public static int getArea(int[][] dots) {

        if (dots.length != 4) {
            return -1;
        }

        int maxToX = Math.max(Math.max(dots[0][0], dots[1][0]), Math.max(dots[0][0], dots[2][0]));
        int minToX = Math.min(Math.max(dots[0][0], dots[1][0]), Math.min(dots[0][0], dots[2][0]));
        int side = 0;
        int maxToY = Math.max(Math.max(dots[0][1], dots[1][1]), Math.max(dots[0][1], dots[2][1]));
        int minToY = Math.min(Math.max(dots[0][1], dots[1][1]), Math.min(dots[0][1], dots[2][1]));
        int vertical = 0;

        while (maxToX != minToX) {
            minToX++;
            side++;
        }

        while (maxToY != minToY) {
            minToY++;
            vertical++;
        }

        return side * vertical;
    }

    public static void main(String[] args) {

        int[][] dots;

        // TEST CODE
        dots = new int[][] {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println(getArea(dots));
        dots = new int[][] {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(getArea(dots));
    }
}
