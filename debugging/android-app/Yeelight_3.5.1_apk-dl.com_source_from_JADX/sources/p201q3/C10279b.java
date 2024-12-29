package p201q3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.yeelight.cherry.p141ui.view.WaveView;
import java.util.ArrayList;

/* renamed from: q3.b */
public class C10279b {

    /* renamed from: a */
    private WaveView f19362a;

    /* renamed from: b */
    private AnimatorSet f19363b;

    /* renamed from: c */
    private ObjectAnimator f19364c;

    public C10279b(WaveView waveView) {
        this.f19362a = waveView;
        m25878a();
    }

    /* renamed from: a */
    private void m25878a() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19362a, "waveShiftRatio", new float[]{0.0f, 5.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5500);
        ofFloat.setInterpolator(new LinearInterpolator());
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f19362a, "waterLevelRatio", new float[]{0.2f, 0.4f});
        ofFloat2.setDuration(10000);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f19362a, "amplitudeRatio", new float[]{0.05f, 0.15f});
        this.f19364c = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        this.f19364c.setRepeatMode(2);
        this.f19364c.setDuration(3000);
        this.f19364c.setInterpolator(new LinearInterpolator());
        arrayList.add(this.f19364c);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19363b = animatorSet;
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: b */
    public void mo41788b() {
        this.f19362a.setShowWave(true);
        AnimatorSet animatorSet = this.f19363b;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
