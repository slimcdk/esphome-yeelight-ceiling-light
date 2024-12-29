package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RoundDotView extends View {

    /* renamed from: a */
    private Paint f6612a;

    /* renamed from: b */
    private float f6613b;

    /* renamed from: c */
    private int f6614c;

    /* renamed from: d */
    private int f6615d;

    public RoundDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6613b = 15.0f;
        this.f6614c = 7;
        m10545a();
    }

    /* renamed from: a */
    private void m10545a() {
        Paint paint = new Paint();
        this.f6612a = paint;
        paint.setAntiAlias(true);
        this.f6612a.setColor(Color.rgb(114, 114, 114));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a0, code lost:
        r3 = r3 / 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a2, code lost:
        r2 = r2 - (r3 * 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a5, code lost:
        r7.drawCircle((float) r2, (float) (getMeasuredHeight() / 2), r6.f6613b, r6.f6612a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        r3 = r3 / 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        r2 = r2 + (r3 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.onDraw(r7)
            int r0 = r6.getMeasuredWidth()
            int r1 = r6.f6614c
            int r0 = r0 / r1
            int r0 = r0 + -10
            r1 = 0
        L_0x000d:
            int r2 = r6.f6614c
            if (r1 >= r2) goto L_0x00b8
            r2 = 145(0x91, float:2.03E-43)
            r3 = 105(0x69, float:1.47E-43)
            r4 = 35
            switch(r1) {
                case 0: goto L_0x008e;
                case 1: goto L_0x007b;
                case 2: goto L_0x0068;
                case 3: goto L_0x005a;
                case 4: goto L_0x0044;
                case 5: goto L_0x002f;
                case 6: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x00b4
        L_0x001c:
            android.graphics.Paint r2 = r6.f6612a
            r2.setAlpha(r4)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 3
            int r2 = r2 + r3
            int r3 = r0 * 3
            goto L_0x0041
        L_0x002f:
            android.graphics.Paint r2 = r6.f6612a
            r2.setAlpha(r3)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 2
            int r2 = r2 + r3
            int r3 = r0 * 2
        L_0x0041:
            int r3 = r3 / 3
            goto L_0x0056
        L_0x0044:
            android.graphics.Paint r3 = r6.f6612a
            r3.setAlpha(r2)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 1
            int r2 = r2 + r3
            int r3 = r0 / 3
        L_0x0056:
            int r3 = r3 * 2
            int r2 = r2 + r3
            goto L_0x00a5
        L_0x005a:
            android.graphics.Paint r2 = r6.f6612a
            r3 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r3)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            goto L_0x00a5
        L_0x0068:
            android.graphics.Paint r3 = r6.f6612a
            r3.setAlpha(r2)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 1
            int r2 = r2 - r3
            int r3 = r0 / 3
            goto L_0x00a2
        L_0x007b:
            android.graphics.Paint r2 = r6.f6612a
            r2.setAlpha(r3)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 2
            int r2 = r2 - r3
            int r3 = r0 * 2
            goto L_0x00a0
        L_0x008e:
            android.graphics.Paint r2 = r6.f6612a
            r2.setAlpha(r4)
            int r2 = r6.getMeasuredWidth()
            int r2 = r2 / 2
            int r3 = r6.f6615d
            int r3 = r3 * 3
            int r2 = r2 - r3
            int r3 = r0 * 3
        L_0x00a0:
            int r3 = r3 / 3
        L_0x00a2:
            int r3 = r3 * 2
            int r2 = r2 - r3
        L_0x00a5:
            float r2 = (float) r2
            int r3 = r6.getMeasuredHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            float r4 = r6.f6613b
            android.graphics.Paint r5 = r6.f6612a
            r7.drawCircle(r2, r3, r4, r5)
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.header.bezierlayout.RoundDotView.onDraw(android.graphics.Canvas):void");
    }

    public void setCir_x(int i) {
        this.f6615d = i;
    }
}
