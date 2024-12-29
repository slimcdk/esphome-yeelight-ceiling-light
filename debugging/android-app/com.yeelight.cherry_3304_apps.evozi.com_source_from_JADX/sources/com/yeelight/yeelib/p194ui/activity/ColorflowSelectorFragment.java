package com.yeelight.yeelib.p194ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p194ui.activity.ColorflowModeActivity;
import com.yeelight.yeelib.p194ui.view.CircleView;
import com.yeelight.yeelib.p194ui.view.ColorSelectView;

/* renamed from: com.yeelight.yeelib.ui.activity.ColorflowSelectorFragment */
public class ColorflowSelectorFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private ColorSelectView f18178a;

    /* renamed from: b */
    private CircleView f18179b;

    /* renamed from: c */
    private CircleView f18180c;

    /* renamed from: d */
    private CircleView f18181d;

    /* renamed from: e */
    private CircleView f18182e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public CircleView f18183f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f18184g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int[] f18185h = new int[4];

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowSelectorFragment$a */
    class C9968a implements ColorflowModeActivity.C9967e {
        C9968a() {
        }

        /* renamed from: a */
        public void mo32221a(int i) {
            if (ColorflowSelectorFragment.this.f18183f != null) {
                ColorflowSelectorFragment.this.f18183f.setColor(i);
            }
            ColorflowSelectorFragment.this.f18185h[ColorflowSelectorFragment.this.f18184g] = i;
            ((ColorflowModeActivity) ColorflowSelectorFragment.this.getActivity()).mo32216b0(i);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.color1) {
            this.f18184g = 0;
            CircleView circleView = this.f18179b;
            this.f18183f = circleView;
            circleView.setIsCurrent(true);
            this.f18180c.setIsCurrent(false);
            this.f18181d.setIsCurrent(false);
            this.f18182e.setIsCurrent(false);
        }
        if (id == R$id.color2) {
            this.f18184g = 1;
            this.f18183f = this.f18180c;
            this.f18179b.setIsCurrent(false);
            this.f18180c.setIsCurrent(true);
            this.f18181d.setIsCurrent(false);
            this.f18182e.setIsCurrent(false);
        }
        if (id == R$id.color3) {
            this.f18184g = 2;
            this.f18183f = this.f18181d;
            this.f18179b.setIsCurrent(false);
            this.f18180c.setIsCurrent(false);
            this.f18181d.setIsCurrent(true);
            this.f18182e.setIsCurrent(false);
        }
        if (id == R$id.color4) {
            this.f18184g = 3;
            this.f18183f = this.f18182e;
            this.f18179b.setIsCurrent(false);
            this.f18180c.setIsCurrent(false);
            this.f18181d.setIsCurrent(false);
            this.f18182e.setIsCurrent(true);
        }
        this.f18178a.setColor(this.f18185h[this.f18184g]);
        ((ColorflowModeActivity) getActivity()).mo32216b0(this.f18185h[this.f18184g]);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_colorflow_color_select, viewGroup, false);
        ColorSelectView colorSelectView = (ColorSelectView) inflate.findViewById(R$id.colorselect);
        this.f18178a = colorSelectView;
        colorSelectView.setColorChangedListener(new C9968a());
        this.f18179b = (CircleView) inflate.findViewById(R$id.color1);
        this.f18180c = (CircleView) inflate.findViewById(R$id.color2);
        this.f18181d = (CircleView) inflate.findViewById(R$id.color3);
        this.f18182e = (CircleView) inflate.findViewById(R$id.color4);
        this.f18179b.setColor(Color.rgb(33, 199, 202));
        this.f18180c.setColor(Color.rgb(185, 72, 201));
        this.f18181d.setColor(Color.rgb(219, 37, 109));
        this.f18182e.setColor(Color.rgb(120, 230, 45));
        this.f18185h[0] = Color.rgb(33, 199, 202);
        this.f18185h[1] = Color.rgb(185, 72, 201);
        this.f18185h[2] = Color.rgb(219, 37, 109);
        this.f18185h[3] = Color.rgb(120, 230, 45);
        this.f18184g = 0;
        CircleView circleView = this.f18179b;
        this.f18183f = circleView;
        circleView.setIsCurrent(true);
        this.f18179b.setOnClickListener(this);
        this.f18180c.setOnClickListener(this);
        this.f18181d.setOnClickListener(this);
        this.f18182e.setOnClickListener(this);
        this.f18178a.setColor(this.f18185h[this.f18184g]);
        return inflate;
    }

    public void onResume() {
        ((ColorflowModeActivity) getActivity()).mo32216b0(this.f18185h[this.f18184g]);
        super.onResume();
    }

    /* renamed from: u */
    public int[] mo32223u() {
        return this.f18185h;
    }
}
