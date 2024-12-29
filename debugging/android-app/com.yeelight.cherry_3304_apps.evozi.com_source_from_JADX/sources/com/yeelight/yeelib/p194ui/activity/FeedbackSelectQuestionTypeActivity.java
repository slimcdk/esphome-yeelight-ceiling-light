package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity */
public class FeedbackSelectQuestionTypeActivity extends BaseActivity {

    /* renamed from: b */
    private ListView f18355b;

    /* renamed from: c */
    private CommonTitleBar f18356c;

    /* renamed from: d */
    private ArrayAdapter<String> f18357d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String[] f18358e;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity$a */
    class C10026a implements View.OnClickListener {
        C10026a() {
        }

        public void onClick(View view) {
            FeedbackSelectQuestionTypeActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSelectQuestionTypeActivity$b */
    class C10027b implements AdapterView.OnItemClickListener {
        C10027b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent();
            intent.putExtra("name", FeedbackSelectQuestionTypeActivity.this.f18358e[i]);
            if (i == FeedbackSelectQuestionTypeActivity.this.f18358e.length - 1) {
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
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_feedback_select_question_type);
        this.f18356c = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18355b = (ListView) findViewById(R$id.question_list);
        this.f18356c.mo32825a(getString(R$string.feature_feedback), new C10026a(), (View.OnClickListener) null);
        this.f18358e = new String[]{getString(R$string.feedback_category_account), getString(R$string.feedback_category_device_connect), getString(R$string.feedback_category_device_control), getString(R$string.slide_item_third_party), getString(R$string.feedback_category_localization), getString(R$string.feedback_category_suggestion), getString(R$string.feedback_category_beta_feedback), getString(R$string.feedback_category_others)};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R$layout.item_question_type_select, R$id.text, this.f18358e);
        this.f18357d = arrayAdapter;
        this.f18355b.setAdapter(arrayAdapter);
        int intExtra = getIntent().getIntExtra("id", -2);
        if (intExtra == -1) {
            this.f18355b.setItemChecked(this.f18358e.length - 1, true);
        } else if (intExtra > -1) {
            this.f18355b.setItemChecked(intExtra, true);
        }
        this.f18355b.setDivider(getResources().getDrawable(R$drawable.device_list_divider_background_dark));
        this.f18355b.setDividerHeight(1);
        this.f18355b.setSelector(R$drawable.common_item_selector);
        this.f18355b.setOnItemClickListener(new C10027b());
    }
}
