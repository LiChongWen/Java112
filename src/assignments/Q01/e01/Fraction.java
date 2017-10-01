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

    public int numerator;
    private int denominator;

    public void trace(){
        System.out.println(description());
        System.out.println(value());
    }

    public String description() {
        return numerator + "/" + denominator;
    }
    public double value(){
        return (float) numerator / (float)denominator;
    }


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
