/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorop;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author test
 */
public class VectorOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> v=new Vector<>(3,1);
        System.out.println(v.capacity());
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println(v.capacity());
        //v.setSize(3);
        v.add(5);
        //v.add(6);
        System.out.println(v.capacity());
        v.add(6);
        System.out.println(v.capacity());
        System.out.println(v);
       
        System.out.println(v.size());
        System.out.println(v.capacity());
        
        Enumeration en= v.elements();
        
        while(en.hasMoreElements())
        {
            System.out.print(en.nextElement()+" ");
        }
        System.out.println();
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
    
}
