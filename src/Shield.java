public class Shield {

    private double power;
    private int level;
    public Shield(int level){
        this.level = level;
        this.power = 10+ 4*level;
    }
    public double getPower(){
        return power;
    }
    public int getLevel(){
        return level;
    }

}
