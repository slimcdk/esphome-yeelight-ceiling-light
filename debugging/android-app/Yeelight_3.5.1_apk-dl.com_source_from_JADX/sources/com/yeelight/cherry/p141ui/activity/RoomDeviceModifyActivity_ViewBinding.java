package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity_ViewBinding */
public class RoomDeviceModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomDeviceModifyActivity f11238a;

    /* renamed from: b */
    private View f11239b;

    /* renamed from: c */
    private View f11240c;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity_ViewBinding$a */
    class C5618a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomDeviceModifyActivity f11241a;

        C5618a(RoomDeviceModifyActivity_ViewBinding roomDeviceModifyActivity_ViewBinding, RoomDeviceModifyActivity roomDeviceModifyActivity) {
            this.f11241a = roomDeviceModifyActivity;
        }

        public void doClick(View view) {
            this.f11241a.back();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomDeviceModifyActivity_ViewBinding$b */
    class C5619b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomDeviceModifyActivity f11242a;

        C5619b(RoomDeviceModifyActivity_ViewBinding roomDeviceModifyActivity_ViewBinding, RoomDeviceModifyActivity roomDeviceModifyActivity) {
            this.f11242a = roomDeviceModifyActivity;
        }

        public void doClick(View view) {
            this.f11242a.save();
        }
    }

    @UiThread
    public RoomDeviceModifyActivity_ViewBinding(RoomDeviceModifyActivity roomDeviceModifyActivity, View view) {
        this.f11238a = roomDeviceModifyActivity;
        roomDeviceModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.img_top_bar_left, "method 'back'");
        this.f11239b = findRequiredView;
        findRequiredView.setOnClickListener(new C5618a(this, roomDeviceModifyActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.tv_top_bar_right_text, "method 'save'");
        this.f11240c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5619b(this, roomDeviceModifyActivity));
    }

    @CallSuper
    public void unbind() {
        RoomDeviceModifyActivity roomDeviceModifyActivity = this.f11238a;
        if (roomDeviceModifyActivity != null) {
            this.f11238a = null;
            roomDeviceModifyActivity.mDeviceList = null;
            this.f11239b.setOnClickListener((View.OnClickListener) null);
            this.f11239b = null;
            this.f11240c.setOnClickListener((View.OnClickListener) null);
            this.f11240c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
