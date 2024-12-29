package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Map;

@SuppressLint({"NewApi"})
/* renamed from: com.xiaomi.push.eq */
public class C4669eq extends Notification.Builder {

    /* renamed from: a */
    private Context f7999a;

    public C4669eq(Context context) {
        super(context);
        this.f7999a = context;
    }

    /* renamed from: a */
    public int mo29063a(Resources resources, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return resources.getIdentifier(str, str2, str3);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo29058a(String str) {
        return mo29063a(mo29059a().getResources(), str, "id", mo29059a().getPackageName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Context mo29059a() {
        return this.f7999a;
    }

    /* renamed from: a */
    public C4669eq addExtras(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 20) {
            super.addExtras(bundle);
        }
        return this;
    }

    /* renamed from: a */
    public C4669eq setCustomContentView(RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT >= 24) {
            super.setCustomContentView(remoteViews);
        } else {
            super.setContent(remoteViews);
        }
        return this;
    }

    /* renamed from: a */
    public C4669eq m13712a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C4554bk.m13012a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
            } catch (Exception e) {
                C4408b.m12483d("fail to set color. " + e);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4669eq mo29066a(Map<String, String> map) {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m13714a() {
    }

    public Notification build() {
        mo29059a();
        return super.build();
    }
}
