/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.adapter;

import tr.edu.marun.adapter.calculator.Calculator;
import tr.edu.marun.adapter.calculator.impl.CalculatorAdepter;
import tr.edu.marun.adapter.calculator.impl.CalculatorImpl;

/**
 *
 * @author bamasyali
 */
public class Main {

    public static void main(String[] args) {

        Double a = 10.4d;
        Double b = 12.5d;

        {
            Calculator calculator = new CalculatorImpl();
            Double sum = calculator.sum(a, b);
            System.out.println(sum);
        }

        {
            Calculator calculator = new CalculatorAdepter();
            Double sum = calculator.sum(a, b);
            System.out.println(sum);
        }
    }
}
