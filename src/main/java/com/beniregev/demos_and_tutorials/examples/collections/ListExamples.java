package com.beniregev.demos_and_tutorials.examples.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExamples {
    private void isDisjoin() {
        List list1 = Arrays.asList(new String []{ "-h", "--help", "-v", "--version" });
        List list2 = Arrays.asList(new String []{ "--help", "--version" });

        System.out.println("list1 and list2 have common elements? " + !Collections.disjoint(list1, list2));
    }
    public static void main(String[] args) {
        ListExamples examples = new ListExamples();

        examples.isDisjoin();
    }
}
