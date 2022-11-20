package AULA4.ArraysMultimencional;

public class ArraysMultiMencionaisFor {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        // POSIÇÃO 0
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        // POSIÇÃO 1
        dias[1][0] = 15;
        dias[1][1] = 13;
        dias[1][2] = 14;

        // POSIÇÃO 2
        dias[2][0] = 200;
        dias[2][1] = 212;
        dias[2][2] = 222;

        //for (int i = 0; i < dias.length; i++) {
         //   for (int j = 0; j < dias[i].length; j++) {
               // System.out.println("DIAS: "+dias[i][j]);

            //}

            for(int[]base : dias){
                for(int num: base){
                    System.out.println(num);
                }
            }
        }

    }

