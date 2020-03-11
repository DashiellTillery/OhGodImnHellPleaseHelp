public class Attack {

    private int x;
    private int y;
    public Attack(int xv, int yv, Board bb){
       xv = x;
       yv = y;
    }

    public void attack(Board b){

       if(b.board[x][y] == "s"){
           b.board[x][y] = "x";

       }else{
           b.board[x][y] = "o";
       }

    }

    //    this.playerboard = a.attack(2,1,board);
   //

   public boolean checkAttack(){
       if(x < 10 && x >= 0 && y < 10 && y >= 0 ) {
           return true;
       }else{
           return false;
       }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    /*public void checkHealth(Battleships s){


        for(int i = 0; i< p; i++){
            if(g==4){
                if(attacks.board[x][y+i]){

                }

            }
            if(g==3){
                if(attacks.board[][]){

                }

            }
            if(g==2){
                if(attacks.board[][]){

                }

            }
            if(g==1){
                if(attacks.board[][]){

                }

            }
        }
    }*/
}
