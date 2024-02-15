package com.consulting.average.service;

import com.consulting.average.service.impl.AverageValue;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class AverageValueImpl implements AverageValue {


    @Override
    public double calculateWeightedAverage(ArrayList<Double> q, ArrayList<Double> p) throws RuntimeException {

        double d;
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 0; i < q.size(); i++) {


            sum1 += q.get(i) * p.get(i);
            sum2 += p.get(i);

        }
        d = sum1 / sum2;

        System.out.println(d);

        return d;
    }
}
