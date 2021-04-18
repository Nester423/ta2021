/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author 19sam
 */


@Component
public class Calculate {
   
    public static float lab2equation(float x){
    
    return (float) ((Math.sqrt(2*x))/(1 + 4*x -3*Math.pow(x, 2))) ;
    }  
       
    public float solve(float x) {
        
        return (float) ((Math.sqrt(2*x))/(1 + 4*x -3*Math.pow(x, 2))) ;
    }
}
