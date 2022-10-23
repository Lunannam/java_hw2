package hw02_java;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;


public class task1_sort {

    /**
     * @param args
     * @throws IOException
     */
    public static void log_operations(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1_sort.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "Input 1");
   } 
           
    public static void main(String[] args, Logger logger) {

        Scanner input = new Scanner(System.in); 
        System.out.println("Enter array length: ");
        int size = input.nextInt(); 
        int array[] = new int[size]; 
        System.out.println("Insert array elements:");
        logger.log(Level.INFO, "Input 1");
       
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
            
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
        isSorted = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
            isSorted = false;
            buf = array[i];
            array[i] = array[i+1];
            array[i+1] = buf;
            logger.log(Level.INFO, "Input 2");
            }
          
        }

    }
    System.out.println();
    System.out.println("Sorted massive: " + Arrays.toString(array)); // выводим отсортированный массив
   
    }
    
}