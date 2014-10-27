package com.harry.myweixin.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.harry.myweixin.R;

/**
 * Created by Harry on 10/20/14.
 */
public class ChatFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        FrameLayout f1 = new FrameLayout(getActivity());
        f1.setLayoutParams(params);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        final  int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,8,dm);
        TextView tv = new TextView(getActivity());
        params.setMargins(margin,margin,margin,margin);
        tv.setLayoutParams(params);
        tv.setGravity(Gravity.CENTER);
        tv.setText(R.string.view_chat);
        tv.setTextSize(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,12,dm));
        f1.addView(tv);
        return f1;
    }
}
