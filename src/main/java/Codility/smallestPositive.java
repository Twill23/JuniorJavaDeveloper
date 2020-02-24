package Codility;

import java.util.HashSet;

public class smallestPositive {

    public int solution(int[] A) {

        int res = 0;
        HashSet<Integer> list = new HashSet<>();

        for (int i : A) list.add(i);
        for (int i = 1; i < 1000000; i++) {
            if(!list.contains(i)){
                res = i;
                break;
            }
        }
        return res;
    }
}
