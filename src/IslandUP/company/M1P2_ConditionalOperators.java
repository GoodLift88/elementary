package IslandUP.company;

public class M1P2_ConditionalOperators {
    public void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    //Conditional_01 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console
    public void check(int N) {
        delimiter();

        System.out.println("Conditional_01 Check the integer number N. If N is negative add 1 or if number is positive do not change . Output result in console");
        System.out.println("N is equal " + N);
        if (N >= 0)
            System.out.println("N is positive " + N);
        else
            System.out.println("N is negative. New value is " + (++N));
    }

    //Conditional_02 If integer is positive add 1 if  number is negative subtract 2.Output result in console
    public void check02(int N) {
        delimiter();

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
        delimiter();
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
        delimiter();
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
    public void check05(int year) {
        delimiter();
        System.out.println("Conditional_05 Integer number means calendar year. Check how many days in year. If day quantity 365 it  is typical year if 366 is leap year. Diapason from 100 to 2020");
        if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
            System.out.println(year + " This is leap year ");
        } else {

            System.out.println(year + " This is typical year ");
        }
    }

    // Conditional_06 The integer number in diapason from 1 to 999 . Output to console integer type(even or uneven)and digits quantity
    public void check06(int n) {
        delimiter();
        System.out.println("Conditional_06 The integer number in diapason from 1 to 999 . Output to console integer type(even or uneven)and digits quantity");
        System.out.println("Integer is equal " + n);
        if (n % 2 == 0) {
            if (n < 10)
                System.out.println("This is even 1 digit number ");
            else if (n < 100 && n >= 10)
                System.out.println("This is even 2 digit number ");
            else if (n >= 100 && n <= 999)
                System.out.println("This is even 3 digit number");
            else
                System.out.println("This integer is not in diapason from 1 to 999");
        }
        if (n % 2 != 0) {
            if (n < 10)
                System.out.println("This is uneven 1 digit number ");
            else if (n < 100 && n >= 10)
                System.out.println("This is uneven 2 digit number ");
            else if (n >= 100 && n <= 999)
                System.out.println("This is uneven 3 digit number");
            else
                System.out.println("This integer is not in diapason from 1 to 999");

        }
    }

    //Conditional_07 The are three variable of integer type if their values sorted in ascending order or sorted descending then change values on x2 from first values
    //If is not  then change to 0 all values
    public void check_07(int first, int second, int third) {
        delimiter();
        System.out.println("Conditional_07 The are three variable of integer type if their values sorted in ascending order or sorted descending then change values on x2 from first values \n" +
                "                If is not  then change to 0 all values");
        System.out.println("First variable has value " + first);
        System.out.println("Second variable has value " + second);
        System.out.println("Third variable has value " + third);
        if (first < second && second < third) {
            System.out.println("Ascending Values");
            System.out.println("First variable new value " + first * 2);
            System.out.println("Second variable new value " + second * 2);
            System.out.println("Third variable new  value " + third * 2);

        } else if (first > second & second > third & third < first) {
            System.out.println("Values in descending order");
            System.out.println("First variable new value " + first * 2);
            System.out.println("Second variable new value " + second * 2);
            System.out.println("Third variable new  value " + third * 2);
        } else {
            System.out.println("Variable values  are not ordered");
            System.out.println("All variable has value 0 ");
            first = 0;
            second = 0;
            third = 0;
            System.out.println("First new value is  " + first);
            System.out.println("Second new value is " + second);
            System.out.println("Third new value " + third);

        }


    }

    //Conditional_08 Three variables A , B and C has integer values. Create program which is find and output into console the roots of the quadratic equation or report when no  roots
    public void check08(int A, int B, int C) {
        delimiter();
        System.out.println("Conditional_08 Three variables A , B and C has integer values. Create program which is find and output into console the roots of the quadratic equation or report when no  roots");
        int D = (int) (Math.pow(B, 2) - 4 * (A * C));
        double root01 = (B - (2 * B) + Math.sqrt(D)) / (2 * A);
        double root02 = (B - (2 * B) - Math.sqrt(D)) / (2 * A);
        if (D == 0) {
            System.out.println("D is " + D + " Quadratic equation with one root " + root01);
        } else if (D > 0) {
            System.out.println("D is " + D + " Quadratic equation with two roots " + root01 + " and " + root02);
        } else {
            System.out.println("D is  " + D + " There are no roots ");
        }


    }

    //Conditional_09 Check a three-digit integer number. Determine whether the square of this number is equal to the sum of the cubes of its numerals. Output result into console

    public void check_09(int N) {
        int numeral_01=N/100;
        int numeral_02 = N/10;
        int numeral_03 = N-(numeral_01+numeral_02);
        int N_in_Square = (int) Math.pow(N, 2);
        int first_numeralCube = (int) Math.pow(numeral_01, 3);
        int second_numeralCube = (int) Math.pow(numeral_02, 3);
        int third_numeralCube = (int) Math.pow(numeral_03, 3);
        int numeralsCubeSum = first_numeralCube + second_numeralCube + third_numeralCube;
        if (N_in_Square == numeralsCubeSum) {
            System.out.println("The number is "+N+"/n"+"First numeral is "+numeral_01);


            System.out.println("The square of number is " + N_in_Square);
            System.out.println("The sum of the cubes numerals this number is " + numeralsCubeSum);
            System.out.println("Variables is equal");


        } else {
            System.out.println("The number is "+N+"First numeral is "+numeral_01);
            System.out.println("The square of number is " + N_in_Square);
            System.out.println("The sum of the cubes numerals this number is " + numeralsCubeSum);
            System.out.println("Variables is not  equal");

        }

    }
}
