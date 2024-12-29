package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.yeelight.yeelib.ui.activity.BaseActivity */
public class BaseActivity extends FragmentActivity {
    /* renamed from: N */
    private boolean m19944N() {
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
    private boolean m19945O() {
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
    private void m19946Q() {
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT > 18) {
            getWindow().addFlags(67108864);
        }
    }

    /* renamed from: U */
    public static void m19947U(Context context) {
        Class<MainActivity> cls = MainActivity.class;
        try {
            int i = MainActivity.f10688y;
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
    public void mo35652M(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo35653P() {
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: R */
    public void mo35654R(boolean z) {
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
    public void mo35655S(int i) {
        Toast.makeText(this, i, 0).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo35656T(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i == 26 && m19945O()) {
            boolean N = m19944N();
            StringBuilder sb = new StringBuilder();
            sb.append("onCreate fixOrientation when Oreo, result = ");
            sb.append(N);
        }
        super.onCreate(bundle);
        if (AppUtils.f4982f != 1) {
            C3108x.m8227l();
            finish();
            return;
        }
        if (i != 26) {
            setRequestedOrientation(1);
        }
        LocalBroadcastManager.getInstance(this);
        m19946Q();
        mo35654R(true);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public void setTitleBarPadding(View view) {
    }
}
