package exception.test;

public class SecondChallenge {
    double xDouble;
    double yDouble;
    public String probablyIWillThrowException(double x, double y) throws Exception {
        this.xDouble = x;
        this.yDouble = y;
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }

}
