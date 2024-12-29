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
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.RoomSelectDeviceAdapter;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import java.util.UUID;
import p051j4.C9193k;
import p145d4.C8937a;
import p170i4.C9107b;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity */
public class CreateRoomSelectDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: a */
    private RoomSelectDeviceAdapter f10128a;

    /* renamed from: b */
    private Uri f10129b = C6043b.C6044a.f12327a;

    /* renamed from: c */
    private String f10130c;

    /* renamed from: d */
    private int f10131d;

    /* renamed from: e */
    private C9107b.C9109b f10132e = null;
    @BindView(2131297165)
    Button mBtnComplete;
    @BindView(2131296669)
    RecyclerView mDeviceList;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$a */
    class C5152a implements View.OnClickListener {
        C5152a() {
        }

        public void onClick(View view) {
            CreateRoomSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$b */
    class C5153b implements View.OnClickListener {
        C5153b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateRoomSelectDeviceActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            CreateRoomSelectDeviceActivity.this.startActivity(intent);
            CreateRoomSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$c */
    class C5154c implements RoomSelectDeviceAdapter.C5920b {
        C5154c() {
        }

        /* renamed from: a */
        public void mo30325a(List<String> list) {
            int size = list.size();
            if (size > 0) {
                String valueOf = String.valueOf(size);
                String format = String.format(CreateRoomSelectDeviceActivity.this.getString(2131756194), new Object[]{Integer.valueOf(size)});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                int indexOf = format.indexOf(valueOf);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(CreateRoomSelectDeviceActivity.this.getResources().getColor(2131099842)), indexOf, valueOf.length() + indexOf, 33);
                CreateRoomSelectDeviceActivity.this.mTitleBar.setTitle(spannableStringBuilder);
                return;
            }
            CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity = CreateRoomSelectDeviceActivity.this;
            createRoomSelectDeviceActivity.mTitleBar.setTitle(createRoomSelectDeviceActivity.getString(2131755315));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$d */
    class C5155d implements View.OnClickListener {
        C5155d() {
        }

        public void onClick(View view) {
            CreateRoomSelectDeviceActivity.this.mo30318X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$e */
    class C5156e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f10137a;

        C5156e(List list) {
            this.f10137a = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CreateRoomSelectDeviceActivity.this.m16051a0(this.f10137a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$f */
    class C5157f implements C8293t.C8299f {
        C5157f() {
        }

        /* renamed from: a */
        public void mo30328a() {
        }

        /* renamed from: b */
        public void mo30329b() {
            CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity = CreateRoomSelectDeviceActivity.this;
            Toast.makeText(createRoomSelectDeviceActivity, createRoomSelectDeviceActivity.getText(2131756175), 0).show();
            Intent intent = new Intent(CreateRoomSelectDeviceActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            CreateRoomSelectDeviceActivity.this.startActivity(intent);
            CreateRoomSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$g */
    class C5158g extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private Paint f10140a;

        /* renamed from: b */
        private int f10141b;

        public C5158g(CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f10140a = paint;
            paint.setColor(createRoomSelectDeviceActivity.getResources().getColor(2131099800));
            this.f10141b = C9193k.m22150a(createRoomSelectDeviceActivity, 20.0f);
            this.f10140a.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, f3, y, this.f10140a);
                    f = x + ((float) this.f10141b);
                    f2 = y + ((float) height);
                } else if (i == childCount - 1) {
                    float f4 = y + ((float) height);
                    canvas.drawLine(x, f4, x + ((float) width), f4, this.f10140a);
                } else {
                    f = x + ((float) this.f10141b);
                    f2 = y + ((float) height);
                    f3 = x + ((float) width);
                }
                canvas.drawLine(f, f2, f3, f2, this.f10140a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m16050Y() {
        C9107b.C9109b bVar = new C9107b.C9109b(this);
        this.f10132e = bVar;
        bVar.mo37129c(10000);
        this.f10132e.mo37128b(0, "");
        this.f10132e.mo37130d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16051a0(List<String> list) {
        C8937a p;
        String uuid = UUID.randomUUID().toString();
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        for (String r0 : strArr) {
            C3012e r02 = YeelightDeviceManager.m7804r0(r0);
            if (!(r02 == null || r02.mo23217Z() == null || (p = C8293t.m19620n().mo35256p(r02.mo23217Z())) == null)) {
                p.mo36718i().remove(r02);
                p.mo36711C(System.currentTimeMillis());
                C8293t.m19620n().mo35251A(p);
            }
        }
        C8937a aVar = new C8937a(uuid, this.f10131d, this.f10130c, System.currentTimeMillis(), strArr);
        m16052b0();
        C8293t.m19620n().mo35252i(aVar, new C5157f());
    }

    /* renamed from: b0 */
    private void m16052b0() {
        runOnUiThread(new C5753f0(this));
    }

    /* renamed from: X */
    public void mo30318X() {
        List<String> g = this.f10128a.mo31197g();
        if (!g.isEmpty()) {
            this.mBtnComplete.setEnabled(false);
            m16051a0(g);
            return;
        }
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        C9113d b = eVar.mo37179i("" + getString(2131756177)).mo37177g(getString(2131756176)).mo37172b();
        b.mo37156g(-1, getString(2131755281), new C5156e(g));
        b.mo37156g(-2, getString(2131755313), (DialogInterface.OnClickListener) null);
        b.show();
    }

    /* renamed from: Z */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        this.f10128a.mo31092b(new C6065f(DeviceDataProvider.m17594G()));
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("room_name") || !getIntent().hasExtra("create_res_index")) {
            AppUtils.m8300u("NoParamErr", "Need name or type");
            finish();
            return;
        }
        this.f10130c = getIntent().getStringExtra("room_name");
        this.f10131d = getIntent().getIntExtra("create_res_index", -1);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_room_select_device);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755315), new C5152a(), (View.OnClickListener) null);
        this.mTitleBar.setRightButtonClickListener(new C5153b());
        this.mTitleBar.setRightButtonResource(2131231214);
        this.mTitleBar.setRightButtonVisibility(0);
        this.mTitleBar.setTitleTextSize(16);
        this.f10128a = new RoomSelectDeviceAdapter(this, (Cursor) null);
        getLoaderManager().initLoader(0, (Bundle) null, this);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10128a);
        this.mDeviceList.addItemDecoration(new C5158g(this));
        this.mDeviceList.setItemAnimator((RecyclerView.ItemAnimator) null);
        this.f10128a.mo31200j(new C5154c());
        this.mBtnComplete.setOnClickListener(new C5155d());
        this.mBtnComplete.setEnabled(true);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f10129b, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
