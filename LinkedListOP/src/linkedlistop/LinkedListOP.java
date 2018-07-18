/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistop;
import java.util.*;

/**
 *
 * @author test
 */
public class LinkedListOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        
        l.add(10);
        l.offer(20);
        l.add(30);
        l.offer(40);
        
        System.out.println(l);
        
        System.out.println(l.contains(50));
        System.out.println(l.indexOf(40));
        System.out.println(l.size());
        
        Iterator it= l.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println();
        Iterator it1= l.descendingIterator();
        
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        System.out.println();
        System.out.println(l);
        l.remove();
        System.out.println(l);
        System.out.println();
        LinkedList<Integer> s=new LinkedList<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println(s);
        
        s.pop();
        System.out.println(s);
        
        s.clear();
        System.out.println(s);
        
    }
    
}
