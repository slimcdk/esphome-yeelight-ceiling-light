package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.p194ui.activity.ColorflowModeActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.PhotoColorView */
public class PhotoColorView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f19807a;

    /* renamed from: b */
    private Bitmap f19808b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C10497c> f19809c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10497c f19810d;

    /* renamed from: e */
    private ColorflowModeActivity.C9967e f19811e;

    /* renamed from: com.yeelight.yeelib.ui.view.PhotoColorView$a */
    public class C10478a implements View.OnTouchListener {
        public C10478a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C10497c cVar = (C10497c) view;
            if (motionEvent.getAction() == 2) {
                if (!cVar.isSelected()) {
                    for (C10497c selected : PhotoColorView.this.f19809c) {
                        selected.setSelected(false);
                    }
                    C10497c unused = PhotoColorView.this.f19810d = cVar;
                    PhotoColorView.this.f19810d.setSelected(true);
                }
                int[] iArr = new int[2];
                PhotoColorView.this.getLocationOnScreen(iArr);
                int rawX = ((int) motionEvent.getRawX()) - iArr[0];
                int rawY = ((int) motionEvent.getRawY()) - iArr[1];
                if (rawX < cVar.getWidth() / 2) {
                    rawX = cVar.getWidth() / 2;
                }
                if (rawX >= PhotoColorView.this.getWidth() - (cVar.getWidth() / 2)) {
                    rawX = PhotoColorView.this.getWidth() - (cVar.getWidth() / 2);
                }
                if (rawY < cVar.getHeight()) {
                    rawY = cVar.getHeight();
                }
                if (rawY >= PhotoColorView.this.getHeight()) {
                    rawY = PhotoColorView.this.getHeight() - 1;
                }
                cVar.setInParentX(((float) rawX) / ((float) PhotoColorView.this.getWidth()));
                cVar.setInParentY(((float) rawY) / ((float) PhotoColorView.this.getHeight()));
                PhotoColorView.this.mo33110h();
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
        m25467g();
    }

    /* renamed from: g */
    private void m25467g() {
        setWillNotDraw(false);
        this.f19807a = new ImageView(getContext());
        this.f19809c = new ArrayList();
        this.f19807a.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f19807a, new RelativeLayout.LayoutParams(-1, -1));
        mo33106d(0.25f, 0.5f, false);
        mo33106d(0.75f, 0.5f, false);
    }

    /* renamed from: d */
    public boolean mo33106d(float f, float f2, boolean z) {
        if (this.f19809c.size() >= 4) {
            return false;
        }
        C10497c cVar = new C10497c(getContext());
        addView(cVar);
        cVar.setOnTouchListener(new C10478a());
        cVar.setInParentX(f);
        cVar.setInParentY(f2);
        if (z) {
            for (C10497c selected : this.f19809c) {
                selected.setSelected(false);
            }
            this.f19810d = cVar;
            cVar.setSelected(true);
        }
        this.f19809c.add(cVar);
        mo33110h();
        return true;
    }

    /* renamed from: e */
    public boolean mo33107e(boolean z) {
        return mo33106d(0.5f, 0.5f, z);
    }

    /* renamed from: f */
    public boolean mo33108f() {
        if (this.f19809c.size() <= 2) {
            return false;
        }
        this.f19809c.remove(this.f19810d);
        removeView(this.f19810d);
        List<C10497c> list = this.f19809c;
        C10497c cVar = list.get(list.size() - 1);
        this.f19810d = cVar;
        cVar.setSelected(true);
        return true;
    }

    public int[] getColors() {
        int[] iArr = new int[this.f19809c.size()];
        for (int i = 0; i < this.f19809c.size(); i++) {
            iArr[i] = this.f19809c.get(i).getColor();
        }
        return iArr;
    }

    /* renamed from: h */
    public void mo33110h() {
        Bitmap bitmap;
        ColorflowModeActivity.C9967e eVar;
        if (getWidth() != 0 && getHeight() != 0 && (bitmap = this.f19808b) != null && !bitmap.isRecycled()) {
            for (C10497c next : this.f19809c) {
                float c = next.mo33177c(getWidth());
                float d = next.mo33178d(getHeight());
                int pixel = this.f19808b.getPixel((int) (((float) this.f19808b.getWidth()) * next.getInParentX()), (int) (((float) this.f19808b.getHeight()) * next.getInParentY()));
                next.setX(c);
                next.setY(d);
                next.setColor(pixel);
                if (next.isSelected() && (eVar = this.f19811e) != null) {
                    eVar.mo32221a(next.getColor());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo33110h();
    }

    public void setColorChangedListener(ColorflowModeActivity.C9967e eVar) {
        this.f19811e = eVar;
    }

    public void setContentBitmap(Bitmap bitmap) {
        this.f19807a.setImageBitmap(bitmap);
        Bitmap bitmap2 = this.f19808b;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f19808b.recycle();
            this.f19808b = null;
        }
        this.f19808b = bitmap;
        mo33110h();
    }
}
