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

        System.out.println(player1.getHp());
    }

}
