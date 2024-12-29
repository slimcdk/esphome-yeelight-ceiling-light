package com.yeelight.yeelib.p191j.p192a;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.j.a.d */
public class C9902d extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private WheelPicker f18007a;

    /* renamed from: b */
    private WheelPicker f18008b;

    /* renamed from: c */
    private View.OnClickListener f18009c;

    /* renamed from: d */
    private C9903a f18010d;

    /* renamed from: e */
    private List<Integer> f18011e;

    /* renamed from: f */
    private List<Integer> f18012f;

    /* renamed from: com.yeelight.yeelib.j.a.d$a */
    public interface C9903a {
        /* renamed from: a */
        void mo32019a(long j);
    }

    public C9902d(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        m24288c(context);
    }

    /* renamed from: a */
    private List<Integer> m24286a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        return arrayList;
    }

    /* renamed from: b */
    private List<Integer> m24287b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        return arrayList;
    }

    /* renamed from: c */
    private void m24288c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.dialog_light_gradient_duration, (ViewGroup) null);
        this.f18007a = (WheelPicker) inflate.findViewById(R$id.second_picker_view);
        this.f18008b = (WheelPicker) inflate.findViewById(R$id.millsecond_picker_view);
        this.f18011e = m24287b();
        this.f18012f = m24286a();
        this.f18007a.setData(this.f18011e);
        this.f18008b.setData(this.f18012f);
        this.f18007a.mo33217l(2, false);
        inflate.findViewById(R$id.tv_cancle).setOnClickListener(this);
        inflate.findViewById(R$id.tv_confirm).setOnClickListener(this);
        setContentView(inflate);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(R$style.alarm_popup_window_animation_style);
            window.setLayout(-1, -2);
        }
    }

    /* renamed from: d */
    public void mo32017d(C9903a aVar) {
        this.f18010d = aVar;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.tv_cancle) {
            dismiss();
            View.OnClickListener onClickListener = this.f18009c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (id == R$id.tv_confirm) {
            int intValue = this.f18011e.get(this.f18007a.getCurrentItemPosition()).intValue();
            int intValue2 = this.f18012f.get(this.f18008b.getCurrentItemPosition()).intValue();
            dismiss();
            C9903a aVar = this.f18010d;
            if (aVar != null) {
                aVar.mo32019a((long) ((intValue * 1000) + intValue2));
            }
        }
    }
}
