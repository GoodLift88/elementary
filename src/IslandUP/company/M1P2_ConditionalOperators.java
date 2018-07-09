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
        int numeral_01 = N / 100;
        int numeral_02 = N / 10 % 10;
        int numeral_03 = N - (N - (N % 10));
        int N_in_Square = (int) Math.pow(N, 2);
        int first_numeralCube = (int) Math.pow(numeral_01, 3);
        int second_numeralCube = (int) Math.pow(numeral_02, 3);
        int third_numeralCube = (int) Math.pow(numeral_03, 3);
        int numeralsCubeSum = first_numeralCube + second_numeralCube + third_numeralCube;
        delimiter();
        System.out.println("Conditional_09 Check a three-digit integer number. Determine whether the square of this number is equal to the sum of the cubes of its numerals. Output result into console");
        System.out.println("The number is \t" + N + " \tFirst numeral is " + numeral_01 + "\t Second numeral is " + numeral_02 + "\t Third numeral is " + numeral_03);
        if ((N > 999 | N < 100)) {
            System.out.println("The number is not diapason");
        } else if (N_in_Square == numeralsCubeSum) {


            System.out.println("The square of number is " + N_in_Square);
            System.out.println("The sum of the cubes numerals this number is " + numeralsCubeSum);
            System.out.println("Variables is equal");


        } else if (N_in_Square != third_numeralCube) {

            System.out.println("The square of number is " + N_in_Square);
            System.out.println("The sum of the cubes numerals this number is " + numeralsCubeSum);
            System.out.println("Variables is not  equal");

        }


    }

    //Conditional_10
//The traffic light for foot passengers programed like cycle where first three minutes is green light next two is yellow and after two minutes is red.
// The integer number T has value what means time in minutes for one hour.Identify what colour will  in this  moment time. Output result into console.
    public void check10(int T) {
        delimiter();
        System.out.println("Conditional_10  The traffic light for foot passengers programed like cycle where first three minutes is green light next two is yellow and after two minutes is red.\n" +
                "The integer number T has value what means time in minutes for one hour.\n" +
                "Identify what colour will  in this  moment time. Output result into console.");

        System.out.println("T equals " + T);

        if (T % 7 <= 3) {
            System.out.println("Now is Green Light");

        } else if (T % 7 >= 4 && T % 7 <= 5) {
            System.out.println("Now is Yellow Light");

        } else if (T % 7 >= 6) {
            System.out.println("Now is Red Light ");
        } else {
            System.out.println("Error !!!");
        }

    }

    //Conditional_11
    // Create program which determinate day of the week by its serial number Output result into console
    public void helpMethod(int i, String s) {

        System.out.println(s + i);
    }

    public void check011(int Day) {
        delimiter();

        System.out.println("Conditional_11 Create program which determinate day of the week by its serial number Output result into console");
        helpMethod(Day, "For example value is  ");
        switch (Day) {
            case 1:
                System.out.println("It's Sunday today ");
                break;
            case 2:
                System.out.println("It's Monday today");
                break;
            case 3:
                System.out.println("It's a Tuesday today");
                break;
            case 4:
                System.out.println("It's a Wednesday today");
                break;
            case 5:
                System.out.println("It's a Thursday today");
                break;
            case 6:
                System.out.println("It's a Friday today");
                break;
            case 7:
                System.out.println("Today is Saturday . The last day of the week ");
                break;


        }
        if (Day < 1 || Day > 8) {
            System.out.println("Error ");
        }
    }

    //Conditional_12
    //One engineer created device whom show time in seconds to end of work . But every time very uncomfortable convert seconds to hours for workers .
    // Write program which can convert seconds to hours
    public void task_text() {
        System.out.println("Conditional_12\n" + "One engineer created device whom show time in seconds to end of work.\n" +
                "But every time very uncomfortable convert seconds to hours for workers.\n"
                + "Write program which can convert seconds to hours");
    }

    public void check012(int Seconds) {
        delimiter();
        task_text();


        int WorkTimeInMinutes = Seconds / 60;
        int Hours = WorkTimeInMinutes / 60;
        int Minutes = WorkTimeInMinutes - (Hours * 60);
        int time = Seconds / 3600;


        if (Seconds < 0 || Seconds > 28800) {
            System.out.println("Incorrect value ");
        } else {
            System.out.println("Seconds passed " + Seconds);
            System.out.println("Full minutes passed " + WorkTimeInMinutes);
            System.out.println("Full hours passed " + Hours);
            System.out.println("Total worked time " + Hours + "h:" + Minutes + "min");


            switch (time) {
                case 8:
                    System.out.println("This hard day is over. See you tomorrow");
                    break;
                case 7:
                    if (Minutes == 0) {
                        System.out.println("It remains to work an hour");
                    } else {
                        System.err.println("It remains to work less an hour");
                    }
                    break;
                case 6:
                    if (Minutes == 0) {
                        System.out.println("It remains to work two hours");
                    } else {
                        System.err.println("It remains to work less two hours");
                    }
                    break;
                case 5:
                    if (Minutes == 0) {
                        System.out.println("It remains to work three hours");
                    } else {
                        System.err.println("It remains to work less three hours");
                    }
                    break;
                case 4:
                    if (Minutes == 0) {
                        System.out.println("It remains to work four hours");
                    } else {
                        System.err.println("It remains to work less four hours");
                    }
                    break;
                case 3:
                    if (Minutes == 0) {
                        System.out.println("It remains to work five hours");
                    } else {
                        System.err.println("It remains to work less five hours");
                    }
                    break;
                case 2:
                    if (Minutes == 0) {
                        System.out.println("It remains to work six hours");
                    } else {
                        System.err.println("It remains to work less six hours");
                    }
                    break;
                case 1:
                    if (Minutes == 0) {
                        System.out.println("It remains to work seven hours");
                    } else {
                        System.err.println("It remains to work less seven  hours");
                    }
                    break;
                case 0:
                    System.err.println("Ready to hard work monkeys.Day just begun");
                    break;


            }
        }

    }
}


