package com.yeelight.yeelib_tasker.p143ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yeelight.yeelib.R$anim;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.widget.C8891a;

/* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity */
public class TypeSheetActivity extends BaseActivity {

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$a */
    class C8925a implements C8891a.C8895c {
        C8925a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            TypeSheetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$b */
    class C8926b implements View.OnClickListener {
        C8926b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_device");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$c */
    class C8927c implements View.OnClickListener {
        C8927c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_group");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$d */
    class C8928d implements View.OnClickListener {
        C8928d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_room");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$e */
    class C8929e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8891a f16423a;

        C8929e(TypeSheetActivity typeSheetActivity, C8891a aVar) {
            this.f16423a = aVar;
        }

        public void onClick(View view) {
            this.f16423a.dismiss();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R$anim.device_prompt_finish_anim);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_transparent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        View inflate = View.inflate(this, R$layout.device_type_select_layout, (ViewGroup) null);
        if (inflate != null) {
            C8891a a = new C8891a.C8893b(this).mo36655a();
            a.mo36646d(new C8925a());
            ((TextView) inflate.findViewById(R$id.type_device)).setOnClickListener(new C8926b());
            ((TextView) inflate.findViewById(R$id.type_group)).setOnClickListener(new C8927c());
            ((TextView) inflate.findViewById(R$id.type_room)).setOnClickListener(new C8928d());
            ((TextView) inflate.findViewById(R$id.cancel_button)).setOnClickListener(new C8929e(this, a));
            a.mo36648e(inflate);
            a.show();
            return;
        }
        finish();
    }
}
