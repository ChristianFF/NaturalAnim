package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * Created by feifan on 2016/9/30.
 * Contacts me:404619986@qq.com
 */

public class SpringInterpolator extends Calculator {
    @Override
    public float getInterpolation(float input) {
        if (input < 0.125) {
            return (float) (0.66 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.25) {
            return (float) (0.58 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.375) {
            return (float) (0.50 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.5) {
            return (float) (0.42 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.625) {
            return (float) (0.34 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.75) {
            return (float) (0.26 * Math.sin(Math.PI * 16 * input));
        } else if (input < 0.875) {
            return (float) (0.18 * Math.sin(Math.PI * 16 * input));
        } else {
            return (float) (0.1 * Math.sin(Math.PI * 16 * input));
        }
    }
}
