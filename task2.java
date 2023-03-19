// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package seminar4_Homework;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner myScanner = new Scanner(System.in, "Cp866");
        while (true){
            String element = "";
            System.out.println("Выберите требуемое действие: ");
            System.out.println("1 - Поместить элемент в конец очереди ");
            System.out.println("2 - Вернуть первый элемент очереди и удалить его ");
            System.out.println("3 - Вернуть первый элемент очереди без удаления ");
            System.out.println("4 - Показать очередь ");
            try {
                int action = myScanner.nextInt();
                myScanner.nextLine();
                if (action == 1){
                    System.out.print("Введите элемент: ");
                    element = myScanner.nextLine();
                    queue = Enqueue(queue, element);
                }
                else if (action == 2) queue  = Dequeue(queue, element);
                else if (action == 3) First(queue,element);                                   
                else if (action == 4) Listqueue(queue);
                else System.out.println("Введен неверный вариант ");       
                
            } catch (Exception e) {
                System.out.println("Введено некорректное значение");
                break;
            }
            }      
            myScanner.close();
        }
        
    public static LinkedList<String> Enqueue(LinkedList<String> queue, String element) {
           queue.addLast(element);
           return queue;       
    }

    public static LinkedList<String> Dequeue(LinkedList<String> queue, String element) {
        System.out.println("Удаляем элемент: "+queue.removeFirst());
        return queue;       
    }

    public static void First(LinkedList<String> queue, String element) {
        System.out.println("Первый элемент: "+queue.getFirst());
    }

    public static void Listqueue(LinkedList<String> queue) {
        System.out.println(queue);
    }

}
