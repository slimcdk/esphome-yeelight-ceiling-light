package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.ViewCompat;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Map;

/* renamed from: com.xiaomi.push.ep */
public class C4668ep extends C4671es {

    /* renamed from: a */
    private int f7996a = 16777216;

    /* renamed from: b */
    private Bitmap f7997b;

    /* renamed from: c */
    private Bitmap f7998c;

    public C4668ep(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public C4668ep setLargeIcon(Bitmap bitmap) {
        if (mo29061b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || 184 > bitmap.getHeight() || bitmap.getHeight() > 1678) {
                C4408b.m12464a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
            } else {
                this.f7997b = bitmap;
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4668ep mo29058a(String str) {
        if (mo29061b() && !TextUtils.isEmpty(str)) {
            try {
                this.f7996a = Color.parseColor(str);
            } catch (Exception unused) {
                C4408b.m12464a("parse banner notification image text color error");
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4671es m13701a(Bitmap bitmap) {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29059a() {
        return "notification_banner";
    }

    /* renamed from: a */
    public void m13703a() {
        Bitmap bitmap;
        RemoteViews remoteViews;
        if (!mo29061b() || this.f7997b == null) {
            mo29061b();
            return;
        }
        super.mo29059a();
        Resources resources = mo29059a().getResources();
        String packageName = mo29059a().getPackageName();
        int a = mo29063a(resources, "bg", "id", packageName);
        if (C4830m.m14998a(mo29059a()) >= 10) {
            remoteViews = mo29059a();
            bitmap = mo29074a(this.f7997b, 30.0f);
        } else {
            remoteViews = mo29059a();
            bitmap = this.f7997b;
        }
        remoteViews.setImageViewBitmap(a, bitmap);
        int a2 = mo29063a(resources, "icon", "id", packageName);
        if (this.f7998c != null) {
            mo29059a().setImageViewBitmap(a2, this.f7998c);
        } else {
            mo29078a(a2);
        }
        int a3 = mo29063a(resources, ScanBarcodeActivity.TITLE, "id", packageName);
        mo29059a().setTextViewText(a3, this.f8009a);
        Map<String, String> map = this.f8012a;
        if (map != null && this.f7996a == 16777216) {
            mo29058a(map.get("notification_image_text_color"));
        }
        RemoteViews a4 = mo29059a();
        int i = this.f7996a;
        a4.setTextColor(a3, (i == 16777216 || !mo29078a(i)) ? -1 : ViewCompat.MEASURED_STATE_MASK);
        setCustomContentView(mo29059a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("miui.customHeight", true);
        addExtras(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13704a() {
        if (!C4830m.m14997a()) {
            return false;
        }
        Resources resources = mo29059a().getResources();
        String packageName = mo29059a().getPackageName();
        return (mo29063a(mo29059a().getResources(), "bg", "id", mo29059a().getPackageName()) == 0 || mo29063a(resources, "icon", "id", packageName) == 0 || mo29063a(resources, ScanBarcodeActivity.TITLE, "id", packageName) == 0 || C4830m.m14998a(mo29059a()) < 9) ? false : true;
    }

    /* renamed from: b */
    public C4668ep mo29060b(Bitmap bitmap) {
        if (mo29061b() && bitmap != null) {
            this.f7998c = bitmap;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo29061b() {
        return null;
    }
}
