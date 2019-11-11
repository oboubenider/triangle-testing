import java.io.DataInputStream;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {
        // creating stdin object3

        DataInputStream stdin = new DataInputStream (System.in);
        String userAnswer = "yes";
        while (!userAnswer.equals("no")  )
        {
            double a = 0;
            double b = 0;
            double c = 0;
            // Ask user for 3 dimensions of triangle.
            System.out.println ("Enter the first side of the triangle make sure number is not negative or zero: ");
            do {
                String str = stdin.readLine();
                if (str.isEmpty() || str.isBlank())
                    continue;
                a = Double.parseDouble(str);
            } while (a <= 0);

            //int a = stdin.readInt();
            System.out.println ("Enter the second side of the triangle make sure number is not negative or zero: ");
            do {
                String str = stdin.readLine();
                if (str.isEmpty() || str.isBlank())
                    continue;
                b = Double.parseDouble(str);
            } while (b <= 0);

            //int b = stdin.readInt();
            System.out.println ("Enter the third side of the triangle make sure number is not negative or zero: ");
            do {
                String str = stdin.readLine();
                if (str.isEmpty() || str.isBlank())
                    continue;
                c = Double.parseDouble(str);
            } while (c <= 0);
            // int c = stdin.readInt();
            // object triangle
            Triangle Sides= new Triangle(a, b, c);

            // determine the triangle type
            System.out.println ("Is triangle right-angle? "+Sides.isRight());
            System.out.println ("Is triangle scalene?     "+Sides.isScalene());
            System.out.println ("Is triangle isosceles?   " +Sides.isosceles());
            System.out.println ("Is triangle equilateral? " +Sides.isEquilateral());
            // you want to continue or not
            System.out.println ("Do you want to check a different triangles");
            System.out.println ("(type  yes to continue otherwise type no)");
            userAnswer = stdin.readLine();
        }
        double x = 0;
        double y = 0;
        point point = new point(x , y);
    }
}