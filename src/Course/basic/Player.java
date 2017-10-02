package Course.basic;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Player {

    private int atk;
    private int def;
    private int hp;

    private Weapon weapon; //玩家可以拥有武器
    //使用一个类来作为另一个类的属性

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int totalAtk(){
//        weapon.setAtk(16); //外部注入
        int totalAtk = this.atk;
        if(weapon != null){             //对象非空验证
            totalAtk += weapon.getAtk();
        }

        return totalAtk;
    }

    public void trace(){
        System.out.println("atk:" + atk + ", def:" + def);
    }

    public Player(){

//        weapon = new Weapon(); //构造方法内赋值

//        atk = 100;
//        drf = 100;
//        hp = 100;
        initialize(100,100,100);
    }//构造方法初始化

    public Player(int atk, int def, int hp){

//        weapon = new Weapon(); //构造方法内赋值

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
