/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetop;

/**
 *
 * @author test
 */
public class Student implements Comparable<Student> {
    int id;
 
    String name;
 
    int perc_Of_Marks_Obtained;
 
    public Student(int id, String name, int perc_Of_Marks_Obtained)
    {
        this.id = id;
 
        this.name = name;
 
        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
    }
 
    @Override
    public String toString()
    {
        return id+" : "+name+" : "+perc_Of_Marks_Obtained;
    }
    
    @Override
  public int compareTo(Student s2){
     
     /*if(this.id == s2.id)
        {
            return 0;
        }*/
        //else
        {
            return this.perc_Of_Marks_Obtained - s2.perc_Of_Marks_Obtained;
        }
    }

    }
    

