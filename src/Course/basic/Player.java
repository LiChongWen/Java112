package Course.basic;

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

    public Player(){
//        atk = 100;
//        drf = 100;
//        hp = 100;
        initialize(100,100,100);
    }//构造方法初始化

    public Player(int atk, int def, int hp){
//        this.atk = atk;
//        this.def = def;
//        this.hp = hp;
        initialize(atk, def, hp);//调用方法进行初始化
    }//有参数构造方法初始化

    //调用方法进行初始化
    public void initialize(int atk, int def, int hp){
        this.atk = atk;
        this.def = def;
        this.hp = hp;

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
