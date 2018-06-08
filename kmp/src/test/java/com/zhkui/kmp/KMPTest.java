package com.zhkui.kmp;

import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {
    @Test
    public void search() throws Exception {
        assertEquals(12,new KMP("ABCDE").search("AAAAAABCDABCABCDEABCEABDE"));
    }

}