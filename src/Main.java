public class Main {
    public static void main(String[] args) {

        //davaleba3 wiladebze shekveca moqmedebis drosve xdeba
        Fraction d = new Fraction(1, 3);
        Fraction f = new Fraction(2, 4);

        Fraction g = d.add(f);
        System.out.println(g.toString());

        g = d.multiply(f);
        System.out.println(g.toString());



        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //QuadraticEquation davaleba1

        double a = 1;
        double b = 5;
        double c = 4;
        double root1;
        double root2;
        double determinant = b * b - 4 * a * c;


        if (determinant > 0) {
            System.out.println("Determinant is " + determinant);
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Root 1 is " + root1);
            System.out.println("Root 2 is " + root2);
        }
        else if (determinant == 0) {
            System.out.println("Determinant is " + determinant);
            root1 = root2 = -b / (2 * a);
            System.out.println("Root is " + root1);
        }
        else {
            System.out.println("Determinant is " + determinant);
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.println("The roots of the quadratic equation are complex and different");
            System.out.println(real);
            System.out.println(imaginary);
        }


        ///////////////////////////////////////////////////////////////////////////////////////////
        //davaleba2 stringze

        String [] words = {"Tea", "Bear", "Cloud", "Ghost", "Sunflower"};
        String shortest = words[0];
        for (int i = 0; i < words.length; i++){
            if(words[i].length() <= shortest.length()){
                shortest = words[i];
            }
        }
        System.out.println(shortest);
    }


}