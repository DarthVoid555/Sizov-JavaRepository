package ocp;

public class SuperVipDiscount implements DiscountPolicy {
    @Override
    public double calculate(double price) {
        return price * 0.2;
    }
}