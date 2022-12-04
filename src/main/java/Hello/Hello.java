package Hello;

public class Hello {
    public int calc(int n) {
        if (n == 0)
            throw new ArithmeticException();
        return n + n/2;
    }
}
