/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author i03
 */
public class EntradaDeUmArquivo {
    public static void main(String[] args) throws IOException{
        //InputStream is= new FileInputStream("C:\\Arquivo\\arquivo.txt");
        InputStream is= System.in;
        Scanner entrada= new Scanner(is);
        
        while(entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
        }
        entrada.close();
        //is.close();
    }
}
