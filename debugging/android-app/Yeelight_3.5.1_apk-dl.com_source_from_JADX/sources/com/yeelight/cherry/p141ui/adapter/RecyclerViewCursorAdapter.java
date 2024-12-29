package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: com.yeelight.cherry.ui.adapter.RecyclerViewCursorAdapter */
public abstract class RecyclerViewCursorAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    private Cursor f11872a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f11873b;

    /* renamed from: c */
    private int f11874c;

    /* renamed from: d */
    private DataSetObserver f11875d;

    /* renamed from: com.yeelight.cherry.ui.adapter.RecyclerViewCursorAdapter$b */
    private class C5902b extends DataSetObserver {
        private C5902b() {
        }

        public void onChanged() {
            super.onChanged();
            boolean unused = RecyclerViewCursorAdapter.this.f11873b = true;
            RecyclerViewCursorAdapter.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            boolean unused = RecyclerViewCursorAdapter.this.f11873b = false;
            RecyclerViewCursorAdapter.this.notifyDataSetChanged();
        }
    }

    public RecyclerViewCursorAdapter(Context context, Cursor cursor) {
        this(context, cursor, "_id");
    }

    public RecyclerViewCursorAdapter(Context context, Cursor cursor, String str) {
        this.f11872a = cursor;
        boolean z = cursor != null;
        this.f11873b = z;
        this.f11874c = z ? cursor.getColumnIndex(str) : -1;
        C5902b bVar = new C5902b();
        this.f11875d = bVar;
        Cursor cursor2 = this.f11872a;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(bVar);
        }
    }

    /* renamed from: b */
    public void mo31092b(Cursor cursor) {
        Cursor d = mo31176d(cursor);
        if (d != null) {
            d.close();
        }
    }

    /* renamed from: c */
    public abstract void mo31093c(VH vh, Cursor cursor);

    /* renamed from: d */
    public Cursor mo31176d(Cursor cursor) {
        boolean z;
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.f11872a;
        if (cursor == cursor2) {
            return null;
        }
        if (!(cursor2 == null || (dataSetObserver = this.f11875d) == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f11872a = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver2 = this.f11875d;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f11874c = cursor.getColumnIndexOrThrow("_id");
            z = true;
        } else {
            this.f11874c = -1;
            z = false;
        }
        this.f11873b = z;
        notifyDataSetChanged();
        return cursor2;
    }

    public int getItemCount() {
        Cursor cursor;
        if (!this.f11873b || (cursor = this.f11872a) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f11873b || (cursor = this.f11872a) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f11872a.getLong(this.f11874c);
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!this.f11873b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f11872a.moveToPosition(i)) {
            mo31093c(vh, this.f11872a);
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(true);
    }
}
