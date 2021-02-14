import java.util.ArrayList;
public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    public Box() {
        this.fruits = new ArrayList<> ();
    }
    public float getWeight() {
        float weight = 0.0f;
        for (T o : fruits) {
            weight += o.getWeight ();
        }
        System.out.println ("Вес коробки " + weight);
        return weight;
    }
    public boolean compare(Box anotherBox) {
        if (getWeight () == anotherBox.getWeight ()) return true;
        return false;
    }
    public void replace(Box<T> anotherBox) {
        anotherBox.fruits.addAll (fruits);
        fruits.clear ();
    }
    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add (fruit);
        }
    }
}