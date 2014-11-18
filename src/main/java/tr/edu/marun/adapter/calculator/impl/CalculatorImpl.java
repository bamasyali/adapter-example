/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.adapter.calculator.impl;

import tr.edu.marun.adapter.calculator.Calculator;

/**
 *
 * @author bamasyali
 */
public class CalculatorImpl implements Calculator {

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

}
