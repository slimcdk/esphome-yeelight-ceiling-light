package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity_ViewBinding */
public class RoomMainActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RoomMainActivity f11253a;

    /* renamed from: b */
    private View f11254b;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomMainActivity_ViewBinding$a */
    class C5626a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomMainActivity f11255a;

        C5626a(RoomMainActivity_ViewBinding roomMainActivity_ViewBinding, RoomMainActivity roomMainActivity) {
            this.f11255a = roomMainActivity;
        }

        public void doClick(View view) {
            this.f11255a.toDeviceControl();
        }
    }

    @UiThread
    public RoomMainActivity_ViewBinding(RoomMainActivity roomMainActivity, View view) {
        this.f11253a = roomMainActivity;
        roomMainActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
        roomMainActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        roomMainActivity.mRoomName = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.room_name, "field 'mRoomName'", TextView.class);
        roomMainActivity.mOnNum = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.room_device_on_number, "field 'mOnNum'", TextView.class);
        roomMainActivity.mOffNum = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.room_device_off_number, "field 'mOffNum'", TextView.class);
        roomMainActivity.mOfflineNum = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.room_device_offline_number, "field 'mOfflineNum'", TextView.class);
        roomMainActivity.mBtnQuickAddDevice = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_quick_add_device, "field 'mBtnQuickAddDevice'", Button.class);
        roomMainActivity.mContentView = Utils.findRequiredView(view, C12225R$id.device_list_layout, "field 'mContentView'");
        roomMainActivity.mEmptyView = Utils.findRequiredView(view, 2131296738, "field 'mEmptyView'");
        roomMainActivity.mArrowView = Utils.findRequiredView(view, C12225R$id.room_control_arrow, "field 'mArrowView'");
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.device_info_layout, "method 'toDeviceControl'");
        this.f11254b = findRequiredView;
        findRequiredView.setOnClickListener(new C5626a(this, roomMainActivity));
    }

    @CallSuper
    public void unbind() {
        RoomMainActivity roomMainActivity = this.f11253a;
        if (roomMainActivity != null) {
            this.f11253a = null;
            roomMainActivity.mDeviceList = null;
            roomMainActivity.mTitleBar = null;
            roomMainActivity.mRoomName = null;
            roomMainActivity.mOnNum = null;
            roomMainActivity.mOffNum = null;
            roomMainActivity.mOfflineNum = null;
            roomMainActivity.mBtnQuickAddDevice = null;
            roomMainActivity.mContentView = null;
            roomMainActivity.mEmptyView = null;
            roomMainActivity.mArrowView = null;
            this.f11254b.setOnClickListener((View.OnClickListener) null);
            this.f11254b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
