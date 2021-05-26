package com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws Exception {
       // String path="shoppingList.txt";
        String path="grades.csv";
        File file = new File(path);
        System.out.println(file.exists());
        Scanner scanner = new Scanner(file);
     //   System.out.println(scanner.nextLine());
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
     /*   FileWriter fw = new FileWriter("grades.csv");
        fw.write("Hello");
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }*/

    }
}
