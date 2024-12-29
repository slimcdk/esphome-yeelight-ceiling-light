package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity_ViewBinding */
public class CreateRoomNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateRoomNameActivity f10574a;

    /* renamed from: b */
    private View f10575b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity_ViewBinding$a */
    class C5104a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateRoomNameActivity f10576a;

        C5104a(CreateRoomNameActivity_ViewBinding createRoomNameActivity_ViewBinding, CreateRoomNameActivity createRoomNameActivity) {
            this.f10576a = createRoomNameActivity;
        }

        public void doClick(View view) {
            this.f10576a.nextStep();
        }
    }

    @UiThread
    public CreateRoomNameActivity_ViewBinding(CreateRoomNameActivity createRoomNameActivity, View view) {
        this.f10574a = createRoomNameActivity;
        createRoomNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        createRoomNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_name, "field 'mEtName'", EditText.class);
        createRoomNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C11745R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        createRoomNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297043, "field 'mBtnNext' and method 'nextStep'");
        createRoomNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297043, "field 'mBtnNext'", TextView.class);
        this.f10575b = findRequiredView;
        findRequiredView.setOnClickListener(new C5104a(this, createRoomNameActivity));
    }

    @CallSuper
    public void unbind() {
        CreateRoomNameActivity createRoomNameActivity = this.f10574a;
        if (createRoomNameActivity != null) {
            this.f10574a = null;
            createRoomNameActivity.mTitleBar = null;
            createRoomNameActivity.mEtName = null;
            createRoomNameActivity.mBtnClear = null;
            createRoomNameActivity.mTypeImageView = null;
            createRoomNameActivity.mBtnNext = null;
            this.f10575b.setOnClickListener((View.OnClickListener) null);
            this.f10575b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
