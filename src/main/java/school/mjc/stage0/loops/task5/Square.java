package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            for (int y = 1; y <= sideLength; y++) {
                if ((i == 0 || i == sideLength - 1) || (y == 0 || y == sideLength - 1))
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
        }
    }
}
