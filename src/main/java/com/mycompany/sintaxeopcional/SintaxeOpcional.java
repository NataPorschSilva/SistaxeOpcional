
package com.mycompany.sintaxeopcional;

import java.util.Locale;
import java.util.Scanner;

public class SintaxeOpcional {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner so = new Scanner(System.in);
        
        int minutos = so.nextInt();
        double conta = 50.0;
        
        if(minutos > 100){
           conta += (minutos - 100) * 2.0;
        }
        System.out.println("Valor da conta = R$" + conta);
        so.close();
        
          }
}
