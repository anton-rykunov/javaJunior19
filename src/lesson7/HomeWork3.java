package lesson7;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (j <= (nums[i].length - 1) / 2 + i && j >= (nums[i].length - 1) / 2 - i)
                    System.out.print(nums[i][j] + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
        for(int i = nums.length/2; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if ((j <= nums.length - i) && j >= i - (nums.length-1)/2 )
                    System.out.print(" " + "  ");
                else

                System.out.print(nums[i][j] + "  ");
            }
        }
    }
}
