import framework.NumbersKihonBase;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        return Integer.MAX_VALUE();
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        return Integer.MIN_VALUE();
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {
        return int = a % b;
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        return double max(int 1, int 2);
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        return double min(int);
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
        return Double.isNumberNan(a);
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
        return Double.isInfinite(a);
    }
}
