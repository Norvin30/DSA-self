
    public class bubblesort {
        public static void main(String[] args){
            int[] array ={12,199,200,11,19,14};

            bubbleSort(array);
            for (int i : array){
                System.out.println(i);
            }
        }
        public static void bubbleSort(int array[]){
            for(int i = 0; i < array.length - 1; i++){
                for (int j = 0; j < array.length - 1; j++){
                    if (array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] =  array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }


