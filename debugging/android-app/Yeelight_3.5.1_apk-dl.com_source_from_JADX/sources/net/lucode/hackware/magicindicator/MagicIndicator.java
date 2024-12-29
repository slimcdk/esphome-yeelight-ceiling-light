package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p146d5.C8940a;

public class MagicIndicator extends FrameLayout {

    /* renamed from: a */
    private C8940a f17577a;

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo38942a(int i) {
        C8940a aVar = this.f17577a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: b */
    public void mo38943b(int i, float f, int i2) {
        C8940a aVar = this.f17577a;
        if (aVar != null) {
            aVar.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: c */
    public void mo38944c(int i) {
        C8940a aVar = this.f17577a;
        if (aVar != null) {
            aVar.onPageSelected(i);
        }
    }

    public C8940a getNavigator() {
        return this.f17577a;
    }

    public void setNavigator(C8940a aVar) {
        C8940a aVar2 = this.f17577a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo36741f();
            }
            this.f17577a = aVar;
            removeAllViews();
            if (this.f17577a instanceof View) {
                addView((View) this.f17577a, new FrameLayout.LayoutParams(-1, -1));
                this.f17577a.mo36740e();
            }
        }
    }
}
