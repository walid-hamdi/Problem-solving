package ArraysExercices;

public class Arrays {
    private int[] array;
    private int count;

    public Arrays(int size) {
        array = new int[size];
    }

    public void insert(int value) {
        if (count > array.length) {
            var newArray = new int[count * 2];
            for (int i = 0; i < array.length; i++)
                newArray[i] = array[i];

            array = newArray;
            array[count++] = value;
            return;
        }
        array[count++] = value;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        array[index] = array[index + 1];
        count--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

}
