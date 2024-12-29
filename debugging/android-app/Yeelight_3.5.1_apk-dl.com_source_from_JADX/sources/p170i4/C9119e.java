package p170i4;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;

/* renamed from: i4.e */
public class C9119e extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private View.OnClickListener f16856a;

    public C9119e(@NonNull Context context) {
        super(context, R$style.dialogstyle);
        m21901a(context);
    }

    /* renamed from: a */
    private void m21901a(Context context) {
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        View inflate = LayoutInflater.from(context).inflate(R$layout.yl_google_home_connect_dialog, (ViewGroup) null);
        double d = (double) i;
        Double.isNaN(d);
        int i2 = (int) (d * 0.781d);
        if (getWindow() != null) {
            getWindow().requestFeature(1);
        }
        setContentView(inflate);
        getWindow().setLayout(i2, -2);
        getWindow().getDecorView().setBackground((Drawable) null);
        inflate.findViewById(R$id.view_close).setOnClickListener(this);
        inflate.findViewById(R$id.btn_confirm).setOnClickListener(this);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: b */
    public void mo37182b(View.OnClickListener onClickListener) {
        this.f16856a = onClickListener;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.view_close) {
            dismiss();
        } else if (id == R$id.btn_confirm) {
            dismiss();
            View.OnClickListener onClickListener = this.f16856a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
