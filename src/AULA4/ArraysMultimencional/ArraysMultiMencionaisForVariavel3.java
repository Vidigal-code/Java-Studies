package AULA4.ArraysMultimencional;

public class ArraysMultiMencionaisForVariavel3 {
    public static void main(String[] args) {
        int[][] arrayint = new int[4][];
        int[] array = {10, 20, 30};


        arrayint[0] = new int[]{1, 2};
        arrayint[1] = new int[]{1, 2, 3};
        arrayint[2] = new int[]{1, 2, 3, 4, 5, 6};
        arrayint[3] = array;


        for (int[] base : arrayint) {
            System.out.println("\n----");
            for (int num : base) {
                System.out.println(num + " ");
            }

        }
    }
}