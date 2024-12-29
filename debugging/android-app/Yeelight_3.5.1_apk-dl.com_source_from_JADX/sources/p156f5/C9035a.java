package p156f5;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.R$id;
import net.lucode.hackware.magicindicator.R$layout;
import p135c5.C4011b;
import p146d5.C8940a;
import p161g5.C9080a;
import p161g5.C9081b;
import p161g5.C9082c;
import p161g5.C9083d;
import p171i5.C9120a;

/* renamed from: f5.a */
public class C9035a extends FrameLayout implements C8940a, C4011b.C4012a {

    /* renamed from: a */
    private HorizontalScrollView f16555a;

    /* renamed from: b */
    private LinearLayout f16556b;

    /* renamed from: c */
    private LinearLayout f16557c;

    /* renamed from: d */
    private C9082c f16558d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9080a f16559e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4011b f16560f;

    /* renamed from: g */
    private boolean f16561g;

    /* renamed from: h */
    private boolean f16562h;

    /* renamed from: i */
    private float f16563i = 0.5f;

    /* renamed from: j */
    private boolean f16564j = true;

    /* renamed from: k */
    private boolean f16565k = true;

    /* renamed from: l */
    private int f16566l;

    /* renamed from: m */
    private int f16567m;

    /* renamed from: n */
    private boolean f16568n;

    /* renamed from: o */
    private boolean f16569o = true;

    /* renamed from: p */
    private List<C9120a> f16570p = new ArrayList();

    /* renamed from: q */
    private DataSetObserver f16571q = new C9036a();

    /* renamed from: f5.a$a */
    class C9036a extends DataSetObserver {
        C9036a() {
        }

        public void onChanged() {
            C9035a.this.f16560f.mo26614m(C9035a.this.f16559e.mo30471a());
            C9035a.this.m21574j();
        }

        public void onInvalidated() {
        }
    }

    public C9035a(Context context) {
        super(context);
        C4011b bVar = new C4011b();
        this.f16560f = bVar;
        bVar.mo26612k(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m21574j() {
        int i;
        LayoutInflater layoutInflater;
        removeAllViews();
        if (this.f16561g) {
            layoutInflater = LayoutInflater.from(getContext());
            i = R$layout.pager_navigator_layout_no_scroll;
        } else {
            layoutInflater = LayoutInflater.from(getContext());
            i = R$layout.pager_navigator_layout;
        }
        View inflate = layoutInflater.inflate(i, this);
        this.f16555a = (HorizontalScrollView) inflate.findViewById(R$id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R$id.title_container);
        this.f16556b = linearLayout;
        linearLayout.setPadding(this.f16567m, 0, this.f16566l, 0);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R$id.indicator_container);
        this.f16557c = linearLayout2;
        if (this.f16568n) {
            linearLayout2.getParent().bringChildToFront(this.f16557c);
        }
        m21575k();
    }

    /* renamed from: k */
    private void m21575k() {
        LinearLayout.LayoutParams layoutParams;
        int g = this.f16560f.mo26608g();
        for (int i = 0; i < g; i++) {
            C9083d c = this.f16559e.mo30473c(getContext(), i);
            if (c instanceof View) {
                View view = (View) c;
                if (this.f16561g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f16559e.mo37033d(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f16556b.addView(view, layoutParams);
            }
        }
        C9080a aVar = this.f16559e;
        if (aVar != null) {
            C9082c b = aVar.mo30472b(getContext());
            this.f16558d = b;
            if (b instanceof View) {
                this.f16557c.addView((View) this.f16558d, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: l */
    private void m21576l() {
        this.f16570p.clear();
        int g = this.f16560f.mo26608g();
        for (int i = 0; i < g; i++) {
            C9120a aVar = new C9120a();
            View childAt = this.f16556b.getChildAt(i);
            if (childAt != null) {
                aVar.f16857a = childAt.getLeft();
                aVar.f16858b = childAt.getTop();
                aVar.f16859c = childAt.getRight();
                int bottom = childAt.getBottom();
                aVar.f16860d = bottom;
                if (childAt instanceof C9081b) {
                    C9081b bVar = (C9081b) childAt;
                    aVar.f16861e = bVar.getContentLeft();
                    aVar.f16862f = bVar.getContentTop();
                    aVar.f16863g = bVar.getContentRight();
                    aVar.f16864h = bVar.getContentBottom();
                } else {
                    aVar.f16861e = aVar.f16857a;
                    aVar.f16862f = aVar.f16858b;
                    aVar.f16863g = aVar.f16859c;
                    aVar.f16864h = bottom;
                }
            }
            this.f16570p.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo26615a(int i, int i2) {
        LinearLayout linearLayout = this.f16556b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C9083d) {
                ((C9083d) childAt).mo37045a(i, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo26616b(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f16556b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C9083d) {
                ((C9083d) childAt).mo37046b(i, i2, f, z);
            }
        }
    }

    /* renamed from: c */
    public void mo26617c(int i, int i2) {
        HorizontalScrollView horizontalScrollView;
        int i3;
        HorizontalScrollView horizontalScrollView2;
        int i4;
        LinearLayout linearLayout = this.f16556b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C9083d) {
                ((C9083d) childAt).mo37047c(i, i2);
            }
            if (!this.f16561g && !this.f16565k && this.f16555a != null && this.f16570p.size() > 0) {
                C9120a aVar = this.f16570p.get(Math.min(this.f16570p.size() - 1, i));
                if (this.f16562h) {
                    float a = ((float) aVar.mo37184a()) - (((float) this.f16555a.getWidth()) * this.f16563i);
                    if (this.f16564j) {
                        horizontalScrollView2 = this.f16555a;
                        i4 = (int) a;
                    } else {
                        horizontalScrollView = this.f16555a;
                        i3 = (int) a;
                        horizontalScrollView.scrollTo(i3, 0);
                        return;
                    }
                } else {
                    int scrollX = this.f16555a.getScrollX();
                    int i5 = aVar.f16857a;
                    if (scrollX <= i5) {
                        int scrollX2 = this.f16555a.getScrollX() + getWidth();
                        int i6 = aVar.f16859c;
                        if (scrollX2 >= i6) {
                            return;
                        }
                        if (this.f16564j) {
                            horizontalScrollView2 = this.f16555a;
                            i4 = i6 - getWidth();
                        } else {
                            horizontalScrollView = this.f16555a;
                            i3 = i6 - getWidth();
                            horizontalScrollView.scrollTo(i3, 0);
                            return;
                        }
                    } else if (this.f16564j) {
                        this.f16555a.smoothScrollTo(i5, 0);
                        return;
                    } else {
                        this.f16555a.scrollTo(i5, 0);
                        return;
                    }
                }
                horizontalScrollView2.smoothScrollTo(i4, 0);
            }
        }
    }

    /* renamed from: d */
    public void mo26618d(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f16556b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C9083d) {
                ((C9083d) childAt).mo37048d(i, i2, f, z);
            }
        }
    }

    /* renamed from: e */
    public void mo36740e() {
        m21574j();
    }

    /* renamed from: f */
    public void mo36741f() {
    }

    public C9080a getAdapter() {
        return this.f16559e;
    }

    public int getLeftPadding() {
        return this.f16567m;
    }

    public C9082c getPagerIndicator() {
        return this.f16558d;
    }

    public int getRightPadding() {
        return this.f16566l;
    }

    public float getScrollPivotX() {
        return this.f16563i;
    }

    public LinearLayout getTitleContainer() {
        return this.f16556b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f16559e != null) {
            m21576l();
            C9082c cVar = this.f16558d;
            if (cVar != null) {
                cVar.mo37041a(this.f16570p);
            }
            if (this.f16569o && this.f16560f.mo26607f() == 0) {
                onPageSelected(this.f16560f.mo26606e());
                onPageScrolled(this.f16560f.mo26606e(), 0.0f, 0);
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
        if (this.f16559e != null) {
            this.f16560f.mo26609h(i);
            C9082c cVar = this.f16558d;
            if (cVar != null) {
                cVar.onPageScrollStateChanged(i);
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f16559e != null) {
            this.f16560f.mo26610i(i, f, i2);
            C9082c cVar = this.f16558d;
            if (cVar != null) {
                cVar.onPageScrolled(i, f, i2);
            }
            if (this.f16555a != null && this.f16570p.size() > 0 && i >= 0 && i < this.f16570p.size() && this.f16565k) {
                int min = Math.min(this.f16570p.size() - 1, i);
                int min2 = Math.min(this.f16570p.size() - 1, i + 1);
                float a = ((float) this.f16570p.get(min).mo37184a()) - (((float) this.f16555a.getWidth()) * this.f16563i);
                this.f16555a.scrollTo((int) (a + (((((float) this.f16570p.get(min2).mo37184a()) - (((float) this.f16555a.getWidth()) * this.f16563i)) - a) * f)), 0);
            }
        }
    }

    public void onPageSelected(int i) {
        if (this.f16559e != null) {
            this.f16560f.mo26611j(i);
            C9082c cVar = this.f16558d;
            if (cVar != null) {
                cVar.onPageSelected(i);
            }
        }
    }

    public void setAdapter(C9080a aVar) {
        C9080a aVar2 = this.f16559e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo37036g(this.f16571q);
            }
            this.f16559e = aVar;
            if (aVar != null) {
                aVar.mo37035f(this.f16571q);
                this.f16560f.mo26614m(this.f16559e.mo30471a());
                if (this.f16556b != null) {
                    this.f16559e.mo37034e();
                    return;
                }
                return;
            }
            this.f16560f.mo26614m(0);
            m21574j();
        }
    }

    public void setAdjustMode(boolean z) {
        this.f16561g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f16562h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f16565k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f16568n = z;
    }

    public void setLeftPadding(int i) {
        this.f16567m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f16569o = z;
    }

    public void setRightPadding(int i) {
        this.f16566l = i;
    }

    public void setScrollPivotX(float f) {
        this.f16563i = f;
    }

    public void setSkimOver(boolean z) {
        this.f16560f.mo26613l(z);
    }

    public void setSmoothScroll(boolean z) {
        this.f16564j = z;
    }
}
