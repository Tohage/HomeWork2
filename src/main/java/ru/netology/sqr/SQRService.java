package ru.netology.sqr;

public class SQRService {
    public int RaiseToAPowerToTwo(int limit) {
        int count = 0;
        int x = 200;
        int y = 300;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;
            if (j >= x && j <= y) {
                count++;
            }
        }
        return count;
    }
}




