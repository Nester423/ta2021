/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
    
     public String findMostFrequentWord(String s) {
        String[] str = s.split("\\W+");         
        int[] howMuch = new int[str.length];    
        int maxCount = 0;                       
        int index = 0;                          
        for(int i=0; i<str.length; i++) 
            for(int j=0; j<str.length; j++) 
                if(str[i].equals(str[j])) howMuch[i]++; 
        for(int i=0; i<howMuch.length; i++) 
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];                  
                index = i;                              
            }
        return str[index];                     
    }
     
    public String find6MostFrequentWords(String text) {
        String str = "";
        String textMod = text;
        for (int i = 0; i<6; i++) {
            str += findMostFrequentWord(textMod) + " ";
            textMod = textMod.replaceAll(findMostFrequentWord(textMod), "");    
        }
        return str;
    }
    
    public int findAmountOfWordsWithoutV(String s) {
        String[] str = s.split("\\W+");         
        int k = 0;
        int z;
        
        for(int i=0; i<str.length; i++) {
            if (str[i].contains("v")) k++;
        }
        
        z = str.length - k;
        
        return z;
    }
    
    public int findWordsWith3DifLet(String s) {
        String[] str = s.split("\\W+");
        int z = 0;
        
        for(int i=0; i<str.length; i++) {
           if (str[i].contains("\\w{3}")) z++;         
        }
       
   return z;
   }
        
}

    