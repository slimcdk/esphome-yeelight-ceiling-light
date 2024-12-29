package p175j5;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import p151e5.C8999b;
import p161g5.C9081b;

/* renamed from: j5.b */
public class C9213b extends TextView implements C9081b {

    /* renamed from: a */
    protected int f17047a;

    /* renamed from: b */
    protected int f17048b;

    public C9213b(Context context) {
        super(context, (AttributeSet) null);
        m22234e(context);
    }

    /* renamed from: e */
    private void m22234e(Context context) {
        setGravity(17);
        int a = C8999b.m21447a(context, 10.0d);
        setPadding(a, 0, a, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    public void mo37045a(int i, int i2) {
        setTextColor(this.f17048b);
    }

    /* renamed from: b */
    public void mo37046b(int i, int i2, float f, boolean z) {
    }

    /* renamed from: c */
    public void mo37047c(int i, int i2) {
        setTextColor(this.f17047a);
    }

    /* renamed from: d */
    public void mo37048d(int i, int i2, float f, boolean z) {
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
        return this.f17048b;
    }

    public int getSelectedColor() {
        return this.f17047a;
    }

    public void setNormalColor(int i) {
        this.f17048b = i;
    }

    public void setSelectedColor(int i) {
        this.f17047a = i;
    }
}
