package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        char operation_ = operation.charAt(0);
        float ans = 0;
        switch(operation_) {
            case '+': ans = a + b;
                break;
            case '-': ans = a - b;
                break;
            case '*': ans = a * b;
                break;
            case '/': ans = (float) (a) / (float) (b);
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
