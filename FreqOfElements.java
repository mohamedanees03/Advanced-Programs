import java.util.HashMap;
import java.util.Map;

public class FreqOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 15, 20};
        findFreq(arr);
    }

    private static void findFreq(int[] arr) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            else 
                hashMap.put(arr[i], 1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" occured : "+entry.getValue());
        }
    }
}
