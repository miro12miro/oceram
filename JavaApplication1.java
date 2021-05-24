/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author gg
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String tab="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] tabb=tab.split(",");
        differentFlagPermutations(5, tabb);
       /* 
         try {
      FileWriter myWriter = new FileWriter("C:\\Users\\gg\\Desktop\\az.txt");
        for(int i=0;i<tabb.length;i++){
           
           String pass=tabb[0]+""+tabb[0]+""+tabb[0]+""+tabb[i]+"\n";
           System.out.println(pass);
             myWriter.write(pass);
           
        }
         System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }*/
    }
   static void differentFlagPermutations(int X,
                               String[] arr) throws IOException
{
    String[] ml = arr;
     
    for(int i = 0; i < ml.length; i++)
    {
        System.out.print(ml[i] + " ");
    }
 
    int count = ml.length;
   
    // Traverse all possible lengths
    for(int z = 0; z < X - 1; z++)
    {
         
        // Stores all combinations
        // of length z
        Vector<String> tmp = new Vector<String>();
           
        // Traverse the array
        for(int i = 0; i < arr.length; i++)
        {
            for(int k = 0; k < ml.length; k++)
            {
                if (arr[i] != ml[k])
                {
                     
                    // Generate all
                    // combinations of length z
                    tmp.add(ml[k] + arr[i]);
                    count += 1;
                }
            }
        }    
         
        // Print all combinations of length z
         FileWriter myWriter = new FileWriter("C:\\Users\\gg\\Desktop\\az.txt");
        for(int i = 0; i < tmp.size(); i++)
        {
            System.out.println(tmp.get(i) + " ");
            myWriter.write(tmp.get(i)+"\n");
        }
           
        // Replace all combinations of length z - 1
        // with all combinations of length z
        ml = tmp.toArray(new String[tmp.size()]);
    }
}
  
}
