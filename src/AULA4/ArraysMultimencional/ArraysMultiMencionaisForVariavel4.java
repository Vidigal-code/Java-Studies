package AULA4.ArraysMultimencional;

public class ArraysMultiMencionaisForVariavel4 {
    public static void main(String[] args) {
            int[][] array = {{10, 20}, {25, 30, 35}, {40, 45, 50, 55}};
            for (int[] base : array) {
                System.out.println("\n----");
                for (int num : base) {
                    System.out.println(num+"");
                }
            }
        }

    }


