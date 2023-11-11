package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++){
            for (int y = 1; y <= sideLength; y++){
//                if ((i == 0 || i == sideLength - 1) || (y == 0 || y == sideLength-1))
//                    System.out.print("8");
//                else
//                    System.out.print(" ");
                if (i == sideLength / 2  || y == sideLength / 2)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.printSquareFrom8s(4);
    }
}
