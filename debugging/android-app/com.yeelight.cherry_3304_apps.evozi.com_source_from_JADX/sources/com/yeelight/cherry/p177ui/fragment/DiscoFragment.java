package com.yeelight.cherry.p177ui.fragment;

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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.view.C5967b;
import com.yeelight.cherry.p177ui.view.WaveView;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9802n;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.GroupMusicModeManagerActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.MusicModeNotificationService;
import com.yeelight.yeelib.utils.C10559w;
import java.util.Iterator;

/* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment */
public class DiscoFragment extends Fragment implements C9770e {

    /* renamed from: g */
    private static final String f12408g = DiscoFragment.class.getSimpleName();

    /* renamed from: a */
    private C5967b f12409a;

    /* renamed from: b */
    private View f12410b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4200i f12411c;

    /* renamed from: d */
    private Unbinder f12412d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f12413e;

    /* renamed from: f */
    private Handler f12414f = new C5885a(Looper.getMainLooper());
    @BindView(2131296406)
    TextView mBtnControl;
    @BindView(2131296407)
    ProgressBar mControlProgressBar;
    @BindView(2131296628)
    ImageView mDefaultView;
    @BindView(2131297029)
    TextView mMusicModeAudioType;
    @BindView(2131297031)
    TextView mMusicModeDeviceNum;
    @BindView(2131297032)
    TextView mMusicModeDeviceNumTitle;
    @BindView(2131297137)
    RadioButton mRbMusicModeAudio;
    @BindView(2131297138)
    RadioButton mRbMusicModeMic;
    @BindView(2131297196)
    RadioGroup mRgMusicMode;
    @BindView(2131297033)
    CommonTitleBar mTitleBar;
    @BindView(2131296629)
    WaveView mWaveView;

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$a */
    class C5885a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$a$a */
        class C5886a implements Runnable {
            C5886a() {
            }

            public void run() {
                ProgressBar progressBar = DiscoFragment.this.mControlProgressBar;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                DiscoFragment.this.mBtnControl.setVisibility(0);
            }
        }

        C5885a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 0 && DiscoFragment.this.isVisible()) {
                Toast.makeText(DiscoFragment.this.getActivity(), DiscoFragment.this.getString(2131755936), 0).show();
                TextView textView = DiscoFragment.this.mBtnControl;
                if (textView != null) {
                    textView.post(new C5886a());
                    DiscoFragment.this.mBtnControl.setEnabled(true);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$b */
    class C5887b implements View.OnClickListener {
        C5887b() {
        }

        public void onClick(View view) {
            DiscoFragment.this.getActivity().onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$c */
    class C5888c implements View.OnClickListener {
        C5888c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(DiscoFragment.this.getContext(), GroupMusicModeManagerActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DiscoFragment.this.f12411c.mo23372G());
            DiscoFragment.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.DiscoFragment$d */
    class C5889d implements RadioGroup.OnCheckedChangeListener {
        C5889d() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            boolean z = false;
            if (i != 2131297137) {
                int unused = DiscoFragment.this.f12413e = 0;
            } else {
                int unused2 = DiscoFragment.this.f12413e = 1;
            }
            DiscoFragment discoFragment = DiscoFragment.this;
            discoFragment.m17337K(discoFragment.f12413e);
            C10559w.m25818n(DiscoFragment.this.f12413e);
            if (ContextCompat.checkSelfPermission(DiscoFragment.this.mRgMusicMode.getContext(), "android.permission.RECORD_AUDIO") == 0) {
                C9802n s = C9802n.m23790s(DiscoFragment.this.mRgMusicMode.getContext());
                if (DiscoFragment.this.f12413e == 1) {
                    z = true;
                }
                s.mo31662A(z);
            } else if (DiscoFragment.this.getActivity() != null) {
                ActivityCompat.requestPermissions(DiscoFragment.this.getActivity(), new String[]{"android.permission.RECORD_AUDIO"}, 101);
            }
        }
    }

    /* renamed from: A */
    private boolean m17333A() {
        C4200i iVar = this.f12411c;
        boolean z = false;
        if (iVar instanceof C5980c) {
            Iterator<C4200i> it = ((C5980c) iVar).mo27498K1().iterator();
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
            this.f12411c.mo23408d0().mo27692i(z);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m17334F(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(context, MusicModeNotificationService.class);
            intent.putExtra("removeDeviceInNotification", true);
            intent.putExtra("com.yeelight.cherry.device_id", this.f12411c.mo23372G());
            if (context != null) {
                context.startService(intent);
            }
        }
    }

    /* renamed from: G */
    private void m17335G(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent(context, MusicModeNotificationService.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f12411c.mo23372G());
            if (context != null) {
                context.startService(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m17336J() {
        Context context = getContext();
        m17335G(context);
        C4200i iVar = this.f12411c;
        if (iVar instanceof C5980c) {
            for (int i = 0; i < ((C5980c) this.f12411c).mo27498K1().size(); i++) {
                C4200i iVar2 = ((C5980c) this.f12411c).mo27498K1().get(i);
                if (iVar2.mo23415n0(21)) {
                    if (!iVar2.mo23332k1()) {
                        iVar2.mo23334l1();
                    }
                    "startMusic !!! device = " + iVar2.mo23397U();
                    C9802n.m23790s(context).mo31663B((C6006h) iVar2, true);
                }
            }
        } else {
            if (!iVar.mo23332k1()) {
                this.f12411c.mo23334l1();
            }
            "startMusic !!! device = " + this.f12411c.mo23397U();
            C9802n.m23790s(context).mo31663B((C6006h) this.f12411c, true);
        }
        this.f12414f.removeMessages(0);
        this.f12414f.sendEmptyMessageDelayed(0, 10000);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m17337K(int i) {
        TextView textView;
        int i2;
        if (i == 1) {
            this.mRbMusicModeAudio.setChecked(true);
            textView = this.mMusicModeAudioType;
            i2 = 2131755926;
        } else {
            this.mRbMusicModeMic.setChecked(true);
            textView = this.mMusicModeAudioType;
            i2 = 2131755927;
        }
        textView.setText(i2);
    }

    /* renamed from: M */
    private void m17338M() {
        Runnable runnable;
        Handler handler;
        "updateMusicModeView, music mode enabled: " + this.f12411c.mo23408d0().mo27677a0();
        m17333A();
        if (this.f12411c.mo23408d0().mo27677a0()) {
            handler = this.f12414f;
            runnable = new C5930c(this);
        } else {
            handler = this.f12414f;
            runnable = new C5931d(this);
        }
        handler.post(runnable);
    }

    /* renamed from: z */
    private int m17345z() {
        C4200i iVar = this.f12411c;
        int i = 0;
        if (iVar instanceof C5980c) {
            for (C4200i d0 : ((C5980c) iVar).mo27498K1()) {
                if (d0.mo23408d0().mo27677a0()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: B */
    public /* synthetic */ void mo27279B() {
        WaveView waveView = this.mWaveView;
        if (waveView != null) {
            waveView.mo27453d(Color.parseColor("#ffffffff"), Color.parseColor("#4dffffff"));
        }
    }

    /* renamed from: C */
    public /* synthetic */ void mo27280C() {
        this.mControlProgressBar.setVisibility(4);
        this.mBtnControl.setVisibility(0);
        this.mDefaultView.setVisibility(4);
        this.mBtnControl.setBackgroundResource(2131231187);
        this.mWaveView.mo27452c(1, 0);
        this.mWaveView.post(new C5932e(this));
        this.f12414f.removeMessages(0);
        this.mWaveView.setVisibility(0);
        this.f12409a.mo27467b();
        if (this.f12411c instanceof C5980c) {
            this.mMusicModeDeviceNum.setText(m17345z() + " / " + ((C5980c) this.f12411c).mo27498K1().size());
        }
        this.mBtnControl.setOnClickListener(new C5949v(this));
    }

    /* renamed from: D */
    public /* synthetic */ void mo27281D() {
        this.mControlProgressBar.setVisibility(4);
        this.mBtnControl.setVisibility(0);
        this.mDefaultView.setVisibility(0);
        this.mBtnControl.setBackgroundResource(2131231186);
        this.f12414f.removeMessages(0);
        this.mWaveView.setVisibility(4);
        if (this.f12411c instanceof C5980c) {
            this.mMusicModeDeviceNum.setText(m17345z() + " / " + ((C5980c) this.f12411c).mo27498K1().size());
        }
        this.mBtnControl.setOnClickListener(new C5950w(this));
    }

    /* renamed from: H */
    public void mo27282H(Context context) {
        try {
            Class<?> cls = Class.forName("com.yeelight.cherry.ui.activity.MainActivity");
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
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_music, viewGroup, false);
        this.f12410b = inflate;
        WaveView waveView = (WaveView) inflate.findViewById(C11745R$id.disco_wave_view);
        this.mWaveView = waveView;
        this.f12409a = new C5967b(waveView);
        this.mWaveView.setVisibility(4);
        this.f12412d = ButterKnife.bind((Object) this, this.f12410b);
        this.mTitleBar.mo32825a(getResources().getString(2131755925), new C5887b(), new C5888c());
        this.mTitleBar.setTitleTextSize(16);
        this.f12411c = (C4200i) C4257w.m11945h0(getActivity().getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.mTitleBar.setLeftButtonVisibility(0);
        this.mTitleBar.setLeftButtonResource(2131231176);
        int d = C10559w.m25808d();
        this.f12413e = d;
        m17337K(d);
        this.mRgMusicMode.setOnCheckedChangeListener(new C5889d());
        C4200i iVar = this.f12411c;
        if (iVar == null) {
            mo27282H(getActivity());
            getActivity().finish();
        } else {
            if (iVar instanceof C5980c) {
                this.mTitleBar.setRightButtonVisibility(0);
                this.mTitleBar.setRightButtonResource(2131231543);
                this.mMusicModeDeviceNum.setVisibility(0);
                this.mMusicModeDeviceNumTitle.setVisibility(0);
            } else {
                this.mMusicModeDeviceNum.setVisibility(4);
                this.mMusicModeDeviceNumTitle.setVisibility(4);
                this.mTitleBar.setRightButtonVisibility(8);
            }
            C9802n.m23790s(getContext()).mo31664x();
        }
        return this.f12410b;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        Unbinder unbinder = this.f12412d;
        if (unbinder != null) {
            unbinder.unbind();
        }
        this.f12414f.removeCallbacksAndMessages((Object) null);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
        C4200i iVar = this.f12411c;
        if (iVar instanceof C5980c) {
            for (C4200i W0 : ((C5980c) iVar).mo27498K1()) {
                W0.mo23400W0(this);
            }
            return;
        }
        iVar.mo23400W0(this);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = false;
        if (i == 100) {
            if (iArr.length > 0 && iArr[0] == 0) {
                m17336J();
            }
        } else if (i == 101) {
            C9802n s = C9802n.m23790s(getContext());
            if (this.f12413e == 1) {
                z = true;
            }
            s.mo31662A(z);
        }
    }

    public void onResume() {
        super.onResume();
        C4200i iVar = this.f12411c;
        if (iVar instanceof C5980c) {
            for (C4200i B0 : ((C5980c) iVar).mo27498K1()) {
                B0.mo23365B0(this);
            }
        } else {
            iVar.mo23365B0(this);
        }
        m17338M();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m17338M();
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
