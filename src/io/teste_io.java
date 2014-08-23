/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author i03
 */
public class teste_io {
    public static void main(String[] args) throws  IOException{
        //InputStream is= System.in;
        InputStream is= new  FileInputStream("C:\\Arquivo\\arquivo.txt");
        
        
        InputStreamReader isr= new InputStreamReader(is);
        BufferedReader br= new BufferedReader(isr);
        
        String linha=br.readLine(); //primeira linha
        try{
            while(linha != null){
                System.out.println(linha);
                linha= br.readLine();
            }
        }finally{
            br.close();
        }
        
        
    }
}
