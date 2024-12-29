package com.inuker.bluetooth.library.utils;

import java.util.Random;

public class RandomUtils {
    private static Random mRandom;

    public static double randFloat() {
        if (mRandom == null) {
            Random random = new Random();
            mRandom = random;
            random.setSeed(System.currentTimeMillis());
        }
        return mRandom.nextDouble();
    }
}
