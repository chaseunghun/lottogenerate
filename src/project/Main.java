package project;
import java.util.Random;
import java.util.Arrays;
public class Main {
    private Random random = new Random(System.nanoTime());
    
    public int[] generate() {
        int[] result = new int[6];
        
        for(i=0; i<6; i++){
            result[i] = random.nextint(45);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] = result = new main().generate();
        System.out.println("Array.toString(result));
    }
    }

}
