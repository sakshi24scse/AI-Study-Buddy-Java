package dao;

import utils.DBConnection;
import java.sql.*;

public class StudyDAO {

    public int getTotalStudyHours(int studentId) {
        int hours = 0;
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT SUM(hours) FROM study_log WHERE student_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                hours = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hours;
    }
}

