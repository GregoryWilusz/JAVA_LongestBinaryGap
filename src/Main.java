import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static int solution(int N) {
        ArrayList<Integer> binaryGapsLengths = new ArrayList<>();
        int maxBinaryLength = 0;

        String binaryStringRepresentation = Integer.toBinaryString(N);
        System.out.println(binaryStringRepresentation);

        if (binaryStringRepresentation.contains("10") && binaryStringRepresentation.contains("01")) {

            char[] chars = binaryStringRepresentation.toCharArray();
            int currentBinaryGapLength = 0;


            for (int i = 0;  i < chars.length; i++) {
                System.out.println(chars[i]);
                if(chars[i] == '1' && currentBinaryGapLength == 0) {
                } else if (chars[i] == '1' && currentBinaryGapLength != 0) {
                    binaryGapsLengths.add(currentBinaryGapLength);
                    System.out.println(binaryGapsLengths);
                    currentBinaryGapLength = 0;
                } else {
                    currentBinaryGapLength++;
                }
            }
            maxBinaryLength = Collections.max(binaryGapsLengths);

        }

        return maxBinaryLength;
    }

    public static void main(String[] args) {

        int maxBinaryLength = solution(22);
        int maxBinaryLength2 = solution(529);
        int maxBinaryLength3 = solution(1041);

        System.out.println();
        System.out.println("ANSWERS:   ");
        System.out.println(maxBinaryLength);
        System.out.println(maxBinaryLength2);
        System.out.println(maxBinaryLength3);

    }
}
