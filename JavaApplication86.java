/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

class A
{
    public void sum(int a,int b)
    {
        System.out.println("Sum is:"+(a+b));
    }
    
}
class B extends A
{
    public void multiply(int a,int b)
    {
        System.out.println("Product is : "+(a*b));
    }
}
public class JavaApplication86 {

    
    public static void main(String[] args) 
    {
        A obj1=new B();  //works normally
        
        obj1.sum(5,6);//only method of the parent class will be called...
       
        B obj2=new A();   //we cannot create the object of the base class and referecne of the derived class.It is not possible.It will give an error 
        
        
        A obj3=new A();  
        obj3.sum(2, 3);  //works normally
        
        B obj4=new B();
        obj4.multiply(0, 0); //works normally
        obj4.sum(2, 7);    //works normally
        
    }
    
}
