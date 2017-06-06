package com.gmail.osbornroad.adproject;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

import static com.google.android.gms.ads.AdRequest.*;

/**
 * Created by User on 05.06.2017.
 */

public class ToastListener extends AdListener {

    Context context;
    String errorReason;

    public ToastListener(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void onAdClosed() {
        Toast.makeText(context, getMethodName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int errorCode) {
        errorReason = "";

        switch (errorCode) {
            case ERROR_CODE_INTERNAL_ERROR:
                errorReason = "INTERNAL ERROR";
                break;
            case ERROR_CODE_INVALID_REQUEST:
                errorReason = "INVALID REQUEST";
                break;
            case ERROR_CODE_NETWORK_ERROR:
                errorReason = "NETWORK ERROR";
                break;
            case ERROR_CODE_NO_FILL:
                errorReason = "NO FILL";
                break;
        }

        Toast.makeText(context, getMethodName() + ": " + errorReason, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLeftApplication() {
        Toast.makeText(context, getMethodName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        Toast.makeText(context, getMethodName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLoaded() {
        Toast.makeText(context, getMethodName(), Toast.LENGTH_SHORT).show();
    }

    public String getErrorReason() {
            return errorReason == null ? "" : errorReason;
    }

    public String getMethodName()
    {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        //System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
        // return ste[ste.length - depth].getMethodName();  //Wrong, fails for depth = 0
        return ste[3].getMethodName(); //Thank you Tom Tresansky
    }


}
