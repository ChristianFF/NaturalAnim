package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/10/11.
 * Contacts me:404619986@qq.com
 */

public class SineInInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        return (float) (-1 * Math.cos(input * Math.PI / 2) + 1);
    }
}
