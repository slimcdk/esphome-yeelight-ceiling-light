package com.yeelight.yeelib.p142ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.activity.ColorflowModeActivity;
import com.yeelight.yeelib.p142ui.view.CircleView;
import com.yeelight.yeelib.p142ui.view.ColorSelectView;

/* renamed from: com.yeelight.yeelib.ui.activity.ColorflowSelectorFragment */
public class ColorflowSelectorFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private ColorSelectView f14484a;

    /* renamed from: b */
    private CircleView f14485b;

    /* renamed from: c */
    private CircleView f14486c;

    /* renamed from: d */
    private CircleView f14487d;

    /* renamed from: e */
    private CircleView f14488e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CircleView f14489f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f14490g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f14491h = new int[4];

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowSelectorFragment$a */
    class C8385a implements ColorflowModeActivity.C8384e {
        C8385a() {
        }

        /* renamed from: a */
        public void mo35679a(int i) {
            if (ColorflowSelectorFragment.this.f14489f != null) {
                ColorflowSelectorFragment.this.f14489f.setColor(i);
            }
            ColorflowSelectorFragment.this.f14491h[ColorflowSelectorFragment.this.f14490g] = i;
            ((ColorflowModeActivity) ColorflowSelectorFragment.this.getActivity()).mo35674b0(i);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.color1) {
            this.f14490g = 0;
            CircleView circleView = this.f14485b;
            this.f14489f = circleView;
            circleView.setIsCurrent(true);
            this.f14486c.setIsCurrent(false);
            this.f14487d.setIsCurrent(false);
            this.f14488e.setIsCurrent(false);
        }
        if (id == R$id.color2) {
            this.f14490g = 1;
            this.f14489f = this.f14486c;
            this.f14485b.setIsCurrent(false);
            this.f14486c.setIsCurrent(true);
            this.f14487d.setIsCurrent(false);
            this.f14488e.setIsCurrent(false);
        }
        if (id == R$id.color3) {
            this.f14490g = 2;
            this.f14489f = this.f14487d;
            this.f14485b.setIsCurrent(false);
            this.f14486c.setIsCurrent(false);
            this.f14487d.setIsCurrent(true);
            this.f14488e.setIsCurrent(false);
        }
        if (id == R$id.color4) {
            this.f14490g = 3;
            this.f14489f = this.f14488e;
            this.f14485b.setIsCurrent(false);
            this.f14486c.setIsCurrent(false);
            this.f14487d.setIsCurrent(false);
            this.f14488e.setIsCurrent(true);
        }
        this.f14484a.setColor(this.f14491h[this.f14490g]);
        ((ColorflowModeActivity) getActivity()).mo35674b0(this.f14491h[this.f14490g]);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_colorflow_color_select, viewGroup, false);
        ColorSelectView colorSelectView = (ColorSelectView) inflate.findViewById(R$id.colorselect);
        this.f14484a = colorSelectView;
        colorSelectView.setColorChangedListener(new C8385a());
        this.f14485b = (CircleView) inflate.findViewById(R$id.color1);
        this.f14486c = (CircleView) inflate.findViewById(R$id.color2);
        this.f14487d = (CircleView) inflate.findViewById(R$id.color3);
        this.f14488e = (CircleView) inflate.findViewById(R$id.color4);
        this.f14485b.setColor(Color.rgb(33, 199, 202));
        this.f14486c.setColor(Color.rgb(185, 72, 201));
        this.f14487d.setColor(Color.rgb(219, 37, 109));
        this.f14488e.setColor(Color.rgb(120, 230, 45));
        this.f14491h[0] = Color.rgb(33, 199, 202);
        this.f14491h[1] = Color.rgb(185, 72, 201);
        this.f14491h[2] = Color.rgb(219, 37, 109);
        this.f14491h[3] = Color.rgb(120, 230, 45);
        this.f14490g = 0;
        CircleView circleView = this.f14485b;
        this.f14489f = circleView;
        circleView.setIsCurrent(true);
        this.f14485b.setOnClickListener(this);
        this.f14486c.setOnClickListener(this);
        this.f14487d.setOnClickListener(this);
        this.f14488e.setOnClickListener(this);
        this.f14484a.setColor(this.f14491h[this.f14490g]);
        return inflate;
    }

    public void onResume() {
        ((ColorflowModeActivity) getActivity()).mo35674b0(this.f14491h[this.f14490g]);
        super.onResume();
    }

    /* renamed from: z */
    public int[] mo35681z() {
        return this.f14491h;
    }
}
