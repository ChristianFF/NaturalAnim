package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class CircleInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if ((input /= 0.5) < 1) {
            return (float) (-1 * 0.5 * (Math.sqrt(1 - input * input) - 1));
        }
        return (float) (0.5 * (Math.sqrt(1 - (input -= 2) * input) + 1));
    }
}
