package com.priyank.quickselect;


//this algo is for finding the kth largest or kth smallest element in O(n) TC.
//if we want to find the range of numbers then no need to go for this , better sort the array and then return the range.
// we can go with QuickSort which will give O(nlogn) in Avg case.

import java.util.Random;

public class QuickSelect {

    private int[] nums;

    public QuickSelect(int[] nums){
        this.nums = nums;
    }

    public int select(int k){
        return select(0 , nums.length -1 , k-1);
    }

    private int select(int indexFirst, int indexLast, int k) {
        int pivot = partition(indexFirst , indexLast);
        if(pivot > k){
            return select(indexFirst , pivot-1 , k);
        }else if(pivot < k){
            return select(pivot+1 , indexLast , k);
        }

        return nums[k];

    }

    private int partition(int indexFirst, int indexLast) {

        int pivot = new Random().nextInt(indexLast - indexFirst + 1) + indexFirst;
        swap(indexLast , pivot);

        for(int i=indexFirst;i<indexLast;i++){
            if(nums[i] > nums[indexLast]){
                swap(i , indexFirst);
                indexFirst++;
            }
        }

        swap(indexFirst , indexLast);
        return indexFirst;

    }


    public void swap(int i , int j){

        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
