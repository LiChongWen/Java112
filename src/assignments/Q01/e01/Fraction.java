package assignments.Q01.e01;

/**
 * Created by liarthur on 2017/7/28.
 */
public class Fraction {
//    属性
//
//    numerator:int
//
//            分子
//    denominator:int
//
//            分母



    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void trace(){
        System.out.println(description());
        System.out.printf("%.2f,%n",value());//小数点后保留2位
        System.out.println(value());
    }

    public String description() {
        return numerator + "/" + denominator;
    }
    public double value(){return numerator / (double)denominator; }


    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int denominator){
        if (denominator == 0){
            denominator = 1;
        }
        this.denominator = denominator;

    }


}
