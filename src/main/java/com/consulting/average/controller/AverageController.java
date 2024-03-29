package com.consulting.average.controller;

import com.consulting.average.service.AverageValueImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Tag(name = "CALCULATE THE WEIGHTED AVERAGE", description = "AverageController")
@RequiredArgsConstructor
@RestController
@RequestMapping("/value")

public class AverageController {
    private final AverageValueImpl service;

    @GetMapping("Weighted Average")
    @Operation(summary = "weightForEachDataPoint/valueOfEachDataPoint")
    public double calculatesTheWeightedAverage(@RequestParam ArrayList<Double> w,
                                               @RequestParam ArrayList<Double> v) {

        return service.calculateWeightedAverage(w, v);
    }
}