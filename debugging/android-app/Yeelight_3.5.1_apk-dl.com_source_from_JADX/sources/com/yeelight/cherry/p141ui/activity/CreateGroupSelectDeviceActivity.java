package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.GroupSelectDeviceAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity */
public class CreateGroupSelectDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: a */
    private GroupSelectDeviceAdapter f10087a;

    /* renamed from: b */
    private Uri f10088b = C6043b.f12322d;

    /* renamed from: c */
    private Uri f10089c = C6043b.f12323e;

    /* renamed from: d */
    private Uri f10090d = C6043b.f12324f;

    /* renamed from: e */
    private Uri f10091e = C6043b.f12325g;

    /* renamed from: f */
    private Uri f10092f = C6043b.f12326h;

    /* renamed from: g */
    private String f10093g;

    /* renamed from: h */
    private String f10094h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f10095i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f10096j = new Handler(new C5130a());
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$a */
    class C5130a implements Handler.Callback {
        C5130a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(C3108x.f4951e, CreateGroupSelectDeviceActivity.this.getString(2131756175), 0).show();
                Intent intent = new Intent(CreateGroupSelectDeviceActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateGroupSelectDeviceActivity.this.startActivity(intent);
                CreateGroupSelectDeviceActivity.this.finish();
            } else if (i == 2) {
                CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = CreateGroupSelectDeviceActivity.this;
                Toast.makeText(createGroupSelectDeviceActivity, createGroupSelectDeviceActivity.getString(2131756174), 0).show();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$b */
    class C5131b implements View.OnClickListener {
        C5131b() {
        }

        public void onClick(View view) {
            CreateGroupSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$c */
    class C5132c implements View.OnClickListener {
        C5132c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateGroupSelectDeviceActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            CreateGroupSelectDeviceActivity.this.startActivity(intent);
            CreateGroupSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$d */
    class C5133d implements GroupSelectDeviceAdapter.C5878b {
        C5133d() {
        }

        /* renamed from: a */
        public void mo30299a(List<String> list) {
            int size = list.size();
            if (size > 0) {
                String valueOf = String.valueOf(size);
                String format = String.format(CreateGroupSelectDeviceActivity.this.getString(2131756194), new Object[]{Integer.valueOf(size)});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                int indexOf = format.indexOf(valueOf);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(CreateGroupSelectDeviceActivity.this.getResources().getColor(2131099842)), indexOf, valueOf.length() + indexOf, 33);
                CreateGroupSelectDeviceActivity.this.mTitleBar.setTitle(spannableStringBuilder);
                return;
            }
            CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity = CreateGroupSelectDeviceActivity.this;
            createGroupSelectDeviceActivity.mTitleBar.setTitle(createGroupSelectDeviceActivity.getString(2131755315));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$e */
    class C5134e extends MiotBleResponse {
        C5134e() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    if (TextUtils.equals(jSONObject.getString("code"), TimerCodec.DISENABLE)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        String string = jSONObject2.getString("group_did");
                        boolean z = jSONObject2.getBoolean("need_alter_device");
                        StringBuilder sb = new StringBuilder();
                        sb.append("groupDid = ");
                        sb.append(string);
                        sb.append(" ,alterDevice = ");
                        sb.append(z);
                        CreateGroupSelectDeviceActivity.this.f10096j.sendEmptyMessage(1);
                    } else {
                        CreateGroupSelectDeviceActivity.this.f10096j.sendEmptyMessage(2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            boolean unused = CreateGroupSelectDeviceActivity.this.f10095i = false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupSelectDeviceActivity$f */
    class C5135f extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private Paint f10102a;

        /* renamed from: b */
        private int f10103b;

        public C5135f(CreateGroupSelectDeviceActivity createGroupSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f10102a = paint;
            paint.setColor(createGroupSelectDeviceActivity.getResources().getColor(2131099800));
            this.f10103b = C9193k.m22150a(createGroupSelectDeviceActivity, 20.0f);
            this.f10102a.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, f3, y, this.f10102a);
                    f = x + ((float) this.f10103b);
                    f2 = y + ((float) height);
                } else if (i == childCount - 1) {
                    float f4 = y + ((float) height);
                    canvas.drawLine(x, f4, x + ((float) width), f4, this.f10102a);
                } else {
                    f = x + ((float) this.f10103b);
                    f2 = y + ((float) height);
                    f3 = x + ((float) width);
                }
                canvas.drawLine(f, f2, f3, f2, this.f10102a);
            }
        }
    }

    /* renamed from: Y */
    private void m16036Y(List<C3010c> list) {
        if (TextUtils.equals(this.f10094h, "yeelink.light.dn2grp") || TextUtils.equals(this.f10094h, "yeelink.light.mb1grp") || TextUtils.equals(this.f10094h, "yeelink.light.mb2grp") || TextUtils.equals(this.f10094h, "yeelink.light.sp1grp")) {
            if (!this.f10095i) {
                this.f10095i = true;
                XmBluetoothManager.getInstance().createLightGroup((ArrayList) this.f10087a.mo31133h(), this.f10093g, new C5134e());
            }
        } else if (DeviceDataProvider.m17618c(this.f10093g, list) == null) {
            Toast.makeText(C3108x.f4951e, getString(2131756175), 0).show();
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(71303168);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, getString(2131756174), 0).show();
        }
    }

    /* renamed from: X */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        this.f10087a.mo31092b(new C6065f(cursor));
    }

    @OnClick({2131297165})
    public void completeSelect(View view) {
        List<C3010c> g = this.f10087a.mo31132g();
        if (!g.isEmpty()) {
            m16036Y(g);
            return;
        }
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i("" + getString(2131756177)).mo37176f(2131755716).mo37174d(-1, getString(2131755313), (DialogInterface.OnClickListener) null).mo37172b().show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10094h = getIntent().getStringExtra("type_group");
        this.f10093g = getIntent().getStringExtra("group_name");
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_room_select_device);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755315), new C5131b(), (View.OnClickListener) null);
        this.mTitleBar.setRightButtonClickListener(new C5132c());
        this.mTitleBar.setRightButtonResource(2131231214);
        this.mTitleBar.setRightButtonVisibility(0);
        this.mTitleBar.setTitleTextSize(16);
        this.f10087a = new GroupSelectDeviceAdapter(this, (Cursor) null);
        getLoaderManager().initLoader(0, (Bundle) null, this);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10087a);
        this.mDeviceList.addItemDecoration(new C5135f(this));
        this.mDeviceList.setItemAnimator((RecyclerView.ItemAnimator) null);
        this.f10087a.mo31136k(new C5133d());
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        CursorLoader cursorLoader;
        if (TextUtils.equals(this.f10094h, "yeelink.light.dn2grp")) {
            return new CursorLoader(this, this.f10089c, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10094h, "yeelink.light.mb1grp")) {
            return new CursorLoader(this, this.f10090d, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10094h, "yeelink.light.mb2grp")) {
            return new CursorLoader(this, this.f10091e, (String[]) null, (String) null, (String[]) null, (String) null);
        } else if (TextUtils.equals(this.f10094h, "yeelink.light.sp1grp")) {
            Uri uri = this.f10092f;
            return cursorLoader;
        } else {
            new CursorLoader(this, this.f10088b, (String[]) null, (String) null, (String[]) null, (String) null);
            return cursorLoader;
        }
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
