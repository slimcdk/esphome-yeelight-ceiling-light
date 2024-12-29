package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.p264c.C11719a;

public class MagicIndicator extends FrameLayout {

    /* renamed from: a */
    private C11719a f23043a;

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo36799a(int i) {
        C11719a aVar = this.f23043a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: b */
    public void mo36800b(int i, float f, int i2) {
        C11719a aVar = this.f23043a;
        if (aVar != null) {
            aVar.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: c */
    public void mo36801c(int i) {
        C11719a aVar = this.f23043a;
        if (aVar != null) {
            aVar.onPageSelected(i);
        }
    }

    public C11719a getNavigator() {
        return this.f23043a;
    }

    public void setNavigator(C11719a aVar) {
        C11719a aVar2 = this.f23043a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo36823f();
            }
            this.f23043a = aVar;
            removeAllViews();
            if (this.f23043a instanceof View) {
                addView((View) this.f23043a, new FrameLayout.LayoutParams(-1, -1));
                this.f23043a.mo36822e();
            }
        }
    }
}
