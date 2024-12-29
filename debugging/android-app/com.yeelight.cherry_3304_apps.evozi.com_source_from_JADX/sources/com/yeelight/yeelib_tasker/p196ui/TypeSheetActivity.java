package com.yeelight.yeelib_tasker.p196ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yeelight.yeelib.R$anim;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10521d;

/* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity */
public class TypeSheetActivity extends BaseActivity {

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$a */
    class C10597a implements C10521d.C10525c {
        C10597a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            TypeSheetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$b */
    class C10598b implements View.OnClickListener {
        C10598b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_device");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$c */
    class C10599c implements View.OnClickListener {
        C10599c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_group");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$d */
    class C10600d implements View.OnClickListener {
        C10600d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TypeSheetActivity.this, TaskerDeviceSelectActivity.class);
            intent.putExtra("com.yeelight.cherry.type", "type_room");
            TypeSheetActivity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TypeSheetActivity$e */
    class C10601e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10521d f20280a;

        C10601e(TypeSheetActivity typeSheetActivity, C10521d dVar) {
            this.f20280a = dVar;
        }

        public void onClick(View view) {
            this.f20280a.dismiss();
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
        mo32193P();
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
            C10521d a = new C10521d.C10523b(this).mo33316a();
            a.mo33307d(new C10597a());
            ((TextView) inflate.findViewById(R$id.type_device)).setOnClickListener(new C10598b());
            ((TextView) inflate.findViewById(R$id.type_group)).setOnClickListener(new C10599c());
            ((TextView) inflate.findViewById(R$id.type_room)).setOnClickListener(new C10600d());
            ((TextView) inflate.findViewById(R$id.cancel_button)).setOnClickListener(new C10601e(this, a));
            a.mo33309e(inflate);
            a.show();
            return;
        }
        finish();
    }
}
