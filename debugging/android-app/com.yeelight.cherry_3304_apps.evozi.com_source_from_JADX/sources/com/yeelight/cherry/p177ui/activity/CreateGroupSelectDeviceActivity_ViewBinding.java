package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity_ViewBinding */
public class CreateGroupSelectDeviceActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupSelectDeviceActivity f10553a;

    /* renamed from: b */
    private View f10554b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity_ViewBinding$a */
    class C5089a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupSelectDeviceActivity f10555a;

        C5089a(CreateGroupSelectDeviceActivity_ViewBinding createGroupSelectDeviceActivity_ViewBinding, CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity) {
            this.f10555a = createGroupSelectDeviceActivity;
        }

        public void doClick(View view) {
            this.f10555a.completeSelect(view);
        }
    }

    @UiThread
    public CreateGroupSelectDeviceActivity_ViewBinding(CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity, View view) {
        this.f10553a = createGroupSelectDeviceActivity;
        createGroupSelectDeviceActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        createGroupSelectDeviceActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297043, "method 'completeSelect'");
        this.f10554b = findRequiredView;
        findRequiredView.setOnClickListener(new C5089a(this, createGroupSelectDeviceActivity));
    }

    @CallSuper
    public void unbind() {
        CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = this.f10553a;
        if (createGroupSelectDeviceActivity != null) {
            this.f10553a = null;
            createGroupSelectDeviceActivity.mTitleBar = null;
            createGroupSelectDeviceActivity.mDeviceList = null;
            this.f10554b.setOnClickListener((View.OnClickListener) null);
            this.f10554b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
