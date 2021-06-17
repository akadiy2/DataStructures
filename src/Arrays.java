import LinkedLists.MyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Arrays {
    public static void main (String [] args) {
//        int [] arr = {4,3,2,1};
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            list.add(i + 4);
//            arr[i] += 5;
//        }
//
//        System.out.println(list);
//        System.out.println(java.util.Arrays.toString(arr));
//
//        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
//        for (int i = 1; i <= 10; i++) {
//            linkedList.insert(i);
//        }
//
//        MyLinkedList list1 = new MyLinkedList();
//        list1.insert(4);
//        list1.insert(5);
//        list1.insert(6);
//
//        MyLinkedList list2 = new MyLinkedList();
//        list1.insert(1);
//        list1.insert(2);
//
//        //System.out.println(list1.addList(list2));
//
//        MyLinkedList sortedLinkedList = new MyLinkedList();
//
//        sortedLinkedList.insert(2);
//        sortedLinkedList.insert(4);
//        sortedLinkedList.insert(6);
//        sortedLinkedList.insert(8);
//        sortedLinkedList.insert(12);
//        sortedLinkedList.insert(14);
//        System.out.println(sortedLinkedList);
//        sortedLinkedList.insertSorted(10);
//        System.out.println(sortedLinkedList);
//
//        System.out.println(linkedList.sizeRecursive());
//        System.out.println(linkedList);
//        linkedList.reverseLinkedList();
//        System.out.println(linkedList);
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = "";
//        int top = 0;
//        try {
//            str = buffer.readLine();
//        } catch (IOException io) {
//
//        }
//
//        for (top = str.length() - 1; top >= 0; top--) {
//            System.out.print(str.charAt(top));
//        }

        countOccurrences("this is a string", 's');
    }

    private static void cubes(int n) {
        if (n > 0) {
            System.out.println(n * n * n + " ");
            cubes(n - 1);
        }
    }

    private static int countOccurrences(String str, char c) {
        if (str.charAt(0) == c) {
            return 1;
        }
        return countOccurrences(str.substring(1), c);
    }

}
