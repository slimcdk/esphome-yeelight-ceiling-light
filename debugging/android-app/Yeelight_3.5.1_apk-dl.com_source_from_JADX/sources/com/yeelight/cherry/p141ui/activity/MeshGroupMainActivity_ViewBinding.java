package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding */
public class MeshGroupMainActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshGroupMainActivity f10801a;

    /* renamed from: b */
    private View f10802b;

    /* renamed from: c */
    private View f10803c;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding$a */
    class C5433a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeshGroupMainActivity f10804a;

        C5433a(MeshGroupMainActivity_ViewBinding meshGroupMainActivity_ViewBinding, MeshGroupMainActivity meshGroupMainActivity) {
            this.f10804a = meshGroupMainActivity;
        }

        public void doClick(View view) {
            this.f10804a.addMeshDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshGroupMainActivity_ViewBinding$b */
    class C5434b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeshGroupMainActivity f10805a;

        C5434b(MeshGroupMainActivity_ViewBinding meshGroupMainActivity_ViewBinding, MeshGroupMainActivity meshGroupMainActivity) {
            this.f10805a = meshGroupMainActivity;
        }

        public void doClick(View view) {
            this.f10805a.toDeviceControl();
        }
    }

    @UiThread
    public MeshGroupMainActivity_ViewBinding(MeshGroupMainActivity meshGroupMainActivity, View view) {
        this.f10801a = meshGroupMainActivity;
        meshGroupMainActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
        meshGroupMainActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        meshGroupMainActivity.mGroupName = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.group_name, "field 'mGroupName'", TextView.class);
        meshGroupMainActivity.mDeviceNum = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.device_number, "field 'mDeviceNum'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.btn_add_device, "field 'mBtnAddDevice' and method 'addMeshDevice'");
        meshGroupMainActivity.mBtnAddDevice = (Button) Utils.castView(findRequiredView, C12225R$id.btn_add_device, "field 'mBtnAddDevice'", Button.class);
        this.f10802b = findRequiredView;
        findRequiredView.setOnClickListener(new C5433a(this, meshGroupMainActivity));
        meshGroupMainActivity.mArrow = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.mesh_group_arrow, "field 'mArrow'", ImageView.class);
        meshGroupMainActivity.mEmptyView = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296738, "field 'mEmptyView'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.device_info_layout, "method 'toDeviceControl'");
        this.f10803c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5434b(this, meshGroupMainActivity));
    }

    @CallSuper
    public void unbind() {
        MeshGroupMainActivity meshGroupMainActivity = this.f10801a;
        if (meshGroupMainActivity != null) {
            this.f10801a = null;
            meshGroupMainActivity.mDeviceList = null;
            meshGroupMainActivity.mTitleBar = null;
            meshGroupMainActivity.mGroupName = null;
            meshGroupMainActivity.mDeviceNum = null;
            meshGroupMainActivity.mBtnAddDevice = null;
            meshGroupMainActivity.mArrow = null;
            meshGroupMainActivity.mEmptyView = null;
            this.f10802b.setOnClickListener((View.OnClickListener) null);
            this.f10802b = null;
            this.f10803c.setOnClickListener((View.OnClickListener) null);
            this.f10803c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
