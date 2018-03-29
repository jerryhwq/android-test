package cn.huwenqiang.myapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItems;

public class CalculatorTest {

    private Calculator calc;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("tearDownAfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
        System.out.println(System.currentTimeMillis());
        calc = null;
    }

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        assertThat(list, hasItems("a"));
        Map<String, String> map = new HashMap<>();
        map.put("a", "hello");
        assertThat(map, hasEntry("a", "hello"));
    }

}
