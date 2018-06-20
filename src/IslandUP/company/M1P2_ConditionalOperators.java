package IslandUP.company;

public class M1P2_ConditionalOperators {
    //Conditional1 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console
    public void check(int N) {
        System.out.println("Conditional1 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console");
        System.out.println("N is equal " + N);
        if (N >= 0)
            System.out.println("N is positive " + N);
        else
            System.out.println("N is negative. New value is " + (++N));
    }

    //Conditional2 If integer is positive add 1 if  number is negative subtract 2.Output result in console
    public void check02(int N) {
        System.out.println("Conditional2 If integer is positive add 1 if  number is negative subtract 2.Output result in console");
        System.out.println("N is equal " + N);
        if (N >= 0)
            System.out.println("N is positive " + N + " New value is " + (++N));
        else
            System.out.println("N is negative. New value is " + (N - 2));

    }

    //Conditional3 If integer is positive add 1 if  number is negative subtract 2.If Number is equal 0 change  to 10
    //Output result in console
    public void check03(int A) {
        System.out.println("Conditional3 If integer is positive add 1 if  number is negative subtract 2.If Number is equal 0 change  to 10");
        if (A < 0) {
            System.out.println("N is negative. New value is " + (A - 2));
        } else if (A == 0) {
            A = 10;
            System.out.println("A is 0. New value is " + A);
        } else {
            System.out.println("A is positive. New value is " + (++A));
        }
    }

}
