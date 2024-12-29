package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10521d;

/* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity */
public class ActionSheetActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f10256b;

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$a */
    class C4968a implements C10521d.C10525c {
        C4968a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            ActionSheetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$b */
    class C4969b implements View.OnClickListener {
        C4969b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddBrightFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f10256b);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$c */
    class C4970c implements View.OnClickListener {
        C4970c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddColorFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f10256b);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$d */
    class C4971d implements View.OnClickListener {
        C4971d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddColorTemperatureFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f10256b);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$e */
    class C4972e implements View.OnClickListener {
        C4972e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddSuspendFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f10256b);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$f */
    class C4973f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10521d f10262a;

        C4973f(ActionSheetActivity actionSheetActivity, C10521d dVar) {
            this.f10262a = dVar;
        }

        public void onClick(View view) {
            this.f10262a.dismiss();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130771988);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(2131493035);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        View inflate = View.inflate(this, 2131493091, (ViewGroup) null);
        if (inflate != null) {
            C10521d a = new C10521d.C10523b(this).mo33316a();
            a.mo33307d(new C4968a());
            this.f10256b = getIntent().getIntExtra("custom_scene_index", -1);
            ((TextView) inflate.findViewById(2131296377)).setOnClickListener(new C4969b());
            ((TextView) inflate.findViewById(2131296492)).setOnClickListener(new C4970c());
            ((TextView) inflate.findViewById(2131296521)).setOnClickListener(new C4971d());
            ((TextView) inflate.findViewById(2131297367)).setOnClickListener(new C4972e());
            ((TextView) inflate.findViewById(2131296452)).setOnClickListener(new C4973f(this, a));
            a.mo33309e(inflate);
            a.show();
            return;
        }
        finish();
    }
}
