/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import knu.fit.ist.ta.lab4.StringProcessing;
import knu.fit.ist.ta.lab4.StringMatching;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 19sam
 */
public class Lab4Tests {
    StringProcessing sp = new StringProcessing();
    int a;
    String text1 = "a, a b - c  c // d d  9 e e  i i f f";
    String text2 = "awq rew ert tu ui ioy iuo r e  s s s d e wr w w ii r re re ";
    String text3 = "";
    String text4 = ""; 
    
    @Test
        void test1() { 
          if (sp.find6MostFrequentWords(text1).contains("a c d e i f")) a = 1;  
            
          assertEquals(a, 1);
          assertEquals(sp.findAmountOfWordsWithoutV(text1), 14);
          assertEquals(sp.findWordsWith3DifLet(text1), 0);
        }
        
     @Test 
        void test2() {    
          if (sp.find6MostFrequentWords(text2).contains("s r e w aq ")) a = 1;  
            
          assertEquals(a, 1);
          assertEquals(sp.findAmountOfWordsWithoutV(text2), 21);
          assertEquals(sp.findWordsWith3DifLet(text2), 0);            
        }
 
}
