import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientDAO {

    public void addPatient(Patient p) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO patient VALUES (?,?,?)");
            ps.setInt(1, p.id);
            ps.setString(2, p.name);
            ps.setInt(3, p.age);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
