import java.sql.*;
class batch
{
public static void main(String...k)
{
try
{
//load driver
Class.forName("com.mysql.jdbc.Driver");
//Create Connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh","root","sql");
String s="insert into cricket values(105,56)";
String s1="update cricket set runs=123,where ball=17";
String s2="delete from cricket where ball=15";
PreparedStatement pst=con.prepareStatement(s);
pst.addBatch(s);
pst.addBatch(s1);
pst.addBatch(s2);
int i[]=pst.executeBatch();
}
catch(Exception e)
{
System.out.println(e);
}
}
}