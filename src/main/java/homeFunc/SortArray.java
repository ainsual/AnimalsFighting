package homeFunc;

public class SortArray {
    public static void sort(Object[] list, MethodSort method){
        for (int i = 0; i < list.length - 1; i++){
            for (int j = i + 1; j < list.length; j++){
                if (method.compare(list[i], list[j]) > 0){
                    Object temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}