package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    int getReal(){
        return real;
    }

    int getImaginary(){
        return imaginary;
    }

    void setReal(int real){
        this.real = real;
    }

    void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex nr){
        this.real = nr.real;
        this.imaginary = nr.imaginary;
    }

    void addWithComplex(Complex nr){
        nr.real += this.real;
        nr.imaginary += this.imaginary;
    }

    void showNumber(){
        if(this.imaginary > 0) System.out.println(this.real + " + i" + " * " + this.imaginary);
        else if(this.imaginary < 0) System.out.println(this.real + " - i" + " * " + this.imaginary);
        else System.out.println(this.real);
    }

}
