/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecobaan.pkg4.labeled.pkgbreak.statment;

/**
 *
 * @author USER
 */
public class Pecobaan4LabeledBreakStatment {
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Beah"};
        int count = 0;
        
        for( int i=0; i<names.length; i++){
            
            if( !names[i].equals("Beah")){
                continue;       //skip next statment
            }
            
            
            count++;
            }
        
        System.out.println("There are " + count + "Beahs in the list");
        }
        
                
    }
    

