package com.algorithm.tests.list;

import com.algorithm.list.CommonMethods;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonMethodsTest {
    private CommonMethods testObject = new CommonMethods();

    @Test
    public void checkStrings_1_Test() {
        List<String> oneList = new ArrayList<>(Arrays.asList(new String[] {"one", "two"}));
        List<String> twoList = new ArrayList<>(Arrays.asList(new String[] {"two"}));
        Assert.assertTrue(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkStrings_2_Test() {
        List<String> oneList = new ArrayList<>(Arrays.asList(new String[] {"one", "two"}));
        List<String> twoList = new ArrayList<>(Arrays.asList(new String[] {"three"}));
        Assert.assertFalse(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkStrings_3_Test() {
        List<String> oneList = new ArrayList<>(Arrays.asList(new String[] {"one", "two"}));
        List<String> twoList = new ArrayList<>();
        Assert.assertFalse(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkStrings_4_Test() {
        List<String> oneList = new ArrayList<>();
        List<String> twoList = new ArrayList<>(Arrays.asList(new String[] {"three"}));
        Assert.assertFalse(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkNull_1_Test() {
        List<String> oneList = new ArrayList<>(Arrays.asList(new String[] {"one", "two"}));
        List<String> twoList = null;
        Assert.assertFalse(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkNull_2_Test() {
        List<String> oneList = null;
        List<String> twoList = new ArrayList<>(Arrays.asList(new String[] {"three"}));
        Assert.assertFalse(testObject.isOneContainsTwo(oneList,twoList));
    }
    @Test
    public void checkInts_1_Test() {
        List<Integer> oneList = new ArrayList<>(Arrays.asList(new Integer[] {1, 2}));
        List<Integer> twoList = new ArrayList<>(Arrays.asList(new Integer[] {2}));
        Assert.assertTrue(testObject.isOneContainsTwo(oneList,twoList));
    }
}
