package com.lcodecore.tkrefreshlayout.p144j;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;

/* renamed from: com.lcodecore.tkrefreshlayout.j.c */
public class C3423c {
    /* renamed from: a */
    private static int m10618a(RecyclerView.LayoutParams layoutParams) {
        try {
            Field declaredField = RecyclerView.LayoutParams.class.getDeclaredField("mDecorInsets");
            declaredField.setAccessible(true);
            return ((Rect) declaredField.get(layoutParams)).top;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m10619b(AbsListView absListView) {
        return absListView != null && absListView.getAdapter() != null && absListView.getChildCount() > 0 && absListView.getLastVisiblePosition() == ((ListAdapter) absListView.getAdapter()).getCount() - 1 && absListView.getChildAt(absListView.getChildCount() - 1).getBottom() <= absListView.getMeasuredHeight();
    }

    /* renamed from: c */
    public static boolean m10620c(AbsListView absListView) {
        if (absListView != null) {
            return absListView.getFirstVisiblePosition() == 0 && (absListView.getChildCount() > 0 ? absListView.getChildAt(0).getTop() - absListView.getPaddingTop() : 0) == 0;
        }
    }

    /* renamed from: d */
    public static boolean m10621d(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || layoutManager.getItemCount() == 0)) {
            if (layoutManager instanceof LinearLayoutManager) {
                View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                if (childAt != null && childAt.getMeasuredHeight() >= recyclerView.getMeasuredHeight()) {
                    return Build.VERSION.SDK_INT < 14 ? !ViewCompat.canScrollVertically(recyclerView, 1) && recyclerView.getScrollY() >= 0 : !ViewCompat.canScrollVertically(recyclerView, 1);
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
                    return true;
                }
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] findLastCompletelyVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions((int[]) null);
                int itemCount = staggeredGridLayoutManager.getItemCount() - 1;
                for (int i : findLastCompletelyVisibleItemPositions) {
                    if (i == itemCount) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10622e(androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0081
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r6.getLayoutManager()
            r2 = 1
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            int r3 = r1.getItemCount()
            if (r3 != 0) goto L_0x0012
            return r2
        L_0x0012:
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x005f
            android.view.View r3 = r6.getChildAt(r0)
            if (r3 == 0) goto L_0x0043
            int r3 = r3.getMeasuredHeight()
            int r4 = r6.getMeasuredHeight()
            if (r3 < r4) goto L_0x0043
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            r4 = -1
            if (r1 >= r3) goto L_0x003d
            boolean r1 = androidx.core.view.ViewCompat.canScrollVertically(r6, r4)
            if (r1 != 0) goto L_0x003c
            int r6 = r6.getScrollY()
            if (r6 > 0) goto L_0x003c
            r0 = 1
        L_0x003c:
            return r0
        L_0x003d:
            boolean r6 = androidx.core.view.ViewCompat.canScrollVertically(r6, r4)
            r6 = r6 ^ r2
            return r6
        L_0x0043:
            android.view.View r3 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            int r3 = r3.getTop()
            int r5 = r4.topMargin
            int r3 = r3 - r5
            int r4 = m10618a(r4)
            int r3 = r3 - r4
            int r6 = r6.getPaddingTop()
            int r3 = r3 - r6
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            boolean r6 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r6 == 0) goto L_0x006f
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r6 = r1.findFirstCompletelyVisibleItemPosition()
            if (r6 >= r2) goto L_0x0081
            if (r3 != 0) goto L_0x0081
            return r2
        L_0x006f:
            boolean r6 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r6 == 0) goto L_0x0081
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r6 = 0
            int[] r6 = r1.findFirstCompletelyVisibleItemPositions(r6)
            r6 = r6[r0]
            if (r6 >= r2) goto L_0x0081
            if (r3 != 0) goto L_0x0081
            return r2
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lcodecore.tkrefreshlayout.p144j.C3423c.m10622e(androidx.recyclerview.widget.RecyclerView):boolean");
    }

    /* renamed from: f */
    public static boolean m10623f(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        return childAt != null && childAt.getMeasuredHeight() <= viewGroup.getScrollY() + viewGroup.getHeight();
    }

    /* renamed from: g */
    public static boolean m10624g(View view, int i) {
        if (view instanceof AbsListView) {
            return m10619b((AbsListView) view);
        }
        if (view instanceof RecyclerView) {
            return m10621d((RecyclerView) view);
        }
        if (view instanceof WebView) {
            return m10626i((WebView) view, i);
        }
        if (view instanceof ViewGroup) {
            return m10623f((ViewGroup) view);
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m10625h(View view, int i) {
        return view instanceof AbsListView ? m10620c((AbsListView) view) : view instanceof RecyclerView ? m10622e((RecyclerView) view) : view != null && Math.abs(view.getScrollY()) <= i * 2;
    }

    /* renamed from: i */
    public static boolean m10626i(WebView webView, int i) {
        return webView != null && (((float) webView.getContentHeight()) * webView.getScale()) - ((float) (webView.getHeight() + webView.getScrollY())) <= ((float) (i * 2));
    }

    /* renamed from: j */
    public static void m10627j(View view, int i) {
        Class<Integer> cls = Integer.class;
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).scrollBy(0, i);
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).smoothScrollBy(0, i);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).smoothScrollBy(i, 0);
        } else {
            try {
                view.getClass().getDeclaredMethod("smoothScrollBy", new Class[]{cls, cls}).invoke(view, new Object[]{0, Integer.valueOf(i)});
            } catch (Exception unused) {
                view.scrollBy(0, i);
            }
        }
    }
}
