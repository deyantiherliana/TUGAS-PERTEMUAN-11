/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan.pkg4.penggunaan.operator.logika.dan.pkgboolean.and;

/**
 *
 * @author USER
 */
public class Percobaan4PenggunaanOperatorLogikaDanBooleanAND {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 10;
        boolean test= false;
        
        //demostrasi &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demostrasi &
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
    
}
