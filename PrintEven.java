/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printeven;
import java.util.*;
/**
 *
 * @author test
 */
public class PrintEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        
        v.add(10);
        v.add(13);
        v.add(23);
        v.add(12);
        v.add(44);
        
        Enumeration<Integer> en=v.elements();
        
        while(en.hasMoreElements())
        {
            int n=en.nextElement();
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
    }
    
}
