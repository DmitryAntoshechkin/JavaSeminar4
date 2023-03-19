//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


package seminar4_Homework;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите  количество элементов массива: ");
        int size = myScanner.nextInt();
        myScanner.nextLine();
        myScanner.close();
        LinkedList<Integer> array = GetRandomArray(size);
        System.out.println("Исходный массив: "+array);
        array = ReverseArray(array);
        System.out.println("Перевернутый массив: "+array);
    }
    
    public static LinkedList<Integer> GetRandomArray(int size) {
        LinkedList<Integer> array = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array.add(rnd.nextInt(100));
        }
        return array;
    }

    public static LinkedList<Integer> ReverseArray(LinkedList<Integer> array) {
        for (int i = 0; i<array.size()-1;i++){
            array.addLast(array.remove(array.size()-2-i));
        }      
        return array;
    }


}
