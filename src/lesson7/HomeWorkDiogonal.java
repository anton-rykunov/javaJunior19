package lesson7;

public class HomeWorkDiogonal {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i].length - (i+1) == j)
                    System.out.print(nums[i][j] + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }
}
