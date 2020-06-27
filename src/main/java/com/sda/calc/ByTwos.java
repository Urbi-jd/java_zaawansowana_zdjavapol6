package com.sda.calc;

public class ByTwos implements Series {
    int start = 0;
    int firstStart = 0;

    @Override
    public int getNext() {
        return start = start + 2;
    }

    @Override
    public void reset() {
        start = firstStart;
    }

    @Override
    public void setStart(int x) {
        start = x;
        firstStart = x;

    }
}
