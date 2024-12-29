package com.yeelight.yeelib.p194ui.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.yeelight.yeelib.ui.activity.BaseActivity */
public class BaseActivity extends FragmentActivity {

    /* renamed from: a */
    private static final String f18127a = BaseActivity.class.getSimpleName();

    /* renamed from: N */
    private boolean m24381N() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: O */
    private boolean m24382O() {
        boolean z;
        Exception e;
        try {
            TypedArray obtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get((Object) null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", new Class[]{TypedArray.class});
            method.setAccessible(true);
            z = ((Boolean) method.invoke((Object) null, new Object[]{obtainStyledAttributes})).booleanValue();
            try {
                method.setAccessible(false);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
            e.printStackTrace();
            return z;
        }
        return z;
    }

    /* renamed from: Q */
    private void m24383Q() {
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT > 18) {
            getWindow().addFlags(67108864);
        }
    }

    /* renamed from: U */
    public static void m24384U(Context context) {
        try {
            Class<?> cls = Class.forName("com.yeelight.cherry.ui.activity.MainActivity");
            Intent intent = new Intent();
            intent.setClass(context, cls);
            intent.addFlags(339738624);
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo32192M(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo32193P() {
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: R */
    public void mo32194R(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2.getAttributes();
        attributes.flags = z ? attributes.flags | 67108864 : attributes.flags & -67108865;
        window2.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo32195S(int i) {
        Toast.makeText(this, i, 0).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo32196T(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && m24382O()) {
            "onCreate fixOrientation when Oreo, result = " + m24381N();
        }
        super.onCreate(bundle);
        if (C4308b.f7486e != 1) {
            C4297y.m12068l();
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        LocalBroadcastManager.getInstance(this);
        m24383Q();
        mo32194R(true);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public void setTitleBarPadding(View view) {
        int i;
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            i = getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            i = -1;
        }
        if (i != -1) {
            view.setPadding(0, i, 0, 0);
        }
    }
}
