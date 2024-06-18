package static1;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 접근 제어자를 통해 인스턴스 생성을 제한한다.
    }
    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int average(int[] array){
        return sum(array) / array.length;
    }

    public static int min(int[] array){
        int min_val = 10000000;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < min_val){
                min_val = array[i];
            }
        }
        return min_val;
    }

    public static int max(int[] array){
        int max_val = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > max_val){
                max_val = array[i];
            }
        }
        return max_val;
    }
}
