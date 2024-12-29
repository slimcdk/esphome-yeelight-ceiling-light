package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.inuker.bluetooth.library.Constants;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.api.bluetooth.response.MiotBleResponse;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.GroupSelectDeviceAdapter;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity */
public class CreateGroupSelectDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: b */
    private GroupSelectDeviceAdapter f10536b;

    /* renamed from: c */
    private Uri f10537c = C7579c.f15363h;

    /* renamed from: d */
    private Uri f10538d = C7579c.f15364i;

    /* renamed from: e */
    private Uri f10539e = C7579c.f15365j;

    /* renamed from: f */
    private Uri f10540f = C7579c.f15366k;

    /* renamed from: g */
    private Uri f10541g = C7579c.f15367l;

    /* renamed from: h */
    private String f10542h;

    /* renamed from: i */
    private String f10543i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10544j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f10545k = new Handler(new C5083a());
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$a */
    class C5083a implements Handler.Callback {
        C5083a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(C4297y.f7456e, CreateGroupSelectDeviceActivity.this.getString(2131756151), 0).show();
                Intent intent = new Intent(CreateGroupSelectDeviceActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateGroupSelectDeviceActivity.this.startActivity(intent);
                CreateGroupSelectDeviceActivity.this.finish();
            } else if (i == 2) {
                CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = CreateGroupSelectDeviceActivity.this;
                Toast.makeText(createGroupSelectDeviceActivity, createGroupSelectDeviceActivity.getString(2131756150), 0).show();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$b */
    class C5084b implements View.OnClickListener {
        C5084b() {
        }

        public void onClick(View view) {
            CreateGroupSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$c */
    class C5085c implements View.OnClickListener {
        C5085c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateGroupSelectDeviceActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            CreateGroupSelectDeviceActivity.this.startActivity(intent);
            CreateGroupSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$d */
    class C5086d implements GroupSelectDeviceAdapter.C5815b {
        C5086d() {
        }

        /* renamed from: a */
        public void mo26253a(List<String> list) {
            int size = list.size();
            if (size > 0) {
                String valueOf = String.valueOf(size);
                String format = String.format(CreateGroupSelectDeviceActivity.this.getString(2131756170), new Object[]{Integer.valueOf(size)});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                int indexOf = format.indexOf(valueOf);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(CreateGroupSelectDeviceActivity.this.getResources().getColor(2131099839)), indexOf, valueOf.length() + indexOf, 33);
                CreateGroupSelectDeviceActivity.this.mTitleBar.setTitle(spannableStringBuilder);
                return;
            }
            CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = CreateGroupSelectDeviceActivity.this;
            createGroupSelectDeviceActivity.mTitleBar.setTitle(createGroupSelectDeviceActivity.getString(2131755311));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$e */
    class C5087e extends MiotBleResponse {
        C5087e() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    if (TextUtils.equals(jSONObject.getString("code"), TimerCodec.DISENABLE)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        "groupDid = " + jSONObject2.getString("group_did") + " ,alterDevice = " + jSONObject2.getBoolean("need_alter_device");
                        CreateGroupSelectDeviceActivity.this.f10545k.sendEmptyMessage(1);
                    } else {
                        CreateGroupSelectDeviceActivity.this.f10545k.sendEmptyMessage(2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            boolean unused = CreateGroupSelectDeviceActivity.this.f10544j = false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$f */
    class C5088f extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private Paint f10551a;

        /* renamed from: b */
        private int f10552b;

        public C5088f(CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f10551a = paint;
            paint.setColor(createGroupSelectDeviceActivity.getResources().getColor(2131099797));
            this.f10552b = C10547m.m25751a(createGroupSelectDeviceActivity, 20.0f);
            this.f10551a.setStrokeWidth(2.0f);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            float f;
            float f2;
            float f3;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                float x = childAt.getX();
                float y = childAt.getY();
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (i == 0) {
                    f3 = x + ((float) width);
                    canvas.drawLine(x, y, f3, y, this.f10551a);
                    f = x + ((float) this.f10552b);
                    f2 = y + ((float) height);
                } else if (i == childCount - 1) {
                    float f4 = y + ((float) height);
                    canvas.drawLine(x, f4, x + ((float) width), f4, this.f10551a);
                } else {
                    f = x + ((float) this.f10552b);
                    f2 = y + ((float) height);
                    f3 = x + ((float) width);
                }
                canvas.drawLine(f, f2, f3, f2, this.f10551a);
            }
        }
    }

    /* renamed from: Y */
    private void m16137Y(List<C4198d> list) {
        if (TextUtils.equals(this.f10543i, "yeelink.light.dn2grp") || TextUtils.equals(this.f10543i, "yeelink.light.mb1grp") || TextUtils.equals(this.f10543i, "yeelink.light.mb2grp") || TextUtils.equals(this.f10543i, "yeelink.light.sp1grp")) {
            if (!this.f10544j) {
                this.f10544j = true;
                XmBluetoothManager.getInstance().createLightGroup((ArrayList) this.f10536b.mo27166h(), this.f10542h, new C5087e());
            }
        } else if (DeviceDataProvider.m22396c(this.f10542h, list) == null) {
            Toast.makeText(C4297y.f7456e, getString(2131756151), 0).show();
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(71303168);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, getString(2131756150), 0).show();
        }
    }

    /* renamed from: X */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        this.f10536b.mo27123b(new C7601g(cursor));
    }

    @OnClick({2131297043})
    public void completeSelect(View view) {
        List<C4198d> g = this.f10536b.mo27165g();
        if (!g.isEmpty()) {
            m16137Y(g);
            return;
        }
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i("" + getString(2131756153));
        eVar.mo33355f(2131755708);
        eVar.mo33353d(-1, getString(2131755309), (DialogInterface.OnClickListener) null);
        eVar.mo33351b().show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10543i = getIntent().getStringExtra("type_group");
        this.f10542h = getIntent().getStringExtra("group_name");
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_room_select_device);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755311), new C5084b(), (View.OnClickListener) null);
        this.mTitleBar.setRightButtonClickListener(new C5085c());
        this.mTitleBar.setRightButtonResource(2131231200);
        this.mTitleBar.setRightButtonVisibility(0);
        this.mTitleBar.setTitleTextSize(16);
        this.f10536b = new GroupSelectDeviceAdapter(this, (Cursor) null);
        getLoaderManager().initLoader(0, (Bundle) null, this);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10536b);
        this.mDeviceList.addItemDecoration(new C5088f(this));
        this.mDeviceList.setItemAnimator((RecyclerView.ItemAnimator) null);
        this.f10536b.mo27169k(new C5086d());
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader;
        if (TextUtils.equals(this.f10543i, "yeelink.light.dn2grp")) {
            return new CursorLoader(this, this.f10538d, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10543i, "yeelink.light.mb1grp")) {
            return new CursorLoader(this, this.f10539e, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10543i, "yeelink.light.mb2grp")) {
            return new CursorLoader(this, this.f10540f, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10543i, "yeelink.light.sp1grp")) {
            Uri uri = this.f10541g;
            return cursorLoader;
        } else {
            new CursorLoader(this, this.f10537c, (String[]) null, (String) null, (String[]) null, (String) null);
            return cursorLoader;
        }
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
