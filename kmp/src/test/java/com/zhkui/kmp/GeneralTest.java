package com.zhkui.kmp;

import static org.junit.Assert.*;

public class GeneralTest {
    @org.junit.Test
    public void search() throws Exception {
        assertEquals(7,General.search("ABCDE","ABCDABCABCDEABCEABDE"));
    }

}