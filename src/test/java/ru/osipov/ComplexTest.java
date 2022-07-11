package ru.osipov;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ComplexTest {

    @BeforeAll
    static void startTests(){
        System.out.println("Начинаем гонять тесты:");
    }

    @AfterAll
    static void stopTests(){
        System.out.println("Закончили гонять тесты!");
    }

    @BeforeEach
    public void startTest(){
        System.out.println("Гоним очередной тест:");
    }

    @AfterEach
    public void stopTest(){
        System.out.println("Прогнали очередной тест!");
    }

    @Test
    public void testAdd() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        Complex complex3 = new Complex(3, 3);
        // when:
        Complex result = complex1.add(complex2);
        // then:
        assertThat(complex3, samePropertyValuesAs(result));

    }

    @Test
    public void testMul() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(0, 4);
        // when:
        final Complex result = complex1.mul(complex2);
        // then:
        assertThat(complex3, samePropertyValuesAs(result));
    }

    @Test
    public void testSub() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(-1, -1);
        // when:
        final Complex result = complex1.sub(complex2);

        // then:
        assertThat(complex3, samePropertyValuesAs(result));
    }

    @Test
    public void testDiv() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        final Complex complex2 = new Complex(2, 2);
        final Complex complex3 = new Complex(0.5, 0);
        // when:
        final Complex result = complex1.div(complex2);
        // then:
        assertThat(complex3, samePropertyValuesAs(result));
    }

    @Test
    public void testAbs() {
        // given:
        final Complex complex1 = new Complex(1, 1);
        // when:
        final double result = complex1.abs();
        // then:
        assertThat(Math.sqrt(2), equalTo(result));

    }
}
