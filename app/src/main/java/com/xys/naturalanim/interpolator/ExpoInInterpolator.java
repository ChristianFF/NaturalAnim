package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class ExpoInInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        return (float) ((input == 0) ? 0 : 1 * Math.pow(2, 10 * (input - 1)) - 0.001f);
    }
}
