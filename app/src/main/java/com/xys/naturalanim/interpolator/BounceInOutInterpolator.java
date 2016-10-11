package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class BounceInOutInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if ((input) < 0.5f) {
            input = input * 2;
            input = 1 - input;
            if (input < (1 / 2.75))
                return (1 - (7.5625f * input * input)) * 0.5f;
            else if (input < (2 / 2.75))
                return (1 - (7.5625f * (input -= (1.5f / 2.75f)) * input + 0.75f)) * 0.5f;
            else if (input < (2.5 / 2.75))
                return (1 - (7.5625f * (input -= (2.25f / 2.75f)) * input + 0.9375f)) * 0.5f;
            else
                return (1 - (7.5625f * (input -= (2.625f / 2.75f)) * input + 0.984375f)) * 0.5f;
        } else {
            input = input * 2 - 1;
            if (input < (1 / 2.75))
                return ((7.5625f * input * input)) * 0.5f + 1 * 0.5f;
            else if (input < (2 / 2.75))
                return ((7.5625f * (input -= (1.5f / 2.75f)) * input + 0.75f)) * 0.5f + 1 * 0.5f;
            else if (input < (2.5 / 2.75))
                return ((7.5625f * (input -= (2.25f / 2.75f)) * input + 0.9375f)) * 0.5f + 1 * 0.5f;
            else
                return ((7.5625f * (input -= (2.625f / 2.75f)) * input + 0.984375f)) * 0.5f + 1 * 0.5f;
        }
    }
}
