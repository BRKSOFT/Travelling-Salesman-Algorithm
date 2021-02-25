/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gezgin_kargocu_problemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 *
 * @author berka
 */

public class Gezgin_Kargocu_Problemi {
    /*public static int a[];
    public static int sehir_sayisi;
    public static String[] b = new String[sehir_sayisi];
    */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        /*prevs prev = new prevs();
        prev.previous_cities.add(new ArrayList());
        prev.previous_cities.get(0).add(5);
        prev.previous_cities.get(0).add(6);
        prev.previous_cities.get(0).add(7);
        prev.previous_cities.get(0).add(8);
        for(int i=0 ; i<prev.previous_cities.get(0).size() ; i++){
            System.out.println(prev.previous_cities.get(0).get(i));
        }*/
        /*String[] gecici = new String[81];
        String[][] bilgiler = new String[81][2];
        try{
            File file = new File("C:\\Users\\berka\\Desktop\\dosyaokucaz\\mesafeler.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i=0 ; i<81 ; i++){
                gecici[i] = bufferedReader.readLine();
                String a[] = gecici[i].split("-");
                System.out.println(a[0] + " " + a[1]);
                bilgiler[i][0]=a[0];
                bilgiler[i][1]=a[1];
                if(gecici[i]==null)
                    break;
            }
            fileReader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for(int i=0 ; i<81 ; i++){
            System.out.printf("%s %s",bilgiler[i][0],bilgiler[i][1]);
            System.out.println();
        }System.out.println("sehir sayisi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int sehir_number = scan.nextInt();
        String[] sehir_kullanici = new String[sehir_number+1];
        int[] a = new int[sehir_number+1];
        for(int i=0 ; i<sehir_number+1 ; i++){
            sehir_kullanici[i] = scan.nextLine();
        }
        for(int i=1 ; i<sehir_number+1 ; i++){
            a[i-1] = plaka_bul(bilgiler,sehir_kullanici[i]);  
        }
        //int[] a = new int[]{6,59,39,22,45,67,78,31};
        
        //int[] a = new int[]{59,22,17,35};
        a[a.length-1]=41;
        for(int i=0 ; i<a.length ; i++)
            System.out.println(a[i]);
        */
        new Menu().setVisible(true);
            
    }
    
}
