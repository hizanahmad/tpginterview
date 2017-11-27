/* COPYRIGHT (C) 2017 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.tpg.interview.question.two;

import java.util.Comparator;

/**
 * @author noorhizan
 */
public class Student {

    // ================================================================================
    // Class variables
    // ================================================================================
    private String id;
    private String name;
    private String gpa;
    // ================================================================================
    // Instance variables
    // ================================================================================

    // ================================================================================
    // Constructor
    // ================================================================================
    public Student() {

    }

    public Student(String id, String name, String gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // ================================================================================
    // Methods
    // ================================================================================

    // ================================================================================
    // Getters and Setters
    // ================================================================================
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: ").append(this.id).append(", ");
        builder.append("Name: ").append(this.name).append(", ");
        builder.append("GPA: ").append(this.gpa).append("");

        return builder.toString();
    }
}