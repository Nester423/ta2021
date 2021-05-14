/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import knu.fit.ist.ta.lab5.ForTests;
import knu.fit.ist.ta.lab5.Searching;
import knu.fit.ist.ta.lab5.Sorting;
import knu.fit.ist.ta.lab5.StringProcessing;
import knu.fit.ist.ta.lab5.TestObj;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 19sam
 */



public class Lab5Tests {
    StringProcessing sp = new StringProcessing();
    Searching srch = new Searching();
    ForTests ft = new ForTests();
    
    String text1 = "Internet of things is the coming together of internet and physical devices in a "
            + "network of unlimited possibilities using microcontrollers, arduino and raspberry pi. "
            + "IOT allows for physical devices to wirelessly communicate over networks which has led to a growing number of applications for iot devices. "
            + "Nevon Projects brings you the list of most innovative IOT projects for students and engineers using micocontroller arduino raspberry pi etc.";
     
    String text2 = "Internet of things is the coming together of internet and physical devices in  in a";

    String text3 = "";
    
    ArrayList testList1 = ft.getList1();
    ArrayList sortedTestList1 = ft.sortApproach(testList1);
    ArrayList testList2 = ft.getList2();
    ArrayList sortedTestList2 = ft.sortApproach(testList2);
    ArrayList testList3 = ft.getList3();
    ArrayList sortedTestList3 = ft.sortApproach(testList3); 


    @Test
        void test1() {  
         assertEquals((srch.linearSearch("is", sp.getList(text1))).toString(), "[4]");
         assertEquals((ft.showList(sortedTestList1)).toString(), "[abur - -1, ertu - 3, kabl - 5, ribl - 80, qwon - 456]");
         assertEquals(ft.jumpSearch(sortedTestList1, "ertu"), 1);
        }
  
    @Test 
        void test2() {    
         assertEquals((srch.linearSearch("of", sp.getList(text2))).toString(), "[2, 8]");
         assertEquals((ft.showList(sortedTestList2)).toString(), "[ - -1,  - 3,  - 5,  - 80,  - 456]");
         assertEquals(ft.jumpSearch(sortedTestList2, ""), 0);
        }           
   
    @Test 
        void test3() {
         assertEquals((srch.linearSearch("of", sp.getList(text3))).toString(), "[]");
         assertEquals((ft.showList(sortedTestList3)).toString(), "[]");
         assertEquals(ft.jumpSearch(sortedTestList3, "ertu"), 0);
        }
        
        
    private void assetEquals(ArrayList<TestObj> sortApproachTest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
