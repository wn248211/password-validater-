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
    @Test
    public void Upper() throws Exception {

        assertEquals(false,passwordValidater.isUpperCase("xianjian12"));
    }
    @Test
    public void Mix() throws Exception {

        assertEquals(false,passwordValidater.isMix("xianjian"));
    }
    @Test
    public void Illegal() throws Exception {
        assertEquals(false,passwordValidater.includeIllegal("Xianjian12#"));
    }
}
