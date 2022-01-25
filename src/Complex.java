public class Complex{
    private int real;
    private int imaginary;
}
public Complex(){

}
public Complex(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
}
    /**
     * @return the real
     */
    public int getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(int real) {
        this.real = real;
    }

    /**
     * @return the imaginary
     */
    public int getImaginary() {
        return imaginary;
    }

    /**
     * @param imaginary the imaginary to set
     */
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }