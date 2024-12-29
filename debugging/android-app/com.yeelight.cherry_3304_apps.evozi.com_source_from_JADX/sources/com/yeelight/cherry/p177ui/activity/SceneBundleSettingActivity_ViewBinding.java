package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding */
public class SceneBundleSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SceneBundleSettingActivity f11738a;

    /* renamed from: b */
    private View f11739b;

    /* renamed from: c */
    private View f11740c;

    /* renamed from: d */
    private View f11741d;

    /* renamed from: e */
    private View f11742e;

    /* renamed from: f */
    private View f11743f;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$a */
    class C5606a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11744a;

        C5606a(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11744a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11744a.modifyType();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$b */
    class C5607b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11745a;

        C5607b(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11745a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11745a.modifyName();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$c */
    class C5608c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11746a;

        C5608c(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11746a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11746a.modifyDevice();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$d */
    class C5609d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11747a;

        C5609d(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11747a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11747a.addShortcut();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity_ViewBinding$e */
    class C5610e extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ SceneBundleSettingActivity f11748a;

        C5610e(SceneBundleSettingActivity_ViewBinding sceneBundleSettingActivity_ViewBinding, SceneBundleSettingActivity sceneBundleSettingActivity) {
            this.f11748a = sceneBundleSettingActivity;
        }

        public void doClick(View view) {
            this.f11748a.deleteRoom();
        }
    }

    @UiThread
    public SceneBundleSettingActivity_ViewBinding(SceneBundleSettingActivity sceneBundleSettingActivity, View view) {
        this.f11738a = sceneBundleSettingActivity;
        sceneBundleSettingActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296606, "field 'mTypeLayout' and method 'modifyType'");
        sceneBundleSettingActivity.mTypeLayout = (LinearLayout) Utils.castView(findRequiredView, 2131296606, "field 'mTypeLayout'", LinearLayout.class);
        this.f11739b = findRequiredView;
        findRequiredView.setOnClickListener(new C5606a(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mTypeImage = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.scene_type_img, "field 'mTypeImage'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.device_name_layout, "field 'mNameLayout' and method 'modifyName'");
        sceneBundleSettingActivity.mNameLayout = (LinearLayout) Utils.castView(findRequiredView2, C11745R$id.device_name_layout, "field 'mNameLayout'", LinearLayout.class);
        this.f11740c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5607b(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mNameView = (TextView) Utils.findRequiredViewAsType(view, 2131297266, "field 'mNameView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.device_manager_layout, "field 'mManagerLayout' and method 'modifyDevice'");
        sceneBundleSettingActivity.mManagerLayout = (LinearLayout) Utils.castView(findRequiredView3, C11745R$id.device_manager_layout, "field 'mManagerLayout'", LinearLayout.class);
        this.f11741d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5608c(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mNumberView = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.device_number, "field 'mNumberView'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, C11745R$id.add_shortcut_layout, "field 'mAddShortcutLayout' and method 'addShortcut'");
        sceneBundleSettingActivity.mAddShortcutLayout = (LinearLayout) Utils.castView(findRequiredView4, C11745R$id.add_shortcut_layout, "field 'mAddShortcutLayout'", LinearLayout.class);
        this.f11742e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5609d(this, sceneBundleSettingActivity));
        sceneBundleSettingActivity.mPbAddShortcut = (ProgressBar) Utils.findRequiredViewAsType(view, C11745R$id.progress_add_shortcut, "field 'mPbAddShortcut'", ProgressBar.class);
        View findRequiredView5 = Utils.findRequiredView(view, C11745R$id.scene_del, "method 'deleteRoom'");
        this.f11743f = findRequiredView5;
        findRequiredView5.setOnClickListener(new C5610e(this, sceneBundleSettingActivity));
    }

    @CallSuper
    public void unbind() {
        SceneBundleSettingActivity sceneBundleSettingActivity = this.f11738a;
        if (sceneBundleSettingActivity != null) {
            this.f11738a = null;
            sceneBundleSettingActivity.mTitleBar = null;
            sceneBundleSettingActivity.mTypeLayout = null;
            sceneBundleSettingActivity.mTypeImage = null;
            sceneBundleSettingActivity.mNameLayout = null;
            sceneBundleSettingActivity.mNameView = null;
            sceneBundleSettingActivity.mManagerLayout = null;
            sceneBundleSettingActivity.mNumberView = null;
            sceneBundleSettingActivity.mAddShortcutLayout = null;
            sceneBundleSettingActivity.mPbAddShortcut = null;
            this.f11739b.setOnClickListener((View.OnClickListener) null);
            this.f11739b = null;
            this.f11740c.setOnClickListener((View.OnClickListener) null);
            this.f11740c = null;
            this.f11741d.setOnClickListener((View.OnClickListener) null);
            this.f11741d = null;
            this.f11742e.setOnClickListener((View.OnClickListener) null);
            this.f11742e = null;
            this.f11743f.setOnClickListener((View.OnClickListener) null);
            this.f11743f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
