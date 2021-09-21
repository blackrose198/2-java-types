package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        if (centimetre >= 100) {
            centimetre = centimetre /100;
            return centimetre;
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}
