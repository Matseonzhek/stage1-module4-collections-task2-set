package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {

    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> treeSquareSet = new TreeSet<>();
        for (Integer element : sourceList) {
            treeSquareSet.add((int) Math.pow(element, 2));
        }
        NavigableSet<Integer> subResult = new TreeSet<>();
        for (Integer integer : treeSquareSet) {
            if ((integer > treeSquareSet.floor(lowerBound)) && (integer < treeSquareSet.higher(upperBound))) {
                subResult.add(integer);
            }
        }
        if (!subResult.isEmpty()) {
            if (treeSquareSet.contains(lowerBound)) {
                subResult.add(lowerBound);
            }
            if (treeSquareSet.contains(upperBound)) {
                subResult.add(upperBound);
            }
        }
        return subResult;
    }
}
