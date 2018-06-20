package IslandUP.company;

public class M1P2_ConditionalOperators {
    //Conditional_01 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console
    public void check(int N) {
        System.out.println("Conditional_01 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console");
        System.out.println("N is equal " + N);
        if (N >= 0)
            System.out.println("N is positive " + N);
        else
            System.out.println("N is negative. New value is " + (++N));
    }

    //Conditional_02 If integer is positive add 1 if  number is negative subtract 2.Output result in console
    public void check02(int N) {
        System.out.println("Conditional_02 If integer is positive add 1 if  number is negative subtract 2.Output result in console");
        System.out.println("N is equal " + N);
        if (N >= 0)
            System.out.println("N is positive " + N + " New value is " + (++N));
        else
            System.out.println("N is negative. New value is " + (N - 2));

    }

    //Conditional_03 If integer is positive add 1 if  number is negative subtract 2.If Number is equal 0 change  to 10
    //Output result in console
    public void check03(int A) {
        System.out.println("Conditional_03 If integer is positive add 1 if  number is negative subtract 2.If Number is equal 0 change  to 10");
        if (A < 0) {
            System.out.println("N is negative. New value is " + (A - 2));
        } else if (A == 0) {
            A = 10;
            System.out.println("A is 0. New value is " + A);
        } else {
            System.out.println("A is positive. New value is " + (++A));
        }
    }

    //Conditional_04 Find all negative and after positive
    //integer values of three numbers . Output result in console
    public void check04(int first, int second, int third) {
        System.out.println("Conditional_04 Find all negative and after positive integer values of three numbers . Output result in console");
        int negativeCounter = 0;
        int positiveCounter = 0;
        if (first >= 0) {
            System.out.println(first + " is positive value");
            positiveCounter++;

        } else
            System.out.println(first + " is negative value");
        negativeCounter++;
        if (second >= 0) {
            System.out.println(second + " is positive value");
            positiveCounter++;

        } else
            System.out.println(second + " is negative value");
        negativeCounter++;
        if (third >= 0) {
            System.out.println(third + " is positive value");
            positiveCounter++;

        } else
            System.out.println(third + " is negative value");
        negativeCounter++;


        System.out.println("Positive quantity is " + positiveCounter);
        System.out.println("Negative quantity is " + negativeCounter);

    }
    //Conditional_05 Integer number means calendar year. Check how many days in year. If day quantity 365 it  is typical year if 366 is leap year. Diapason from 100 to 2020
    public void check05(int year){
        System.out.println("Conditional_05 Integer number means calendar year. Check how many days in year. If day quantity 365 it  is typical year if 366 is leap year. Diapason from 100 to 2020");
        if (year%4==0 & year%100!=0 | year%400==0){
            System.out.println(year+" This is leap year ");
        }
        else{

            System.out.println(year+" This is typical year ");
        }
    }


}
