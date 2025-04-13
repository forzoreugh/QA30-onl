package Task11and12;

import java.util.Arrays;

// единственное не понял разницы между <e>, <t>. погуглил, чет ничего дельного не узнал, пусть будет <t>))
// на результат не повлияло
public class MyCollection<T> {
    protected Object[] elements;
    protected int size;
    protected static final int capacity = 2;

    public MyCollection() {
        elements = new Object[capacity];
        size = 0;
    }

    public MyCollection(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0.");
        } else {
            elements = new Object[capacity];
            size = 0;
        }
    }

    // добавление элемента
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // получение по индексу
    public Object getIndex(int index) {
        return elements[index];
    }

    // удаление по индексу
    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    // проверка наличия
    public boolean getElements(T element){
        for (int index = 0; index < size; index++){
            if (elements[index].equals(element)){
                return true;
            }
        } return false;
    }

    public void clearCollection(){
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }





    private void resize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < size; index++) {
            stringBuilder.append(elements[index]);
            if (index < size - 1) {
                stringBuilder.append(", ");
            }

        }
        return stringBuilder.toString();
    }
}
