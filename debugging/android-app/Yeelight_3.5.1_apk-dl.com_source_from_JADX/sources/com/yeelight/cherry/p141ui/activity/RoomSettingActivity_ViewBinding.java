package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding */
public class RoomSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomSettingActivity f11263a;

    /* renamed from: b */
    private View f11264b;

    /* renamed from: c */
    private View f11265c;

    /* renamed from: d */
    private View f11266d;

    /* renamed from: e */
    private View f11267e;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$a */
    class C5629a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11268a;

        C5629a(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11268a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11268a.modifyType();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$b */
    class C5630b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11269a;

        C5630b(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11269a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11269a.modifyName();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$c */
    class C5631c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11270a;

        C5631c(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11270a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11270a.modifyDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$d */
    class C5632d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11271a;

        C5632d(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11271a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11271a.deleteRoom();
        }
    }

    @UiThread
    public RoomSettingActivity_ViewBinding(RoomSettingActivity roomSettingActivity, View view) {
        this.f11263a = roomSettingActivity;
        roomSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296684, "field 'mTypeLayout' and method 'modifyType'");
        roomSettingActivity.mTypeLayout = (LinearLayout) Utils.castView(findRequiredView, 2131296684, "field 'mTypeLayout'", LinearLayout.class);
        this.f11264b = findRequiredView;
        findRequiredView.setOnClickListener(new C5629a(this, roomSettingActivity));
        roomSettingActivity.mTypeImage = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.device_type_img, "field 'mTypeImage'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.device_name_layout, "field 'mNameLayout' and method 'modifyName'");
        roomSettingActivity.mNameLayout = (LinearLayout) Utils.castView(findRequiredView2, C12225R$id.device_name_layout, "field 'mNameLayout'", LinearLayout.class);
        this.f11265c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5630b(this, roomSettingActivity));
        roomSettingActivity.mNameView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.room_name, "field 'mNameView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.device_manager_layout, "field 'mManagerLayout' and method 'modifyDevice'");
        roomSettingActivity.mManagerLayout = (LinearLayout) Utils.castView(findRequiredView3, C12225R$id.device_manager_layout, "field 'mManagerLayout'", LinearLayout.class);
        this.f11266d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5631c(this, roomSettingActivity));
        roomSettingActivity.mNumberView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.device_number, "field 'mNumberView'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C12225R$id.room_del, "method 'deleteRoom'");
        this.f11267e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5632d(this, roomSettingActivity));
    }

    @CallSuper
    public void unbind() {
        RoomSettingActivity roomSettingActivity = this.f11263a;
        if (roomSettingActivity != null) {
            this.f11263a = null;
            roomSettingActivity.mTitleBar = null;
            roomSettingActivity.mTypeLayout = null;
            roomSettingActivity.mTypeImage = null;
            roomSettingActivity.mNameLayout = null;
            roomSettingActivity.mNameView = null;
            roomSettingActivity.mManagerLayout = null;
            roomSettingActivity.mNumberView = null;
            this.f11264b.setOnClickListener((View.OnClickListener) null);
            this.f11264b = null;
            this.f11265c.setOnClickListener((View.OnClickListener) null);
            this.f11265c = null;
            this.f11266d.setOnClickListener((View.OnClickListener) null);
            this.f11266d = null;
            this.f11267e.setOnClickListener((View.OnClickListener) null);
            this.f11267e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
