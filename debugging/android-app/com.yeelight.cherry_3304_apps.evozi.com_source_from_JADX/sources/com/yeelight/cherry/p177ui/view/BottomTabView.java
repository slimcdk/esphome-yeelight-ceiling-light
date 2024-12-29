package com.yeelight.cherry.p177ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.view.BottomTabView */
public class BottomTabView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private int f12579a;

    /* renamed from: b */
    private CheckedTextView f12580b;

    /* renamed from: c */
    private CheckedTextView f12581c;

    /* renamed from: d */
    private CheckedTextView f12582d;

    /* renamed from: e */
    ArrayList<String> f12583e;

    /* renamed from: f */
    private C5960a f12584f;

    /* renamed from: com.yeelight.cherry.ui.view.BottomTabView$a */
    public interface C5960a {
        /* renamed from: b */
        void mo26574b(int i);
    }

    static {
        Class<BottomTabView> cls = BottomTabView.class;
    }

    public BottomTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo27412d(context, attributeSet);
    }

    /* renamed from: a */
    private CheckedTextView m17448a(int i, String str, int i2) {
        CheckedTextView checkedTextView = new CheckedTextView(getContext());
        Drawable drawable = getResources().getDrawable(i);
        int b = C10547m.m25752b(getContext(), 24.0f);
        drawable.setBounds(0, 0, b, b);
        checkedTextView.setText(str);
        checkedTextView.setTextColor(getResources().getColor(2131099835));
        checkedTextView.setTextSize(2, 12.0f);
        checkedTextView.setGravity(1);
        checkedTextView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        checkedTextView.setLayoutParams(new LinearLayout.LayoutParams(this.f12579a / 3, -2));
        checkedTextView.setTextAlignment(4);
        checkedTextView.setId(i2);
        return checkedTextView;
    }

    /* renamed from: b */
    private void m17449b() {
        m17450c();
        m17451g();
    }

    /* renamed from: c */
    private void m17450c() {
        removeAllViews();
        this.f12580b = m17448a(C11744R$drawable.bottom_tab_scene, this.f12583e.get(0), 0);
        this.f12581c = m17448a(C11744R$drawable.bottom_tab_room, this.f12583e.get(1), 1);
        this.f12582d = m17448a(C11744R$drawable.bottom_tab_device, this.f12583e.get(2), 2);
        addView(this.f12580b);
        addView(this.f12581c);
        addView(this.f12582d);
    }

    /* renamed from: g */
    private void m17451g() {
        this.f12580b.setClickable(true);
        this.f12581c.setClickable(true);
        this.f12582d.setClickable(true);
        this.f12580b.setOnClickListener(this);
        this.f12581c.setOnClickListener(this);
        this.f12582d.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo27412d(Context context, AttributeSet attributeSet) {
        this.f12579a = getContext().getResources().getDisplayMetrics().widthPixels;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f12583e = arrayList;
        arrayList.add(context.getString(2131755728));
        this.f12583e.add(context.getString(2131755727));
        this.f12583e.add(context.getString(2131755726));
        m17449b();
    }

    /* renamed from: e */
    public void mo27413e(int i) {
        C5960a aVar = this.f12584f;
        if (aVar != null) {
            aVar.mo26574b(i);
        }
    }

    /* renamed from: f */
    public void mo27414f(C5960a aVar) {
        this.f12584f = aVar;
    }

    /* renamed from: h */
    public void mo27415h() {
        this.f12584f = null;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == 0) {
            setSelected(0);
        }
        if (id == 1) {
            setSelected(1);
        }
        if (id == 2) {
            setSelected(2);
        }
    }

    public void setSelected(int i) {
        CheckedTextView checkedTextView;
        CheckedTextView checkedTextView2;
        if (i == 0) {
            mo27413e(0);
            this.f12580b.setChecked(true);
            this.f12581c.setChecked(false);
            this.f12582d.setChecked(false);
            this.f12580b.setTextColor(getResources().getColor(2131099802));
            checkedTextView2 = this.f12581c;
        } else if (i == 1) {
            mo27413e(1);
            this.f12580b.setChecked(false);
            this.f12581c.setChecked(true);
            this.f12582d.setChecked(false);
            this.f12581c.setTextColor(getResources().getColor(2131099802));
            checkedTextView2 = this.f12580b;
        } else if (i == 2) {
            mo27413e(2);
            this.f12580b.setChecked(false);
            this.f12581c.setChecked(false);
            this.f12582d.setChecked(true);
            this.f12582d.setTextColor(getResources().getColor(2131099802));
            this.f12581c.setTextColor(getResources().getColor(2131099835));
            checkedTextView = this.f12580b;
            checkedTextView.setTextColor(getResources().getColor(2131099835));
        } else {
            return;
        }
        checkedTextView2.setTextColor(getResources().getColor(2131099835));
        checkedTextView = this.f12582d;
        checkedTextView.setTextColor(getResources().getColor(2131099835));
    }
}
