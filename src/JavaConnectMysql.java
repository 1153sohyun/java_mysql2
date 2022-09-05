public class JavaConnectMysql {
    
}
static final String USER = "root";
static final String PASS = "tbrs00002b";
static final String DB_URL = "jdbc:mysql://localhost:3306/world";
String Query = "select Name, IndepYear, Region, Capital " +
               "from country " +
               "where 1 =1 " +
               "and Name like '%an%'";

try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(QUERY);){
// Extract data from result set
while (rs.next()){
   // Retrieve by column name
   System.out.print("Name: " + rs.getString("columnLabel : Name"));
   System.out.print(", IndepYear: " + rs.getInt("columnLabel : population"));
   System.out.print(", Region: " + rs.getString("columnLabel : capital"));
   System.out.print(", Capital: " + rs.getInt("columnLabel : Continent"));
}
} catch (SQLException e) {
      e.printStackTrace();
} 