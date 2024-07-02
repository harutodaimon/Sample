package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        return (double)getWin() / (getWin() + getLose())  ;

    }

    public void report() {
        ;
        System.out.println(this.name + "の2023年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate()  + "です。");
    }



}