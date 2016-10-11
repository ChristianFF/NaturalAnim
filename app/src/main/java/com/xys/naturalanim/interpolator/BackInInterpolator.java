package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class BackInInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        return input * input * ((1.70158f + 1) * input - 1.70158f);
    }
}
