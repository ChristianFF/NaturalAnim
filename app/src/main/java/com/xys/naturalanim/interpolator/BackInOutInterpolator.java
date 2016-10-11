package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class BackInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        float s = 1.70158f;
        if ((input *= 2) < 1) {
            return 0.5f * (input * input * (((s *= (1.525f)) + 1) * input - s));
        }
        return 0.5f * ((input -= 2) * input * (((s *= (1.525f)) + 1) * input + s) + 2);
    }
}
