package p160g4;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g4.d */
public class C9076d extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private WheelPicker f16676a;

    /* renamed from: b */
    private WheelPicker f16677b;

    /* renamed from: c */
    private View.OnClickListener f16678c;

    /* renamed from: d */
    private C9077a f16679d;

    /* renamed from: e */
    private List<Integer> f16680e;

    /* renamed from: f */
    private List<Integer> f16681f;

    /* renamed from: g4.d$a */
    public interface C9077a {
        /* renamed from: a */
        void mo36029a(long j);
    }

    public C9076d(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        m21741c(context);
    }

    /* renamed from: a */
    private List<Integer> m21739a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION));
        arrayList.add(800);
        arrayList.add(Integer.valueOf(TypedValues.Custom.TYPE_INT));
        return arrayList;
    }

    /* renamed from: b */
    private List<Integer> m21740b() {
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
    private void m21741c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.dialog_light_gradient_duration, (ViewGroup) null);
        this.f16676a = (WheelPicker) inflate.findViewById(R$id.second_picker_view);
        this.f16677b = (WheelPicker) inflate.findViewById(R$id.millsecond_picker_view);
        this.f16680e = m21740b();
        this.f16681f = m21739a();
        this.f16676a.setData(this.f16680e);
        this.f16677b.setData(this.f16681f);
        this.f16676a.mo36586l(2, false);
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
    public void mo37029d(C9077a aVar) {
        this.f16679d = aVar;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.tv_cancle) {
            dismiss();
            View.OnClickListener onClickListener = this.f16678c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (id == R$id.tv_confirm) {
            int intValue = this.f16680e.get(this.f16676a.getCurrentItemPosition()).intValue();
            int intValue2 = this.f16681f.get(this.f16677b.getCurrentItemPosition()).intValue();
            dismiss();
            C9077a aVar = this.f16679d;
            if (aVar != null) {
                aVar.mo36029a((long) ((intValue * 1000) + intValue2));
            }
        }
    }
}
