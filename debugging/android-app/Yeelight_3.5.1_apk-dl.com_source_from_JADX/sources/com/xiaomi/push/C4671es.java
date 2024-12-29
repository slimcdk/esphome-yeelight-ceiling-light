package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4874al;
import com.xiaomi.push.service.C4893ax;
import com.xiaomi.push.service.C4894ay;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.es */
public abstract class C4671es extends C4669eq {

    /* renamed from: a */
    private int f8006a;

    /* renamed from: a */
    protected Bitmap f8007a;

    /* renamed from: a */
    private RemoteViews f8008a;

    /* renamed from: a */
    protected CharSequence f8009a;

    /* renamed from: a */
    private String f8010a;

    /* renamed from: a */
    private ArrayList<Notification.Action> f8011a;

    /* renamed from: a */
    protected Map<String, String> f8012a;

    /* renamed from: a */
    private boolean f8013a;

    /* renamed from: b */
    private int f8014b;

    /* renamed from: b */
    protected CharSequence f8015b;

    /* renamed from: b */
    private boolean f8016b;

    public C4671es(Context context, int i, String str) {
        super(context);
        this.f8011a = new ArrayList<>();
        this.f8014b = 0;
        this.f8010a = str;
        this.f8006a = i;
        m13727c();
    }

    public C4671es(Context context, String str) {
        this(context, 0, str);
    }

    /* renamed from: a */
    private Bitmap mo29059a() {
        return C4874al.m15220a(C4747h.m14123a(mo29059a(), this.f8010a));
    }

    /* renamed from: c */
    private String m13727c() {
        boolean e = m13732e();
        this.f8016b = e;
        return e ? mo29061b() : mo29059a();
    }

    /* renamed from: c */
    private void m13728c() {
        int a = mo29063a(mo29059a().getResources(), m13727c(), "layout", mo29059a().getPackageName());
        if (a != 0) {
            this.f8008a = new RemoteViews(mo29059a().getPackageName(), a);
            this.f8013a = mo29059a();
            return;
        }
        C4408b.m12464a("create RemoteViews failed, no such layout resource was found");
    }

    /* renamed from: c */
    private boolean m13729c() {
        Map<String, String> map = this.f8012a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    /* renamed from: d */
    private void m13730d() {
        super.setContentTitle(this.f8009a);
        super.setContentText(this.f8015b);
    }

    /* renamed from: d */
    private boolean m13731d() {
        return !TextUtils.isEmpty(mo29061b()) && !TextUtils.isEmpty(this.f8010a);
    }

    /* renamed from: e */
    private boolean m13732e() {
        return m13730d() && m13733f();
    }

    /* renamed from: f */
    private boolean m13733f() {
        List<StatusBarNotification> b;
        if (Build.VERSION.SDK_INT >= 20 && (b = C4893ax.m15315a(mo29059a(), this.f8010a).mo29984b()) != null && !b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : b) {
                if (statusBarNotification.getId() == this.f8006a) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification == null) {
                        return false;
                    }
                    return !notification.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29073a(float f) {
        return (int) ((f * mo29059a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo29074a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    public final RemoteViews m13736a() {
        return this.f8008a;
    }

    /* renamed from: a */
    public C4669eq mo29066a(Map<String, String> map) {
        this.f8012a = map;
        return this;
    }

    /* renamed from: a */
    public C4671es addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    /* renamed from: a */
    public C4671es addAction(Notification.Action action) {
        if (action != null) {
            this.f8011a.add(action);
        }
        int i = this.f8014b;
        this.f8014b = i + 1;
        mo29079a(i, action);
        return this;
    }

    /* renamed from: a */
    public C4671es setLargeIcon(Bitmap bitmap) {
        this.f8007a = bitmap;
        return this;
    }

    /* renamed from: a */
    public C4671es setContentTitle(CharSequence charSequence) {
        this.f8009a = charSequence;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String m13742a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m13743a() {
        super.mo29059a();
        Bundle bundle = new Bundle();
        if (m13730d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f8016b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", mo29058a("large_icon"));
        if (this.f8011a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f8011a.size()];
            this.f8011a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m13727c() || !C4894ay.m15339a(mo29059a().getContentResolver())) {
            m13730d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f8009a);
            bundle.putCharSequence("mipush.customContent", this.f8015b);
        }
        addExtras(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29078a(int i) {
        Bitmap a = mo29059a();
        if (a != null) {
            mo29059a().setImageViewBitmap(i, a);
            return;
        }
        int b = C4747h.m14131b(mo29059a(), this.f8010a);
        if (b != 0) {
            mo29059a().setImageViewResource(i, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29079a(int i, Notification.Action action) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean m13746a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m13747a(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double d = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return d + (blue * 0.114d) < 192.0d;
    }

    /* renamed from: b */
    public C4671es setContentText(CharSequence charSequence) {
        this.f8015b = charSequence;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo29061b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void m13750b() {
        super.setContentTitle(this.f8009a);
        super.setContentText(this.f8015b);
        Bitmap bitmap = this.f8007a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean m13751b() {
        return this.f8013a;
    }
}
