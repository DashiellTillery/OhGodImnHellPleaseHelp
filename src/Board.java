public class Board {
    private Battleships ship;
    public String[][] board = new String[10][10];
    public Battleships[] shipLength = {};
    public Board() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                board[row][col] = "_";
            }
        }

    }
    public void placeships(Battleships s) {
        int p = s.getLength();
        int x = s.getPositionx();
        int y = s.getPositiony();
        String c = s.getDirection();
        int[][] position = s.getPosition();
        board[x][y] = "s";
        if(c.equals("down")) {
            int positionCounter = 0;
            for (int i = 0; i < p; i++) {
                board[x++][y] ="s";
                int[] coord = {x,y};
                position[positionCounter] = coord;
                positionCounter++;
            }
        }
        if(c.equals("right")){
            for(int i = 0; i < p;i++){
                board[x][y++] = "s";
            }

        }

        if (c.equals("up")){
            for(int i = 0; i < p;i++){
                board[x--][y] = "s";
            }

        }
        if (c.equals(  "left")){
            for(int i = 0; i < p;i++){
                board[x][y--] = "s";
            }
        }
        int shipcounter = 0;
        shipLength[shipcounter] = s;
        shipcounter++;
    }
    public void printBoard() {
        System.out.println("Updated board:");
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {

                System.out.print(board[row][col] + " ");

            }
            System.out.print("\n");
        }


    }

    public void attack(int x,int y){

        if(board[x][y] == "s"){
            board[x][y] = "x";
            for(int i = 0; i < shipLength.length; i++){
                int[][] v = shipLength[i].getPosition();
                for(int z = 0; z < shipLength[i].getPosition().length; z++) {
                    if (v[z][z].equals(this.board[x][y])){
                        shipLength[i].loseHealth();
                    }
                }
            }
        }else{
            board[x][y] = "o";
        }

    }
}