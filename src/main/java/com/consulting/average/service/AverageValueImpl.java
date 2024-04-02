package com.consulting.average.service;

import com.consulting.average.service.impl.AverageValue;
import org.springframework.stereotype.Service;


@Service
public class AverageValueImpl implements AverageValue {


    @Override
    public String calculateWeightedAverage(double[] q, double[] p) throws RuntimeException {

        double d;
        double sum1 = 0.0;
        double sum2 = 0.0;
        if (q.length != p.length) throw new NullPointerException("Array sizes must be equal");
        for (int i = 0; i < q.length; i++) {

            sum1 += q[i] * p[i];
            sum2 += p[i];

        }
        d = sum1 / sum2;
        String s = String.format("WeightedAverage = %.1f", d);
        System.out.println("possible cases:");
        System.out.println("x\u2081>0, x\u2082=0,...x\u2099;\nx\u2081=0, x\u2082>0,...x\u2099;\nx\u2081>0, x\u2082>0,...x\u2099;");
        System.out.println("Formula for solution");
        System.out.println("WeightedAverage = (a\u2081*x\u2081+a\u2082*x\u2082+...+a\u2099*x\u2099) / (x\u2081+x\u2082+...+x\u2099)");
        System.out.format(s);
        return String.format(s);
    }
}
