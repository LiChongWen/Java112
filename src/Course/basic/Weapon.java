package Course.basic;

/**
 * Created by liarthur on 2017/10/1.
 */
public class Weapon {

    private int def;
    private int atk;


    public Weapon() {

    }

    public Weapon(int def, int atk) {
        this.def = def;
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    //    public void setDef(int def) {
//        if(def < 0) def = 0;
//        this.def = def;
//    }
//
//    public void setAtk(int atk) {
//        if(atk < 0){
//            atk = 0;
//        }
//        this.atk = atk;
//    }
//
//    public int getDef() {
//
//        return def;
//    }
//
//    public int getAtk() {
//        return atk;
//    }
}
