package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class BounceInInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        input = 1 - input;
        if (input < (1 / 2.75)) {
            return 1 - (7.5625f * input * input);
        } else if (input < (2 / 2.75)) {
            return 1 - (7.5625f * (input -= (1.5f / 2.75f)) * input + 0.75f);
        } else if (input < (2.5 / 2.75)) {
            return 1 - (7.5625f * (input -= (2.25f / 2.75f)) * input + 0.9375f);
        } else {
            return 1 - (7.5625f * (input -= (2.625f / 2.75f)) * input + 0.984375f);
        }
    }
}
