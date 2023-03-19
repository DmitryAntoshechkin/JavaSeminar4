//В калькулятор добавьте возможность отменить последнюю операцию.

package seminar4_Homework;

import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.#####");
            Scanner myScanner = new Scanner(System.in, "Cp866");
            System.out.print("Введите число: ");
            double result = myScanner.nextDouble();
            myScanner.nextLine();
            ArrayDeque<Double> resultStack = new ArrayDeque<Double>();
            while (true) {
                System.out.print("Введите действие или \"Отмена\": ");
                String action = myScanner.nextLine();
                if (action.toLowerCase().equals("отмена")) {           

                    if (resultStack.isEmpty()== false) resultStack.removeLast();
                    if(resultStack.isEmpty()){
                        result = 0;
                    }else result = resultStack.getLast();               

                } else if (action.equals("+") || action.equals("-") || action.equals("*") || action.equals("/") ) {
                    System.out.print("Введите число: ");
                    Double number = myScanner.nextDouble();
                    myScanner.nextLine();
                    if (action.equals("+"))
                        result = result + number;
                    if (action.equals("-"))
                        result = result - number;
                    if (action.equals("*"))
                        result = result * number;
                    if (action.equals("/"))
                        result = result / number;
                    resultStack.addLast(result);

                } else {
                    System.out.print("Введено неверное действие! ");
                    break;             
                }
                System.out.println("Результат: "+ decimalFormat.format(result));
            }
            myScanner.close();
         } catch (Exception e) {
             System.out.println("Введено некорректное значение");
        }
    }
}
    
