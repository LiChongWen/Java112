package assignments.Q01.e01;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    private void run() {
        Fraction fraction1 = new Fraction();
        //fraction1.denominator = 4;
        fraction1.setDenominator(0);

        fraction1.numerator = 3;


        fraction1.trace();

        System.out.println("使用getter取到对象中的属性值：" + fraction1.numerator + "/" + fraction1.getDenominator());
    }
}
