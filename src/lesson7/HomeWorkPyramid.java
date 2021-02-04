package lesson7;

public class HomeWorkPyramid {
    public static void main(String[] args) {
        int[][] nums = new int[4][7];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j <= (nums[i].length - 1) / 2 + i && j >= (nums[i].length - 1) / 2 - i)
                    System.out.print(nums[i][j] + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }
}
