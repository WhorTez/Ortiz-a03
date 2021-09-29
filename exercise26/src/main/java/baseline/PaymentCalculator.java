package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    private final float b;
    private final float p;
    private final float i;

    public PaymentCalculator(float b, float p, float i){
        this.b = b;
        this.p = p;
        this.i = i;
    }

    public int calculateMonthsUntilPaidOff() {
        // This method will get values passed from the main class

        // Use formula to get months remaining
        double n = -(1.0/30) * log(1 + b/p * (1-Math.pow((1+i), 30)))/ log(1+i);
        //round remaining months up and return it
        return (int)Math.ceil(n);
    }
}
