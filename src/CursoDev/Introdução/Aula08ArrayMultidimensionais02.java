package CursoDev.Introdução;

public class Aula08ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
//------------------------------------------------------------

        int[][] arrayint = new int[3][];
//----------------------------------------------------------------
        arrayint[0] = new int[2];
        arrayint[1] = array;
        arrayint[2] = new int[]{1, 2, 3, 4, 5};
//--------------------------------------------------------------------------

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5}};


        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n__________");
        }

    }
}
