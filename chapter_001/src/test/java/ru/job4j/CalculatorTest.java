
package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * CalculatorTest.
 */
public class CalculatorTest {

 /**
 * class Test данный тест проверяет операцию сложения.
 */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

 /**
 * class Test данный тест проверяет операцию вычитания.
 */
	@Test
    public void whenAddThreeSubstructTwoThenOne() {
        Calculator calc = new Calculator();
        calc.substruct(3D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

 /**
 * class Test данный тест проверяет операцию деления.
 */
	@Test
    public void whenAddTenDivFiveThenTwo() {
        Calculator calc = new Calculator();
        calc.div(10D, 5D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

 /**
 * class Test данный тест проверяет операцию сложения.
 */
	@Test
    public void whenAddFourMultipleTwoThenEight() {
        Calculator calc = new Calculator();
        calc.multiple(4D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }
}