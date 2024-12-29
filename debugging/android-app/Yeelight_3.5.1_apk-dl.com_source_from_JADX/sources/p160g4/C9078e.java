package p160g4;

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

/* renamed from: g4.e */
public class C9078e extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private ImageView f16682a;

    /* renamed from: b */
    private ImageView f16683b;

    /* renamed from: c */
    private WifiSpeakerService.AiProvider f16684c;

    /* renamed from: d */
    private final Context f16685d;

    /* renamed from: e */
    private C9079a f16686e;

    /* renamed from: g4.e$a */
    public interface C9079a {
        /* renamed from: a */
        void mo31081a(WifiSpeakerService.AiProvider aiProvider);
    }

    public C9078e(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        this.f16685d = context;
        m21744a();
    }

    /* renamed from: a */
    private void m21744a() {
        View inflate = LayoutInflater.from(this.f16685d).inflate(R$layout.dialog_select_speaker_system, (ViewGroup) null);
        double d = (double) getContext().getResources().getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.781d);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(inflate);
        getWindow().setLayout(i, -2);
        getWindow().getDecorView().setBackground((Drawable) null);
        this.f16682a = (ImageView) findViewById(R$id.img_xiaoai);
        this.f16683b = (ImageView) findViewById(R$id.img_xiaobing);
        findViewById(R$id.ll_xiaoai).setOnClickListener(this);
        findViewById(R$id.ll_xiaobing).setOnClickListener(this);
        findViewById(R$id.btn_confirm).setOnClickListener(this);
        m21745c();
    }

    /* renamed from: c */
    private void m21745c() {
        int i;
        ImageView imageView;
        WifiSpeakerService.AiProvider aiProvider = this.f16684c;
        if (aiProvider == WifiSpeakerService.AiProvider.mibrain) {
            this.f16682a.setImageResource(R$drawable.icon_yeelight_common_choice_selected);
            imageView = this.f16683b;
            i = R$drawable.icon_yeelight_common_choice_normal;
        } else if (aiProvider == WifiSpeakerService.AiProvider.xiaobing) {
            this.f16682a.setImageResource(R$drawable.icon_yeelight_common_choice_normal);
            imageView = this.f16683b;
            i = R$drawable.icon_yeelight_common_choice_selected;
        } else {
            ImageView imageView2 = this.f16682a;
            i = R$drawable.icon_yeelight_common_choice_normal;
            imageView2.setImageResource(i);
            imageView = this.f16683b;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: b */
    public void mo37031b(C9079a aVar) {
        this.f16686e = aVar;
    }

    public void onClick(View view) {
        C9079a aVar;
        WifiSpeakerService.AiProvider aiProvider;
        int id = view.getId();
        if (id == R$id.ll_xiaoai) {
            aiProvider = WifiSpeakerService.AiProvider.mibrain;
        } else if (id == R$id.ll_xiaobing) {
            aiProvider = WifiSpeakerService.AiProvider.xiaobing;
        } else if (id == R$id.btn_confirm && (aVar = this.f16686e) != null) {
            aVar.mo31081a(this.f16684c);
            return;
        } else {
            return;
        }
        this.f16684c = aiProvider;
        m21745c();
    }
}
