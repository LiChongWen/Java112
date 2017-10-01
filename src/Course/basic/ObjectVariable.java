package Course.basic;

/**
 * Created by liarthur on 2017/10/1.
 */
public class ObjectVariable {
    public static void main(String[] args) {

        int a = 0;
        Player player = null;
        System.out.println(a);
        System.out.println(player.getAtk());
        //对一个对象变量赋值为 没有对象（null）时，调用 " . " 会报错
        //Exception in thread "main" java.lang.NullPointerException  (空指针异常)
        //                                     --------------------

    }
}
