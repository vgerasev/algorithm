package com.algorithm.list;

import java.util.List;

public class CommonMethods {
    public <B extends Comparable<B> , A extends B> boolean isOneContainsTwo  (List<A> bigOne, List<B> smallTwo) {
        boolean bResult = true;
        if (bigOne==null || smallTwo==null || (smallTwo.size() == 0 && bigOne.size() > 0)) {
            return false;
        }
        if (bigOne.size() == 0 && smallTwo.size() == 0) return true;
        for (B bItem : smallTwo){
            if (!bigOne.contains(bItem)) {
                bResult = false;
                break;
            }
        }
        return  bResult;
    }
}
