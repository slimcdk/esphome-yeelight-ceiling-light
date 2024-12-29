package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity_ViewBinding */
public class CreateRoomNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateRoomNameActivity f10125a;

    /* renamed from: b */
    private View f10126b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity_ViewBinding$a */
    class C5151a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateRoomNameActivity f10127a;

        C5151a(CreateRoomNameActivity_ViewBinding createRoomNameActivity_ViewBinding, CreateRoomNameActivity createRoomNameActivity) {
            this.f10127a = createRoomNameActivity;
        }

        public void doClick(View view) {
            this.f10127a.nextStep();
        }
    }

    @UiThread
    public CreateRoomNameActivity_ViewBinding(CreateRoomNameActivity createRoomNameActivity, View view) {
        this.f10125a = createRoomNameActivity;
        createRoomNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        createRoomNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C12225R$id.et_name, "field 'mEtName'", EditText.class);
        createRoomNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C12225R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        createRoomNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297165, "field 'mBtnNext' and method 'nextStep'");
        createRoomNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297165, "field 'mBtnNext'", TextView.class);
        this.f10126b = findRequiredView;
        findRequiredView.setOnClickListener(new C5151a(this, createRoomNameActivity));
    }

    @CallSuper
    public void unbind() {
        CreateRoomNameActivity createRoomNameActivity = this.f10125a;
        if (createRoomNameActivity != null) {
            this.f10125a = null;
            createRoomNameActivity.mTitleBar = null;
            createRoomNameActivity.mEtName = null;
            createRoomNameActivity.mBtnClear = null;
            createRoomNameActivity.mTypeImageView = null;
            createRoomNameActivity.mBtnNext = null;
            this.f10126b.setOnClickListener((View.OnClickListener) null);
            this.f10126b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
