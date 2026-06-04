package com.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee") // Must match your PostgreSQL table name
public class Employee {

    @Id
    private int id;
    private String name;
    private String gmail;

    // Default constructor (required by Hibernate)
    public Employee() {}

    // Constructor for convenience (optional)
    public Employee(int id, String name, String gmail) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGmail() { return gmail; }
    public void setGmail(String gmail) { this.gmail = gmail; }

    // toString() for readable output
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gmail=" + gmail + "]";
    }
}
