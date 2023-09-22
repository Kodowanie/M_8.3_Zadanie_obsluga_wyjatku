package exception.test;

public class ExceptionHandling {

    public ExceptionHandling(){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2,1));
        } catch (Exception e) {
            System.out.println("Exception because of loop conditions:");
            System.out.println("x >= 2 || x < 1 || where double x =  " +  secondChallenge.xDouble);
            System.out.println("or");
            System.out.println("y == 1.5 where double y = " +  secondChallenge.yDouble);
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("End try-catch");
        }

    }



}
