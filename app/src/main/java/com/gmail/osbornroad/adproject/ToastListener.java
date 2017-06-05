package com.gmail.osbornroad.adproject;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

/**
 * Created by User on 05.06.2017.
 */

public class ToastListener extends AdListener {

    Context context;

    public ToastListener(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void onAdClosed() {
        super.onAdClosed();
        Toast.makeText(context, "onAdClosed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int i) {
        super.onAdFailedToLoad(i);
        Toast.makeText(context, "onAdFailedToLoad", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
        super.onAdLeftApplication();
        Toast.makeText(context, "onAdLeftApplication", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        super.onAdOpened();
        Toast.makeText(context, "onAdOpened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLoaded() {
        super.onAdLoaded();
        Toast.makeText(context, "onAdLoaded", Toast.LENGTH_SHORT).show();
    }


}
