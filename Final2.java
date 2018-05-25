//When we dont want to override a method, we make it final.

package final2;
class A
{
    public void sum()
    {
        System.out.println("Hello");
    }
    public final void multi()
    {
        System.out.println("Bye");
    }
}
class B extends A
{
 public void sum()
 {
     System.out.println("Hello2");   //here sum method is overriden
 }
public void multi()   //here multi method will not be overriden as it is made final in class A 
{
    System.out.println("Hey there");
}
}

public class Final2 {

   
    public static void main(String[] args) 
    {
       
    }
    
}
