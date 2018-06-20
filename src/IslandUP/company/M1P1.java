package IslandUP.company;

public class M1P1 {
    // Begin1.Find perimeter of the square where side is equal value 'a'
    public void perimeter(int a) {
        System.out.println("BEGIN 1. Find perimeter of the square where side is equal value 'a'  P = 4·a");
        int P = 4 * a;
        System.out.println("The value of the side is  " + a);
        System.out.println("The perimeter is equal " + P);
    }

    //Begin2.The side of square  equal  'a'. Find the area of square
    public void area(int a) {
        System.out.println("BEGIN 2.The side of square  equal  'a'. Find the area of square S = a2");
        int b = 2;
        int S = (int) Math.pow(a, b);
        System.out.println("The value of the side is " + a);
        System.out.println("The area is equal " + S);

    }

    //Begin3 The sides of rectangle are equal A and B. Find the area and perimeter
    public void rectangle(int a, int b) {
        System.out.println("BEGIN 3 The sides of rectangle are equal A and B. Find the area and perimeter S = a·b  P = 2·(a + b). ");
        int P = 2 * (a + b);
        int S = a * b;
        System.out.println("The values  sides a and b are " + a + " " + b);
        System.out.println("The perimeter is equal " + P);
        System.out.println("The area is equal " + S);


    }

    //Begin4 The diameter of circle is equal 'd' . Find the length of circle. L= pi*d
    public void circleDiameter(double d) {
        System.out.println("BEGIN 4 The diameter of circle is equal 'd' . Find the length of circle. L= pi*d");

        double L = Math.PI * d;
        System.out.println("The value of diameter  is equal " + d);
        System.out.println("The length is " + L);


    }

    //Begin5 The length of the cube edge is equal 'a'. Find the cube area and capacity
    public void cubeParameter(int a) {
        System.out.println("BEGIN 5 The length of the cube edge is equal 'a'. Find the cube area and capacity  V=a3 S = 6·a2");
        int V = (int) Math.pow(a, 3);
        int S = (int) (6 * Math.pow(a, 2));
        System.out.println("The length of the cube edge is equal " + a);
        System.out.println("The area is " + S);
        System.out.println("The capacity is " + V);

    }

    //Begin6 The lengths rectangular parallelepiped edges are equal 'a' , 'b' and 'c' . Find the capacity and area V = a·b·c  S = 2·(a·b + b·c + a·c)
    public void parallelepipedParameter(int a, int b, int c) {

        int V = a * b * c;
        int S = 2 * (a * b + b * c + a * c);
        System.out.println("BEGIN6 The lengths rectangular parallelepiped edges are equal 'a' , 'b' and 'c' ." +
                " Find the capacity and area V = a·b·c  S = 2·(a·b + b·c + a·c)");
        System.out.println("edges are equal " + a + " " + b + " " + c);
        System.out.println("The area is " + S);
        System.out.println("The capacity is " + V);


    }

    //Begin7 Find the value of circle length and area. Where length is equal L and area is S.And radius is R . L=2PI*R S=PI*R2
    public void circleParameters(double R) {
        double L = (Math.PI * 2) * R;
        double S = (Math.PI) * Math.pow(R, 2);
        System.out.println("BEGIN7 Find the value of circle length and area. Where length is equal L and area is S.And radius is R . L=2PI*R S=PI*R2");
        System.out.println("Radius is equal " + R);
        System.out.println("Area is " + S);
        System.out.println("Lenght is " + L);


    }

    //Begin8 Find the arithmetic average of two numbers. Numbers are equal A and B
    public void average(int A, int B) {
        int average = (A + B) / 2;
        System.out.println("Begin8 Find the arithmetic average of two numbers. Numbers are equal A and B");
        System.out.println("Number A is equal " + A);
        System.out.println("Number B is equal " + B);
        System.out.println("Arithmetic average is " + average);
    }

    //  Begin9 Find the geometric average of two positive numbers . The numbers equal A and B. The geometric average determination formula  is SQRT(A*B)
    public void geometricAverage(int A, int B) {
        int geoAve = (int) Math.sqrt(A * B);
        System.out.println("Find the geometric average of two positive numbers . The numbers equal A and B. The geometric average determination formula  is SQRT(A*B)");
        System.out.println("Number A is equal " + A);
        System.out.println("Number B is equal " + B);
        System.out.println("Geometric average " + geoAve);
    }

    //Begin10 The two non zero numbers are equal A and B. Find the sum,difference,product and
    //quotient modules of numbers
    public void mathOperations(int A, int B) {
        int modSum = Math.abs(A + B);
        int modDif = Math.abs(A - B);
        int modPr = Math.abs(A * B);
        double modQuotient = Math.abs((double) A / B);
        System.out.println("Begin10 The two non zero numbers are equal A and B. Find the sum,difference,product and\n" +
                "    quotient modules of numbers");
        System.out.println("The numbers  are equal  " + A + " " + B);
        System.out.println("Sum is " + modSum + " Difference is " + modDif + " Product is " + modPr + " quotient is " + modQuotient);
    }

    //Begin11 The two cassettes of rectangular triangle are equal A and B. Find the  hypotenuse and perimeter. The perimeter is equal P = A+B+C.
    //The hypotenuse is SQRT(A2+B2)
    public void operatinWithtriangle(int A, int B) {
        double HPT = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        double P = (HPT + A + B);
        System.out.println("Begin11 The two cassettes of rectangular triangle are equal A and B. Find the  hypotenuse and perimeter. The perimeter is equal P = A+B+C.\n" +
                "    The hypotenuse is SQRT(A2+B2)");
        System.out.println("A is equal " + A);
        System.out.println("B is equal " + B);
        System.out.println("Hypotenuse value " + HPT);
        System.out.println("Perimeter " + P);
    }

    //Begin12 There are two circle with general center and radius R1 and R2. Find areas this circles and area circle where inside radius is R1 and outside radius is R2. S1 = PI*(R1)2
    // S2 = PI*(R2)2  S3=S1-S2
    public void circleArea(int R1, int R2) {
        double S1 = (Math.PI * Math.pow(R1, 2));
        double S2 = (Math.PI * Math.pow(R2, 2));
        double S3 = S1 - S2;
        System.out.println("Begin12 There are two circle with general center and radius R1 and R2. Find areas this circles and area circle where inside radius is R1 and outside radius is R2. S1 = PI*(R1)2\n" +
                "     S2 = PI*(R2)2  S3=S1-S2 ");
        System.out.println("R1 value " + R1 + " S1 is " + S1);
        System.out.println("R1 value " + R2 + " S2 is " + S2);
        System.out.println("S3 " + S3);


    }

    //Begin13 Change A and B values for each other
    public void reverse(int A, int B) {
        int helpVariable;
        System.out.println("Begin13 Change A and B values for each other");
        System.out.println("A equal is  " + A);
        System.out.println("B equal is  " + B);
        helpVariable = A;
        A = B;
        B = helpVariable;
        System.out.println("Now A is " + A);
        System.out.println("Now B is " + B);
//a = a ^ b;
//b = a ^ b;
//a = a ^ b; another way without third variable

    }

    //Begin14 Find the first and second part of two digit number
    public void numberParts(int n) {
        int firsPart = (n - (n % 10)) / 10;
        int secondPart = n % 10;
        System.out.println("Find the first and second part of two digit number");
        System.out.println("For example two digit number is "+n);
        System.out.println("The first part is "+firsPart);
        System.out.println("The second part is "+secondPart);
    }
}


