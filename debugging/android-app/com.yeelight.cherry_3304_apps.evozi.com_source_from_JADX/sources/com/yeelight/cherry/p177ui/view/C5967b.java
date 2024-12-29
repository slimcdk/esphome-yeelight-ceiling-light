package com.yeelight.cherry.p177ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.view.b */
public class C5967b {

    /* renamed from: a */
    private WaveView f12640a;

    /* renamed from: b */
    private AnimatorSet f12641b;

    /* renamed from: c */
    private ObjectAnimator f12642c;

    public C5967b(WaveView waveView) {
        this.f12640a = waveView;
        m17480a();
    }

    /* renamed from: a */
    private void m17480a() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12640a, "waveShiftRatio", new float[]{0.0f, 5.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5500);
        ofFloat.setInterpolator(new LinearInterpolator());
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f12640a, "waterLevelRatio", new float[]{0.2f, 0.4f});
        ofFloat2.setDuration(10000);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f12640a, "amplitudeRatio", new float[]{0.05f, 0.15f});
        this.f12642c = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        this.f12642c.setRepeatMode(2);
        this.f12642c.setDuration(3000);
        this.f12642c.setInterpolator(new LinearInterpolator());
        arrayList.add(this.f12642c);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12641b = animatorSet;
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: b */
    public void mo27467b() {
        this.f12640a.setShowWave(true);
        AnimatorSet animatorSet = this.f12641b;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
