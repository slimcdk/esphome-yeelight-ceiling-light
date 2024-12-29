package com.yeelight.cherry.p141ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.cherry.p141ui.view.WaveView;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8282n;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.GroupMusicModeManagerActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.MusicModeNotificationService;
import java.util.ArrayList;
import java.util.Iterator;
import p051j4.C3283v;
import p201q3.C10279b;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment */
public class DiscoFragment extends Fragment implements C12145e {

    /* renamed from: g */
    private static final String f12003g = DiscoFragment.class.getSimpleName();

    /* renamed from: a */
    private C10279b f12004a;

    /* renamed from: b */
    private View f12005b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3012e f12006c;

    /* renamed from: d */
    private Unbinder f12007d;

    /* renamed from: e */
    private int f12008e;

    /* renamed from: f */
    private Handler f12009f = new C5946a(Looper.getMainLooper());
    @BindView(2131296464)
    TextView mBtnControl;
    @BindView(2131296465)
    ProgressBar mControlProgressBar;
    @BindView(2131296710)
    ImageView mDefaultView;
    @BindView(2131297149)
    TextView mMusicModeAudioType;
    @BindView(2131297151)
    TextView mMusicModeDeviceNum;
    @BindView(2131297152)
    TextView mMusicModeDeviceNumTitle;
    @BindView(2131297272)
    RadioButton mRbMusicModeAudio;
    @BindView(2131297273)
    RadioButton mRbMusicModeMic;
    @BindView(2131297338)
    RadioGroup mRgMusicMode;
    @BindView(2131297153)
    CommonTitleBar mTitleBar;
    @BindView(2131296711)
    WaveView mWaveView;

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$a */
    class C5946a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$a$a */
        class C5947a implements Runnable {
            C5947a() {
            }

            public void run() {
                ProgressBar progressBar = DiscoFragment.this.mControlProgressBar;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                DiscoFragment.this.mBtnControl.setVisibility(0);
            }
        }

        C5946a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 0 && DiscoFragment.this.isVisible()) {
                Toast.makeText(DiscoFragment.this.getActivity(), DiscoFragment.this.getString(2131755946), 0).show();
                TextView textView = DiscoFragment.this.mBtnControl;
                if (textView != null) {
                    textView.post(new C5947a());
                    DiscoFragment.this.mBtnControl.setEnabled(true);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$b */
    class C5948b implements View.OnClickListener {
        C5948b() {
        }

        public void onClick(View view) {
            DiscoFragment.this.getActivity().onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$c */
    class C5949c implements View.OnClickListener {
        C5949c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(DiscoFragment.this.getContext(), GroupMusicModeManagerActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DiscoFragment.this.f12006c.mo23185G());
            DiscoFragment.this.startActivity(intent);
        }
    }

    /* renamed from: D */
    private int m17384D() {
        C3012e eVar = this.f12006c;
        int i = 0;
        if (eVar instanceof C6119c) {
            for (C3012e d0 : ((C6119c) eVar).mo31753K1()) {
                if (d0.mo23221d0().mo31580b0()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: F */
    private boolean m17385F() {
        return Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(getActivity(), "android.permission.POST_NOTIFICATIONS") == 0;
    }

    /* renamed from: G */
    private boolean m17386G() {
        C3012e eVar = this.f12006c;
        boolean z = false;
        if (eVar instanceof C6119c) {
            Iterator<C3012e> it = ((C6119c) eVar).mo31753K1().iterator();
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
            this.f12006c.mo23221d0().mo31593i(z);
        }
        return z;
    }

    /* renamed from: H */
    private boolean m17387H(@NonNull int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m17388J(RadioGroup radioGroup, int i) {
        boolean z = false;
        if (i == 2131297272) {
            this.f12008e = 1;
        } else {
            this.f12008e = 0;
        }
        m17397U(this.f12008e);
        C3283v.m8848n(this.f12008e);
        if (ContextCompat.checkSelfPermission(this.mRgMusicMode.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
            return;
        }
        C8282n s = C8282n.m19569s(this.mRgMusicMode.getContext());
        if (this.f12008e == 1) {
            z = true;
        }
        s.mo35228A(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m17389K() {
        WaveView waveView = this.mWaveView;
        if (waveView != null) {
            waveView.mo31396d(Color.parseColor("#ffffffff"), Color.parseColor("#4dffffff"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m17390M(View view) {
        Context context = getContext();
        if (this.f12006c instanceof C6119c) {
            for (int i = 0; i < ((C6119c) this.f12006c).mo31753K1().size(); i++) {
                if (this.f12006c.mo23229n0(21)) {
                    C8282n.m19569s(context).mo35229B((WifiDeviceBase) ((C6119c) this.f12006c).mo31753K1().get(i), false);
                }
            }
        } else {
            C8282n.m19569s(context).mo35229B((WifiDeviceBase) this.f12006c, false);
        }
        if (m17385F()) {
            m17394Q(context);
        } else {
            requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 103);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m17391N() {
        this.mControlProgressBar.setVisibility(4);
        this.mBtnControl.setVisibility(0);
        this.mDefaultView.setVisibility(4);
        this.mBtnControl.setBackgroundResource(2131231201);
        this.mWaveView.mo31395c(1, 0);
        this.mWaveView.post(new C5995f(this));
        this.f12009f.removeMessages(0);
        this.mWaveView.setVisibility(0);
        this.f12004a.mo41788b();
        if (this.f12006c instanceof C6119c) {
            this.mMusicModeDeviceNum.setText(m17384D() + " / " + ((C6119c) this.f12006c).mo31753K1().size());
        }
        this.mBtnControl.setOnClickListener(new C5993d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m17392O(View view) {
        this.mControlProgressBar.setVisibility(0);
        this.mBtnControl.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        if (ContextCompat.checkSelfPermission(this.mBtnControl.getContext(), "android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!m17385F()) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (arrayList.isEmpty()) {
            m17396T();
        } else {
            requestPermissions((String[]) arrayList.toArray(new String[0]), 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m17393P() {
        this.mControlProgressBar.setVisibility(4);
        this.mBtnControl.setVisibility(0);
        this.mDefaultView.setVisibility(0);
        this.mBtnControl.setBackgroundResource(2131231200);
        this.f12009f.removeMessages(0);
        this.mWaveView.setVisibility(4);
        if (this.f12006c instanceof C6119c) {
            this.mMusicModeDeviceNum.setText(m17384D() + " / " + ((C6119c) this.f12006c).mo31753K1().size());
        }
        this.mBtnControl.setOnClickListener(new C5992c(this));
    }

    /* renamed from: Q */
    private void m17394Q(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(context, MusicModeNotificationService.class);
            intent.putExtra("removeDeviceInNotification", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f12006c.mo23185G());
            if (context != null) {
                context.startService(intent);
            }
        }
    }

    /* renamed from: R */
    private void m17395R(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(context, MusicModeNotificationService.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f12006c.mo23185G());
            if (context != null) {
                context.startService(intent);
            }
        }
    }

    /* renamed from: T */
    private void m17396T() {
        Context context = getContext();
        m17395R(context);
        C3012e eVar = this.f12006c;
        if (eVar instanceof C6119c) {
            for (int i = 0; i < ((C6119c) this.f12006c).mo31753K1().size(); i++) {
                C3012e eVar2 = ((C6119c) this.f12006c).mo31753K1().get(i);
                if (eVar2.mo23229n0(21)) {
                    if (!eVar2.mo23146k1()) {
                        eVar2.mo23148l1();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("startMusic !!! device = ");
                    sb.append(eVar2.mo23210U());
                    C8282n.m19569s(context).mo35229B((WifiDeviceBase) eVar2, true);
                }
            }
        } else {
            if (!eVar.mo23146k1()) {
                this.f12006c.mo23148l1();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startMusic !!! device = ");
            sb2.append(this.f12006c.mo23210U());
            C8282n.m19569s(context).mo35229B((WifiDeviceBase) this.f12006c, true);
        }
        this.f12009f.removeMessages(0);
        this.f12009f.sendEmptyMessageDelayed(0, 10000);
    }

    /* renamed from: U */
    private void m17397U(int i) {
        TextView textView;
        int i2;
        if (i == 1) {
            this.mRbMusicModeAudio.setChecked(true);
            textView = this.mMusicModeAudioType;
            i2 = 2131755936;
        } else {
            this.mRbMusicModeMic.setChecked(true);
            textView = this.mMusicModeAudioType;
            i2 = 2131755937;
        }
        textView.setText(i2);
    }

    /* renamed from: V */
    private void m17398V() {
        Runnable runnable;
        Handler handler;
        StringBuilder sb = new StringBuilder();
        sb.append("updateMusicModeView, music mode enabled: ");
        sb.append(this.f12006c.mo23221d0().mo31580b0());
        m17386G();
        if (this.f12006c.mo23221d0().mo31580b0()) {
            handler = this.f12009f;
            runnable = new C5996g(this);
        } else {
            handler = this.f12009f;
            runnable = new C5997h(this);
        }
        handler.post(runnable);
    }

    /* renamed from: S */
    public void mo31242S(Context context) {
        Class<MainActivity> cls = MainActivity.class;
        try {
            int i = MainActivity.f10688y;
            Intent intent = new Intent();
            intent.setClass(context, cls);
            intent.addFlags(71303168);
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_music, viewGroup, false);
        this.f12005b = inflate;
        WaveView waveView = (WaveView) inflate.findViewById(C12225R$id.disco_wave_view);
        this.mWaveView = waveView;
        this.f12004a = new C10279b(waveView);
        this.mWaveView.setVisibility(4);
        this.f12007d = ButterKnife.bind((Object) this, this.f12005b);
        this.mTitleBar.mo36195a(getResources().getString(2131755935), new C5948b(), new C5949c());
        this.mTitleBar.setTitleTextSize(16);
        this.f12006c = (C3012e) YeelightDeviceManager.m7794j0(getActivity().getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.mTitleBar.setLeftButtonVisibility(0);
        this.mTitleBar.setLeftButtonResource(2131231190);
        int d = C3283v.m8838d();
        this.f12008e = d;
        m17397U(d);
        this.mRgMusicMode.setOnCheckedChangeListener(new C5994e(this));
        C3012e eVar = this.f12006c;
        if (eVar == null) {
            mo31242S(getActivity());
            getActivity().finish();
        } else {
            if (eVar instanceof C6119c) {
                this.mTitleBar.setRightButtonVisibility(0);
                this.mTitleBar.setRightButtonResource(2131231565);
                this.mMusicModeDeviceNum.setVisibility(0);
                this.mMusicModeDeviceNumTitle.setVisibility(0);
            } else {
                this.mMusicModeDeviceNum.setVisibility(4);
                this.mMusicModeDeviceNumTitle.setVisibility(4);
                this.mTitleBar.setRightButtonVisibility(8);
            }
            C8282n.m19569s(getContext()).mo35230x();
        }
        return this.f12005b;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.f12007d;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.f12009f.removeCallbacksAndMessages((Object) null);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
        C3012e eVar = this.f12006c;
        if (eVar instanceof C6119c) {
            for (C3012e W0 : ((C6119c) eVar).mo31753K1()) {
                W0.mo23213W0(this);
            }
            return;
        }
        eVar.mo23213W0(this);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100 && m17387H(iArr)) {
            m17396T();
        } else if (i == 101) {
            C8282n s = C8282n.m19569s(getContext());
            boolean z = true;
            if (this.f12008e != 1) {
                z = false;
            }
            s.mo35228A(z);
        } else if (i == 103) {
            m17394Q(getContext());
        }
    }

    public void onResume() {
        super.onResume();
        C3012e eVar = this.f12006c;
        if (eVar instanceof C6119c) {
            for (C3012e B0 : ((C6119c) eVar).mo31753K1()) {
                B0.mo23178B0(this);
            }
        } else {
            eVar.mo23178B0(this);
        }
        m17398V();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            m17398V();
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
