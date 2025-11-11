public class Main{
    public static void unsecureSelectClient(Connection con) throws SQLException{
        while(rs.next()) {

            int Id = rs.getInt("id_client");
            String name = rs.getString("name_client");
            String email = rs.getString("email");
            Date dob = rs.getDate("dob");

            System.out.printf("");
        }
    }

    public static void securInsertClient(Connection con) throws SQLException{
        String sql = "INSERT INTO clients(name_client,email,dob) VALUES (?,?,?)";
        PrepartStatement pst
    }
}