package ocp;

public class VipDiscount implements DiscountPolicy {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}