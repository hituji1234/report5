

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    boolean isDead(){
        return dead;
    }

    String getName(){

        return name;
    }

    public void attack(LivingThing opponent){
        if(hitPoint > 0){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

