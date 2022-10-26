package com.codegym.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 45, message = "min length 5, max 45 characters")
    private String firstName;

    @Size(min = 3, max = 45, message = "min length 5, max 45 characters")
    private String lastName;

    @Size(min = 6, max = 18, message = "Username must be between 6 and 18 characters")
    private String userName;

    @Size(min = 6, max = 18, message = "Password must be between 6 and 18 characters")
    private String password;

    @Email( message = "Please enter the correct email format")
    private String email;

    @Pattern(regexp = "((09|03|07|08|05)+([0-9]{8})\\b)", message = "Please enter the correct phone number format")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
