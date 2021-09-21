package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int ost;
        int count = 0;
        int length = String.valueOf(x).length();
        int ln = length;
        while (ln != 0){
            if (x < 10){
                if (x %2 == 0) {
                    count++;
                    ln--;
                }
                else break;
            }
            else {
                ost = x % 2;
                x = x/ 10;
                if (ost %2 == 0) {
                    count++;
                    ln--;
                }
                else break;

            }
        }
        if (count == length)
            return "TRUE";
        else return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(10);
        System.out.println(result);

    }

}
