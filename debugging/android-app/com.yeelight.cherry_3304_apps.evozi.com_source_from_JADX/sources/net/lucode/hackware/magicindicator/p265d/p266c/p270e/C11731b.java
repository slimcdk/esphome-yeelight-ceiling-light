package net.lucode.hackware.magicindicator.p265d.p266c.p270e;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import net.lucode.hackware.magicindicator.p265d.C11721b;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11725b;

/* renamed from: net.lucode.hackware.magicindicator.d.c.e.b */
public class C11731b extends TextView implements C11725b {

    /* renamed from: a */
    protected int f23102a;

    /* renamed from: b */
    protected int f23103b;

    public C11731b(Context context) {
        super(context, (AttributeSet) null);
        m30452e(context);
    }

    /* renamed from: e */
    private void m30452e(Context context) {
        setGravity(17);
        int a = C11721b.m30419a(context, 10.0d);
        setPadding(a, 0, a, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    public void mo36859a(int i, int i2) {
        setTextColor(this.f23103b);
    }

    /* renamed from: b */
    public void mo36860b(int i, int i2, float f, boolean z) {
    }

    /* renamed from: c */
    public void mo36861c(int i, int i2) {
        setTextColor(this.f23102a);
    }

    /* renamed from: d */
    public void mo36862d(int i, int i2, float f, boolean z) {
    }

    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((float) (getHeight() / 2)) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getContentLeft() {
        Rect rect = new Rect();
        getPaint().getTextBounds(getText().toString(), 0, getText().length(), rect);
        return (getLeft() + (getWidth() / 2)) - (rect.width() / 2);
    }

    public int getContentRight() {
        Rect rect = new Rect();
        getPaint().getTextBounds(getText().toString(), 0, getText().length(), rect);
        return getLeft() + (getWidth() / 2) + (rect.width() / 2);
    }

    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) (((float) (getHeight() / 2)) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getNormalColor() {
        return this.f23103b;
    }

    public int getSelectedColor() {
        return this.f23102a;
    }

    public void setNormalColor(int i) {
        this.f23103b = i;
    }

    public void setSelectedColor(int i) {
        this.f23102a = i;
    }
}
