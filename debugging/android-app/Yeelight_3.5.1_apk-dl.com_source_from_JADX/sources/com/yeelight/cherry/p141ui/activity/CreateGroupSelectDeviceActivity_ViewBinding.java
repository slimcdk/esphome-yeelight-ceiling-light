package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity_ViewBinding */
public class CreateGroupSelectDeviceActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupSelectDeviceActivity f10104a;

    /* renamed from: b */
    private View f10105b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity_ViewBinding$a */
    class C5136a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupSelectDeviceActivity f10106a;

        C5136a(CreateGroupSelectDeviceActivity_ViewBinding createGroupSelectDeviceActivity_ViewBinding, CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity) {
            this.f10106a = createGroupSelectDeviceActivity;
        }

        public void doClick(View view) {
            this.f10106a.completeSelect(view);
        }
    }

    @UiThread
    public CreateGroupSelectDeviceActivity_ViewBinding(CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity, View view) {
        this.f10104a = createGroupSelectDeviceActivity;
        createGroupSelectDeviceActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        createGroupSelectDeviceActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297165, "method 'completeSelect'");
        this.f10105b = findRequiredView;
        findRequiredView.setOnClickListener(new C5136a(this, createGroupSelectDeviceActivity));
    }

    @CallSuper
    public void unbind() {
        CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = this.f10104a;
        if (createGroupSelectDeviceActivity != null) {
            this.f10104a = null;
            createGroupSelectDeviceActivity.mTitleBar = null;
            createGroupSelectDeviceActivity.mDeviceList = null;
            this.f10105b.setOnClickListener((View.OnClickListener) null);
            this.f10105b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
