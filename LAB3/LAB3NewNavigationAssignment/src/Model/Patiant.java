/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author Coach
 */
public class Patiant {
    // Data Elements - private
    private String firstname;
    private String lastname;
    private String age;
    private String email;
    private String telephone;
    private String gender;
    private String patiantType;
    private String message;
    
    private ImageIcon profilepicture;
    
    //Methodist - Public

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatiantType() {
        return patiantType;
    }

    public void setPatiantType(String patiantType) {
        this.patiantType = patiantType;
    }

     public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public ImageIcon getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(ImageIcon profilepicture) {
        this.profilepicture = profilepicture;
    }
    
}
