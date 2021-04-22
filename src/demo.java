public class demo {
    public static void main(String[] args) {
        int []array = {10,4,8,13,7,3,9};
        insertionSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}
