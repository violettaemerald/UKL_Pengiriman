import java.util.HashMap;

public class uklsulit32024 {
    public static void main(String[] args) {        
        int [] angka = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < angka.length ; i++) {
            frequency.put(angka[i], frequency.getOrDefault(angka[i], 0) +1);
        }
        
        for (Integer key : frequency.keySet()) {
            System.out.println(key +" muncul sebanyak "+frequency.get(key)+" kali");
        }

    }
}
