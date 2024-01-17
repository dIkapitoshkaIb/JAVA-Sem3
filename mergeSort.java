//Задача 1.
//Сортировка слиянием

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
    if (a.length <= 1) {
      return a;
    }
    
    // Находим середину массива
    int mid = a.length / 2;
    
    // Разделяем массив на две половины
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];
    System.arraycopy(a, 0, left, 0, left.length);
    System.arraycopy(a, mid, right, 0, right.length);
    
    // Рекурсивно сортируем каждую половину
    mergeSort(left);
    mergeSort(right);
    
    // Сливаем две отсортированные половины в одну
    merge(a, left, right);
    
    return a;
  }
  
  private static void merge(int[] a, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    
    // Сравниваем элементы в двух половинах и помещаем их в итоговый массив в порядке возрастания
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        a[k++] = left[i++];
      } else {
        a[k++] = right[j++];
      }
    }
    
    // Копируем оставшиеся элементы из левой половины (если есть)
    while (i < left.length) {
      a[k++] = left[i++];
    }
    
    // Копируем оставшиеся элементы из правой половины (если есть)
    while (j < right.length) {
      a[k++] = right[j++];
    }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}