package ocp;

public class DiscountCalculator {

    private final DiscountPolicy discountPolicy;

    public DiscountCalculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculateDiscount(double price) {
        return discountPolicy.calculate(price);
    }
}
