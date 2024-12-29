package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity */
public class FeedbackSelectQuestionTypeActivity extends BaseActivity {

    /* renamed from: a */
    private ListView f14663a;

    /* renamed from: b */
    private CommonTitleBar f14664b;

    /* renamed from: c */
    private ArrayAdapter<String> f14665c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String[] f14666d;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity$a */
    class C8444a implements View.OnClickListener {
        C8444a() {
        }

        public void onClick(View view) {
            FeedbackSelectQuestionTypeActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity$b */
    class C8445b implements AdapterView.OnItemClickListener {
        C8445b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent();
            intent.putExtra("name", FeedbackSelectQuestionTypeActivity.this.f14666d[i]);
            if (i == FeedbackSelectQuestionTypeActivity.this.f14666d.length - 1) {
                i = -1;
            }
            intent.putExtra("id", i);
            FeedbackSelectQuestionTypeActivity.this.setResult(-1, intent);
            FeedbackSelectQuestionTypeActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_feedback_select_question_type);
        this.f14664b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14663a = (ListView) findViewById(R$id.question_list);
        this.f14664b.mo36195a(getString(R$string.feature_feedback), new C8444a(), (View.OnClickListener) null);
        this.f14666d = new String[]{getString(R$string.feedback_category_account), getString(R$string.feedback_category_device_connect), getString(R$string.feedback_category_device_control), getString(R$string.slide_item_third_party), getString(R$string.feedback_category_localization), getString(R$string.feedback_category_suggestion), getString(R$string.feedback_category_beta_feedback), getString(R$string.feedback_category_others)};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R$layout.item_question_type_select, R$id.text, this.f14666d);
        this.f14665c = arrayAdapter;
        this.f14663a.setAdapter(arrayAdapter);
        int intExtra = getIntent().getIntExtra("id", -2);
        if (intExtra == -1) {
            this.f14663a.setItemChecked(this.f14666d.length - 1, true);
        } else if (intExtra > -1) {
            this.f14663a.setItemChecked(intExtra, true);
        }
        this.f14663a.setDivider(getResources().getDrawable(R$drawable.device_list_divider_background_dark));
        this.f14663a.setDividerHeight(1);
        this.f14663a.setSelector(R$drawable.common_item_selector);
        this.f14663a.setOnItemClickListener(new C8445b());
    }
}
