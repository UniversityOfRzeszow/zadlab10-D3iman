/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad5 {

    Scanner input = new Scanner(System.in);
    
    public void wprowadzInt(){
        int x;
        try{
        System.out.println("Podaj liczbe calkowita: ");
        x = input.nextInt();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba calkowita. Przerwanie programu!");
        }
    }
    public void wprowadzChar(){
        String x;
        try{
        System.out.println("Podaj pojedynczy znak: ");
        x = input.next();
        }
        catch(InputMismatchException e1){
            System.out.println("Podany pojedynczy znak jedy bledny. Przerwanie programu!");
        }
    }
    public void wprowadzLong(){
        long x;
        try{
        System.out.println("Podaj liczbe calkowita long: ");
        x = input.nextLong();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba jest bledna. Przerwanie programu!");
        }
    }
    public void wprowadzShort(){
        short x;
        try{
        System.out.println("Podaj liczbe calkowita short: ");
        x = input.nextShort();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba jest bledna. Przerwanie programu!");
        }
    }
    public void wprowadzFloat(){
        float x;
        try{
        System.out.println("Podaj liczbe zmiennoprzecinkowa typu float: ");
        x = input.nextFloat();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba zmiennoprzecinkowa typu float. Przerwanie programu!");
        }
    }
    public void wprowadzDouble(){
        double x;
        try{
        System.out.println("Podaj liczbe zmiennoprzecinkowa typu double: ");
        x = input.nextDouble();
        }
        catch(InputMismatchException e1){
            System.out.println("Podana liczba nie jest liczba zmiennoprzecinkowa typu double. Przerwanie programu!");
        }
    }
    public void wprowadzString(){
        String x;
        try{
        System.out.println("Podaj ciag znakow: ");
        x = input.nextLine();
        }
        catch(InputMismatchException e1){
            System.out.println("Podany ciag znakow jest bledny. Przerwanie programu!");
        }
    }

    public void zapiszInt(int liczba){
        
        FileWriter f = null;
        
        try {
            f = new FileWriter("zapiszInt.txt");
            BufferedWriter b = new BufferedWriter(f);
            b.write(String.valueOf(liczba));
            b.newLine();
            b.close();
        } catch (IOException e1) {
            System.out.println("Blad podczas zapisu do pliku!");
        } finally {
            try {
                f.close();
            } catch (IOException e2) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void zapiszFloat(float liczba){
        
        FileWriter f = null;
        
        try {
            f = new FileWriter("zapiszFloat.txt");
            BufferedWriter b = new BufferedWriter(f);
            b.write(String.valueOf(liczba));
            b.newLine();
            b.close();
        } catch (IOException e1) {
            System.out.println("Blad podczas zapisu do pliku!");
        } finally {
            try {
                f.close();
            } catch (IOException e2) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void zapiszDouble(double liczba){
        
        FileWriter f = null;
        
        try {
            f = new FileWriter("zapiszDouble.txt");
            BufferedWriter b = new BufferedWriter(f);
            b.write(String.valueOf(liczba));
            b.newLine();
            b.close();
        } catch (IOException e1) {
            System.out.println("Blad podczas zapisu do pliku!");
        } finally {
            try {
                f.close();
            } catch (IOException e2) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void zapiszString(String napis){
        
        FileWriter f = null;
        
        try {
            f = new FileWriter("zapiszString.txt");
            BufferedWriter b = new BufferedWriter(f);
            b.write(napis);
            b.newLine();
            b.close();
        } catch (IOException e1) {
            System.out.println("Blad podczas zapisu do pliku!");
        } finally {
            try {
                f.close();
            } catch (IOException e2) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void odczytajInt() {
        
        FileReader f = null;
        
        try {
            f = new FileReader("zapiszInt.txt");
            BufferedReader b = new BufferedReader(f);
            String stringRead = ".";
            System.out.println("Odczytywanie pliku...");
            int i = 1;
            while (stringRead != null) {
                stringRead = b.readLine();
                if (stringRead == null) {
                    System.out.println("Koniec pliku");
                }
                else {
                    System.out.println("Linia nr " + i);
                    i++;
                    System.out.println(stringRead);
                }

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku");
        }
        catch (IOException ex) {
            System.out.println("Blad podczas zapisu do pliku!");
        }
        finally {
            try {
                f.close();
            }
            catch (IOException ex) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void odczytajString() {
        
        FileReader f = null;
        
        try {
            f = new FileReader("zapiszString.txt");
            BufferedReader b = new BufferedReader(f);
            String stringRead = ".";
            System.out.println("Odczytywanie pliku...");
            int i = 1;
            while (stringRead != null) {
                stringRead = b.readLine();
                if (stringRead == null) {
                    System.out.println("Koniec pliku");
                }
                else {
                    System.out.println("Linia nr " + i);
                    i++;
                    System.out.println(stringRead);
                }

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku");
        }
        catch (IOException ex) {
            System.out.println("Blad podczas zapisu do pliku!");
        }
        finally {
            try {
                f.close();
            }
            catch (IOException ex) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void odczytajFloat() {
        
        FileReader f = null;
        
        try {
            f = new FileReader("zapiszFloat.txt");
            BufferedReader b = new BufferedReader(f);
            String stringRead = ".";
            System.out.println("Odczytywanie pliku...");
            int i = 1;
            while (stringRead != null) {
                stringRead = b.readLine();
                if (stringRead == null) {
                    System.out.println("Koniec pliku");
                }
                else {
                    System.out.println("Linia nr " + i);
                    i++;
                    System.out.println(stringRead);
                }

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku");
        }
        catch (IOException ex) {
            System.out.println("Blad podczas zapisu do pliku!");
        }
        finally {
            try {
                f.close();
            }
            catch (IOException ex) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
    public void odczytajDouble() {
        
        FileReader f = null;
        
        try {
            f = new FileReader("zapiszDouble.txt");
            BufferedReader b = new BufferedReader(f);
            String stringRead = ".";
            System.out.println("Odczytywanie pliku...");
            int i = 1;
            while (stringRead != null) {
                stringRead = b.readLine();
                if (stringRead == null) {
                    System.out.println("Koniec pliku");
                }
                else {
                    System.out.println("Linia nr " + i);
                    i++;
                    System.out.println(stringRead);
                }

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku");
        }
        catch (IOException ex) {
            System.out.println("Blad podczas zapisu do pliku!");
        }
        finally {
            try {
                f.close();
            }
            catch (IOException ex) {
                System.out.println("Blad podczas zapisu do pliku!");
            }
        }
    }
    
}

