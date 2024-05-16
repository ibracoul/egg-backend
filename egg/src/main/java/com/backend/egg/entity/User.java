package com.backend.egg.entity;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String lastName;
    private String firstName;
    private String email;
    private String tel;

    private String adresse;
    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    public User(){

    }

    public User(String lastName, String firstName,  String email, String tel, String adresse){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        this.lastName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String prenom) {
        this.firstName = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
