package com.yeelight.cherry.p141ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.yeelight.cherry.C12224R$drawable;
import java.util.ArrayList;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.view.BottomTabView */
public class BottomTabView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private int f12174a;

    /* renamed from: b */
    private CheckedTextView f12175b;

    /* renamed from: c */
    private CheckedTextView f12176c;

    /* renamed from: d */
    private CheckedTextView f12177d;

    /* renamed from: e */
    ArrayList<String> f12178e;

    /* renamed from: f */
    private C6022a f12179f;

    /* renamed from: com.yeelight.cherry.ui.view.BottomTabView$a */
    public interface C6022a {
        /* renamed from: b */
        void mo30598b(int i);
    }

    static {
        Class<BottomTabView> cls = BottomTabView.class;
    }

    public BottomTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo31356d(context, attributeSet);
    }

    /* renamed from: a */
    private CheckedTextView m17521a(int i, String str, int i2) {
        CheckedTextView checkedTextView = new CheckedTextView(getContext());
        Drawable drawable = getResources().getDrawable(i);
        int b = C9193k.m22151b(getContext(), 24.0f);
        drawable.setBounds(0, 0, b, b);
        checkedTextView.setText(str);
        checkedTextView.setTextColor(getResources().getColor(2131099838));
        checkedTextView.setTextSize(2, 12.0f);
        checkedTextView.setGravity(1);
        checkedTextView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        checkedTextView.setLayoutParams(new LinearLayout.LayoutParams(this.f12174a / 3, -2));
        checkedTextView.setTextAlignment(4);
        checkedTextView.setId(i2);
        return checkedTextView;
    }

    /* renamed from: b */
    private void m17522b() {
        m17523c();
        m17524g();
    }

    /* renamed from: c */
    private void m17523c() {
        removeAllViews();
        this.f12175b = m17521a(C12224R$drawable.bottom_tab_scene, this.f12178e.get(0), 0);
        this.f12176c = m17521a(C12224R$drawable.bottom_tab_room, this.f12178e.get(1), 1);
        this.f12177d = m17521a(C12224R$drawable.bottom_tab_device, this.f12178e.get(2), 2);
        addView(this.f12175b);
        addView(this.f12176c);
        addView(this.f12177d);
    }

    /* renamed from: g */
    private void m17524g() {
        this.f12175b.setClickable(true);
        this.f12176c.setClickable(true);
        this.f12177d.setClickable(true);
        this.f12175b.setOnClickListener(this);
        this.f12176c.setOnClickListener(this);
        this.f12177d.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31356d(Context context, AttributeSet attributeSet) {
        this.f12174a = getContext().getResources().getDisplayMetrics().widthPixels;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f12178e = arrayList;
        arrayList.add(context.getString(2131755737));
        this.f12178e.add(context.getString(2131755736));
        this.f12178e.add(context.getString(2131755735));
        m17522b();
    }

    /* renamed from: e */
    public void mo31357e(int i) {
        C6022a aVar = this.f12179f;
        if (aVar != null) {
            aVar.mo30598b(i);
        }
    }

    /* renamed from: f */
    public void mo31358f(C6022a aVar) {
        this.f12179f = aVar;
    }

    /* renamed from: h */
    public void mo31359h() {
        this.f12179f = null;
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
            mo31357e(0);
            this.f12175b.setChecked(true);
            this.f12176c.setChecked(false);
            this.f12177d.setChecked(false);
            this.f12175b.setTextColor(getResources().getColor(2131099805));
            checkedTextView2 = this.f12176c;
        } else if (i == 1) {
            mo31357e(1);
            this.f12175b.setChecked(false);
            this.f12176c.setChecked(true);
            this.f12177d.setChecked(false);
            this.f12176c.setTextColor(getResources().getColor(2131099805));
            checkedTextView2 = this.f12175b;
        } else if (i == 2) {
            mo31357e(2);
            this.f12175b.setChecked(false);
            this.f12176c.setChecked(false);
            this.f12177d.setChecked(true);
            this.f12177d.setTextColor(getResources().getColor(2131099805));
            this.f12176c.setTextColor(getResources().getColor(2131099838));
            checkedTextView = this.f12175b;
            checkedTextView.setTextColor(getResources().getColor(2131099838));
        } else {
            return;
        }
        checkedTextView2.setTextColor(getResources().getColor(2131099838));
        checkedTextView = this.f12177d;
        checkedTextView.setTextColor(getResources().getColor(2131099838));
    }
}
