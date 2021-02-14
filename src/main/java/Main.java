import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = " 1";
        objects[1] = " 2";
        objects[2] = " 3";
        objects[3] = " 4";
        objects[4] = " 5";
        //ArrayEdit arrayEdit = new ArrayEdit ();
        ArrayEdit.replaceArrElements (objects,0,1);
        ArrayEdit.toArrayList(objects);
/*        Задача:
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается,
а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.*/
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        orangeBox.addFruit(new Orange(),33);
        appleBox.addFruit(new Apple(),17);
        orangeBox2.addFruit(new Orange(),10);
        appleBox2.addFruit(new Apple(),15);
        System.out.println (orangeBox.compare (appleBox));
        System.out.println (orangeBox2.compare (appleBox2));
        orangeBox.replace (orangeBox2);
        orangeBox.getWeight ();
        orangeBox2.getWeight ();
    }
}
