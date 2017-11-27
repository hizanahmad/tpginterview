/* COPYRIGHT (C) 2017 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.tpg.interview.question.three;

import java.util.Date;

/**
 * @author noorhizan
 */
public class TPGMeasuringTool {
    // ================================================================================
    // Class variables
    // ================================================================================
    private static TPGMeasuringTool instance;
    private Date startTime;
    private Date endTime;
    // ================================================================================
    // Instance variables
    // ================================================================================

    // ================================================================================
    // Constructor
    // ================================================================================
    private TPGMeasuringTool() {
    }

    // ================================================================================
    // Methods
    // ================================================================================
    public static TPGMeasuringTool getInstance() {
        if (instance == null) {
            instance = new TPGMeasuringTool();
        }
        return instance;
    }

    public void showExecutionTime(String className, String method) {
        Long time = (endTime.getTime() - startTime.getTime());

        StringBuilder builder = new StringBuilder();
        builder.append(className).append(".").append(method);
        builder.append("[ Starts at: ").append(startTime).append("], ");
        builder.append("[ End at: ").append(endTime).append("], ");
        builder.append("[ Execution time: ").append(time).append("ms]");

        System.out.println(builder.toString());
    }
    // ================================================================================
    // Getters and Setters
    // ================================================================================

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
