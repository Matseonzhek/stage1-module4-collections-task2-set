package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstCondition = new HashSet<>(firstSet);
        firstCondition.addAll(secondSet);
        firstSet.retainAll(secondSet);
        firstSet.removeAll(thirdSet);
        thirdSet.removeAll(firstCondition);
        firstSet.addAll(thirdSet);
        return firstSet;
    }
}
