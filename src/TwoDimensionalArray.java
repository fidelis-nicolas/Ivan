public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] numbers = {{45, 67, 67, 89}, {45, 78, 67, 98}, {34, 78, 23,62}};
        System.out.println(numbers[2][0]);
        String [][] countries = new String[3][2];

        for(int row =0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
