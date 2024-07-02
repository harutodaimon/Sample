package baseball;

public class Review {

    public static void main(String[] args) {

        BaseBallTeam bbt1 = new BaseBallTeam();
        bbt1.setName("阪神タイガース");
        bbt1.setWin(85);
        bbt1.setLose(53);
        bbt1.setDraw(5);


        BaseBallTeam bbt2 = new BaseBallTeam();
        bbt2.setName("広島東洋カープ");
        bbt2.setWin(74);
        bbt2.setLose(65);
        bbt2.setDraw(4);

        BaseBallTeam bbt3 = new BaseBallTeam();
        bbt3.setName("横浜DeNAベイスターズ");
        bbt3.setWin(74);
        bbt3.setLose(66);
        bbt3.setDraw(3);

        BaseBallTeam bbt4 = new BaseBallTeam();
        bbt4.setName("読売ジャイアンツ");
        bbt4.setWin(71);
        bbt4.setLose(70);
        bbt4.setDraw(2);

        BaseBallTeam bbt5 = new BaseBallTeam();
        bbt5.setName("東京ヤクルトスワローズ");
        bbt5.setWin(57);
        bbt5.setLose(83);
        bbt5.setDraw(3);

        BaseBallTeam bbt6 = new BaseBallTeam();
        bbt6.setName("中日ドラゴンズ");
        bbt6.setWin(56);
        bbt6.setLose(82);
        bbt6.setDraw(5);


        bbt1.report();
        bbt2.report();
        bbt3.report();
        bbt4.report();
        bbt5.report();
        bbt6.report();

    }
}