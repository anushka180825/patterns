public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++)
        {
            // Print spaces to center the numbers
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");

                number = number * (i - j) / (j + 1);
            }
            System.out.println(); // Move to next line
        }
    }
}
