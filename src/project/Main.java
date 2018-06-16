package project;

import java.util.Random;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class main {
    private Random random = new Random(System.nanoTime());
    public int[] generate() {
        int[] result = new int[6];  
        int index = 0;
        Set<Integer> generated = new HashDet<>();
        
        while(generated.size() < 6) {
            int num = random.nextInt(45) +1;
            
            if(!contains(generated, num)) {
                result[index++] = num; 
                genetated.add(num);
            }
        }
        ////생성된 목록임
    return result;
    }
    boolen contains(Set<Integer) generated, int num) {
        return generated.contains(num);
    }
    public static void main(String[] args) {
        int[] result = new main().generate();
        System.out.println(Arrays.toString(result));
    }
}


