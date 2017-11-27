package com.tpg.interview.question.one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import com.tpg.interview.question.three.TPGMeasuringTool;

/**
 * @author noorhizan
 */
public class IPValidationRegex {
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
        System.out.println("Processing IP...");
        if (args != null && args.length > 0 && !args[0].trim().equals("")) {
            try (FileReader file = new FileReader(args[0]); BufferedReader reader = new BufferedReader(file);) {

                String data = null;
                IPValidator validator = new IPValidator();

                while ((data = reader.readLine()) != null) {
                    boolean valid = validator.validate(data);
                    if (valid) {
                        System.out.println("IP Address: " + data + " is VALID");
                    } else {
                        System.out.println("IP Address: " + data + " is INVALID");

                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(
                    "Invalid filename. Please specify the path to the file that contains list of IP addresses.\ne.g: E:\\ipaddress.txt");
        }

        System.out.println("Done");
        TPGMeasuringTool.getInstance().setEndTime(Calendar.getInstance().getTime());
        TPGMeasuringTool.getInstance().showExecutionTime(IPValidator.class.getName(), "main");
    }
    // ================================================================================
    // Getters and Setters
    // ================================================================================

}
