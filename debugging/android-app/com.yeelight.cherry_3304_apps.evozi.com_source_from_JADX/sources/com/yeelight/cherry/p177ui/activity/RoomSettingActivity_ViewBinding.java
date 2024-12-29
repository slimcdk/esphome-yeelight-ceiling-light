package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding */
public class RoomSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomSettingActivity f11694a;

    /* renamed from: b */
    private View f11695b;

    /* renamed from: c */
    private View f11696c;

    /* renamed from: d */
    private View f11697d;

    /* renamed from: e */
    private View f11698e;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$a */
    class C5588a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11699a;

        C5588a(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11699a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11699a.modifyType();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$b */
    class C5589b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11700a;

        C5589b(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11700a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11700a.modifyName();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$c */
    class C5590c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11701a;

        C5590c(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11701a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11701a.modifyDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity_ViewBinding$d */
    class C5591d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomSettingActivity f11702a;

        C5591d(RoomSettingActivity_ViewBinding roomSettingActivity_ViewBinding, RoomSettingActivity roomSettingActivity) {
            this.f11702a = roomSettingActivity;
        }

        public void doClick(View view) {
            this.f11702a.deleteRoom();
        }
    }

    @UiThread
    public RoomSettingActivity_ViewBinding(RoomSettingActivity roomSettingActivity, View view) {
        this.f11694a = roomSettingActivity;
        roomSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296606, "field 'mTypeLayout' and method 'modifyType'");
        roomSettingActivity.mTypeLayout = (LinearLayout) Utils.castView(findRequiredView, 2131296606, "field 'mTypeLayout'", LinearLayout.class);
        this.f11695b = findRequiredView;
        findRequiredView.setOnClickListener(new C5588a(this, roomSettingActivity));
        roomSettingActivity.mTypeImage = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.device_type_img, "field 'mTypeImage'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.device_name_layout, "field 'mNameLayout' and method 'modifyName'");
        roomSettingActivity.mNameLayout = (LinearLayout) Utils.castView(findRequiredView2, C11745R$id.device_name_layout, "field 'mNameLayout'", LinearLayout.class);
        this.f11696c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5589b(this, roomSettingActivity));
        roomSettingActivity.mNameView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.room_name, "field 'mNameView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.device_manager_layout, "field 'mManagerLayout' and method 'modifyDevice'");
        roomSettingActivity.mManagerLayout = (LinearLayout) Utils.castView(findRequiredView3, C11745R$id.device_manager_layout, "field 'mManagerLayout'", LinearLayout.class);
        this.f11697d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5590c(this, roomSettingActivity));
        roomSettingActivity.mNumberView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.device_number, "field 'mNumberView'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C11745R$id.room_del, "method 'deleteRoom'");
        this.f11698e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5591d(this, roomSettingActivity));
    }

    @CallSuper
    public void unbind() {
        RoomSettingActivity roomSettingActivity = this.f11694a;
        if (roomSettingActivity != null) {
            this.f11694a = null;
            roomSettingActivity.mTitleBar = null;
            roomSettingActivity.mTypeLayout = null;
            roomSettingActivity.mTypeImage = null;
            roomSettingActivity.mNameLayout = null;
            roomSettingActivity.mNameView = null;
            roomSettingActivity.mManagerLayout = null;
            roomSettingActivity.mNumberView = null;
            this.f11695b.setOnClickListener((View.OnClickListener) null);
            this.f11695b = null;
            this.f11696c.setOnClickListener((View.OnClickListener) null);
            this.f11696c = null;
            this.f11697d.setOnClickListener((View.OnClickListener) null);
            this.f11697d = null;
            this.f11698e.setOnClickListener((View.OnClickListener) null);
            this.f11698e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
