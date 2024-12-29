package androidx.constraintlayout.core.state;

/* renamed from: androidx.constraintlayout.core.state.a */
public final /* synthetic */ class C0175a implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ String f43a;

    public /* synthetic */ C0175a(String str) {
        this.f43a = str;
    }

    public final float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0(this.f43a, f);
    }
}
