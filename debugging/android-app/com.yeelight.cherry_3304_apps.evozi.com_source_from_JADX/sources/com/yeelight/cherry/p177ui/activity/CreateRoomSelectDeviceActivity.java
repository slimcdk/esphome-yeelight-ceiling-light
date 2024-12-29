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
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.RoomSelectDeviceAdapter;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity */
public class CreateRoomSelectDeviceActivity extends BaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: b */
    private RoomSelectDeviceAdapter f10577b;

    /* renamed from: c */
    private Uri f10578c = C7579c.C7580a.f15368a;

    /* renamed from: d */
    private String f10579d;

    /* renamed from: e */
    private int f10580e;
    @BindView(2131297043)
    Button mBtnComplete;
    @BindView(2131296591)
    RecyclerView mDeviceList;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$a */
    class C5105a implements View.OnClickListener {
        C5105a() {
        }

        public void onClick(View view) {
            CreateRoomSelectDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$b */
    class C5106b implements View.OnClickListener {
        C5106b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateRoomSelectDeviceActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            CreateRoomSelectDeviceActivity.this.startActivity(intent);
            CreateRoomSelectDeviceActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$c */
    class C5107c implements RoomSelectDeviceAdapter.C5857b {
        C5107c() {
        }

        /* renamed from: a */
        public void mo26279a(List<String> list) {
            int size = list.size();
            if (size > 0) {
                String valueOf = String.valueOf(size);
                String format = String.format(CreateRoomSelectDeviceActivity.this.getString(2131756170), new Object[]{Integer.valueOf(size)});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                int indexOf = format.indexOf(valueOf);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(CreateRoomSelectDeviceActivity.this.getResources().getColor(2131099839)), indexOf, valueOf.length() + indexOf, 33);
                CreateRoomSelectDeviceActivity.this.mTitleBar.setTitle(spannableStringBuilder);
                return;
            }
            CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity = CreateRoomSelectDeviceActivity.this;
            createRoomSelectDeviceActivity.mTitleBar.setTitle(createRoomSelectDeviceActivity.getString(2131755311));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$d */
    class C5108d implements View.OnClickListener {
        C5108d() {
        }

        public void onClick(View view) {
            CreateRoomSelectDeviceActivity.this.mo26272W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$e */
    class C5109e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f10585a;

        C5109e(List list) {
            this.f10585a = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CreateRoomSelectDeviceActivity.this.m16150Y(this.f10585a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomSelectDeviceActivity$f */
    class C5110f extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private Paint f10587a;

        /* renamed from: b */
        private int f10588b;

        public C5110f(CreateRoomSelectDeviceActivity createRoomSelectDeviceActivity) {
            Paint paint = new Paint();
            this.f10587a = paint;
            paint.setColor(createRoomSelectDeviceActivity.getResources().getColor(2131099797));
            this.f10588b = C10547m.m25751a(createRoomSelectDeviceActivity, 20.0f);
            this.f10587a.setStrokeWidth(2.0f);
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
                    canvas.drawLine(x, y, f3, y, this.f10587a);
                    f = x + ((float) this.f10588b);
                    f2 = y + ((float) height);
                } else if (i == childCount - 1) {
                    float f4 = y + ((float) height);
                    canvas.drawLine(x, f4, x + ((float) width), f4, this.f10587a);
                } else {
                    f = x + ((float) this.f10588b);
                    f2 = y + ((float) height);
                    f3 = x + ((float) width);
                }
                canvas.drawLine(f, f2, f3, f2, this.f10587a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16150Y(List<String> list) {
        C9875a m;
        String uuid = UUID.randomUUID().toString();
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        for (String o0 : strArr) {
            C4200i o02 = C4257w.m11953o0(o0);
            if (!(o02 == null || o02.mo23404Z() == null || (m = C9812t.m23832j().mo31686m(o02.mo23404Z())) == null)) {
                m.mo31949i().remove(o02);
                m.mo31942C(System.currentTimeMillis());
                C9812t.m23832j().mo31694x(m);
            }
        }
        C9812t.m23832j().mo31683e(new C9875a(uuid, this.f10580e, this.f10579d, System.currentTimeMillis(), strArr));
        Toast.makeText(this, getText(2131756151), 0).show();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(71303168);
        startActivity(intent);
        finish();
    }

    /* renamed from: W */
    public void mo26272W() {
        List<String> g = this.f10577b.mo27232g();
        if (!g.isEmpty()) {
            this.mBtnComplete.setEnabled(false);
            m16150Y(g);
            return;
        }
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i("" + getString(2131756153));
        eVar.mo33356g(getString(2131756152));
        C10526e b = eVar.mo33351b();
        b.mo33335g(-1, getString(2131755277), new C5109e(g));
        b.mo33335g(-2, getString(2131755309), (DialogInterface.OnClickListener) null);
        b.show();
    }

    /* renamed from: X */
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        this.f10577b.mo27123b(new C7601g(DeviceDataProvider.m22372G()));
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("room_name") || !getIntent().hasExtra("create_res_index")) {
            C4308b.m12139r("NoParamErr", "Need name or type");
            finish();
            return;
        }
        this.f10579d = getIntent().getStringExtra("room_name");
        this.f10580e = getIntent().getIntExtra("create_res_index", -1);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_room_select_device);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755311), new C5105a(), (View.OnClickListener) null);
        this.mTitleBar.setRightButtonClickListener(new C5106b());
        this.mTitleBar.setRightButtonResource(2131231200);
        this.mTitleBar.setRightButtonVisibility(0);
        this.mTitleBar.setTitleTextSize(16);
        this.f10577b = new RoomSelectDeviceAdapter(this, (Cursor) null);
        getLoaderManager().initLoader(0, (Bundle) null, this);
        this.mDeviceList.setLayoutManager(new LinearLayoutManager(this));
        this.mDeviceList.setAdapter(this.f10577b);
        this.mDeviceList.addItemDecoration(new C5110f(this));
        this.mDeviceList.setItemAnimator((RecyclerView.ItemAnimator) null);
        this.f10577b.mo27235j(new C5107c());
        this.mBtnComplete.setOnClickListener(new C5108d());
        this.mBtnComplete.setEnabled(true);
    }

    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, this.f10578c, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
