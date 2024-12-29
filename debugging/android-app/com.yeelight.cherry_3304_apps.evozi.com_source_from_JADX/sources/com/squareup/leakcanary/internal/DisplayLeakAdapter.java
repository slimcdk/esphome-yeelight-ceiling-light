package com.squareup.leakcanary.internal;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.leakcanary.C3940R;
import com.squareup.leakcanary.LeakTrace;
import com.squareup.leakcanary.LeakTraceElement;
import com.squareup.leakcanary.internal.DisplayLeakConnectorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class DisplayLeakAdapter extends BaseAdapter {
    private static final int NORMAL_ROW = 1;
    private static final int TOP_ROW = 0;
    private List<LeakTraceElement> elements = Collections.emptyList();
    private boolean[] opened = new boolean[0];
    private String referenceKey;
    private String referenceName = "";

    DisplayLeakAdapter() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String elementToHtmlString(com.squareup.leakcanary.LeakTraceElement r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = r5.referenceName
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r0 = "leaks "
        L_0x0010:
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L_0x0026
        L_0x0018:
            if (r6 != 0) goto L_0x0025
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r0 = "references "
            goto L_0x0010
        L_0x0025:
            r6 = r1
        L_0x0026:
            com.squareup.leakcanary.LeakTraceElement$Type r0 = r5.type
            com.squareup.leakcanary.LeakTraceElement$Type r2 = com.squareup.leakcanary.LeakTraceElement.Type.STATIC_FIELD
            if (r0 != r2) goto L_0x003d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "<font color='#c48a47'>static</font> "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L_0x003d:
            com.squareup.leakcanary.LeakTraceElement$Holder r0 = r5.holder
            com.squareup.leakcanary.LeakTraceElement$Holder r2 = com.squareup.leakcanary.LeakTraceElement.Holder.ARRAY
            if (r0 == r2) goto L_0x0047
            com.squareup.leakcanary.LeakTraceElement$Holder r2 = com.squareup.leakcanary.LeakTraceElement.Holder.THREAD
            if (r0 != r2) goto L_0x006a
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "<font color='#f3cf83'>"
            r0.append(r6)
            com.squareup.leakcanary.LeakTraceElement$Holder r6 = r5.holder
            java.lang.String r6 = r6.name()
            java.lang.String r6 = r6.toLowerCase()
            r0.append(r6)
            java.lang.String r6 = "</font> "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L_0x006a:
            java.lang.String r0 = r5.className
            r2 = 46
            int r0 = r0.lastIndexOf(r2)
            r2 = -1
            if (r0 != r2) goto L_0x0078
            java.lang.String r0 = r5.className
            goto L_0x0087
        L_0x0078:
            java.lang.String r1 = r5.className
            r2 = 0
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r2, r0)
            java.lang.String r2 = r5.className
            java.lang.String r0 = r2.substring(r0)
        L_0x0087:
            java.lang.String r2 = "</font>"
            if (r7 == 0) goto L_0x00a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r6 = "<font color='#919191'>"
            r3.append(r6)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r6 = r3.toString()
        L_0x00a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "<font color='#ffffff'>"
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.String r0 = r5.referenceName
            if (r0 == 0) goto L_0x00ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = ".<font color='#998bb5'>"
            r0.append(r6)
            java.lang.String r6 = r5.referenceName
            java.lang.String r1 = "<"
            java.lang.String r3 = "&lt;"
            java.lang.String r6 = r6.replaceAll(r1, r3)
            java.lang.String r1 = ">"
            java.lang.String r3 = "&gt;"
            java.lang.String r6 = r6.replaceAll(r1, r3)
            r0.append(r6)
            r0.append(r2)
            goto L_0x00fc
        L_0x00ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " <font color='#f3cf83'>instance</font>"
            r0.append(r6)
        L_0x00fc:
            java.lang.String r6 = r0.toString()
            if (r7 == 0) goto L_0x011f
            java.lang.String r0 = r5.extra
            if (r0 == 0) goto L_0x011f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " <font color='#919191'>"
            r0.append(r6)
            java.lang.String r6 = r5.extra
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
        L_0x011f:
            com.squareup.leakcanary.Exclusion r5 = r5.exclusion
            if (r5 == 0) goto L_0x019b
            if (r7 == 0) goto L_0x018a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "<br/><br/>Excluded by rule"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = r5.name
            if (r7 == 0) goto L_0x0153
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " <font color='#ffffff'>"
            r7.append(r6)
            java.lang.String r6 = r5.name
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
        L_0x0153:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " matching <font color='#f3cf83'>"
            r7.append(r6)
            java.lang.String r6 = r5.matching
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = r5.reason
            if (r7 == 0) goto L_0x019b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " because <font color='#f3cf83'>"
            r7.append(r6)
            java.lang.String r5 = r5.reason
            r7.append(r5)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            goto L_0x019b
        L_0x018a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " (excluded)"
            r5.append(r6)
            java.lang.String r6 = r5.toString()
        L_0x019b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.internal.DisplayLeakAdapter.elementToHtmlString(com.squareup.leakcanary.LeakTraceElement, boolean, boolean):java.lang.String");
    }

    private static <T extends View> T findById(View view, int i) {
        return view.findViewById(i);
    }

    public int getCount() {
        return this.elements.size() + 1;
    }

    public LeakTraceElement getItem(int i) {
        if (getItemViewType(i) == 0) {
            return null;
        }
        return this.elements.get(i - 1);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        boolean z = false;
        if (getItemViewType(i) == 0) {
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C3940R.layout.leak_canary_ref_top_row, viewGroup, false);
            }
            ((TextView) findById(view, C3940R.C3942id.__leak_canary_row_text)).setText(context.getPackageName());
        } else {
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C3940R.layout.leak_canary_ref_row, viewGroup, false);
            }
            TextView textView = (TextView) findById(view, C3940R.C3942id.__leak_canary_row_text);
            boolean z2 = i == 1;
            if (i == getCount() - 1) {
                z = true;
            }
            String elementToHtmlString = elementToHtmlString(getItem(i), z2, this.opened[i]);
            if (z && !this.referenceName.equals("") && this.opened[i]) {
                elementToHtmlString = elementToHtmlString + " <font color='#919191'>" + this.referenceName + "</font>";
            }
            textView.setText(Html.fromHtml(elementToHtmlString));
            ((DisplayLeakConnectorView) findById(view, C3940R.C3942id.__leak_canary_row_connector)).setType(z2 ? DisplayLeakConnectorView.Type.START : z ? DisplayLeakConnectorView.Type.END : DisplayLeakConnectorView.Type.NODE);
            ((MoreDetailsView) findById(view, C3940R.C3942id.__leak_canary_row_more)).setOpened(this.opened[i]);
        }
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public void toggleRow(int i) {
        boolean[] zArr = this.opened;
        zArr[i] = !zArr[i];
        notifyDataSetChanged();
    }

    public void update(LeakTrace leakTrace, String str, String str2) {
        if (!str.equals(this.referenceKey)) {
            this.referenceKey = str;
            this.referenceName = str2;
            ArrayList arrayList = new ArrayList(leakTrace.elements);
            this.elements = arrayList;
            this.opened = new boolean[(arrayList.size() + 1)];
            notifyDataSetChanged();
        }
    }
}
