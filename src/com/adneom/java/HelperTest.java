package com.adneom.java;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Project          : ADNEOM_lyazidi_rezki
 * Date             : 18/06/2017.
 * Name             : Lyazidi
 * First name       : Rezki
 * email            : lyazidi.rezki@gmail.com
 */
@RunWith(JUnit4.class)
public class HelperTest {

    List<Object> src_empty;
    List<Integer> src;

    int negativeSize;
    int biggerSize;
    int randomSize;

    @org.junit.Before
    public void setUp() throws Exception {
        src_empty = new ArrayList<Object>();
        src = new ArrayList<Integer>();
        int size = (int) (Math.random()*100);
        for (int i = 0; i < size; i++) {
            src.add(size+1%100);
        }

        negativeSize = -1;
        biggerSize = src.size()+1;
        randomSize = (int) Math.min( Math.max(1, Math.random()*100), src.size() - 1);
    }

    @org.junit.Test
    public void test_partition_liste_empty_taille_valid() throws Exception {
        List<List<Object>> lists = Helper.partition(src_empty, randomSize);
        assertEquals( 1, lists.size());
        assertEquals(0, lists.get(0).size());
        assertEquals(src_empty.hashCode(), lists.get(0).hashCode());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void test_partition_liste_empty_taille_invalid() throws Exception {
        Helper.partition(src_empty, negativeSize);
    }

    @org.junit.Test
    public void test_partition_liste_taille_valid() throws Exception {
        List<List<Integer>> lists = Helper.partition(src, randomSize);
        assertTrue( lists.get(0).size() == randomSize);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void test_partition_liste_taille_invalid() throws Exception {
        Helper.partition(src, negativeSize);
    }
}
