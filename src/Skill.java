public class Skill {
    private String name;
    private int manaCost;
    private int damage;

    public Skill(String name , int damage,int manaCost){
        this.name =name;
        this.manaCost = manaCost;
        this.damage=damage;
    }


    public void useSkill(Character character) {
        if (character.getCurrentMana() >= manaCost) {
            System.out.println("Skill : "+ name);
            reduceMana(character);
            calActDamage(character);

        } else {
            System.out.println("does not have enough mana to use " +name);
            System.exit(0);

        }
    }
    private void reduceMana(Character character){
        character.reduceMana(manaCost);
    }

    private void calActDamage(Character character){
        character.calActDamage(damage);
    }

}
