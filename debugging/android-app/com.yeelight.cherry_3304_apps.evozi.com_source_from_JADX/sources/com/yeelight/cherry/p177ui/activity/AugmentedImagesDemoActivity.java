package com.yeelight.cherry.p177ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.google.p107ar.core.AugmentedImage;
import com.google.p107ar.core.Frame;
import com.google.p107ar.core.TrackingState;
import com.google.p107ar.sceneform.FrameTime;
import com.google.p107ar.sceneform.p108ux.ArFragment;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p176c.C4963c;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yeelight.cherry.ui.activity.AugmentedImagesDemoActivity */
public class AugmentedImagesDemoActivity extends BaseActivity {

    /* renamed from: b */
    ArFragment f10345b;

    /* renamed from: c */
    private ImageView f10346c;

    /* renamed from: d */
    private final Map<AugmentedImage, C4963c> f10347d = new HashMap();

    /* renamed from: com.yeelight.cherry.ui.activity.AugmentedImagesDemoActivity$a */
    static /* synthetic */ class C5003a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10348a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.ar.core.TrackingState[] r0 = com.google.p107ar.core.TrackingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10348a = r0
                com.google.ar.core.TrackingState r1 = com.google.p107ar.core.TrackingState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10348a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.core.TrackingState r1 = com.google.p107ar.core.TrackingState.TRACKING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.core.TrackingState r1 = com.google.p107ar.core.TrackingState.STOPPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.AugmentedImagesDemoActivity.C5003a.<clinit>():void");
        }
    }

    static {
        Class<AugmentedImagesDemoActivity> cls = AugmentedImagesDemoActivity.class;
    }

    /* access modifiers changed from: private */
    @RequiresApi(api = 24)
    /* renamed from: W */
    public void m15992W(FrameTime frameTime) {
        Frame arFrame = this.f10345b.getArSceneView().getArFrame();
        if (arFrame != null && arFrame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            for (AugmentedImage next : arFrame.getUpdatedTrackables(AugmentedImage.class)) {
                int i = C5003a.f10348a[next.getTrackingState().ordinal()];
                if (i == 1) {
                    Toast.makeText(this, "Detected Image " + next.getIndex(), 0);
                } else if (i == 2) {
                    this.f10346c.setVisibility(8);
                    if (!this.f10347d.containsKey(next)) {
                        Toast.makeText(this, "Found new image, add anchor!", 0);
                        C4963c cVar = new C4963c(this);
                        cVar.mo26064c(next);
                        this.f10347d.put(next, cVar);
                        this.f10345b.getArSceneView().getScene().addChild(cVar);
                    }
                } else if (i == 3) {
                    this.f10347d.remove(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 24)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_augmented_image_demo);
        this.f10345b = (ArFragment) getSupportFragmentManager().findFragmentById(C11745R$id.ux_fragment);
        this.f10346c = (ImageView) findViewById(C11745R$id.image_view_fit_to_scan);
        this.f10345b.getArSceneView().getScene().addOnUpdateListener(new C5715h(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10347d.isEmpty()) {
            this.f10346c.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
