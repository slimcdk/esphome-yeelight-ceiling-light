package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding */
public class SceneBundleSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SceneBundleSettingActivity f11308a;

    /* renamed from: b */
    private View f11309b;

    /* renamed from: c */
    private View f11310c;

    /* renamed from: d */
    private View f11311d;

    /* renamed from: e */
    private View f11312e;

    /* renamed from: f */
    private View f11313f;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$a */
    class C5647a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11314a;

        C5647a(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11314a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11314a.modifyType();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$b */
    class C5648b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11315a;

        C5648b(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11315a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11315a.modifyName();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$c */
    class C5649c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11316a;

        C5649c(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11316a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11316a.modifyDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$d */
    class C5650d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11317a;

        C5650d(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11317a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11317a.addShortcut();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$e */
    class C5651e extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11318a;

        C5651e(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11318a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11318a.deleteRoom();
        }
    }

    @UiThread
    public SceneBundleSettingActivity_ViewBinding(SceneBundleSettingActivity sceneBundleSettingActivity, View view) {
        this.f11308a = sceneBundleSettingActivity;
        sceneBundleSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296684, "field 'mTypeLayout' and method 'modifyType'");
        sceneBundleSettingActivity.mTypeLayout = (LinearLayout) Utils.castView(findRequiredView, 2131296684, "field 'mTypeLayout'", LinearLayout.class);
        this.f11309b = findRequiredView;
        findRequiredView.setOnClickListener(new C5647a(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mTypeImage = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.scene_type_img, "field 'mTypeImage'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.device_name_layout, "field 'mNameLayout' and method 'modifyName'");
        sceneBundleSettingActivity.mNameLayout = (LinearLayout) Utils.castView(findRequiredView2, C12225R$id.device_name_layout, "field 'mNameLayout'", LinearLayout.class);
        this.f11310c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5648b(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mNameView = (TextView) Utils.findRequiredViewAsType(view, 2131297409, "field 'mNameView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.device_manager_layout, "field 'mManagerLayout' and method 'modifyDevice'");
        sceneBundleSettingActivity.mManagerLayout = (LinearLayout) Utils.castView(findRequiredView3, C12225R$id.device_manager_layout, "field 'mManagerLayout'", LinearLayout.class);
        this.f11311d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5649c(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mNumberView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.device_number, "field 'mNumberView'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C12225R$id.add_shortcut_layout, "field 'mAddShortcutLayout' and method 'addShortcut'");
        sceneBundleSettingActivity.mAddShortcutLayout = (LinearLayout) Utils.castView(findRequiredView4, C12225R$id.add_shortcut_layout, "field 'mAddShortcutLayout'", LinearLayout.class);
        this.f11312e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5650d(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mPbAddShortcut = (ProgressBar) Utils.findRequiredViewAsType(view, C12225R$id.progress_add_shortcut, "field 'mPbAddShortcut'", ProgressBar.class);
        View findRequiredView5 = Utils.findRequiredView(view, C12225R$id.scene_del, "method 'deleteRoom'");
        this.f11313f = findRequiredView5;
        findRequiredView5.setOnClickListener(new C5651e(this, sceneBundleSettingActivity));
    }

    @CallSuper
    public void unbind() {
        SceneBundleSettingActivity sceneBundleSettingActivity = this.f11308a;
        if (sceneBundleSettingActivity != null) {
            this.f11308a = null;
            sceneBundleSettingActivity.mTitleBar = null;
            sceneBundleSettingActivity.mTypeLayout = null;
            sceneBundleSettingActivity.mTypeImage = null;
            sceneBundleSettingActivity.mNameLayout = null;
            sceneBundleSettingActivity.mNameView = null;
            sceneBundleSettingActivity.mManagerLayout = null;
            sceneBundleSettingActivity.mNumberView = null;
            sceneBundleSettingActivity.mAddShortcutLayout = null;
            sceneBundleSettingActivity.mPbAddShortcut = null;
            this.f11309b.setOnClickListener((View.OnClickListener) null);
            this.f11309b = null;
            this.f11310c.setOnClickListener((View.OnClickListener) null);
            this.f11310c = null;
            this.f11311d.setOnClickListener((View.OnClickListener) null);
            this.f11311d = null;
            this.f11312e.setOnClickListener((View.OnClickListener) null);
            this.f11312e = null;
            this.f11313f.setOnClickListener((View.OnClickListener) null);
            this.f11313f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
