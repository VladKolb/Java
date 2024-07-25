package theme5;

public class Fraction {

    // Создайте класс с именем fraction, содержащий два поля типа int -
    // числитель и знаменатель обыкновенной дроби.
    //● Конструктор класса должен инициализировать их заданным
    //набором значений.
    //● Создайте метод класса, который будет выводить дробь в
    //текстовую строку в формате x / y;
    //● метод, добавляющий (сложение) к текущей дроби дробь,
    //переданную ему в параметре и возвращающий дробь - результат
    //сложения;
    //● метод, умножающий (произведение) текущую дробь на число типа
    //double, переданное ему в параметре и возвращающий дробь -
    //результат умножения;
    //● метод, делящий (деление) текущую дробь на число типа double,
    //переданное ему в параметре и возвращающий дробь - результат
    //деления.

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printFraction() {
        System.out.println(numerator + " / " + denominator);
    }

    public void addingFractions(int addedNumerator, int addedDenominator) {
        if (addedDenominator == 0 || addedNumerator == 0) {
            System.out.println("Added numerator or denominator is 0");
            return;
        }
        if (addedDenominator == denominator) {
            System.out.println(numerator + " / " + denominator +
                    " + " + addedNumerator + " / " + addedDenominator + " = " +
                    (addedNumerator + numerator) + " / " + addedDenominator);
        } else if (denominator > addedDenominator && denominator % addedDenominator == 0) {
            System.out.println(numerator + " / " + denominator +
                    " + " + addedNumerator + " / " + addedDenominator + " = " +
                    (addedNumerator * (denominator / addedDenominator) + numerator) + " / " + denominator);
        } else if (denominator < addedDenominator && addedDenominator % denominator == 0) {
            System.out.println(numerator + " / " + denominator +
                    " + " + addedNumerator + " / " + addedDenominator + " = " +
                    (numerator * (addedDenominator / denominator) + addedNumerator) + " / " + addedDenominator);
        } else {
            System.out.println(numerator + " / " + denominator +
                    " + " + addedNumerator + " / " + addedDenominator + " = " +
                    (addedNumerator * denominator + numerator * addedDenominator) + " / " + denominator * addedDenominator);
        }
    }

    public void multiplyingOnDouble(double numberToMultiply) {
        if (numberToMultiply < 0.1) {
            System.out.println("Number to multiply is 0");
            return;
        }
        int addedDenominator = 10;
        numberToMultiply = (double) Math.round(numberToMultiply * 10) / 10;
        int integerPart = (int) numberToMultiply * 10 / 10;
        int addedNumerator = (int) (numberToMultiply * 10 % 10) + integerPart * addedDenominator;
        if (addedNumerator == 0 && integerPart == 0) {
            System.out.println("Added numerator and integer part is 0");
            return;
        }
        System.out.println(numerator + " / " + denominator +
                " * " + addedNumerator + " / " + addedDenominator + " = " +
                numerator * addedNumerator + " / " + denominator * addedDenominator);
    }

    public void divisionOfFractions(double divider) {
        if (divider < 0.1) {
            System.out.println("Divider is 0");
            return;
        }
        int addedDenominator = 10;
        divider = (double) Math.round(divider * 10) / 10;
        int integerPart = (int) divider * 10 / 10;
        int addedNumerator = (int) (divider * 10 % 10) + integerPart * addedDenominator;
        if (addedNumerator == 0 && integerPart == 0) {
            System.out.println("Added numerator and integer part is 0");
            return;
        }
        System.out.println(numerator + " / " + denominator +
                " : " + addedNumerator + " / " + addedDenominator + " = " +
                numerator * addedDenominator + " / " + denominator * addedNumerator);
    }


}
