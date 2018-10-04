
public class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){

        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int Numerator){
        numerator = Numerator;
    }

    public void setDenominator(int Denominator){
        if (Denominator != 0){
            denominator = Denominator;
        }
    }

    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }

    public void multiplication(Fraction fraction){
        numerator = numerator * fraction.getNumerator();
        denominator = denominator * fraction.getDenominator();

        reduceFraction(numerator, denominator);

    }

    public void add(Fraction fraction){
        numerator =(numerator * fraction.getNumerator()) + 
        (fraction.getNumerator() * denominator);
        
        denominator = denominator * fraction.getDenominator();
        
        reduceFraction(numerator, denominator);
    }

    public void sub(Fraction fraction){
        numerator =(numerator * fraction.getNumerator()) - 
        (fraction.getNumerator() * denominator);
        
        denominator = denominator * fraction.getDenominator();
        
        reduceFraction(numerator, denominator);
    }

    public void division(Fraction fraction){
        numerator = numerator * fraction.getDenominator();
        denominator = denominator * fraction.getNumerator();

        reduceFraction(numerator, denominator);
    }

    private void reduceFraction(int numerator, int denominator){

        


        int i = 2;
        while(true){
            if(numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator / i;
                i = 2;
            }
            else{
                if (i > numerator || i > denominator){
                    break;
                }

                i++;
            }
           
        }

        System.out.println(numerator + "/" + denominator);

    }



}