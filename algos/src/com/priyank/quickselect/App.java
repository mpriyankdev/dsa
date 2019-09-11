package com.priyank.quickselect;

public class App {

    public static void main(String[] args) {
        int [] nums = {1,5,4,8,-2,-5};
        QuickSelect quickSelect = new QuickSelect(nums);
        System.out.println(quickSelect.select(1));
    }
}
