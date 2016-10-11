package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class QuintInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if ((input /= 0.5f) < 1) {
            return 0.5f * input * input * input * input * input;
        }
        return 0.5f * ((input -= 2) * input * input * input * input + 2);
    }
}
