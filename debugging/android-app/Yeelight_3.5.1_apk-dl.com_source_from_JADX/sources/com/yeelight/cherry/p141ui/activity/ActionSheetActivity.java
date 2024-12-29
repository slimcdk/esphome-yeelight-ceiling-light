package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.widget.C8891a;

/* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity */
public class ActionSheetActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f9800a;

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$a */
    class C5013a implements C8891a.C8895c {
        C5013a() {
        }

        public void afterDismissCallBack() {
        }

        public void beforeDismissCallBack() {
            ActionSheetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$b */
    class C5014b implements View.OnClickListener {
        C5014b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddBrightFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f9800a);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$c */
    class C5015c implements View.OnClickListener {
        C5015c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddColorFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f9800a);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$d */
    class C5016d implements View.OnClickListener {
        C5016d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddColorTemperatureFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f9800a);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$e */
    class C5017e implements View.OnClickListener {
        C5017e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(ActionSheetActivity.this, AddSuspendFrameActivity.class);
            intent.putExtra("custom_scene_index", ActionSheetActivity.this.f9800a);
            ActionSheetActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ActionSheetActivity$f */
    class C5018f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8891a f9806a;

        C5018f(ActionSheetActivity actionSheetActivity, C8891a aVar) {
            this.f9806a = aVar;
        }

        public void onClick(View view) {
            this.f9806a.dismiss();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2130772000);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(2131493037);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        View inflate = View.inflate(this, 2131493095, (ViewGroup) null);
        if (inflate != null) {
            C8891a a = new C8891a.C8893b(this).mo36655a();
            a.mo36646d(new C5013a());
            this.f9800a = getIntent().getIntExtra("custom_scene_index", -1);
            ((TextView) inflate.findViewById(2131296435)).setOnClickListener(new C5014b());
            ((TextView) inflate.findViewById(2131296562)).setOnClickListener(new C5015c());
            ((TextView) inflate.findViewById(2131296594)).setOnClickListener(new C5016d());
            ((TextView) inflate.findViewById(2131297523)).setOnClickListener(new C5017e());
            ((TextView) inflate.findViewById(2131296513)).setOnClickListener(new C5018f(this, a));
            a.mo36648e(inflate);
            a.show();
            return;
        }
        finish();
    }
}
