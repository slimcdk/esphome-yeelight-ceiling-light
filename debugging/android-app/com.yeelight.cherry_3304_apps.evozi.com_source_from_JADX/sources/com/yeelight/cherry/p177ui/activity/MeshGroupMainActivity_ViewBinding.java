package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding */
public class MeshGroupMainActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshGroupMainActivity f11232a;

    /* renamed from: b */
    private View f11233b;

    /* renamed from: c */
    private View f11234c;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding$a */
    class C5387a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeshGroupMainActivity f11235a;

        C5387a(MeshGroupMainActivity_ViewBinding meshGroupMainActivity_ViewBinding, MeshGroupMainActivity meshGroupMainActivity) {
            this.f11235a = meshGroupMainActivity;
        }

        public void doClick(View view) {
            this.f11235a.addMeshDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding$b */
    class C5388b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeshGroupMainActivity f11236a;

        C5388b(MeshGroupMainActivity_ViewBinding meshGroupMainActivity_ViewBinding, MeshGroupMainActivity meshGroupMainActivity) {
            this.f11236a = meshGroupMainActivity;
        }

        public void doClick(View view) {
            this.f11236a.toDeviceControl();
        }
    }

    @UiThread
    public MeshGroupMainActivity_ViewBinding(MeshGroupMainActivity meshGroupMainActivity, View view) {
        this.f11232a = meshGroupMainActivity;
        meshGroupMainActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296591, "field 'mDeviceList'", RecyclerView.class);
        meshGroupMainActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        meshGroupMainActivity.mGroupName = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.group_name, "field 'mGroupName'", TextView.class);
        meshGroupMainActivity.mDeviceNum = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.device_number, "field 'mDeviceNum'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.btn_add_device, "field 'mBtnAddDevice' and method 'addMeshDevice'");
        meshGroupMainActivity.mBtnAddDevice = (Button) Utils.castView(findRequiredView, C11745R$id.btn_add_device, "field 'mBtnAddDevice'", Button.class);
        this.f11233b = findRequiredView;
        findRequiredView.setOnClickListener(new C5387a(this, meshGroupMainActivity));
        meshGroupMainActivity.mArrow = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.mesh_group_arrow, "field 'mArrow'", ImageView.class);
        meshGroupMainActivity.mEmptyView = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296644, "field 'mEmptyView'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.device_info_layout, "method 'toDeviceControl'");
        this.f11234c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5388b(this, meshGroupMainActivity));
    }

    @CallSuper
    public void unbind() {
        MeshGroupMainActivity meshGroupMainActivity = this.f11232a;
        if (meshGroupMainActivity != null) {
            this.f11232a = null;
            meshGroupMainActivity.mDeviceList = null;
            meshGroupMainActivity.mTitleBar = null;
            meshGroupMainActivity.mGroupName = null;
            meshGroupMainActivity.mDeviceNum = null;
            meshGroupMainActivity.mBtnAddDevice = null;
            meshGroupMainActivity.mArrow = null;
            meshGroupMainActivity.mEmptyView = null;
            this.f11233b.setOnClickListener((View.OnClickListener) null);
            this.f11233b = null;
            this.f11234c.setOnClickListener((View.OnClickListener) null);
            this.f11234c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
