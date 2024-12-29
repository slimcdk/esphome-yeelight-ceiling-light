package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.p142ui.activity.ColorflowModeActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.PhotoColorView */
public class PhotoColorView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f16065a;

    /* renamed from: b */
    private Bitmap f16066b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C8873b> f16067c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8873b f16068d;

    /* renamed from: e */
    private ColorflowModeActivity.C8384e f16069e;

    /* renamed from: com.yeelight.yeelib.ui.view.PhotoColorView$a */
    public class C8855a implements View.OnTouchListener {
        public C8855a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C8873b bVar = (C8873b) view;
            if (motionEvent.getAction() == 2) {
                if (!bVar.isSelected()) {
                    for (C8873b selected : PhotoColorView.this.f16067c) {
                        selected.setSelected(false);
                    }
                    C8873b unused = PhotoColorView.this.f16068d = bVar;
                    PhotoColorView.this.f16068d.setSelected(true);
                }
                int[] iArr = new int[2];
                PhotoColorView.this.getLocationOnScreen(iArr);
                int rawX = ((int) motionEvent.getRawX()) - iArr[0];
                int rawY = ((int) motionEvent.getRawY()) - iArr[1];
                if (rawX < bVar.getWidth() / 2) {
                    rawX = bVar.getWidth() / 2;
                }
                if (rawX >= PhotoColorView.this.getWidth() - (bVar.getWidth() / 2)) {
                    rawX = PhotoColorView.this.getWidth() - (bVar.getWidth() / 2);
                }
                if (rawY < bVar.getHeight()) {
                    rawY = bVar.getHeight();
                }
                if (rawY >= PhotoColorView.this.getHeight()) {
                    rawY = PhotoColorView.this.getHeight() - 1;
                }
                bVar.setInParentX(((float) rawX) / ((float) PhotoColorView.this.getWidth()));
                bVar.setInParentY(((float) rawY) / ((float) PhotoColorView.this.getHeight()));
                PhotoColorView.this.mo36479h();
            }
            return true;
        }
    }

    static {
        Class<PhotoColorView> cls = PhotoColorView.class;
    }

    public PhotoColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21081g();
    }

    /* renamed from: g */
    private void m21081g() {
        setWillNotDraw(false);
        this.f16065a = new ImageView(getContext());
        this.f16067c = new ArrayList();
        this.f16065a.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f16065a, new RelativeLayout.LayoutParams(-1, -1));
        mo36475d(0.25f, 0.5f, false);
        mo36475d(0.75f, 0.5f, false);
    }

    /* renamed from: d */
    public boolean mo36475d(float f, float f2, boolean z) {
        if (this.f16067c.size() >= 4) {
            return false;
        }
        C8873b bVar = new C8873b(getContext());
        addView(bVar);
        bVar.setOnTouchListener(new C8855a());
        bVar.setInParentX(f);
        bVar.setInParentY(f2);
        if (z) {
            for (C8873b selected : this.f16067c) {
                selected.setSelected(false);
            }
            this.f16068d = bVar;
            bVar.setSelected(true);
        }
        this.f16067c.add(bVar);
        mo36479h();
        return true;
    }

    /* renamed from: e */
    public boolean mo36476e(boolean z) {
        return mo36475d(0.5f, 0.5f, z);
    }

    /* renamed from: f */
    public boolean mo36477f() {
        if (this.f16067c.size() <= 2) {
            return false;
        }
        this.f16067c.remove(this.f16068d);
        removeView(this.f16068d);
        List<C8873b> list = this.f16067c;
        C8873b bVar = list.get(list.size() - 1);
        this.f16068d = bVar;
        bVar.setSelected(true);
        return true;
    }

    public int[] getColors() {
        int[] iArr = new int[this.f16067c.size()];
        for (int i = 0; i < this.f16067c.size(); i++) {
            iArr[i] = this.f16067c.get(i).getColor();
        }
        return iArr;
    }

    /* renamed from: h */
    public void mo36479h() {
        Bitmap bitmap;
        ColorflowModeActivity.C8384e eVar;
        if (getWidth() != 0 && getHeight() != 0 && (bitmap = this.f16066b) != null && !bitmap.isRecycled()) {
            for (C8873b next : this.f16067c) {
                float c = next.mo36545c(getWidth());
                float d = next.mo36546d(getHeight());
                int pixel = this.f16066b.getPixel((int) (((float) this.f16066b.getWidth()) * next.getInParentX()), (int) (((float) this.f16066b.getHeight()) * next.getInParentY()));
                next.setX(c);
                next.setY(d);
                next.setColor(pixel);
                if (next.isSelected() && (eVar = this.f16069e) != null) {
                    eVar.mo35679a(next.getColor());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo36479h();
    }

    public void setColorChangedListener(ColorflowModeActivity.C8384e eVar) {
        this.f16069e = eVar;
    }

    public void setContentBitmap(Bitmap bitmap) {
        this.f16065a.setImageBitmap(bitmap);
        Bitmap bitmap2 = this.f16066b;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f16066b.recycle();
            this.f16066b = null;
        }
        this.f16066b = bitmap;
        mo36479h();
    }
}
