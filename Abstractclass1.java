/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass1;

abstract class A
{
    public void x()
    {
        System.out.println("x");
    }
    public abstract void y();
}
class B extends A
{
 public void y()
{
    System.out.println("y");
}
}


public class Abstractclass1 {

   
    public static void main(String[] args) 
    {
     new B();
     
    }
    
}
