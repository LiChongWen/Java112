package Course.basic;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Game {

    public static void main(String[] args) {
        new Game().run();
    }

    public void run(){
        Player player1 = new Player();
        Player player2 = new Player(200, 200, 200);



//        player1.setAtk(100);
//        player1.setDef(100);
//        player1.setHp(100);
//        player2.setAtk(100);
//        player2.setDef(100);
//        player2.setHp(100);
        //此处的初始化   改  使用 构造方法 在 Player类中实现

        int damage = 200;
        player1.setHp(player1.getHp() - damage);
        player2.setHp(player2.getHp() - damage);

        player1.trace();

        System.out.println("player1 HP:" + player1.getHp());


        //多类多对象注入
        Player player3 = new Player(10, 10, 200);//创建玩家
        //以下属于外部注入！！

        Weapon weapon = new Weapon();//创建武器
        weapon.setAtk(15);//武器属性
        player3.setWeapon(weapon);//给予玩家武器


        System.out.println("总攻击为" + player3.totalAtk());
    }

}
