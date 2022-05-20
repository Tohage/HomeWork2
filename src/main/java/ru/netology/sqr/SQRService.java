package ru.netology.sqr;

public class SQRService {
    public int RaiseToAPowerToTwo(int first, int second) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= first && i * i <= second) {
                count++;
            }
        }
        return count;
    }
}




