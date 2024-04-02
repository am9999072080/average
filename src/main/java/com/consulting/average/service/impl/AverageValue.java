package com.consulting.average.service.impl;

import java.util.ArrayList;

public interface AverageValue {

    /**
     * @param q takes a weight for each data point
     * @param p takes the value of each data point
     * @return calculates the weighted average
     */

    public String calculateWeightedAverage(double[] q, double[] p);
}