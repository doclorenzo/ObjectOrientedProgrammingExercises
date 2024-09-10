package esercizi_oop.basic;

import java.util.Objects;

public class RationalNumber {

    final int numerator;
    final int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator/greatestCommonDivisor(numerator,denominator);
        this.denominator = denominator/greatestCommonDivisor(numerator,denominator);
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public RationalNumber add(RationalNumber o){
        return new RationalNumber(this.getNumerator()+ o.getNumerator(), this.denominator+o.getDenominator());
    }

    public RationalNumber multiply(RationalNumber o){
        return new RationalNumber(this.getNumerator()*o.getNumerator(), this.getDenominator()*o.getDenominator());
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}
