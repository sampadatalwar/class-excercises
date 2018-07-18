/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetop;
import java.util.*;
/**
 *
 * @author test
 */
public class TreeSetOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //MyComparator comparator = new MyComparator();
 
        //Creating TreeSet with 'MyComparator' as Comparator.
 
        TreeSet<Student> set = new TreeSet<Student>();
 
        //Adding elements to TreeSet
 
        set.add(new Student(121, "Santosh", 85));
 
        set.add(new Student(231, "Cherry", 71));
 
        set.add(new Student(417, "David", 82));
 
        set.add(new Student(562, "Praveen", 91));
 
        set.add(new Student(231, "Raj", 61));         //Duplicate element
 
        set.add(new Student(458, "John", 76));
 
        set.add(new Student(874, "Peter", 83));
 
        set.add(new Student(231, "Hari", 52));       //Duplicate element
 
        set.add(new Student(568, "Daniel", 89));
 
        //Iterating though TreeSet
 
        Iterator<Student> it = set.iterator();
 
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
