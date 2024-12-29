package net.lucode.hackware.magicindicator.p265d.p266c;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.C11717b;
import net.lucode.hackware.magicindicator.R$id;
import net.lucode.hackware.magicindicator.R$layout;
import net.lucode.hackware.magicindicator.p264c.C11719a;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11724a;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11725b;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11726c;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11727d;
import net.lucode.hackware.magicindicator.p265d.p266c.p269d.C11729a;

/* renamed from: net.lucode.hackware.magicindicator.d.c.a */
public class C11722a extends FrameLayout implements C11719a, C11717b.C11718a {

    /* renamed from: a */
    private HorizontalScrollView f23063a;

    /* renamed from: b */
    private LinearLayout f23064b;

    /* renamed from: c */
    private LinearLayout f23065c;

    /* renamed from: d */
    private C11726c f23066d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11724a f23067e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11717b f23068f;

    /* renamed from: g */
    private boolean f23069g;

    /* renamed from: h */
    private boolean f23070h;

    /* renamed from: i */
    private float f23071i = 0.5f;

    /* renamed from: j */
    private boolean f23072j = true;

    /* renamed from: k */
    private boolean f23073k = true;

    /* renamed from: l */
    private int f23074l;

    /* renamed from: m */
    private int f23075m;

    /* renamed from: n */
    private boolean f23076n;

    /* renamed from: o */
    private boolean f23077o = true;

    /* renamed from: p */
    private List<C11729a> f23078p = new ArrayList();

    /* renamed from: q */
    private DataSetObserver f23079q = new C11723a();

    /* renamed from: net.lucode.hackware.magicindicator.d.c.a$a */
    class C11723a extends DataSetObserver {
        C11723a() {
        }

        public void onChanged() {
            C11722a.this.f23068f.mo36817m(C11722a.this.f23067e.mo26444a());
            C11722a.this.m30423j();
        }

        public void onInvalidated() {
        }
    }

    public C11722a(Context context) {
        super(context);
        C11717b bVar = new C11717b();
        this.f23068f = bVar;
        bVar.mo36815k(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m30423j() {
        int i;
        LayoutInflater layoutInflater;
        removeAllViews();
        if (this.f23069g) {
            layoutInflater = LayoutInflater.from(getContext());
            i = R$layout.pager_navigator_layout_no_scroll;
        } else {
            layoutInflater = LayoutInflater.from(getContext());
            i = R$layout.pager_navigator_layout;
        }
        View inflate = layoutInflater.inflate(i, this);
        this.f23063a = (HorizontalScrollView) inflate.findViewById(R$id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R$id.title_container);
        this.f23064b = linearLayout;
        linearLayout.setPadding(this.f23075m, 0, this.f23074l, 0);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R$id.indicator_container);
        this.f23065c = linearLayout2;
        if (this.f23076n) {
            linearLayout2.getParent().bringChildToFront(this.f23065c);
        }
        m30424k();
    }

    /* renamed from: k */
    private void m30424k() {
        LinearLayout.LayoutParams layoutParams;
        int g = this.f23068f.mo36811g();
        for (int i = 0; i < g; i++) {
            C11727d c = this.f23067e.mo26446c(getContext(), i);
            if (c instanceof View) {
                View view = (View) c;
                if (this.f23069g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f23067e.mo36847d(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f23064b.addView(view, layoutParams);
            }
        }
        C11724a aVar = this.f23067e;
        if (aVar != null) {
            C11726c b = aVar.mo26445b(getContext());
            this.f23066d = b;
            if (b instanceof View) {
                this.f23065c.addView((View) this.f23066d, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: l */
    private void m30425l() {
        this.f23078p.clear();
        int g = this.f23068f.mo36811g();
        for (int i = 0; i < g; i++) {
            C11729a aVar = new C11729a();
            View childAt = this.f23064b.getChildAt(i);
            if (childAt != null) {
                aVar.f23094a = childAt.getLeft();
                aVar.f23095b = childAt.getTop();
                aVar.f23096c = childAt.getRight();
                int bottom = childAt.getBottom();
                aVar.f23097d = bottom;
                if (childAt instanceof C11725b) {
                    C11725b bVar = (C11725b) childAt;
                    aVar.f23098e = bVar.getContentLeft();
                    aVar.f23099f = bVar.getContentTop();
                    aVar.f23100g = bVar.getContentRight();
                    aVar.f23101h = bVar.getContentBottom();
                } else {
                    aVar.f23098e = aVar.f23094a;
                    aVar.f23099f = aVar.f23095b;
                    aVar.f23100g = aVar.f23096c;
                    aVar.f23101h = bottom;
                }
            }
            this.f23078p.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo36818a(int i, int i2) {
        LinearLayout linearLayout = this.f23064b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C11727d) {
                ((C11727d) childAt).mo36859a(i, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo36819b(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f23064b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C11727d) {
                ((C11727d) childAt).mo36860b(i, i2, f, z);
            }
        }
    }

    /* renamed from: c */
    public void mo36820c(int i, int i2) {
        HorizontalScrollView horizontalScrollView;
        int i3;
        HorizontalScrollView horizontalScrollView2;
        int i4;
        LinearLayout linearLayout = this.f23064b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C11727d) {
                ((C11727d) childAt).mo36861c(i, i2);
            }
            if (!this.f23069g && !this.f23073k && this.f23063a != null && this.f23078p.size() > 0) {
                C11729a aVar = this.f23078p.get(Math.min(this.f23078p.size() - 1, i));
                if (this.f23070h) {
                    float a = ((float) aVar.mo36883a()) - (((float) this.f23063a.getWidth()) * this.f23071i);
                    if (this.f23072j) {
                        horizontalScrollView2 = this.f23063a;
                        i4 = (int) a;
                    } else {
                        horizontalScrollView = this.f23063a;
                        i3 = (int) a;
                        horizontalScrollView.scrollTo(i3, 0);
                        return;
                    }
                } else {
                    int scrollX = this.f23063a.getScrollX();
                    int i5 = aVar.f23094a;
                    if (scrollX <= i5) {
                        int scrollX2 = this.f23063a.getScrollX() + getWidth();
                        int i6 = aVar.f23096c;
                        if (scrollX2 >= i6) {
                            return;
                        }
                        if (this.f23072j) {
                            horizontalScrollView2 = this.f23063a;
                            i4 = i6 - getWidth();
                        } else {
                            horizontalScrollView = this.f23063a;
                            i3 = i6 - getWidth();
                            horizontalScrollView.scrollTo(i3, 0);
                            return;
                        }
                    } else if (this.f23072j) {
                        this.f23063a.smoothScrollTo(i5, 0);
                        return;
                    } else {
                        this.f23063a.scrollTo(i5, 0);
                        return;
                    }
                }
                horizontalScrollView2.smoothScrollTo(i4, 0);
            }
        }
    }

    /* renamed from: d */
    public void mo36821d(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f23064b;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C11727d) {
                ((C11727d) childAt).mo36862d(i, i2, f, z);
            }
        }
    }

    /* renamed from: e */
    public void mo36822e() {
        m30423j();
    }

    /* renamed from: f */
    public void mo36823f() {
    }

    public C11724a getAdapter() {
        return this.f23067e;
    }

    public int getLeftPadding() {
        return this.f23075m;
    }

    public C11726c getPagerIndicator() {
        return this.f23066d;
    }

    public int getRightPadding() {
        return this.f23074l;
    }

    public float getScrollPivotX() {
        return this.f23071i;
    }

    public LinearLayout getTitleContainer() {
        return this.f23064b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f23067e != null) {
            m30425l();
            C11726c cVar = this.f23066d;
            if (cVar != null) {
                cVar.mo36855a(this.f23078p);
            }
            if (this.f23077o && this.f23068f.mo36810f() == 0) {
                onPageSelected(this.f23068f.mo36809e());
                onPageScrolled(this.f23068f.mo36809e(), 0.0f, 0);
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
        if (this.f23067e != null) {
            this.f23068f.mo36812h(i);
            C11726c cVar = this.f23066d;
            if (cVar != null) {
                cVar.onPageScrollStateChanged(i);
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f23067e != null) {
            this.f23068f.mo36813i(i, f, i2);
            C11726c cVar = this.f23066d;
            if (cVar != null) {
                cVar.onPageScrolled(i, f, i2);
            }
            if (this.f23063a != null && this.f23078p.size() > 0 && i >= 0 && i < this.f23078p.size() && this.f23073k) {
                int min = Math.min(this.f23078p.size() - 1, i);
                int min2 = Math.min(this.f23078p.size() - 1, i + 1);
                float a = ((float) this.f23078p.get(min).mo36883a()) - (((float) this.f23063a.getWidth()) * this.f23071i);
                this.f23063a.scrollTo((int) (a + (((((float) this.f23078p.get(min2).mo36883a()) - (((float) this.f23063a.getWidth()) * this.f23071i)) - a) * f)), 0);
            }
        }
    }

    public void onPageSelected(int i) {
        if (this.f23067e != null) {
            this.f23068f.mo36814j(i);
            C11726c cVar = this.f23066d;
            if (cVar != null) {
                cVar.onPageSelected(i);
            }
        }
    }

    public void setAdapter(C11724a aVar) {
        C11724a aVar2 = this.f23067e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo36850g(this.f23079q);
            }
            this.f23067e = aVar;
            if (aVar != null) {
                aVar.mo36849f(this.f23079q);
                this.f23068f.mo36817m(this.f23067e.mo26444a());
                if (this.f23064b != null) {
                    this.f23067e.mo36848e();
                    return;
                }
                return;
            }
            this.f23068f.mo36817m(0);
            m30423j();
        }
    }

    public void setAdjustMode(boolean z) {
        this.f23069g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f23070h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f23073k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f23076n = z;
    }

    public void setLeftPadding(int i) {
        this.f23075m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f23077o = z;
    }

    public void setRightPadding(int i) {
        this.f23074l = i;
    }

    public void setScrollPivotX(float f) {
        this.f23071i = f;
    }

    public void setSkimOver(boolean z) {
        this.f23068f.mo36816l(z);
    }

    public void setSmoothScroll(boolean z) {
        this.f23072j = z;
    }
}
