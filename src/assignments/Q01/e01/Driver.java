package assignments.Q01.e01;

import java.util.Scanner;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Driver {
    public static void main(String[] args) {
        new Driver().run();
    }

    private void run() {
        Fraction fraction1 = new Fraction();

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入分母");
        int Den = scanner.nextInt();
        scanner.nextLine();
        System.out.println("输入分子");
        int Num = scanner.nextInt();


        //fraction1.denominator = 4;
        fraction1.setDenominator(Den);

        fraction1.setNumerator(Num);


        fraction1.trace();

        System.out.println("使用getter取到对象中的属性值：" + fraction1.getNumerator() + "/" + fraction1.getDenominator());
    }
}
