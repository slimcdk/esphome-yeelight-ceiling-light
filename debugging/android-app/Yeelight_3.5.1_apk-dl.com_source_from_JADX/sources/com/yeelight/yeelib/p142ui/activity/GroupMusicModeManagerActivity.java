package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8282n;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.MusicModeNotificationService;
import java.util.ArrayList;
import java.util.Iterator;
import p051j4.C9193k;
import p227x3.C11981q;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity */
public class GroupMusicModeManagerActivity extends BaseActivity implements C12145e {

    /* renamed from: a */
    CommonTitleBar f14729a;

    /* renamed from: b */
    ListView f14730b;

    /* renamed from: c */
    TextView f14731c;

    /* renamed from: d */
    TextView f14732d;

    /* renamed from: e */
    C8475g f14733e;

    /* renamed from: f */
    C6119c f14734f;

    /* renamed from: g */
    ArrayList<C3012e> f14735g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f14736h = new C8471d();

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$a */
    class C8468a implements View.OnClickListener {
        C8468a() {
        }

        public void onClick(View view) {
            GroupMusicModeManagerActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$b */
    class C8469b implements View.OnClickListener {
        C8469b() {
        }

        public void onClick(View view) {
            for (int i = 0; i < GroupMusicModeManagerActivity.this.f14734f.mo31753K1().size(); i++) {
                if (GroupMusicModeManagerActivity.this.f14734f.mo23229n0(21)) {
                    C8282n.m19569s(GroupMusicModeManagerActivity.this).mo35229B((WifiDeviceBase) GroupMusicModeManagerActivity.this.f14734f.mo31753K1().get(i), true);
                }
            }
            GroupMusicModeManagerActivity.this.m20142e0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$c */
    class C8470c implements View.OnClickListener {
        C8470c() {
        }

        public void onClick(View view) {
            for (int i = 0; i < GroupMusicModeManagerActivity.this.f14734f.mo31753K1().size(); i++) {
                if (GroupMusicModeManagerActivity.this.f14734f.mo23229n0(21)) {
                    C8282n.m19569s(GroupMusicModeManagerActivity.this).mo35229B((WifiDeviceBase) GroupMusicModeManagerActivity.this.f14734f.mo31753K1().get(i), false);
                }
            }
            GroupMusicModeManagerActivity.this.m20141d0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$d */
    class C8471d extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$d$a */
        class C8472a implements Runnable {
            C8472a() {
            }

            public void run() {
                GroupMusicModeManagerActivity.this.f14733e.notifyDataSetChanged();
            }
        }

        C8471d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GroupMusicModeManagerActivity.this.m20140c0((WifiDeviceBase) YeelightDeviceManager.m7794j0(message.getData().getString("com.yeelight.cherry.device_id")));
            } else if (i == 2) {
                GroupMusicModeManagerActivity.this.runOnUiThread(new C8472a());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$e */
    class C8473e implements DeviceManager.QueryFirmwareHandler {

        /* renamed from: a */
        final /* synthetic */ WifiDeviceBase f14742a;

        C8473e(WifiDeviceBase wifiDeviceBase) {
            this.f14742a = wifiDeviceBase;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            this.f14742a.mo23191J0(new C11981q(miotFirmware));
            if (miotFirmware.isLatestVersion()) {
                GroupMusicModeManagerActivity.this.f14736h.sendEmptyMessage(2);
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("com.yeelight.cherry.device_id", this.f14742a.mo23185G());
            message.setData(bundle);
            message.what = 1;
            GroupMusicModeManagerActivity.this.f14736h.sendMessageDelayed(message, 3000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$f */
    class C8474f implements Runnable {
        C8474f() {
        }

        public void run() {
            GroupMusicModeManagerActivity.this.f14733e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g */
    private class C8475g extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g$a */
        class C8476a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C3012e f14746a;

            C8476a(C3012e eVar) {
                this.f14746a = eVar;
            }

            public void onClick(View view) {
                boolean z = false;
                C8282n.m19569s(GroupMusicModeManagerActivity.this).mo35229B((WifiDeviceBase) this.f14746a, false);
                Iterator<C3012e> it = GroupMusicModeManagerActivity.this.f14734f.mo31753K1().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo23221d0().mo31580b0()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    GroupMusicModeManagerActivity.this.m20141d0();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g$b */
        class C8477b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C3012e f14748a;

            C8477b(C3012e eVar) {
                this.f14748a = eVar;
            }

            public void onClick(View view) {
                C8282n.m19569s(GroupMusicModeManagerActivity.this).mo35229B((WifiDeviceBase) this.f14748a, true);
                GroupMusicModeManagerActivity.this.m20142e0();
            }
        }

        private C8475g() {
        }

        /* synthetic */ C8475g(GroupMusicModeManagerActivity groupMusicModeManagerActivity, C8468a aVar) {
            this();
        }

        public int getCount() {
            return GroupMusicModeManagerActivity.this.f14735g.size();
        }

        public Object getItem(int i) {
            return GroupMusicModeManagerActivity.this.f14735g.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C8478h hVar;
            TextView textView;
            int i2;
            Resources resources;
            View.OnClickListener onClickListener;
            ImageView imageView;
            if (view != null) {
                hVar = (C8478h) view.getTag();
            } else {
                C8478h hVar2 = new C8478h();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_group_music_mode, viewGroup, false);
                hVar2.f14750a = (ImageView) inflate.findViewById(R$id.device_item_badge_view);
                hVar2.f14753d = (TextView) inflate.findViewById(R$id.device_item_name);
                hVar2.f14754e = (TextView) inflate.findViewById(R$id.device_item_status);
                hVar2.f14751b = (ImageView) inflate.findViewById(R$id.music_mode_beat_view);
                hVar2.f14752c = (ImageView) inflate.findViewById(R$id.device_item_action_view);
                hVar2.f14755f = (ProgressBar) inflate.findViewById(R$id.device_item_action_update_firmware);
                inflate.setTag(hVar2);
                View view2 = inflate;
                hVar = hVar2;
                view = view2;
            }
            C3012e eVar = GroupMusicModeManagerActivity.this.f14735g.get(i);
            Drawable drawable = ContextCompat.getDrawable(view.getContext(), eVar.mo23116F());
            hVar.f14755f.setVisibility(8);
            hVar.f14750a.setBackground(drawable);
            hVar.f14753d.setText(eVar.mo23210U());
            if (GroupMusicModeManagerActivity.this.m20139b0(eVar)) {
                if (!eVar.mo23230o0()) {
                    hVar.f14751b.setVisibility(8);
                    hVar.f14752c.setVisibility(8);
                    TextView textView2 = hVar.f14753d;
                    Resources resources2 = GroupMusicModeManagerActivity.this.getResources();
                    int i3 = R$color.gray;
                    textView2.setTextColor(resources2.getColor(i3));
                    hVar.f14754e.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(i3));
                    textView = hVar.f14754e;
                    resources = GroupMusicModeManagerActivity.this.getResources();
                    i2 = R$string.common_text_status_offline;
                    textView.setText(resources.getString(i2));
                    hVar.f14754e = (TextView) view.findViewById(R$id.device_item_status);
                    hVar.f14751b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
                    hVar.f14752c = (ImageView) view.findViewById(R$id.device_item_action_view);
                    return view;
                } else if (GroupMusicModeManagerActivity.this.f14734f.mo23229n0(21)) {
                    hVar.f14753d.setTextColor(Color.parseColor("#333333"));
                    hVar.f14754e.setTextColor(Color.parseColor("#666666"));
                    if (eVar.mo23221d0().mo31580b0()) {
                        hVar.f14755f.setVisibility(8);
                        hVar.f14752c.setVisibility(0);
                        hVar.f14751b.setVisibility(0);
                        hVar.f14754e.setText(GroupMusicModeManagerActivity.this.getResources().getString(R$string.music_mode_flowing));
                        hVar.f14752c.setImageResource(R$drawable.group_music_view_action_end);
                        imageView = hVar.f14752c;
                        onClickListener = new C8476a(eVar);
                    } else {
                        hVar.f14751b.setVisibility(8);
                        hVar.f14754e.setText(GroupMusicModeManagerActivity.this.getResources().getString(R$string.common_text_status_off));
                        hVar.f14752c.setVisibility(0);
                        hVar.f14752c.setImageResource(R$drawable.group_music_view_action_start);
                        imageView = hVar.f14752c;
                        onClickListener = new C8477b(eVar);
                    }
                    imageView.setOnClickListener(onClickListener);
                    hVar.f14754e = (TextView) view.findViewById(R$id.device_item_status);
                    hVar.f14751b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
                    hVar.f14752c = (ImageView) view.findViewById(R$id.device_item_action_view);
                    return view;
                }
            }
            hVar.f14755f.setVisibility(8);
            hVar.f14752c.setVisibility(8);
            hVar.f14751b.setVisibility(8);
            TextView textView3 = hVar.f14753d;
            Resources resources3 = GroupMusicModeManagerActivity.this.getResources();
            int i4 = R$color.gray;
            textView3.setTextColor(resources3.getColor(i4));
            hVar.f14754e.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(i4));
            textView = hVar.f14754e;
            resources = GroupMusicModeManagerActivity.this.getResources();
            i2 = R$string.music_mode_not_available;
            textView.setText(resources.getString(i2));
            hVar.f14754e = (TextView) view.findViewById(R$id.device_item_status);
            hVar.f14751b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
            hVar.f14752c = (ImageView) view.findViewById(R$id.device_item_action_view);
            return view;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$h */
    static class C8478h {

        /* renamed from: a */
        public ImageView f14750a;

        /* renamed from: b */
        public ImageView f14751b;

        /* renamed from: c */
        public ImageView f14752c;

        /* renamed from: d */
        public TextView f14753d;

        /* renamed from: e */
        public TextView f14754e;

        /* renamed from: f */
        public ProgressBar f14755f;

        C8478h() {
        }
    }

    /* renamed from: a0 */
    private void m20138a0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14734f.mo31753K1().size(); i++) {
            if (!this.f14734f.mo31753K1().get(i).mo23229n0(21)) {
                arrayList.add(this.f14734f.mo31753K1().get(i));
            } else {
                this.f14735g.add(this.f14734f.mo31753K1().get(i));
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f14735g.add((C3012e) arrayList.get(i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public boolean m20139b0(C3012e eVar) {
        String T = eVar.mo23208T();
        T.hashCode();
        char c = 65535;
        switch (T.hashCode()) {
            case -1308146495:
                if (T.equals("yeelink.light.color1")) {
                    c = 0;
                    break;
                }
                break;
            case -1308146494:
                if (T.equals("yeelink.light.color2")) {
                    c = 1;
                    break;
                }
                break;
            case -1308146493:
                if (T.equals("yeelink.light.color3")) {
                    c = 2;
                    break;
                }
                break;
            case -1308146492:
                if (T.equals("yeelink.light.color4")) {
                    c = 3;
                    break;
                }
                break;
            case -1308146491:
                if (T.equals("yeelink.light.color5")) {
                    c = 4;
                    break;
                }
                break;
            case -1308146490:
                if (T.equals("yeelink.light.color6")) {
                    c = 5;
                    break;
                }
                break;
            case -1308146488:
                if (T.equals("yeelink.light.color8")) {
                    c = 6;
                    break;
                }
                break;
            case -1308146447:
                if (T.equals("yeelink.light.colora")) {
                    c = 7;
                    break;
                }
                break;
            case -1308146446:
                if (T.equals("yeelink.light.colorb")) {
                    c = 8;
                    break;
                }
                break;
            case -1308146445:
                if (T.equals("yeelink.light.colorc")) {
                    c = 9;
                    break;
                }
                break;
            case -1308146443:
                if (T.equals("yeelink.light.colore")) {
                    c = 10;
                    break;
                }
                break;
            case -1063384694:
                if (T.equals("yeelink.light.lamp10")) {
                    c = 11;
                    break;
                }
                break;
            case -1063384685:
                if (T.equals("yeelink.light.lamp19")) {
                    c = 12;
                    break;
                }
                break;
            case -845289556:
                if (T.equals("yeelink.light.strip1")) {
                    c = 13;
                    break;
                }
                break;
            case -845289555:
                if (T.equals("yeelink.light.strip2")) {
                    c = 14;
                    break;
                }
                break;
            case -845289551:
                if (T.equals("yeelink.light.strip6")) {
                    c = 15;
                    break;
                }
                break;
            case -845289549:
                if (T.equals("yeelink.light.strip8")) {
                    c = 16;
                    break;
                }
                break;
            case -845289508:
                if (T.equals("yeelink.light.stripa")) {
                    c = 17;
                    break;
                }
                break;
            case 1623724661:
                if (T.equals("yeelink.light.bslamp1")) {
                    c = 18;
                    break;
                }
                break;
            case 1623724662:
                if (T.equals("yeelink.light.bslamp2")) {
                    c = 19;
                    break;
                }
                break;
            case 1623724663:
                if (T.equals("yeelink.light.bslamp3")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20140c0(WifiDeviceBase wifiDeviceBase) {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(wifiDeviceBase.mo23206S(), new C8473e(wifiDeviceBase));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m20141d0() {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(this, MusicModeNotificationService.class);
            intent.putExtra("removeDeviceInNotification", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f14734f.mo23185G());
            startService(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m20142e0() {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(this, MusicModeNotificationService.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f14734f.mo23185G());
            startService(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_group_music_mode_manager);
        C9193k.m22157h(true, this);
        this.f14729a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14730b = (ListView) findViewById(R$id.device_list);
        this.f14731c = (TextView) findViewById(R$id.music_all_stop);
        this.f14732d = (TextView) findViewById(R$id.music_all_start);
        Intent intent = getIntent();
        if (intent.hasExtra("com.yeelight.cherry.device_id")) {
            this.f14734f = (C6119c) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        }
        if (this.f14734f == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14729a.mo36195a(getString(R$string.feature_music_mode), new C8468a(), (View.OnClickListener) null);
        this.f14729a.setTitleTextSize(16);
        C8475g gVar = new C8475g(this, (C8468a) null);
        this.f14733e = gVar;
        this.f14730b.setAdapter(gVar);
        this.f14732d.setOnClickListener(new C8469b());
        this.f14731c.setOnClickListener(new C8470c());
        m20138a0();
        C8282n.m19569s(this).mo35230x();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo35652M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        for (C3012e W0 : this.f14734f.mo31753K1()) {
            W0.mo23213W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        for (C3012e B0 : this.f14734f.mo31753K1()) {
            B0.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            runOnUiThread(new C8474f());
        }
    }
}
