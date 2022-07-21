package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result;
        result = dividend/divider;
        if (dividend == 0 || divider == 0){
            System.out.println("division by zero");
        }
        else if (dividend == result*divider){
            System.out.println("can be divided completely");
        }
        else {
            System.out.println("cannot be divided completely");
        }
    }
}
