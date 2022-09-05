import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectConnectMysql {
    public static void main(String[] args) {
     // run MySQL Workbench
        // connect to DataBase
        // Hostname: localhost  port: 3306
        // Username: root
        // Default Schema : world
        // password : tbrs00002b
        // access to 'World' DB
        // Make new SQL tab for executing query
        // Select * from City
        // print World.City

        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/world";
        String Query = "select Continent, Name, Population, Capital " +
                       "from country " + 
                       "where 1 = 1 " +
                       "and Name like '%an%' ";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            //새로운 query 생성, select 명령문 입력 후 test 해보기
            ResultSet rs = ((java.sql.Statement) stmt).executeQuery (Query);
            //result grid, action output 확인
        while (rs.next()) {
            // Retrieve by column name
            System.out.print("Continent: " + rs.getString("Continent"));
            System.out.print(", Name: " + rs.getInt("Name"));
            System.out.print(", Population: " + rs.getInt("Population"));
            System.out.print(", Capital: " + rs.getInt("Capital"));
             }
            

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return;
} 
}
