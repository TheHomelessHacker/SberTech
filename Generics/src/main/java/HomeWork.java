import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Количество четных элементов: " + HomeWork.countEvenElements(integerList));

        List<Object> objectList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        System.out.println("Исходный список: " + objectList);

        swap(objectList, 1, 3);
        System.out.println("Список после замены элементов: " + objectList);
    }

    public static  <T extends Number> int countEvenElements(Collection<T> collection){
        int count = 0;
        for (T elemement : collection){
            if (elemement.intValue() % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public static <T> void swap(List<? super T> list, int index1, int index2){
        if (index1 != index2) {
            Collections.swap(list, index1, index2);
        }
    }


}
