/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author test
 */
public class JDBC_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        Connection c=DriverManager.getConnection(url,"User4","password");
        Statement s=c.createStatement();
        
        while(true)
        {
        Scanner sc=new Scanner(System.in);
        String ans;
        int acc;
        System.out.println("Login");
        System.out.print("username: ");
        String uname=sc.next();
        System.out.print("password: ");
        String pass=sc.next();
        int flag=0;
        
        String q="select * from emp";
        ResultSet rs=s.executeQuery(q);
        
        while(rs.next())
        {
            if(uname.equals(rs.getString(1))&& pass.equals(rs.getString(2)))
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            do
            {
                System.out.println(" 1.Account Creation\n 2.Deposit\n 3.Withdraw\n 4.Balance Check\n 5.Exit");
                int n=sc.nextInt();
                
                switch(n)
                {
                    case 1: System.out.println("Enter new account number");
                            acc=sc.nextInt();
                            int bal=500;
                            String query="insert into cust values("+acc+","+bal+")";
                            int r=s.executeUpdate(query);
                            if(r>0)
                            System.out.println("Account Created");
                            break;
                            
                    case 2: System.out.println("Enter account number");
                            acc=sc.nextInt();     
                            q="select * from cust";
                            rs=s.executeQuery(q);
                            flag=0;
                            while(rs.next())
                            {
                                if(acc==rs.getInt(1))
                                {
                                    flag=1;
                                    break;
                                }
                                
                            }    
                                if(flag==0)
                                {
                                    System.out.println("no such account exists");
                                }
                                
                                else
                                {
                                    System.out.println("Enter amount to be deposited");
                                    int amt=sc.nextInt();
                                    rs=s.executeQuery(q);
                                    
                                    while(rs.next())
                                    {
                                        if(acc==rs.getInt(1))
                                        {
                                            query="update cust set balance=balance+"+amt+" where acc_no="+acc;
                                            int result=s.executeUpdate(query);
                                            if(result>0)
                                            {
                                                System.out.println("Deposit successful");
                                            }
                                        }
                                    }    
                                }
                               
                                break;
                                    
                                
                    case 3: System.out.println("Enter account number");
                            acc=sc.nextInt();     
                            q="select * from cust";
                            rs=s.executeQuery(q);
                            flag=0;
                            while(rs.next())
                            {
                                if(acc==rs.getInt(1))
                                {
                                    flag=1;
                                    break;
                                }
                                
                            }    
                                if(flag==0)
                                {
                                    System.out.println("no such account exists");
                                }
                                
                                else
                                {
                                    System.out.println("Enter amount to be withdrawn");
                                    int amt=sc.nextInt();
                                    int amt2=0;
                                    rs=s.executeQuery(q);
                                    while(rs.next())
                                    {
                                        if(acc==rs.getInt(1))
                                        {
                                            amt2=rs.getInt(2);
                                        }
                                    }    
                     
                                    if(amt<=amt2)
                                    {    
                                    while(rs.next())
                                    {
                                        if(acc==rs.getInt(1))
                                        {
                                            query="update cust set balance=balance-"+amt+" where acc_no="+acc;
                                            int result=s.executeUpdate(query);
                                            if(result>0)
                                            {
                                                System.out.println("Withdraw successful");
                                            }
                                        }
                                
                                    } 
                                    }
                                    
                                    else
                                    {
                                        System.out.println("Insufficient balance");
                                    }
                                }
                                
                                break;  
                                
                    case 4: System.out.println("Enter account number");
                            acc=sc.nextInt();    
                            q="select * from cust";
                            rs=s.executeQuery(q);
                            flag=0;
                            while(rs.next())
                            {
                                if(acc==rs.getInt(1))
                                {
                                    System.out.println("Balance is "+rs.getInt(2));
                                    flag=1;
                                    break;
                                }
                                
                            }  
                            
                            if(flag==0)
                            {
                                System.out.println("No such account exists");
                            }
                            
                            break;
                            
                    case 5: break;
                    
                    default: System.out.println("Wrong choice");
                             break;   
                             
                }
                if(n==5)
                    break;
                System.out.println("Do you want to continue?");
                ans=sc.next();
                
                
            }while(ans.equals("y")||ans.equals("Y"));
            
        }
        
        else
        {
            System.out.println("incorrect username or password");
        }
        
        }
         
    }
    
}
