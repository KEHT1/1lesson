package ru.job4j.calculator;

/**
 * Calculator.
 */
public class Calculator {

/**
 * Method private double result поле для записи промежуточного результата.
 */
private double result;

/**
 * Method void add добаляет первое и второе число.
 *@param first - входящий аргумент
 *@param second - входящий аргумент
 */
public void add(double first, double second) {
this.result = first + second;
}

/**
 * Method void substruct вычитает из первого числа второе.
 *@param first - входящий аргумент
 *@param second - входящий аргумент
 */
public void substruct(double first, double second) {
this.result = first - second;
}


/**
 * Method void div делит первое число на второе.
 *@param first - входящий аргумент
 *@param second - входящий аргумент
 */
public void div(double first, double second) {
this.result = first / second;
}


/**
 * Method void muktiple умножает первое число на второе.
 *@param first - входящий аргумент
 *@param second - входящий аргумент
 */
public void multiple(double first, double second) {
this.result = first * second;
}

/**
 * Method  getResult передаёт значение поля result.
 *@return result
 */
public double getResult() {
return this.result;
}
}