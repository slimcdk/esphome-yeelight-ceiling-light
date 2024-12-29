package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: com.yeelight.cherry.ui.adapter.RecyclerViewCursorAdapter */
public abstract class RecyclerViewCursorAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    private Cursor f12272a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f12273b;

    /* renamed from: c */
    private int f12274c;

    /* renamed from: d */
    private DataSetObserver f12275d;

    /* renamed from: com.yeelight.cherry.ui.adapter.RecyclerViewCursorAdapter$b */
    private class C5839b extends DataSetObserver {
        private C5839b() {
        }

        public void onChanged() {
            super.onChanged();
            boolean unused = RecyclerViewCursorAdapter.this.f12273b = true;
            RecyclerViewCursorAdapter.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            boolean unused = RecyclerViewCursorAdapter.this.f12273b = false;
            RecyclerViewCursorAdapter.this.notifyDataSetChanged();
        }
    }

    public RecyclerViewCursorAdapter(Context context, Cursor cursor) {
        this(context, cursor, "_id");
    }

    public RecyclerViewCursorAdapter(Context context, Cursor cursor, String str) {
        this.f12272a = cursor;
        boolean z = cursor != null;
        this.f12273b = z;
        this.f12274c = z ? this.f12272a.getColumnIndex(str) : -1;
        C5839b bVar = new C5839b();
        this.f12275d = bVar;
        Cursor cursor2 = this.f12272a;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(bVar);
        }
    }

    /* renamed from: b */
    public void mo27123b(Cursor cursor) {
        Cursor d = mo27210d(cursor);
        if (d != null) {
            d.close();
        }
    }

    /* renamed from: c */
    public abstract void mo27124c(VH vh, Cursor cursor);

    /* renamed from: d */
    public Cursor mo27210d(Cursor cursor) {
        boolean z;
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.f12272a;
        if (cursor == cursor2) {
            return null;
        }
        if (!(cursor2 == null || (dataSetObserver = this.f12275d) == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f12272a = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver2 = this.f12275d;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f12274c = cursor.getColumnIndexOrThrow("_id");
            z = true;
        } else {
            this.f12274c = -1;
            z = false;
        }
        this.f12273b = z;
        notifyDataSetChanged();
        return cursor2;
    }

    public int getItemCount() {
        Cursor cursor;
        if (!this.f12273b || (cursor = this.f12272a) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f12273b || (cursor = this.f12272a) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f12272a.getLong(this.f12274c);
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!this.f12273b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f12272a.moveToPosition(i)) {
            mo27124c(vh, this.f12272a);
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(true);
    }
}
