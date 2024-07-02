package sample;


public class Eratosthenes {

    public static void main(String[] args) {
        
        int i, j;
        
        boolean[] primeNumbers  = new boolean[]; 

        boolean judge;
        
        for (i = 2;i <= 100;i++) {
            judge = true;
            for (j = 2;j < i;j++) {
                if (i % j == 0) {
                    judge = false;
                    break;
                }
            }

            /* 判定結果を出力 */
            if (judge)        //変数judgeがtrueなら(素数なら)出力
                println("%d ", i);
        }

        
    
        
    }

}
