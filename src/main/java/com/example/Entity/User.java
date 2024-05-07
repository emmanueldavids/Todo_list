package com.example.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    // This class is where you define your table and table names,
    // getters and setter and your constructor

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    
    @Column(name = "Description")
    private String description;
    
    @Column(name = "Completed")
    private float completed;
   

    public User(){
        
    }
    
    
    //Getters and setter
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public float getCompleted() {
        return completed;
    }


    public void setCompleted(float completed) {
        this.completed = completed;
    }


    //ToString
    @Override
    public String toString() {
        return "User [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
                + "]";
    }
    

    
    
}
