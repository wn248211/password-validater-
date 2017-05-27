package com.example.a2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Wenlong on 2017/5/26.
 */

public class jUnitTest {

    @Test
    public void Password() throws Exception {

        assertEquals(false,passwordValidater.isInsensitive("password"));
    }
    @Test
    public void Short() throws Exception {

        assertEquals(false,passwordValidater.isShort("123"));
    }

}