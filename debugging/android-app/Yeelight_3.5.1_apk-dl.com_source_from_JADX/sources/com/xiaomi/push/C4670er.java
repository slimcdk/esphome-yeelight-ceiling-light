package com.xiaomi.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.view.ViewCompat;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4874al;
import java.util.Map;

/* renamed from: com.xiaomi.push.er */
public class C4670er extends C4671es {

    /* renamed from: a */
    private int f8000a = 16777216;

    /* renamed from: a */
    private PendingIntent f8001a;

    /* renamed from: b */
    private int f8002b = 16777216;

    /* renamed from: b */
    private Bitmap f8003b;

    /* renamed from: c */
    private int f8004c = 16777216;

    /* renamed from: c */
    private CharSequence f8005c;

    public C4670er(Context context, int i, String str) {
        super(context, i, str);
    }

    /* renamed from: a */
    private Drawable m13715a(int i, int i2, int i3, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i3);
        return shapeDrawable;
    }

    /* renamed from: a */
    private void m13716a(RemoteViews remoteViews, int i, int i2, int i3, boolean z) {
        int a = mo29073a(6.0f);
        remoteViews.setViewPadding(i, a, 0, a, 0);
        int i4 = z ? -1 : ViewCompat.MEASURED_STATE_MASK;
        remoteViews.setTextColor(i2, i4);
        remoteViews.setTextColor(i3, i4);
    }

    /* renamed from: a */
    public C4670er mo29057a(Bitmap bitmap) {
        if (mo29061b() && bitmap != null) {
            if (bitmap.getWidth() != 984 || bitmap.getHeight() < 177 || bitmap.getHeight() > 207) {
                C4408b.m12464a("colorful notification bg image resolution error, must [984*177, 984*207]");
            } else {
                this.f8003b = bitmap;
            }
        }
        return this;
    }

    /* renamed from: a */
    public C4670er mo29070a(CharSequence charSequence, PendingIntent pendingIntent) {
        if (mo29061b()) {
            super.addAction(0, charSequence, pendingIntent);
            this.f8005c = charSequence;
            this.f8001a = pendingIntent;
        }
        return this;
    }

    /* renamed from: a */
    public C4670er mo29058a(String str) {
        if (mo29061b() && !TextUtils.isEmpty(str)) {
            try {
                this.f8002b = Color.parseColor(str);
            } catch (Exception unused) {
                C4408b.m12464a("parse colorful notification button bg color error");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29059a() {
        return "notification_colorful";
    }

    /* renamed from: a */
    public void m13721a() {
        Bitmap bitmap;
        RemoteViews remoteViews;
        boolean z;
        RemoteViews a;
        Drawable drawable;
        RemoteViews remoteViews2;
        if (mo29061b()) {
            super.mo29059a();
            Resources resources = mo29059a().getResources();
            String packageName = mo29059a().getPackageName();
            int a2 = mo29063a(resources, "icon", "id", packageName);
            if (this.f8007a == null) {
                mo29078a(a2);
            } else {
                mo29059a().setImageViewBitmap(a2, this.f8007a);
            }
            int a3 = mo29063a(resources, ScanBarcodeActivity.TITLE, "id", packageName);
            int a4 = mo29063a(resources, "content", "id", packageName);
            mo29059a().setTextViewText(a3, this.f8009a);
            mo29059a().setTextViewText(a4, this.f8015b);
            if (!TextUtils.isEmpty(this.f8005c)) {
                int a5 = mo29063a(resources, "buttonContainer", "id", packageName);
                int a6 = mo29063a(resources, "button", "id", packageName);
                int a7 = mo29063a(resources, "buttonBg", "id", packageName);
                mo29059a().setViewVisibility(a5, 0);
                mo29059a().setTextViewText(a6, this.f8005c);
                mo29059a().setOnClickPendingIntent(a5, this.f8001a);
                if (this.f8002b != 16777216) {
                    int a8 = mo29073a(70.0f);
                    int a9 = mo29073a(29.0f);
                    mo29059a().setImageViewBitmap(a7, C4874al.m15220a(m13715a(this.f8002b, a8, a9, ((float) a9) / 2.0f)));
                    mo29059a().setTextColor(a6, mo29078a(this.f8002b) ? -1 : ViewCompat.MEASURED_STATE_MASK);
                }
            }
            int a10 = mo29063a(resources, "bg", "id", packageName);
            int a11 = mo29063a(resources, "container", "id", packageName);
            if (this.f8000a != 16777216) {
                if (C4830m.m14998a(mo29059a()) >= 10) {
                    remoteViews2 = mo29059a();
                    drawable = m13715a(this.f8000a, 984, 192, 30.0f);
                } else {
                    remoteViews2 = mo29059a();
                    drawable = m13715a(this.f8000a, 984, 192, 0.0f);
                }
                remoteViews2.setImageViewBitmap(a10, C4874al.m15220a(drawable));
                a = mo29059a();
                z = mo29078a(this.f8000a);
            } else if (this.f8003b != null) {
                if (C4830m.m14998a(mo29059a()) >= 10) {
                    remoteViews = mo29059a();
                    bitmap = mo29074a(this.f8003b, 30.0f);
                } else {
                    remoteViews = mo29059a();
                    bitmap = this.f8003b;
                }
                remoteViews.setImageViewBitmap(a10, bitmap);
                Map<String, String> map = this.f8012a;
                if (map != null && this.f8004c == 16777216) {
                    mo29072c(map.get("notification_image_text_color"));
                }
                int i = this.f8004c;
                z = i == 16777216 || !mo29078a(i);
                a = mo29059a();
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    mo29059a().setViewVisibility(a2, 8);
                    mo29059a().setViewVisibility(a10, 8);
                    try {
                        C4554bk.m13012a((Object) this, "setStyle", C4994v.m15735a(mo29059a(), "android.app.Notification$DecoratedCustomViewStyle").getConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        C4408b.m12464a("load class DecoratedCustomViewStyle failed");
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.customHeight", true);
                addExtras(bundle);
                setCustomContentView(mo29059a());
                return;
            }
            m13716a(a, a11, a3, a4, z);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("miui.customHeight", true);
            addExtras(bundle2);
            setCustomContentView(mo29059a());
            return;
        }
        mo29061b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13722a() {
        if (!C4830m.m14997a()) {
            return false;
        }
        Resources resources = mo29059a().getResources();
        String packageName = mo29059a().getPackageName();
        return (mo29063a(resources, "icon", "id", packageName) == 0 || mo29063a(resources, ScanBarcodeActivity.TITLE, "id", packageName) == 0 || mo29063a(resources, "content", "id", packageName) == 0) ? false : true;
    }

    /* renamed from: b */
    public C4670er mo29071b(String str) {
        if (mo29061b() && !TextUtils.isEmpty(str)) {
            try {
                this.f8000a = Color.parseColor(str);
            } catch (Exception unused) {
                C4408b.m12464a("parse colorful notification bg color error");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo29061b() {
        return "notification_colorful_copy";
    }

    /* renamed from: c */
    public C4670er mo29072c(String str) {
        if (mo29061b() && !TextUtils.isEmpty(str)) {
            try {
                this.f8004c = Color.parseColor(str);
            } catch (Exception unused) {
                C4408b.m12464a("parse colorful notification image text color error");
            }
        }
        return this;
    }
}
