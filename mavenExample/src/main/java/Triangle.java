public class Triangle
{
     double a;
     double b;
     double c;

    // initializing the sizes of the triangle
    public Triangle (double firstSide, double secondSide, double thirdSide)
    {
        a = firstSide;
        b = secondSide;
        c = thirdSide;
    }

    // Right Triangle
    public boolean isRight ()
    {
        if (((a*a) == ((b*b) + (c*c))) || ((b*b) == ((a*a) + (c*c))) || ((c*c) == ((a*a) + (b*b))))
            return true;
        else
            return false;
    }

    // Scalene
    public boolean isScalene ()
    {
        if ((a != b) && (a != c) && (b != c))

            //   if (a > 0 && b > 0 && c > 0)

            return true;

        else
            return false;
    }

    // isosceles.
    public boolean isosceles ()
    {
        if (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (b != a)))
            return true;
        else
            return false;
    }

    // equilateral.
    public boolean isEquilateral () {
        if ((a == b) && (a == c) && (b == c))
            return true;
        else
            return false;
    }
    public double getArea ()
    {
        double s  = (a + b + c ) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

