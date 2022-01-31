/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class App {
    
	public static void main(String args[]) {
        Complex c1 = new Complex(2,3);//2+3i
         Complex c2 = new Complex(8,5);//8+5i
         Complex c3 = new Complex();
          Complex c4 = new Complex();
           c3= c1.add(c2);
          System.out.println(c3);//10+8i
          c4=c1.multiply(c2);
          System.out.println(c4); //1+34i
 
}
}

public class Complex{
    private int real;
    private int imaginary;
  
    public Complex(){
}
   public Complex(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
}
   
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary= imaginary;
    }
    public Complex add(Complex c) {
        Complex temp=new Complex();
        temp.setReal(this.getReal()+c.getReal());
        temp.setImaginary(this.getImaginary()+c.getImaginary());
        return temp;}
    
        public Complex multiply(Complex c){
            Complex temp=new Complex();
            temp.setReal(this.getReal()*  c.getReal() - this.getImaginary()* c.getImaginary());
            temp.setImaginary(this.getReal()*c.getImaginary() + this.getImaginary()* c.getReal());
            return temp;
         }
        @Override
        public String toString(){
     return "The result is: " + this.real + " + " + this.imaginary + "i";
}
	
}
