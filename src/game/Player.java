package game;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Player {

    private int atk;
    private int def;
    private int hp;

    public void trace(){
        System.out.println("atk:" + atk + ", def:" + def);
    }

    public int getAtk(){
        return atk;
    }

    public void setAtk(int atk){
        this.atk = atk;
    }

    public int getDef(){
        return def;
    }

    public void setDef(int def){
        this.def = def;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

}
