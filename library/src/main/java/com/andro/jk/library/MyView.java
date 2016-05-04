package com.andro.jk.library;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Saikiran on 5/1/2016.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);;
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }
}
