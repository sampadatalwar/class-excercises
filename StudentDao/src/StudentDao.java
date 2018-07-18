
import DaoImpl.StudenDaoImpl;
import Model.StudentBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class StudentDao {
    
    public static void main(String args[])throws Exception
    {
        boolean status=false;
        StudentBean sb=new StudentBean();
        sb.setsId(100);
        sb.setsName("Sampada");
        
        StudenDaoImpl sdao =new StudenDaoImpl();
        status=sdao.insertdata(sb);
        
            }
    
}
