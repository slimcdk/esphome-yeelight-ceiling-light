package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding */
public class MiBandOpenBluetoothActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandOpenBluetoothActivity f10902a;

    /* renamed from: b */
    private View f10903b;

    /* renamed from: c */
    private View f10904c;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding$a */
    class C5477a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandOpenBluetoothActivity f10905a;

        C5477a(MiBandOpenBluetoothActivity_ViewBinding miBandOpenBluetoothActivity_ViewBinding, MiBandOpenBluetoothActivity miBandOpenBluetoothActivity) {
            this.f10905a = miBandOpenBluetoothActivity;
        }

        public void doClick(View view) {
            this.f10905a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding$b */
    class C5478b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandOpenBluetoothActivity f10906a;

        C5478b(MiBandOpenBluetoothActivity_ViewBinding miBandOpenBluetoothActivity_ViewBinding, MiBandOpenBluetoothActivity miBandOpenBluetoothActivity) {
            this.f10906a = miBandOpenBluetoothActivity;
        }

        public void doClick(View view) {
            this.f10906a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandOpenBluetoothActivity_ViewBinding(MiBandOpenBluetoothActivity miBandOpenBluetoothActivity, View view) {
        this.f10902a = miBandOpenBluetoothActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.btn_next, "method 'onViewClicked'");
        this.f10903b = findRequiredView;
        findRequiredView.setOnClickListener(new C5477a(this, miBandOpenBluetoothActivity));
        View findRequiredView2 = Utils.findRequiredView(view, 2131296876, "method 'onViewClicked'");
        this.f10904c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5478b(this, miBandOpenBluetoothActivity));
    }

    @CallSuper
    public void unbind() {
        if (this.f10902a != null) {
            this.f10902a = null;
            this.f10903b.setOnClickListener((View.OnClickListener) null);
            this.f10903b = null;
            this.f10904c.setOnClickListener((View.OnClickListener) null);
            this.f10904c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
