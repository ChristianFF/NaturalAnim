package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/9/30.
 * Contacts me:404619986@qq.com
 */

public class QuadInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if ((input *= 2) < 1) {
            return (float) (0.5f * Math.pow(input, 2));
        } else {
            return (float) (1 - 0.5f * Math.abs(Math.pow(2 - input, 2)));
        }
    }
}
