public class Complex1{
    private int real;
    private int imaginary;


public Complex1(){

}
public Complex1(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
}
   
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getimaginary() {
        return imaginary;
    }

    public void setimaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    public Complex1 add(Complex1 c){
       Complex1 temp=new Complex1();
       temp.real=this.real+c.real;
       temp.imaginary=this.imaginary+c.imaginary;
       return temp;
    }
       
    public Complex1 Multiply(Complex1 c){
        Complex1 temp=new Complex1();
        (this.real*c.real()) - (this.imaginary* c.imaginary()),
		(this.real*c.imaginary()) + (this.imaginary* c.real()));
        return temp;
     }
     @Override
	public String toString() {
		return "Sum is: " + temp.real + " + " + temp.imaginary + "i" +  " Multiply is: " + temp.real + " + " + temp.imaginary + "i";
   
	}
}