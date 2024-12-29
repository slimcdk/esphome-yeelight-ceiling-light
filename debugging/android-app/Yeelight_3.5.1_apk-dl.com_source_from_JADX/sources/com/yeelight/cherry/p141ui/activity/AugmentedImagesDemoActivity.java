package com.yeelight.cherry.p141ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.google.p017ar.core.AugmentedImage;
import com.google.p017ar.core.Frame;
import com.google.p017ar.core.TrackingState;
import com.google.p017ar.sceneform.FrameTime;
import com.google.p017ar.sceneform.p018ux.ArFragment;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.utils.C6029c;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import java.util.HashMap;
import java.util.Map;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AugmentedImagesDemoActivity */
public class AugmentedImagesDemoActivity extends BaseActivity {

    /* renamed from: a */
    ArFragment f9889a;

    /* renamed from: b */
    private ImageView f9890b;

    /* renamed from: c */
    private final Map<AugmentedImage, C6029c> f9891c = new HashMap();

    /* renamed from: com.yeelight.cherry.ui.activity.AugmentedImagesDemoActivity$a */
    static /* synthetic */ class C5048a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9892a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.ar.core.TrackingState[] r0 = com.google.p017ar.core.TrackingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9892a = r0
                com.google.ar.core.TrackingState r1 = com.google.p017ar.core.TrackingState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9892a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.core.TrackingState r1 = com.google.p017ar.core.TrackingState.TRACKING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9892a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.core.TrackingState r1 = com.google.p017ar.core.TrackingState.STOPPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.AugmentedImagesDemoActivity.C5048a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    @RequiresApi(api = 24)
    /* renamed from: W */
    public void m15846W(FrameTime frameTime) {
        Frame arFrame = this.f9889a.getArSceneView().getArFrame();
        if (arFrame != null && arFrame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            for (AugmentedImage next : arFrame.getUpdatedTrackables(AugmentedImage.class)) {
                int i = C5048a.f9892a[next.getTrackingState().ordinal()];
                if (i == 1) {
                    Toast.makeText(this, "Detected Image " + next.getIndex(), 0);
                } else if (i == 2) {
                    this.f9890b.setVisibility(8);
                    if (!this.f9891c.containsKey(next)) {
                        Toast.makeText(this, "Found new image, add anchor!", 0);
                        C6029c cVar = new C6029c(this);
                        cVar.mo31411e(next);
                        this.f9891c.put(next, cVar);
                        this.f9889a.getArSceneView().getScene().addChild(cVar);
                    }
                } else if (i == 3) {
                    this.f9891c.remove(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 24)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_augmented_image_demo);
        this.f9889a = (ArFragment) getSupportFragmentManager().findFragmentById(C12225R$id.ux_fragment);
        this.f9890b = (ImageView) findViewById(C12225R$id.image_view_fit_to_scan);
        this.f9889a.getArSceneView().getScene().addOnUpdateListener(new C5788l(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f9891c.isEmpty()) {
            this.f9890b.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
