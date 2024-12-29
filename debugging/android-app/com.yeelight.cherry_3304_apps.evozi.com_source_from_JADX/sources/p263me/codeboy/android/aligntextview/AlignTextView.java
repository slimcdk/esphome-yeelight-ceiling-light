package p263me.codeboy.android.aligntextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p271io.IOUtils;

/* renamed from: me.codeboy.android.aligntextview.AlignTextView */
public class AlignTextView extends TextView {

    /* renamed from: a */
    private float f23007a;

    /* renamed from: b */
    private float f23008b = 0.0f;

    /* renamed from: c */
    private int f23009c;

    /* renamed from: d */
    private List<String> f23010d = new ArrayList();

    /* renamed from: e */
    private List<Integer> f23011e = new ArrayList();

    /* renamed from: f */
    private C11585a f23012f = C11585a.ALIGN_LEFT;

    /* renamed from: g */
    private boolean f23013g = true;

    /* renamed from: h */
    private float f23014h = 1.0f;

    /* renamed from: i */
    private float f23015i = 0.0f;

    /* renamed from: j */
    private int f23016j = 0;

    /* renamed from: k */
    private int f23017k = 0;

    /* renamed from: l */
    private int f23018l = 0;

    /* renamed from: m */
    private boolean f23019m = false;

    /* renamed from: me.codeboy.android.aligntextview.AlignTextView$a */
    public enum C11585a {
        ALIGN_LEFT,
        ALIGN_CENTER,
        ALIGN_RIGHT
    }

    public AlignTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextIsSelectable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843287, 16843288});
        this.f23015i = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f23014h = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f23018l = getPaddingBottom();
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.AlignTextView);
        int i = obtainStyledAttributes2.getInt(R$styleable.AlignTextView_align, 0);
        this.f23012f = i != 1 ? i != 2 ? C11585a.ALIGN_LEFT : C11585a.ALIGN_RIGHT : C11585a.ALIGN_CENTER;
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    private void m30384a(Paint paint, String str) {
        List list;
        Object valueOf;
        if (str.length() == 0) {
            list = this.f23010d;
            valueOf = IOUtils.LINE_SEPARATOR_UNIX;
        } else {
            int measureText = (int) (((float) this.f23009c) / paint.measureText("中"));
            int i = measureText + 1;
            int i2 = 0;
            StringBuilder sb = new StringBuilder(str.substring(0, Math.min(i, str.length())));
            while (true) {
                if (i >= str.length()) {
                    break;
                }
                if (paint.measureText(str.substring(i2, i + 1)) > ((float) this.f23009c)) {
                    this.f23010d.add(sb.toString());
                    sb = new StringBuilder();
                    if (str.length() - i <= measureText) {
                        this.f23010d.add(str.substring(i));
                        break;
                    }
                    int i3 = i + measureText;
                    sb.append(str.substring(i, i3));
                    i2 = i;
                    i = i3 - 1;
                } else {
                    sb.append(str.charAt(i));
                }
                i++;
            }
            if (sb.length() > 0) {
                this.f23010d.add(sb.toString());
            }
            list = this.f23011e;
            valueOf = Integer.valueOf(this.f23010d.size() - 1);
        }
        list.add(valueOf);
    }

    /* renamed from: b */
    private void m30385b(String str, float f, int i) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(0, f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f23017k = textView.getLineCount();
        this.f23016j = textView.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0090, code lost:
        if (r14 == p263me.codeboy.android.aligntextview.AlignTextView.C11585a.f23022c) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            android.text.TextPaint r1 = r16.getPaint()
            int r2 = r16.getCurrentTextColor()
            r1.setColor(r2)
            int[] r2 = r16.getDrawableState()
            r1.drawableState = r2
            int r2 = r16.getMeasuredWidth()
            r0.f23009c = r2
            android.graphics.Paint$FontMetrics r2 = r1.getFontMetrics()
            float r3 = r16.getTextSize()
            float r4 = r2.bottom
            float r5 = r2.descent
            float r4 = r4 - r5
            float r5 = r2.ascent
            float r4 = r4 + r5
            float r2 = r2.top
            float r4 = r4 - r2
            float r3 = r3 - r4
            int r2 = r16.getGravity()
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 != 0) goto L_0x003c
            float r2 = r0.f23007a
            float r2 = r2 - r3
            float r2 = r2 / r4
            float r3 = r3 + r2
        L_0x003c:
            int r2 = r16.getPaddingTop()
            int r5 = r16.getPaddingLeft()
            int r6 = r16.getPaddingRight()
            int r7 = r0.f23009c
            int r7 = r7 - r5
            int r7 = r7 - r6
            r0.f23009c = r7
            r6 = 0
            r7 = 0
        L_0x0050:
            java.util.List<java.lang.String> r8 = r0.f23010d
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x00c6
            float r8 = (float) r7
            float r9 = r0.f23007a
            float r9 = r9 * r8
            float r9 = r9 + r3
            java.util.List<java.lang.String> r10 = r0.f23010d
            java.lang.Object r10 = r10.get(r7)
            java.lang.String r10 = (java.lang.String) r10
            float r11 = (float) r5
            int r12 = r0.f23009c
            float r12 = (float) r12
            float r13 = r1.measureText(r10)
            float r12 = r12 - r13
            int r13 = r10.length()
            int r13 = r13 + -1
            float r13 = (float) r13
            float r13 = r12 / r13
            java.util.List<java.lang.Integer> r14 = r0.f23011e
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r14 = r14.contains(r15)
            if (r14 == 0) goto L_0x0093
            r13 = 0
            me.codeboy.android.aligntextview.AlignTextView$a r14 = r0.f23012f
            me.codeboy.android.aligntextview.AlignTextView$a r15 = p263me.codeboy.android.aligntextview.AlignTextView.C11585a.ALIGN_CENTER
            if (r14 != r15) goto L_0x008e
            float r12 = r12 / r4
        L_0x008c:
            float r11 = r11 + r12
            goto L_0x0093
        L_0x008e:
            me.codeboy.android.aligntextview.AlignTextView$a r15 = p263me.codeboy.android.aligntextview.AlignTextView.C11585a.ALIGN_RIGHT
            if (r14 != r15) goto L_0x0093
            goto L_0x008c
        L_0x0093:
            r12 = 0
        L_0x0094:
            int r14 = r10.length()
            if (r12 >= r14) goto L_0x00be
            java.lang.String r14 = r10.substring(r6, r12)
            float r14 = r1.measureText(r14)
            float r15 = (float) r12
            float r15 = r15 * r13
            float r14 = r14 + r15
            int r15 = r12 + 1
            java.lang.String r12 = r10.substring(r12, r15)
            float r14 = r14 + r11
            float r4 = (float) r2
            float r4 = r4 + r9
            float r6 = r0.f23008b
            float r6 = r6 * r8
            float r4 = r4 + r6
            r6 = r17
            r6.drawText(r12, r14, r4, r1)
            r12 = r15
            r4 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            goto L_0x0094
        L_0x00be:
            r6 = r17
            int r7 = r7 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            goto L_0x0050
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p263me.codeboy.android.aligntextview.AlignTextView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f23013g) {
            this.f23009c = getMeasuredWidth();
            String charSequence = getText().toString();
            TextPaint paint = getPaint();
            this.f23010d.clear();
            this.f23011e.clear();
            for (String a : charSequence.split("\\n")) {
                m30384a(paint, a);
            }
            m30385b(charSequence, paint.getTextSize(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            float f = (((float) this.f23016j) * 1.0f) / ((float) this.f23017k);
            this.f23007a = f;
            float f2 = ((this.f23014h - 1.0f) * f) + this.f23015i;
            this.f23008b = f2;
            int size = (int) ((f2 + f) * ((float) (this.f23010d.size() - this.f23017k)));
            this.f23019m = true;
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.f23018l + size);
            this.f23013g = false;
        }
    }

    public void setAlign(C11585a aVar) {
        this.f23012f = aVar;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (!this.f23019m) {
            this.f23018l = i4;
        }
        this.f23019m = false;
        super.setPadding(i, i2, i3, i4);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f23013g = true;
        super.setText(charSequence, bufferType);
    }
}
