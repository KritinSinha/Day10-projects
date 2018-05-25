/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;




public class Final {

    
    public static void main(String[] args) 
    {
        final float pi=3.14f;
        pi=3.1414;  //here it shows error as pi has been mdoified with final and hence its value cannot be changed again once initialised. 
        
        //VERSUS
        
        float pi1=3.14f;
        pi1=3.1414f;
       
    }
    
}
