package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class ExpoInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if (input == 0) {
            return 0;
        }
        if (input == 1) {
            return 1;
        }
        if ((input /= 0.5f) < 1) {
            return (float) (0.5f * Math.pow(2, 10 * (input - 1)));
        }
        return (float) (0.5f * (-Math.pow(2, -10 * --input) + 2));
    }
}
