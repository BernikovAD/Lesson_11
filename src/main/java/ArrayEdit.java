import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEdit {

    public static <T> void replaceArrElements(T[] array, int i1, int i2){
        System.out.println("Массив до : "+ Arrays.toString(array));
        T temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        System.out.println("Массив после : "+Arrays.toString(array));
    }

    public static <T> ArrayList<T> toArrayList(T[]array){
        ArrayList<T> result = new ArrayList<>();
        for (T t : array){
            result.add (t);
        }
        System.out.println(result);
        return result;
    }
}
