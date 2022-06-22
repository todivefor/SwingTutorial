/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.todivefor.swing7.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.todivefor.swing7.gui.FormEvent;
import org.todivefor.swing7.model.AgeCategory;
import org.todivefor.swing7.model.Database;
import org.todivefor.swing7.model.EmploymentCategory;
import org.todivefor.swing7.model.Gender;
import org.todivefor.swing7.model.Person;

/**
 *
 * @author peterream
 */
public class Controller {
    
    Database db;

    public Controller() {
        
        this.db = new Database();
    }
    
    public List<Person> getPeople() {
        
        return db.getPeople();
    }

    public void addPerson(FormEvent ev) {

        // Get input data from EventObject
        String name = ev.getName();
        String occupation = ev.getOccupation();
        int ageCatId = ev.getAgeCategory();
        String empCat = ev.getEmploymentCategory();
        boolean isUS = ev.isUsCitizen();
        String taxId = ev.getTaxId();
        String gender = ev.getGender();

//      Change some of the inputs to their Enums

        AgeCategory ageCategory = null;

        switch (ageCatId) {

            case 0:
                ageCategory = AgeCategory.child;
                break;

            case 1:
                ageCategory = AgeCategory.adult;
                break;

            case 2:
                ageCategory = AgeCategory.senior;
                break;
        }

        EmploymentCategory empCategory;

        switch (empCat) {

            case "Employed":
                empCategory = EmploymentCategory.employed;
                break;

            case "Self-Employed":
                empCategory = EmploymentCategory.selEmployed;
                break;

            case "Unemployed":
                empCategory = EmploymentCategory.unemployed;
                break;

            default:
                empCategory = EmploymentCategory.other;
                System.out.println(empCat);                                         // Debug
        }

        Gender genderCat;

        if (gender.equals("male")) {
            genderCat = Gender.male;
        } else {
            genderCat = Gender.female;
        }
        
        Person person = new Person(name, occupation, ageCategory, empCategory, 
                taxId, isUS, genderCat);
        
        db.addPerson(person);
    }
    
    public void saveToFile(File file) throws IOException {
        
        db.saveToFile(file);
    }
    
    public void loadFromFile(File file) throws IOException {
        
        db.loadFromFile(file);
    }

    public void removePerson(int row) {
        
        db.removePerson(row);                                                       // Remove person from people
    }
}
