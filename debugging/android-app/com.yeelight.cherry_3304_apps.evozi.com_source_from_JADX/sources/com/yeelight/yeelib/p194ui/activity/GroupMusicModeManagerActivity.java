package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.device.models.C7640n0;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9802n;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.MusicModeNotificationService;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity */
public class GroupMusicModeManagerActivity extends BaseActivity implements C9770e {

    /* renamed from: b */
    CommonTitleBar f18421b;

    /* renamed from: c */
    ListView f18422c;

    /* renamed from: d */
    TextView f18423d;

    /* renamed from: e */
    TextView f18424e;

    /* renamed from: f */
    C10057g f18425f;

    /* renamed from: g */
    C5980c f18426g;

    /* renamed from: h */
    ArrayList<C4200i> f18427h = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f18428i = new C10053d();

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$a */
    class C10050a implements View.OnClickListener {
        C10050a() {
        }

        public void onClick(View view) {
            GroupMusicModeManagerActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$b */
    class C10051b implements View.OnClickListener {
        C10051b() {
        }

        public void onClick(View view) {
            for (int i = 0; i < GroupMusicModeManagerActivity.this.f18426g.mo27498K1().size(); i++) {
                if (GroupMusicModeManagerActivity.this.f18426g.mo23415n0(21)) {
                    C9802n.m23790s(GroupMusicModeManagerActivity.this).mo31663B((C6006h) GroupMusicModeManagerActivity.this.f18426g.mo27498K1().get(i), true);
                }
            }
            GroupMusicModeManagerActivity.this.m24548e0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$c */
    class C10052c implements View.OnClickListener {
        C10052c() {
        }

        public void onClick(View view) {
            for (int i = 0; i < GroupMusicModeManagerActivity.this.f18426g.mo27498K1().size(); i++) {
                if (GroupMusicModeManagerActivity.this.f18426g.mo23415n0(21)) {
                    C9802n.m23790s(GroupMusicModeManagerActivity.this).mo31663B((C6006h) GroupMusicModeManagerActivity.this.f18426g.mo27498K1().get(i), false);
                }
            }
            GroupMusicModeManagerActivity.this.m24547d0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$d */
    class C10053d extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$d$a */
        class C10054a implements Runnable {
            C10054a() {
            }

            public void run() {
                GroupMusicModeManagerActivity.this.f18425f.notifyDataSetChanged();
            }
        }

        C10053d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GroupMusicModeManagerActivity.this.m24546c0((C6006h) C4257w.m11945h0(message.getData().getString("com.yeelight.cherry.device_id")));
            } else if (i == 2) {
                GroupMusicModeManagerActivity.this.runOnUiThread(new C10054a());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$e */
    class C10055e implements DeviceManager.QueryFirmwareHandler {

        /* renamed from: a */
        final /* synthetic */ C6006h f18434a;

        C10055e(C6006h hVar) {
            this.f18434a = hVar;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            this.f18434a.mo23378J0(new C7640n0(miotFirmware));
            if (miotFirmware.isLatestVersion()) {
                GroupMusicModeManagerActivity.this.f18428i.sendEmptyMessage(2);
                return;
            }
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("com.yeelight.cherry.device_id", this.f18434a.mo23372G());
            message.setData(bundle);
            message.what = 1;
            GroupMusicModeManagerActivity.this.f18428i.sendMessageDelayed(message, 3000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$f */
    class C10056f implements Runnable {
        C10056f() {
        }

        public void run() {
            GroupMusicModeManagerActivity.this.f18425f.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g */
    private class C10057g extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g$a */
        class C10058a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4200i f18438a;

            C10058a(C4200i iVar) {
                this.f18438a = iVar;
            }

            public void onClick(View view) {
                boolean z = false;
                C9802n.m23790s(GroupMusicModeManagerActivity.this).mo31663B((C6006h) this.f18438a, false);
                Iterator<C4200i> it = GroupMusicModeManagerActivity.this.f18426g.mo27498K1().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo23408d0().mo27677a0()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    GroupMusicModeManagerActivity.this.m24547d0();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$g$b */
        class C10059b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4200i f18440a;

            C10059b(C4200i iVar) {
                this.f18440a = iVar;
            }

            public void onClick(View view) {
                C9802n.m23790s(GroupMusicModeManagerActivity.this).mo31663B((C6006h) this.f18440a, true);
                GroupMusicModeManagerActivity.this.m24548e0();
            }
        }

        private C10057g() {
        }

        /* synthetic */ C10057g(GroupMusicModeManagerActivity groupMusicModeManagerActivity, C10050a aVar) {
            this();
        }

        public int getCount() {
            return GroupMusicModeManagerActivity.this.f18427h.size();
        }

        public Object getItem(int i) {
            return GroupMusicModeManagerActivity.this.f18427h.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C10060h hVar;
            TextView textView;
            int i2;
            Resources resources;
            View.OnClickListener onClickListener;
            ImageView imageView;
            if (view != null) {
                hVar = (C10060h) view.getTag();
            } else {
                C10060h hVar2 = new C10060h();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_device_group_music_mode, viewGroup, false);
                hVar2.f18442a = (ImageView) inflate.findViewById(R$id.device_item_badge_view);
                hVar2.f18445d = (TextView) inflate.findViewById(R$id.device_item_name);
                hVar2.f18446e = (TextView) inflate.findViewById(R$id.device_item_status);
                hVar2.f18443b = (ImageView) inflate.findViewById(R$id.music_mode_beat_view);
                hVar2.f18444c = (ImageView) inflate.findViewById(R$id.device_item_action_view);
                hVar2.f18447f = (ProgressBar) inflate.findViewById(R$id.device_item_action_update_firmware);
                inflate.setTag(hVar2);
                View view2 = inflate;
                hVar = hVar2;
                view = view2;
            }
            C4200i iVar = GroupMusicModeManagerActivity.this.f18427h.get(i);
            Drawable drawable = ContextCompat.getDrawable(view.getContext(), iVar.mo23303F());
            hVar.f18447f.setVisibility(8);
            hVar.f18442a.setBackground(drawable);
            hVar.f18445d.setText(iVar.mo23397U());
            if (GroupMusicModeManagerActivity.this.m24545b0(iVar)) {
                if (!iVar.mo23416o0()) {
                    hVar.f18443b.setVisibility(8);
                    hVar.f18444c.setVisibility(8);
                    hVar.f18445d.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(R$color.gray));
                    hVar.f18446e.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(R$color.gray));
                    textView = hVar.f18446e;
                    resources = GroupMusicModeManagerActivity.this.getResources();
                    i2 = R$string.common_text_status_offline;
                    textView.setText(resources.getString(i2));
                    hVar.f18446e = (TextView) view.findViewById(R$id.device_item_status);
                    hVar.f18443b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
                    hVar.f18444c = (ImageView) view.findViewById(R$id.device_item_action_view);
                    return view;
                } else if (GroupMusicModeManagerActivity.this.f18426g.mo23415n0(21)) {
                    hVar.f18445d.setTextColor(Color.parseColor("#333333"));
                    hVar.f18446e.setTextColor(Color.parseColor("#666666"));
                    if (iVar.mo23408d0().mo27677a0()) {
                        hVar.f18447f.setVisibility(8);
                        hVar.f18444c.setVisibility(0);
                        hVar.f18443b.setVisibility(0);
                        hVar.f18446e.setText(GroupMusicModeManagerActivity.this.getResources().getString(R$string.music_mode_flowing));
                        hVar.f18444c.setImageResource(R$drawable.group_music_view_action_end);
                        imageView = hVar.f18444c;
                        onClickListener = new C10058a(iVar);
                    } else {
                        hVar.f18443b.setVisibility(8);
                        hVar.f18446e.setText(GroupMusicModeManagerActivity.this.getResources().getString(R$string.common_text_status_off));
                        hVar.f18444c.setVisibility(0);
                        hVar.f18444c.setImageResource(R$drawable.group_music_view_action_start);
                        imageView = hVar.f18444c;
                        onClickListener = new C10059b(iVar);
                    }
                    imageView.setOnClickListener(onClickListener);
                    hVar.f18446e = (TextView) view.findViewById(R$id.device_item_status);
                    hVar.f18443b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
                    hVar.f18444c = (ImageView) view.findViewById(R$id.device_item_action_view);
                    return view;
                }
            }
            hVar.f18447f.setVisibility(8);
            hVar.f18444c.setVisibility(8);
            hVar.f18443b.setVisibility(8);
            hVar.f18445d.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(R$color.gray));
            hVar.f18446e.setTextColor(GroupMusicModeManagerActivity.this.getResources().getColor(R$color.gray));
            textView = hVar.f18446e;
            resources = GroupMusicModeManagerActivity.this.getResources();
            i2 = R$string.music_mode_not_available;
            textView.setText(resources.getString(i2));
            hVar.f18446e = (TextView) view.findViewById(R$id.device_item_status);
            hVar.f18443b = (ImageView) view.findViewById(R$id.music_mode_beat_view);
            hVar.f18444c = (ImageView) view.findViewById(R$id.device_item_action_view);
            return view;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupMusicModeManagerActivity$h */
    static class C10060h {

        /* renamed from: a */
        public ImageView f18442a;

        /* renamed from: b */
        public ImageView f18443b;

        /* renamed from: c */
        public ImageView f18444c;

        /* renamed from: d */
        public TextView f18445d;

        /* renamed from: e */
        public TextView f18446e;

        /* renamed from: f */
        public ProgressBar f18447f;

        C10060h() {
        }
    }

    static {
        Class<GroupMusicModeManagerActivity> cls = GroupMusicModeManagerActivity.class;
    }

    /* renamed from: a0 */
    private void m24544a0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f18426g.mo27498K1().size(); i++) {
            if (!this.f18426g.mo27498K1().get(i).mo23415n0(21)) {
                arrayList.add(this.f18426g.mo27498K1().get(i));
            } else {
                this.f18427h.add(this.f18426g.mo27498K1().get(i));
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f18427h.add(arrayList.get(i2));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m24545b0(com.yeelight.yeelib.p150c.p151i.C4200i r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.mo23395T()
            int r0 = r4.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -1644531059: goto L_0x03ce;
                case -1462015191: goto L_0x03c3;
                case -1462015190: goto L_0x03b8;
                case -1462015189: goto L_0x03ad;
                case -1462015188: goto L_0x03a2;
                case -1462015187: goto L_0x0397;
                case -1462015186: goto L_0x038c;
                case -1462015185: goto L_0x0381;
                case -1462015184: goto L_0x0376;
                case -1462015183: goto L_0x036a;
                case -1462015182: goto L_0x035e;
                case -1400275319: goto L_0x0352;
                case -1399953856: goto L_0x0346;
                case -1317475937: goto L_0x033a;
                case -1308146488: goto L_0x032e;
                case -1063384694: goto L_0x0322;
                case -1063384689: goto L_0x0316;
                case -1063384685: goto L_0x030b;
                case -948847040: goto L_0x02ff;
                case -948847038: goto L_0x02f3;
                case -845289553: goto L_0x02e7;
                case -845289551: goto L_0x02dc;
                case -845289508: goto L_0x02d1;
                case -454053748: goto L_0x02c5;
                case -449944724: goto L_0x02b9;
                case -449944723: goto L_0x02ad;
                case -449944722: goto L_0x02a1;
                case -448603205: goto L_0x0295;
                case -448603204: goto L_0x0289;
                case -448603202: goto L_0x027d;
                case -448603201: goto L_0x0271;
                case -448603157: goto L_0x0265;
                case -448603156: goto L_0x0259;
                case 152160739: goto L_0x024d;
                case 922669543: goto L_0x0241;
                case 922669544: goto L_0x0235;
                case 922669545: goto L_0x0229;
                case 922669546: goto L_0x021d;
                case 922669547: goto L_0x0211;
                case 922669548: goto L_0x0205;
                case 922669549: goto L_0x01f9;
                case 922669550: goto L_0x01ed;
                case 1201756974: goto L_0x01e1;
                case 1201757021: goto L_0x01d5;
                case 1623724661: goto L_0x01ca;
                case 1623724662: goto L_0x01bf;
                case 1623724663: goto L_0x01b4;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case -1462015160: goto L_0x01a8;
                case -1462015159: goto L_0x019c;
                case -1462015158: goto L_0x0190;
                case -1462015157: goto L_0x0184;
                case -1462015156: goto L_0x0178;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r0) {
                case -1317475940: goto L_0x016c;
                case -1317475939: goto L_0x0160;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r0) {
                case -1317475915: goto L_0x0154;
                case -1317475914: goto L_0x0148;
                case -1317475913: goto L_0x013c;
                case -1317475912: goto L_0x0130;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r0) {
                case -1308146495: goto L_0x0124;
                case -1308146494: goto L_0x0118;
                case -1308146493: goto L_0x010c;
                case -1308146492: goto L_0x0100;
                case -1308146491: goto L_0x00f4;
                case -1308146490: goto L_0x00e8;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r0) {
                case -1308146447: goto L_0x00dc;
                case -1308146446: goto L_0x00d0;
                case -1308146445: goto L_0x00c4;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r0) {
                case -888668266: goto L_0x00b8;
                case -888668265: goto L_0x00ac;
                case -888668264: goto L_0x00a0;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r0) {
                case -845289556: goto L_0x0095;
                case -845289555: goto L_0x008a;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r0) {
                case -458141175: goto L_0x007e;
                case -458141174: goto L_0x0072;
                case -458141173: goto L_0x0066;
                case -458141172: goto L_0x005a;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r0) {
                case -449944730: goto L_0x004e;
                case -449944729: goto L_0x0042;
                case -449944728: goto L_0x0036;
                case -449944727: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x03d9
        L_0x002a:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 33
            goto L_0x03da
        L_0x0036:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 39
            goto L_0x03da
        L_0x0042:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 38
            goto L_0x03da
        L_0x004e:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 32
            goto L_0x03da
        L_0x005a:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 75
            goto L_0x03da
        L_0x0066:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 74
            goto L_0x03da
        L_0x0072:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 73
            goto L_0x03da
        L_0x007e:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 72
            goto L_0x03da
        L_0x008a:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 5
            goto L_0x03da
        L_0x0095:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 4
            goto L_0x03da
        L_0x00a0:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 78
            goto L_0x03da
        L_0x00ac:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 77
            goto L_0x03da
        L_0x00b8:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 76
            goto L_0x03da
        L_0x00c4:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 17
            goto L_0x03da
        L_0x00d0:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 16
            goto L_0x03da
        L_0x00dc:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 15
            goto L_0x03da
        L_0x00e8:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 13
            goto L_0x03da
        L_0x00f4:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 12
            goto L_0x03da
        L_0x0100:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 11
            goto L_0x03da
        L_0x010c:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 10
            goto L_0x03da
        L_0x0118:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 9
            goto L_0x03da
        L_0x0124:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 8
            goto L_0x03da
        L_0x0130:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 71
            goto L_0x03da
        L_0x013c:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 70
            goto L_0x03da
        L_0x0148:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 69
            goto L_0x03da
        L_0x0154:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 68
            goto L_0x03da
        L_0x0160:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 66
            goto L_0x03da
        L_0x016c:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 65
            goto L_0x03da
        L_0x0178:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 64
            goto L_0x03da
        L_0x0184:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 63
            goto L_0x03da
        L_0x0190:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 62
            goto L_0x03da
        L_0x019c:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 61
            goto L_0x03da
        L_0x01a8:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 60
            goto L_0x03da
        L_0x01b4:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 2
            goto L_0x03da
        L_0x01bf:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 1
            goto L_0x03da
        L_0x01ca:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 0
            goto L_0x03da
        L_0x01d5:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 27
            goto L_0x03da
        L_0x01e1:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 26
            goto L_0x03da
        L_0x01ed:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 49
            goto L_0x03da
        L_0x01f9:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 48
            goto L_0x03da
        L_0x0205:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 47
            goto L_0x03da
        L_0x0211:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 46
            goto L_0x03da
        L_0x021d:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 45
            goto L_0x03da
        L_0x0229:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 44
            goto L_0x03da
        L_0x0235:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 43
            goto L_0x03da
        L_0x0241:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 42
            goto L_0x03da
        L_0x024d:
            java.lang.String r0 = "yeelink.bleremote.v1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 41
            goto L_0x03da
        L_0x0259:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 25
            goto L_0x03da
        L_0x0265:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 24
            goto L_0x03da
        L_0x0271:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 23
            goto L_0x03da
        L_0x027d:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 22
            goto L_0x03da
        L_0x0289:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 21
            goto L_0x03da
        L_0x0295:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 20
            goto L_0x03da
        L_0x02a1:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 36
            goto L_0x03da
        L_0x02ad:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 35
            goto L_0x03da
        L_0x02b9:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 34
            goto L_0x03da
        L_0x02c5:
            java.lang.String r0 = "yeelink.light.group"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 40
            goto L_0x03da
        L_0x02d1:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 7
            goto L_0x03da
        L_0x02dc:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 6
            goto L_0x03da
        L_0x02e7:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 28
            goto L_0x03da
        L_0x02f3:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 30
            goto L_0x03da
        L_0x02ff:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 29
            goto L_0x03da
        L_0x030b:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 3
            goto L_0x03da
        L_0x0316:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 37
            goto L_0x03da
        L_0x0322:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 18
            goto L_0x03da
        L_0x032e:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 14
            goto L_0x03da
        L_0x033a:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 67
            goto L_0x03da
        L_0x0346:
            java.lang.String r0 = "yeelink.light.mesh"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 31
            goto L_0x03da
        L_0x0352:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 19
            goto L_0x03da
        L_0x035e:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 59
            goto L_0x03da
        L_0x036a:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 58
            goto L_0x03da
        L_0x0376:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 57
            goto L_0x03da
        L_0x0381:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 56
            goto L_0x03da
        L_0x038c:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 55
            goto L_0x03da
        L_0x0397:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 54
            goto L_0x03da
        L_0x03a2:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 53
            goto L_0x03da
        L_0x03ad:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 52
            goto L_0x03da
        L_0x03b8:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 51
            goto L_0x03da
        L_0x03c3:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 50
            goto L_0x03da
        L_0x03ce:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x03d9
            r4 = 79
            goto L_0x03da
        L_0x03d9:
            r4 = -1
        L_0x03da:
            switch(r4) {
                case 0: goto L_0x03de;
                case 1: goto L_0x03de;
                case 2: goto L_0x03de;
                case 3: goto L_0x03de;
                case 4: goto L_0x03de;
                case 5: goto L_0x03de;
                case 6: goto L_0x03de;
                case 7: goto L_0x03de;
                case 8: goto L_0x03de;
                case 9: goto L_0x03de;
                case 10: goto L_0x03de;
                case 11: goto L_0x03de;
                case 12: goto L_0x03de;
                case 13: goto L_0x03de;
                case 14: goto L_0x03de;
                case 15: goto L_0x03de;
                case 16: goto L_0x03de;
                case 17: goto L_0x03de;
                case 18: goto L_0x03de;
                default: goto L_0x03dd;
            }
        L_0x03dd:
            return r1
        L_0x03de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.GroupMusicModeManagerActivity.m24545b0(com.yeelight.yeelib.c.i.i):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m24546c0(C6006h hVar) {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(hVar.mo23393S(), new C10055e(hVar));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m24547d0() {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(this, MusicModeNotificationService.class);
            intent.putExtra("removeDeviceInNotification", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f18426g.mo23372G());
            startService(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m24548e0() {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(this, MusicModeNotificationService.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f18426g.mo23372G());
            startService(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_group_music_mode_manager);
        C10547m.m25758h(true, this);
        this.f18421b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18422c = (ListView) findViewById(R$id.device_list);
        this.f18423d = (TextView) findViewById(R$id.music_all_stop);
        this.f18424e = (TextView) findViewById(R$id.music_all_start);
        Intent intent = getIntent();
        if (intent.hasExtra("com.yeelight.cherry.device_id")) {
            this.f18426g = (C5980c) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        }
        if (this.f18426g == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18421b.mo32825a(getString(R$string.feature_music_mode), new C10050a(), (View.OnClickListener) null);
        this.f18421b.setTitleTextSize(16);
        C10057g gVar = new C10057g(this, (C10050a) null);
        this.f18425f = gVar;
        this.f18422c.setAdapter(gVar);
        this.f18424e.setOnClickListener(new C10051b());
        this.f18423d.setOnClickListener(new C10052c());
        m24544a0();
        C9802n.m23790s(this).mo31664x();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        for (C4200i W0 : this.f18426g.mo27498K1()) {
            W0.mo23400W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        for (C4200i B0 : this.f18426g.mo27498K1()) {
            B0.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            runOnUiThread(new C10056f());
        }
    }
}
