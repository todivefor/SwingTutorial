/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todivefor.swing7.model;

/**
 *
 * @author peterream
 */
public class Person {
    
    private static int count = 0;                                                   // Person counter
    
    private int id;                                                                 // Unique ID in DB
    private String name;
    private String occupation;
    private AgeCategory ageCategory;
    private EmploymentCategory empCat;
    private String taxId;
    private boolean usCitizen;
    private Gender gender;

    public Person (String name, String occupation, AgeCategory ageCategory, 
            EmploymentCategory empCat, String taxId, boolean usCitizen, 
            Gender gender) {
        
        this.name =name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.empCat = empCat;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
        this.gender = gender;
        
        this.id = count;                                                            // New Person
        count++;                                                                    // Increment on each new Person
    }
    
    public int getId() {
        
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public String getName() {
        
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public String getOccupation() {
        
        return occupation;
    }

    public void setOccupation(String occupation) {
        
        this.occupation = occupation;
    }

    public AgeCategory getAgeCategory() {
        
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        
        this.ageCategory = ageCategory;
    }

    public EmploymentCategory getEmpCat() {
        
        return empCat;
    }

    public void setEmpCat(EmploymentCategory empCat) {
        
        this.empCat = empCat;
    }

    public String getTaxId() {
        
        return taxId;
    }

    public void setTaxId(String taxId) {
        
        this.taxId = taxId;
    }

    public boolean isUsCitizen() {
        
        return usCitizen;
    }

    public void setUsCitizen(boolean usCitizen) {
        
        this.usCitizen = usCitizen;
    }

    public Gender getGender() {
        
        return gender;
    }

    public void setGender(Gender gender) {
        
        this.gender = gender;
    }
}
