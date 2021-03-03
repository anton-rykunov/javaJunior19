package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);

        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);

        ColletionUtilsImpl utils = new ColletionUtilsImpl();
        Collection<Integer> result = utils.union(nums1, nums2);
        System.out.println(result);
        Collection<Integer> dif = utils.difference(nums1,nums2);
        System.out.println(dif);
    }
}
