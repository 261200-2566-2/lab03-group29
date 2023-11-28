public class Character {
    private String name;
    private int level;
    private int maxHP;
    private int maxMana;
    private double currentHP;

    private double currentMana;
    private double swordPower;
    private double shieldPower;
    private Sword sword;
    private Shield shield;

    private boolean hasSword;
    private boolean hasShield;
    private int swordLV;
    private int shieldLV;
    private double baseRunSpeed;
    private double currentRunSpeed;

    public Character(int baseLV,boolean hasSword,boolean hasShield){
            this.level = baseLV;
            this.hasSword = hasSword;
            this.hasShield = hasShield;


            if(hasSword){
                this.sword = new Sword(1);
                this.swordPower = sword.getPower();
            }

            if(hasShield){
                this.shield =new Shield(1);
                this.shieldPower = shield.getPower();
            }
            calStats();
    }

    private void calStats(){
            this.maxHP = 100+10*level;
            this.maxMana = 50+2*level;
            this.currentRunSpeed= 10+0.1+0.03*level;
            this.currentHP=maxHP;
            this.currentMana = maxMana;


            calRunSpeed();
    }


    private void calRunSpeed(){
            this.baseRunSpeed = 10;
            this.currentRunSpeed = baseRunSpeed;

            if(hasSword){
                double swordToSpeed = (0.1+0.4*swordLV);
                currentRunSpeed -= swordToSpeed;
            }
            if(hasShield){
                double shieldToSpeed = (0.1+0.4*shieldLV);
                currentRunSpeed -= shieldToSpeed;
            }

    }

        public int getMaxHP(){
            return maxHP;
        }
        public int getMaxMana(){
            return maxMana;
    }
        public double getCurrentRunSpeed(){
            return currentRunSpeed;
    }
        public double getCurrentHP() {
            return currentHP;
    }
    public double getCurrentMana(){
        return currentMana;
    }
    public String getName(){
        return name;
    }

    public double getSwordPower(){
        return swordPower;
    }

    public double getShieldPower(){
        return shieldPower;
    }


    public void levelUp(){
        this.level++;
        calStats();
    }

    public void equipSword(int swordLV){
        this.hasSword =true;
        this.sword = new Sword(swordLV);
        this.swordPower = sword.getPower();
        this.swordLV++;
        calRunSpeed();
    }

    public  void equipShield(int shieldLV){
        this.hasShield = true;
        this.shield = new Shield(shieldLV);
        this.shieldPower = shield.getPower();
        this.shieldLV++;
        calRunSpeed();
    }

    public void unequipSword(){
        this.hasSword = false;
        this.swordPower =0;

        calRunSpeed();
    }

    public void unequipShield(){
        this.hasShield = false;
        this.shieldPower =0;
        calRunSpeed();
    }

    public void takeDamage(){
        if(hasShield){
            double damageAfterShield = swordPower*0.5;
            currentHP -=  damageAfterShield;
        }
        if(currentHP <0){
            currentHP =0;
        }
        if(currentHP==0){
            System.out.println("You have been defeated!!");
            System.exit(0);
        }
    }
    public void reduceMana(int amount) {
        currentMana -= amount;
        if (currentMana < 0) {
            currentMana = 0;
        }
    }

    public void calActDamage(int amount){
        currentHP -= amount;
        if(currentHP <0){
            currentHP =0;
        }
        if(currentHP==0){
            System.out.println("You have been defeated!!");
            System.exit(0);
        }
    }


}
