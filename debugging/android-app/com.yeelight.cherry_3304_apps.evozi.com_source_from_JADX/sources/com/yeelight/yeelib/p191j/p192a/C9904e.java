package com.yeelight.yeelib.p191j.p192a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;

/* renamed from: com.yeelight.yeelib.j.a.e */
public class C9904e extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private ImageView f18013a;

    /* renamed from: b */
    private ImageView f18014b;

    /* renamed from: c */
    private WifiSpeakerService.C9665g f18015c;

    /* renamed from: d */
    private final Context f18016d;

    /* renamed from: e */
    private C9905a f18017e;

    /* renamed from: com.yeelight.yeelib.j.a.e$a */
    public interface C9905a {
        /* renamed from: a */
        void mo27029a(WifiSpeakerService.C9665g gVar);
    }

    public C9904e(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        this.f18016d = context;
        m24291a();
    }

    /* renamed from: a */
    private void m24291a() {
        View inflate = LayoutInflater.from(this.f18016d).inflate(R$layout.dialog_select_speaker_system, (ViewGroup) null);
        double d = (double) getContext().getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.781d);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(inflate);
        getWindow().setLayout(i, -2);
        getWindow().getDecorView().setBackground((Drawable) null);
        this.f18013a = (ImageView) findViewById(R$id.img_xiaoai);
        this.f18014b = (ImageView) findViewById(R$id.img_xiaobing);
        findViewById(R$id.ll_xiaoai).setOnClickListener(this);
        findViewById(R$id.ll_xiaobing).setOnClickListener(this);
        findViewById(R$id.btn_confirm).setOnClickListener(this);
        m24292c();
    }

    /* renamed from: c */
    private void m24292c() {
        ImageView imageView;
        int i;
        ImageView imageView2;
        int i2;
        WifiSpeakerService.C9665g gVar = this.f18015c;
        if (gVar == WifiSpeakerService.C9665g.mibrain) {
            imageView = this.f18013a;
            i = R$drawable.icon_yeelight_common_choice_selected;
        } else if (gVar == WifiSpeakerService.C9665g.xiaobing) {
            this.f18013a.setImageResource(R$drawable.icon_yeelight_common_choice_normal);
            imageView2 = this.f18014b;
            i2 = R$drawable.icon_yeelight_common_choice_selected;
            imageView2.setImageResource(i2);
        } else {
            imageView = this.f18013a;
            i = R$drawable.icon_yeelight_common_choice_normal;
        }
        imageView.setImageResource(i);
        imageView2 = this.f18014b;
        i2 = R$drawable.icon_yeelight_common_choice_normal;
        imageView2.setImageResource(i2);
    }

    /* renamed from: b */
    public void mo32020b(C9905a aVar) {
        this.f18017e = aVar;
    }

    public void onClick(View view) {
        C9905a aVar;
        WifiSpeakerService.C9665g gVar;
        int id = view.getId();
        if (id == R$id.ll_xiaoai) {
            gVar = WifiSpeakerService.C9665g.mibrain;
        } else if (id == R$id.ll_xiaobing) {
            gVar = WifiSpeakerService.C9665g.xiaobing;
        } else if (id == R$id.btn_confirm && (aVar = this.f18017e) != null) {
            aVar.mo27029a(this.f18015c);
            return;
        } else {
            return;
        }
        this.f18015c = gVar;
        m24292c();
    }
}
