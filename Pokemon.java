
public class Pokemon implements CompareStats
{
    private int hp;
    private int attack;
    private int speed;
    private int defense;
    private String name;

    public Pokemon (int userHp, int userAttack, int userDefense, int userSpeed, String userName) {
        hp = userHp;
        attack = userAttack;
        defense = userDefense;
        speed = userSpeed;
        name = userName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int inputHp) {
        hp = inputHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override 
    public boolean equals(Object obj) {
        Pokemon temp = (Pokemon) obj;
        if (this.getAttack() == temp.getAttack()&&this.getHp() == temp.getHp()){//should connect all variables
            return true;
        }else {
            return false;
        }
    }
    // @Override //makes sure you override something (spellcheck)
    // public void attack() {

    // }

    //determine if a pokemon has more speed than the other.
    @Override
    public int compareTo(Object obj){
        Pokemon temp = null; //to initialize temp so method can use it and not limited to 1st if/else statement
        if(obj instanceof Pokemon){
            temp = (Pokemon) obj;
        } else {
            return -1000;
        }
        
        if (this.getSpeed() > temp.getSpeed()){
            return 1;
        } else if (this.getSpeed() == temp.getSpeed()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
