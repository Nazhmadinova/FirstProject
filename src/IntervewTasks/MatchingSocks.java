package IntervewTasks;

import java.util.ArrayList;

public class MatchingSocks {
    static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> unique = new ArrayList<>();

        int matchingPairs = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            if(!unique.contains(ar[i])){
                for(int j = 0; j < n; j++){
                    if(ar[i] == ar[j]){
                        count++;
                    }

                }

                if(count > 1){
                    matchingPairs += (count / 2);
                }
                unique.add(ar[i]);
            }
        }
        return matchingPairs;

        //other way
        //int [] all = new int [100];
        //        for(int i=0; i < ar.length; i++) {
        //            all[(ar[i] -1)] = all[(ar[i] -1)] + 1;
        //        }
        //        int socks = 0;
        //        for(int sock: all) {
        //            socks += sock/2;
        //        }
        //        return socks;
    }
}
