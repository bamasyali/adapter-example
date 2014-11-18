/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.adapter.old;

/**
 *
 * @author bamasyali
 */
public final class StringCalculator {

    public String sum(String a, String b) {
        Double sum = Double.parseDouble(a) + Double.parseDouble(b);
        return sum.toString();
    }
}
