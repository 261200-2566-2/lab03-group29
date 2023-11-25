public class RPGMain {
    public static void main(String[] args){
        Character player = new Character(1,true,true);
        Skill fireball = new Skill("FireBall",30,20);
        Skill icebreak = new Skill("IceBreak",15,15);
        // สามารถกำหนด skill ขึ้นมาเองได้โดย (name,damage,manaCost)

        System.out.println("Basic Stats: ");
        System.out.println("HP : "+player.getMaxHP());
        System.out.println("Mana : "+player.getMaxMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");

       player.levelUp();

       System.out.println("Current Stats: ");
       System.out.println("Current HP : "+player.getMaxHP());
       System.out.println("Current Mana : "+player.getMaxMana());
       System.out.println("Current Run Speed : " +player.getCurrentRunSpeed());
       System.out.println("---------------------------------------------------");

        player.equipSword(2);
        System.out.println("After equipping sword Stats: ");
        System.out.println("HP : "+player.getMaxHP());
        System.out.println("Mana : "+player.getMaxMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");

        player.takeDamage();
        System.out.println("HP : "+player.getCurrentHP());
        System.out.println("Mana : "+player.getMaxMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");

        player.unequipShield();
        System.out.println("HP : "+player.getCurrentHP());
        System.out.println("Mana : "+player.getMaxMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");

        fireball.useSkill(player);
        System.out.println("HP : "+player.getCurrentHP());
        System.out.println("Mana : "+player.getCurrentMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");

        icebreak.useSkill(player);
        System.out.println("HP : "+player.getCurrentHP());
        System.out.println("Mana : "+player.getCurrentMana());
        System.out.println("RunSpeed : " +player.getCurrentRunSpeed());
        System.out.println("---------------------------------------------------");



    }


}
