/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.math.BigInteger;
import java.security.SecureRandom;
import knu.fit.ist.ta.lab5.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import org.springframework.util.StringUtils;


/**
 *
 * @author 19sam
 */
public class StringProcessing {
    
    String text;

    public StringProcessing() {

        text = "The idea of adding sensors and intelligence to basic objects was discussed throughout the 1980s and 1990s (and there are arguably some much earlier ancestors), but apart from some early projects - including an internet-connected vending machine - progress was slow simply because the technology wasn't ready. Chips were too big and bulky and there was no way for objects to communicate effectively.\n" +
                "Processors that were cheap and power-frugal enough to be all but disposable were needed before it finally became cost-effective to connect up billions of devices. The adoption of RFID tags - low-power chips that can communicate wirelessly - solved some of this issue, along with the increasing availability of broadband internet and cellular and wireless networking. The adoption of IPv6 - which, among other things, should provide enough IP addresses for every device the world (or indeed this galaxy) is ever likely to need - was also a necessary step for the IoT to scale. Kevin Ashton coined the phrase 'Internet of Things' in 1999, although it took at least another decade for the technology to catch up with the vision. \"The IoT integrates the interconnectedness of human culture - our 'things' - with the interconnectedness of our digital information system - 'the internet.' That's the IoT,\" Ashton told ZDNet.\n" +
                "The IoT was initially most interesting to business and manufacturing, where its application is sometimes known as machine-to-machine (M2M), but the emphasis is now on filling our homes and offices with smart devices, transforming it into something that's relevant to almost everyone. Early suggestions for internet-connected devices included 'blogjects' (objects that blog and record data about themselves to the internet), ubiquitous computing (or 'ubicomp'), invisible computing, and pervasive computing. However, it was Internet of Things and IoT that stuck.";

       text = cleanString(text);
    }
    
    public String getText() {
        return this.text;
    }
    
    public String getCleanText()
    {
        return String.join(" ", getList(text));
    }

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    private String cleanString(String input){
    input = input.toLowerCase();
    input = input.replaceAll("-{2,}","");
    input = input.replaceAll(" {2,}"," ");
    input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    }
    
    /**
     *
     * @param s
     * @return
     */
    
    SecureRandom random = new SecureRandom();

    public String rdEl()
    {
        return new BigInteger(130, random).toString(32);
    }
     
    public ArrayList<Obj> initList(int amount){ 
        ArrayList<Obj> list = new ArrayList<Obj>();
        for (int i = 0; i < amount; i++) {
            Obj elem = new Obj();               
            list.add(elem);
        }         
        return list;
    }
    
    public  ArrayList<String> showList(ArrayList<Obj> list) {
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {  
            Obj tmp = list.get(i);
            list1.add(tmp.getRdString() + " - " + tmp.getRdInt());
        }  
        return list1;
    }

    List InitList(String amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    