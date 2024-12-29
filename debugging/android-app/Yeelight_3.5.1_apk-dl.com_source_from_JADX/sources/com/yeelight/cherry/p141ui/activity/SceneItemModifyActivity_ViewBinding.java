package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity_ViewBinding */
public class SceneItemModifyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SceneItemModifyActivity f11330a;

    /* renamed from: b */
    private View f11331b;

    /* renamed from: c */
    private View f11332c;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity_ViewBinding$a */
    class C5656a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneItemModifyActivity f11333a;

        C5656a(SceneItemModifyActivity_ViewBinding sceneItemModifyActivity_ViewBinding, SceneItemModifyActivity sceneItemModifyActivity) {
            this.f11333a = sceneItemModifyActivity;
        }

        public void doClick(View view) {
            this.f11333a.back();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneItemModifyActivity_ViewBinding$b */
    class C5657b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneItemModifyActivity f11334a;

        C5657b(SceneItemModifyActivity_ViewBinding sceneItemModifyActivity_ViewBinding, SceneItemModifyActivity sceneItemModifyActivity) {
            this.f11334a = sceneItemModifyActivity;
        }

        public void doClick(View view) {
            this.f11334a.save();
        }
    }

    @UiThread
    public SceneItemModifyActivity_ViewBinding(SceneItemModifyActivity sceneItemModifyActivity, View view) {
        this.f11330a = sceneItemModifyActivity;
        sceneItemModifyActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, 2131296669, "field 'mDeviceList'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.img_top_bar_left, "method 'back'");
        this.f11331b = findRequiredView;
        findRequiredView.setOnClickListener(new C5656a(this, sceneItemModifyActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.tv_top_bar_right_text, "method 'save'");
        this.f11332c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5657b(this, sceneItemModifyActivity));
    }

    @CallSuper
    public void unbind() {
        SceneItemModifyActivity sceneItemModifyActivity = this.f11330a;
        if (sceneItemModifyActivity != null) {
            this.f11330a = null;
            sceneItemModifyActivity.mDeviceList = null;
            this.f11331b.setOnClickListener((View.OnClickListener) null);
            this.f11331b = null;
            this.f11332c.setOnClickListener((View.OnClickListener) null);
            this.f11332c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
