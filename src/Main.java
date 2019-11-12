import java.util.Random;

public class Main {
    public static int [][] location = new int [5][5];
    public static void main(String[] args) {


//        Room1 rm1 = new Room1();
        generateRoom();

    }

    public static void generateRoom() {
        Random rand = new Random();
        for (int row = 0; row < location.length; row++) {
            for (int col = 0; col < location[row].length; col++) {
                location[row][col] = rand.nextInt(5);
                System.out.print("row: "+location[row][col]);
            }
        }
//        for (int i = 0; i < location.length; i++) {
//            for (int j = 0; j < location[i].length; j++) {
//                System.out.print(location[i][j] + " ");
//            }
//        }
    }
}
