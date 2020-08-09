package core.basesyntax;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     *
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     *
     * Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a == b && a == c && a == d) ? false
                : ((a ^ b) ^ (c ^ d)) ? false
                : true;
    }
    
    public void push(T value) {
        int hello = 10;
        int world = 15;
        int result = hello + world;
        result = 10;
        System.out.println(result);
    }
}
