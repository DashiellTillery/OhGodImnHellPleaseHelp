import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Player player = new Player();
        Computer why = new Computer();
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the coordinates of your Ship:");
        //int location = sc.nextInt();
        Battleships b = new Battleships(0,0,6, "down");
        Battleships s = new Battleships(4,7,3, "down");
        player.getPlayingfield().placeships(s);
        player.getPlayingfield().placeships(b);
        player.getPlayingfield().printBoard();
        System.out.println(s);
        /*
        while(true)
         */
    }
}
