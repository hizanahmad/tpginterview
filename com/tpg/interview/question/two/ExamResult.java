/* COPYRIGHT (C) 2017 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.tpg.interview.question.two;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import com.tpg.interview.question.one.IPValidator;
import com.tpg.interview.question.three.TPGMeasuringTool;

/**
 * @author noorhizan
 */
public class ExamResult {

    // ================================================================================
    // Class variables
    // ================================================================================

    // ================================================================================
    // Instance variables
    // ================================================================================

    // ================================================================================
    // Constructor
    // ================================================================================

    // ================================================================================
    // Methods
    // ================================================================================
    public static void main(String args[]) {
        TPGMeasuringTool.getInstance().setStartTime(Calendar.getInstance().getTime());
        List<Student> studentList = new ArrayList<Student>();
        Student tina = new Student("33", "Tina", "3.68");
        Student louis = new Student("85", "Louis", "3.85");
        Student samil = new Student("56", "Samil", "3.75");
        Student samar = new Student("19", "Samar", "3.75");
        Student lorry = new Student("22", "Lorry", "3.76");

        studentList.add(tina);
        studentList.add(louis);
        studentList.add(samil);
        studentList.add(samar);
        studentList.add(lorry);

        Collections.sort(studentList, (a, b) -> {
            Student stud1 = (Student) b;
            Student stud2 = (Student) a;

            // If GPA is the same for both
            if (stud1.getGpa().trim().equals(stud2.getGpa().trim())) {
                // If the first name is the same
                if (stud1.getName().trim().equals(stud2.getName().trim())) {
                    // Sort by Id
                    return stud2.getId().compareTo(stud1.getId());
                } else {
                    return stud2.getName().compareTo(stud1.getName());
                }
            } else {
                return stud1.getGpa().compareTo(stud2.getGpa());
            }
        });

        for (final Student student : studentList) {
            System.out.println(student.toString());
        }
        TPGMeasuringTool.getInstance().setEndTime(Calendar.getInstance().getTime());
        TPGMeasuringTool.getInstance().showExecutionTime(ExamResult.class.getName(), "main");

    }
    // ================================================================================
    // Getters and Setters
    // ================================================================================

}
