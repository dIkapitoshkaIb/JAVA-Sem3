import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     

      Answer ans = new Answer();      
      ArrayList<Integer> nums = ans.removeEvenNumbers(arr);
      System.out.println(nums);
    }
}