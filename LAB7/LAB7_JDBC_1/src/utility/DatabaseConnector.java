/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.ArrayList;
import model.Patiant;
/**
 *
 * @author Coach
 */
public class DatabaseConnector {
  // data members
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw";  
    
    // CRUD Operations on Database
    // C - Create: Inserting data into the database
    public static void addPatiant(Patiant p1) throws SQLException{
        String query = "INSERT INTO patiant(firstname,lastname,age,email,telephone, gender, patiantType) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        // String query = "INSERT INTO patiant(first_name, last_name, gender, patiant_type, age) VALUES (?, ?, ?, ?, ?, ?, ?getFirstname) ";
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getFirstname());
            stmt.setString(2, p1.getLastname());
            stmt.setString(3, p1.getAge()); 
            stmt.setString(4, p1.getEmail());
            stmt.setString(5, p1.getTelephone());            
            stmt.setString(6, p1.getGender());        
            stmt.setString(7, p1.getPatiantType());
            
            // stmt.setInt(5, p1.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            // After this query will look like:
//            "INSERT INTO patiant(first_name, gender, patiant_type) VALUES ('Rish', 'Male', 'Appointment') "
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
}
    // R - Read: Getting all the values from the database
    public static ArrayList<Patiant> getPatiants(){
        ArrayList <Patiant> patiants = new ArrayList();
        String query = "SELECT * FROM patiant";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patiant p1 = new Patiant();
                p1.setId(rs.getInt("id"));
                p1.setFirstname(rs.getString("firstName"));
                p1.setLastname(rs.getString("lastName"));
                p1.setAge(rs.getString("age"));
                p1.setEmail(rs.getString("email"));
                p1.setTelephone(rs.getString("telephone"));
                p1.setGender(rs.getString("gender"));
                p1.setPatiantType(rs.getString("patiantType"));
                patiants.add(p1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return patiants;
    }
    
    public static void getPatiantName(){
        String query = "SELECT firstname, lastname, age, email, telephone, gender, patianttype FROM patiant";
    }
    
     
    // U - Update: Changing a value in the database
    public static void updatePatiant(Patiant oldPatiant, Patiant updatedPatiant){
            String query = "UPDATE patiant SET firstname = ?, lastname = ?, age = ?, email = ?, telephone = ?, gender = ?, patianttype = ? WHERE id = ? ";
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedPatiant.getFirstname());
            stmt.setString(2, updatedPatiant.getLastname());
            stmt.setString(3, updatedPatiant.getAge());
            stmt.setString(4, updatedPatiant.getEmail());
            stmt.setString(5, updatedPatiant.getTelephone());
            stmt.setString(6, updatedPatiant.getGender());
            stmt.setString(7, updatedPatiant.getPatiantType());
            stmt.setInt(8, oldPatiant.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deletePatiant(Patiant p1){
        String query = "DELETE FROM patiant WHERE id = ? ;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}

