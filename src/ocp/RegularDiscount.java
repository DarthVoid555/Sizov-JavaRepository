package ocp;

public class RegularDiscount implements DiscountPolicy {
    @Override
    public double calculate(double price) {
        return price * 0.05;
    }
}