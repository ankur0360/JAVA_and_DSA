import java.sql.*;
import java.util.Scanner;

class JDBC
{
    Show z = new Show();
    Scanner scn = new Scanner(System.in);
    void exec() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ankur","root","25092003");
        PreparedStatement ps = con.prepareStatement("insert into lab values(?,?)");
        {
            System.out.print("Enter number of row : ");
            int n = scn.nextInt();
            for(int i = 1;i <= n;i ++)
            {   System.out.print("Enter Roll no : ");
                int a = scn.nextInt();
                System.out.print("Enter Name : ");
                scn.nextLine();
                String b = scn.nextLine();
                ps.setInt(1,a);
                ps.setString(2,b);
                ps.executeUpdate();
            }
            System.out.println("Row Inserted by Using Prepared Statement");
            System.out.println("Here is your database");
            z.View();
        }
    }
}
class Dlt
{
    Show z = new Show();
    Scanner scn = new Scanner(System.in);
    void Des() throws SQLException
    {
        System.out.println("Here is your database");
        z.View();
        char c;
        System.out.println("If you want to delete all rows press [1]");
        System.out.println("If want to delete specify row press[2]");
        System.out.println("For inserting data [Press any key]");
        c = scn.next().charAt(0);
        if (c == '1')
            Dl();
        else if(c == '2')
            Another();
            
        else
        {
            JDBC j = new JDBC();
            j.exec();
        }
    }
    void Dl() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ankur", "root","25092003");
        PreparedStatement ps = con.prepareStatement("delete from lab");
        ps.executeUpdate();
        System.out.println("Successfully deleted all rows.");
        
        
    }
    void Another() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ankur", "root","25092003");
        PreparedStatement ps = con.prepareStatement("delete from lab where sName = ?");
        scn.nextLine();
        System.out.print("Enter the name of student which you want to delete : ");
        String a = scn.nextLine();
        ps.setString(1,a);
        ps.executeUpdate();
        System.out.println("Successfully deleted the row.");
    }
}
class Show
{
    void View() throws SQLException
    {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ankur","root","25092003"); 
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from lab");  
        while(rs.next())  
            System.out.println(rs.getInt(1) +" "+  rs.getString(2)); 
        con.close();
    }
}
public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Dlt d = new Dlt();
            d.Des();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class Not Found");
        }
    }
}
