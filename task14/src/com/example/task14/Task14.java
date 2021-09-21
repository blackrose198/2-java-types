package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        int tmp;
        int obr_value=0;
        int length = String.valueOf(value).length();
        while (length != 0){
            tmp = value %10;
            obr_value = obr_value*10+tmp;
            value = value /10;
            length--;
        }
        return obr_value;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(345);
        System.out.println(result);

    }


}
