package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;

/* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity_ViewBinding */
public class GroupRhythmActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupRhythmActivity f10559a;

    @UiThread
    public GroupRhythmActivity_ViewBinding(GroupRhythmActivity groupRhythmActivity, View view) {
        this.f10559a = groupRhythmActivity;
        groupRhythmActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        groupRhythmActivity.mRadioGroup = (RadioGroup) Utils.findRequiredViewAsType(view, C12225R$id.btn_group, "field 'mRadioGroup'", RadioGroup.class);
        groupRhythmActivity.mPickerView = (WheelPicker) Utils.findRequiredViewAsType(view, 2131297439, "field 'mPickerView'", WheelPicker.class);
        groupRhythmActivity.mBtnControl = (TextView) Utils.findRequiredViewAsType(view, 2131296464, "field 'mBtnControl'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        GroupRhythmActivity groupRhythmActivity = this.f10559a;
        if (groupRhythmActivity != null) {
            this.f10559a = null;
            groupRhythmActivity.mTitleBar = null;
            groupRhythmActivity.mRadioGroup = null;
            groupRhythmActivity.mPickerView = null;
            groupRhythmActivity.mBtnControl = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
