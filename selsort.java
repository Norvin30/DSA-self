public class selsort {
        public static void main(String[] args){
            int array[] ={12,19,10,1,18};

            selectionSort(array);
            for (int i: array){
                System.out.println(i);
            }
        }
        private static void selectionSort(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[min] > array[j]) {
                        min = j;
                    }
                }
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }


