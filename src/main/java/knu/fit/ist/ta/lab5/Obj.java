/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author 19sam
 */

class Obj {
    SecureRandom random = new SecureRandom();
    
    String rdString = new BigInteger(30, random).toString(32);
    int rdInt = (int) (Math.random()*1000);
    
    public String getRdString() {
        return rdString;
    }
    
    public int getRdInt() {
        return rdInt;
    }
}

