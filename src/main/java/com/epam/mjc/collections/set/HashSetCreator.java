package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer integer : sourceList) {
            result.add(integer);
            if (integer % 2 == 0) {
                while (integer % 2 == 0) {
                    result.add(integer /= 2);
                }
            } else {
                result.add(integer * 2);
            }
        }
        return result;
    }
}
