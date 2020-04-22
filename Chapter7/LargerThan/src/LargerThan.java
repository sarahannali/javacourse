public class LargerThan {
    public static void greaterNumbers(int [] integerArray, int n){
        int [] greaterNumbers = new int [ integerArray.length ];
        int greaterNumbersIndex = 0;
        for (int i = 0; i < integerArray.length; i++){
            if (integerArray[i] > n){
                greaterNumbers[greaterNumbersIndex] = integerArray[i];
                greaterNumbersIndex++;
            }
        }

        for (int i = 0; i < greaterNumbersIndex; i++){
            System.out.println(greaterNumbers[i]);
        }
    }
    public static void main(String[] args){
        int [] integerArray = {1,2,3,4,5,6,7,8};
        int num = 5;
        greaterNumbers(integerArray, num);
    }
}
