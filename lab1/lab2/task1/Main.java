package lab2.task1;

public class Main {
    public static void main(String args[]){
        Complex nr1 = new Complex();
        Complex nr2 = new Complex(2,3);

        nr1.setReal(5);
        nr2.setImaginary(1);

        Complex nr3 = new Complex(nr2);

        nr3.addWithComplex(nr1);

        nr1.showNumber();
        nr2.showNumber();
        nr3.showNumber();
    }
}
