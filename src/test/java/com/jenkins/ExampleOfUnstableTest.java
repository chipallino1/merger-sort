package com.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleOfUnstableTest {

    @Test
    public void test1() {
        Assertions.assertEquals(2, 1);
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, 1);
    }
}
