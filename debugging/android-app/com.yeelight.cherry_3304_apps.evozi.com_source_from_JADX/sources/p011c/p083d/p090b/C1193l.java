package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.l */
class C1193l extends C1153a<ImageView> {

    /* renamed from: m */
    C1172e f2021m;

    C1193l(C1203t tVar, ImageView imageView, C1216w wVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C1172e eVar, boolean z) {
        super(tVar, imageView, wVar, i, i2, i3, drawable, str, obj, z);
        this.f2021m = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9886a() {
        super.mo9886a();
        if (this.f2021m != null) {
            this.f2021m = null;
        }
    }

    /* renamed from: b */
    public void mo9887b(Bitmap bitmap, C1203t.C1209e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f1914c.get();
            if (imageView != null) {
                C1203t tVar = this.f1912a;
                Bitmap bitmap2 = bitmap;
                C1203t.C1209e eVar2 = eVar;
                C1213u.m3124c(imageView, tVar.f2060e, bitmap2, eVar2, this.f1915d, tVar.f2068m);
                C1172e eVar3 = this.f2021m;
                if (eVar3 != null) {
                    eVar3.mo9951b();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo9888c() {
        ImageView imageView = (ImageView) this.f1914c.get();
        if (imageView != null) {
            int i = this.f1918g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.f1919h;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            C1172e eVar = this.f2021m;
            if (eVar != null) {
                eVar.mo9950a();
            }
        }
    }
}
