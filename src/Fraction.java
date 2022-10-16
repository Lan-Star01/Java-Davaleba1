public class Fraction {
    protected int numerator;
    protected int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    protected void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    static int gcd(int d, int f) {
        if (d==0)
            return f;
        return gcd(f%d,d);
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }


    public boolean equals(Object obj){
        if(obj instanceof Fraction) {
            if (numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator) {
                return true;
            }
        }
        return false;
    }

    Fraction add(Fraction x){
        return new Fraction((numerator * x.getDenominator()) + (x.getNumerator() * denominator), denominator * x.getDenominator());
    }
    
    Fraction multiply(Fraction x){
        return new Fraction(numerator * x.getNumerator(), denominator * x.getDenominator());
    }

    public String toString()
    {
        return (Integer.toString(numerator) + "/" + Integer.toString(denominator));
    }

}
