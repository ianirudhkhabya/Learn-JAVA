package com.ianirudhkhabya.Recursion;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 2, 7, 0};
        System.out.println(findAllIndex(nums, 7, 0));
    }

    static int findOneIndex(int[] arr, int target, int idx){
        if (idx == arr.length) return -1;
        if (arr[idx] == target) return idx;
        else return findOneIndex(arr, target, idx + 1);
    }

    static ArrayList<Integer> indexes = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int idx){
//        if (idx == arr.length) return;
//
//        if (arr[idx] == target) indexes.add(idx);
//        findAllIndex(arr, target, idx + 1);
//    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx, ArrayList<Integer> indexes){
        if (idx == arr.length) return indexes;
        if (arr[idx] == target) indexes.add(idx);
        return findAllIndex(arr, target, idx + 1, indexes);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx){
        ArrayList<Integer> indexes = new ArrayList<>();

        if (idx == arr.length) return indexes;

        if (arr[idx] == target) indexes.add(idx);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, idx + 1);
        indexes.addAll(ansFromBelowCalls);
        return indexes;
    }
}
