/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.adapter.calculator.impl;

import tr.edu.marun.adapter.old.StringCalculator;
import tr.edu.marun.adapter.calculator.Calculator;

/**
 *
 * @author bamasyali
 */
public class CalculatorAdepter implements Calculator {

    private final StringCalculator stringCalculator;

    public CalculatorAdepter() {
        this.stringCalculator = new StringCalculator();
    }

    @Override
    public Double sum(Double a, Double b) {
        String sum = stringCalculator.sum(a.toString(), b.toString());
        return Double.parseDouble(sum);
    }

}
