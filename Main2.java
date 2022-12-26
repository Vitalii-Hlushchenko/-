class Main2 {
    public static void main(String[] args) {
        Main2 test = new Main2();
        test.start();
    }
    public void start() {
        int size = 1000;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 29) );
        }
        System.out.println("Сума елементів масиву:");
        System.out.println(SumMas(array));
    }
    public long SumMas(int[] array) {
        int size = array.length;
        do {
            for (int i = 0; i < size / 2; i++) {
                int end = size - 1 - i;
                array[i] = array[i] + array[end];
            }
            size = size / 2 + size % 2;
        } while (size > 1);
        return array[0];
    }
}
