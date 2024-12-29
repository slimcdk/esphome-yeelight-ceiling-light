package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding */
public class MiBandOpenBluetoothActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandOpenBluetoothActivity f11332a;

    /* renamed from: b */
    private View f11333b;

    /* renamed from: c */
    private View f11334c;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding$a */
    class C5431a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandOpenBluetoothActivity f11335a;

        C5431a(MiBandOpenBluetoothActivity_ViewBinding miBandOpenBluetoothActivity_ViewBinding, MiBandOpenBluetoothActivity miBandOpenBluetoothActivity) {
            this.f11335a = miBandOpenBluetoothActivity;
        }

        public void doClick(View view) {
            this.f11335a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity_ViewBinding$b */
    class C5432b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandOpenBluetoothActivity f11336a;

        C5432b(MiBandOpenBluetoothActivity_ViewBinding miBandOpenBluetoothActivity_ViewBinding, MiBandOpenBluetoothActivity miBandOpenBluetoothActivity) {
            this.f11336a = miBandOpenBluetoothActivity;
        }

        public void doClick(View view) {
            this.f11336a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandOpenBluetoothActivity_ViewBinding(MiBandOpenBluetoothActivity miBandOpenBluetoothActivity, View view) {
        this.f11332a = miBandOpenBluetoothActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.btn_next, "method 'onViewClicked'");
        this.f11333b = findRequiredView;
        findRequiredView.setOnClickListener(new C5431a(this, miBandOpenBluetoothActivity));
        View findRequiredView2 = Utils.findRequiredView(view, 2131296772, "method 'onViewClicked'");
        this.f11334c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5432b(this, miBandOpenBluetoothActivity));
    }

    @CallSuper
    public void unbind() {
        if (this.f11332a != null) {
            this.f11332a = null;
            this.f11333b.setOnClickListener((View.OnClickListener) null);
            this.f11333b = null;
            this.f11334c.setOnClickListener((View.OnClickListener) null);
            this.f11334c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
