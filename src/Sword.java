public class Sword {
    private double power;
    private int level;
    public Sword(int level){
        this.level = level;
        this.power = calPw();
    }
    public double getPower(){
        return power;
    }
    public int getLevel(){
        return level;
    }
    public void levelUP(){
        this.level++;
        this.power = calPw();
    }
    private double calPw(){
        return 15+5*level;
    }

}
