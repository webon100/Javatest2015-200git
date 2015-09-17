/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest2015.pkg100;


import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author ross.bai
 */
public class wordcount100 {
    
     public static void main(String args[])
   {
      {
     // String s = JOptionPane.showInputDialog("Enter any text.");
     // String[] splitted = s.split(" ");
      
      String filename = args[0];
		BufferedReader input = new BufferedReader
			//(new FileReader(filename));
                        (new FileReader("wordcounttext.txt"));

		String line;
      
      
      HashMap hm = new HashMap();
      int x;

      for (int i=0; i<splitted.length ; i++) {
         hm.put(splitted[i], i);
         System.out.println(splitted[i] + " " + i);
         if (hm.containsKey(splitted[i])) {
             x = ((Integer)hm.get(splitted[i])).intValue();
             hm.put(splitted[i], new Integer(x+1)); }
         }
      }
   }
    
}
