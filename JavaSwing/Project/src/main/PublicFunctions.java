package main;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PublicFunctions {
    String Query="";
    Connection c;
    Statement s;
    ResultSet r;
    public final void getrec()  //get data from sql table
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
            c=DriverManager.getConnection("jdbc:odbc:Marks_Record_Sys","root","gaurav");  
            s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            r =s.executeQuery(Query);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connectivity Error..!!!"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public final void updtrec()     //update data on SQL Table
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
            c=DriverManager.getConnection("jdbc:odbc:Marks_Record_Sys","root","gaurav");  
            s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            s.executeUpdate(Query);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connectivity Error..!!!"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    void emptyTable( javax.swing.JTable tb_name)
    {
        DefaultTableModel model= (DefaultTableModel) tb_name.getModel();
        int row=tb_name.getRowCount()-1;
        while(row>=0)
            model.removeRow(row--);
    }
}
