package com.targetindia.exceptions;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Scanner;

@Slf4j
public class Main extends Exception{
    public static void main(String[] args) throws IOException {
        //declare a scanner object
        Scanner sc = new Scanner(System.in);
        //read textfile path from user
        System.out.println("Enter the file name : ");
        String text_file_path = sc.nextLine();
        //declare a file object
        File f = new File(text_file_path);
        FileWriter fw = new FileWriter(f);
        PrintWriter p = new PrintWriter(fw);
        //take final range values and write data into text file
        try {
            System.out.print("Enter the range N value : ");
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                p.printf("%d\n",i);
            }
            fw.close();
        }
        catch(FileNotFoundException e){
            log.warn("exception is in {} ",e.getClass());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch(NumberFormatException e){
            log.warn("exception is in {} ",e.getClass());
        }

        // read data from text file and find average value
        try {
            FileReader fs = new FileReader(f);
            BufferedReader b = new BufferedReader(fs);
            int average = 0, count = 0;
            String t;
            while ((b.readLine()) != null) {
                t = b.readLine();
                count += 1;
                average += (int) t.charAt(0);
            }
            b.reset();
            fs.close();
            b.close();
            System.out.println("The average of values is : "+(average/count));
        }
        catch(FileNotFoundException e){
            log.warn("exception is in {} ",e.getClass());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch(ArithmeticException e){
            log.warn("Exception is in {}",e.getClass());
        }

    }
}
