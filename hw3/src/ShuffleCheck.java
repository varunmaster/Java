public class ShuffleCheck {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);  // size of array
        int N = Integer.parseInt(args[1]);  // number of random trials
        int [] deck = new int [M];
        int [][] a = new int [M][M]; 

        for (int i = 0; i < M; i++) {  //all a's are init to zero
          for (int j = 0; j < M; j++) {
            a[i][j] = 0 ; 
          }
        }

        for(int i = 0; i < N; i++) {  //orders, shuffles, and records N times
            for (int j = 0; j < M; j++)  //order the deck
              deck[j] = j;

            for(int j = 0; j < M; j++) {       //shuffle the deck 
              int r = j + (int)(Math.random() * (M-j));
              int t = deck[r];
              deck[r] = deck[j];
              deck[j] = t;
            }

           for(int j = 0; j < M; j++)   //record status of this deck as described
           {
               int J_card = deck[j];  //value of card in position j
               a[J_card][j]++;        //tally that card_at_j occured in position j
           }
        } 
        for (int b = 0; b < M; b++){  //print loop.  a is MxM, so limit of N was wrong.
            for (int c = 0; c < M; c++){
                System.out.print(" " + a[b][c]);
             }
            System.out.println();
         }
    }
}
