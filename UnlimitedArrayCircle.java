package DSAssignment2;

public class UnlimitedArrayCircle implements UnlimitedArray {
    int[] array;
    UnlimitedArrayCircle() {
        this.array = new int[4];
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFirst() {
        return 0;
    }

    @Override
    public int getLast() {
        return 0;
    }

    @Override
    public void add(int number) {

    }

    @Override
    public int removeFirst() {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }
}
