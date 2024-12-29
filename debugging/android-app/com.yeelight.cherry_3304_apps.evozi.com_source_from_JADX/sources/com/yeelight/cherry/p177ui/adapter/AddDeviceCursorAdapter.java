package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.deviceViewHolder.AddNewDeviceVH;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.view.DeviceConnectStateView;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter */
public class AddDeviceCursorAdapter extends RecyclerViewCursorAdapter<AddNewDeviceVH> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f12104e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5803b f12105f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f12106g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12107h = 1;

    /* renamed from: i */
    private boolean f12108i = false;

    /* renamed from: j */
    private HashMap<String, Integer> f12109j = null;

    /* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter$a */
    class C5802a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4198d f12110a;

        /* renamed from: b */
        final /* synthetic */ AddNewDeviceVH f12111b;

        C5802a(C4198d dVar, AddNewDeviceVH addNewDeviceVH) {
            this.f12110a = dVar;
            this.f12111b = addNewDeviceVH;
        }

        public void onClick(View view) {
            if (AddDeviceCursorAdapter.this.f12104e.contains(this.f12110a.mo23372G())) {
                this.f12111b.f12363a.setChecked(false);
                AddDeviceCursorAdapter.this.f12104e.remove(this.f12110a.mo23372G());
                int unused = AddDeviceCursorAdapter.this.f12106g = -1;
            } else {
                this.f12111b.f12363a.setChecked(true);
                if (!AddDeviceCursorAdapter.this.f12104e.isEmpty() && AddDeviceCursorAdapter.this.f12107h == 1) {
                    AddDeviceCursorAdapter.this.f12104e.clear();
                }
                AddDeviceCursorAdapter.this.notifyDataSetChanged();
                int unused2 = AddDeviceCursorAdapter.this.f12106g = this.f12111b.getAdapterPosition();
                AddDeviceCursorAdapter.this.f12104e.add(this.f12110a.mo23372G());
            }
            if (AddDeviceCursorAdapter.this.f12105f != null) {
                AddDeviceCursorAdapter.this.f12105f.mo26114a(AddDeviceCursorAdapter.this.f12104e);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter$b */
    public interface C5803b {
        /* renamed from: a */
        void mo26114a(List<String> list);
    }

    public AddDeviceCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: b */
    public void mo27123b(Cursor cursor) {
        super.mo27123b(cursor);
        if (cursor.getCount() == 0) {
            this.f12104e.clear();
        }
    }

    public int getItemViewType(int i) {
        return this.f12107h;
    }

    /* renamed from: i */
    public void mo27124c(AddNewDeviceVH addNewDeviceVH, Cursor cursor) {
        int intValue;
        DeviceConnectStateView deviceConnectStateView;
        String string = cursor.getString(cursor.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
        C4198d h0 = C4257w.m11945h0(string);
        if (addNewDeviceVH.getItemViewType() == 4) {
            addNewDeviceVH.f12364b.setText(string);
            HashMap<String, Integer> hashMap = this.f12109j;
            if (hashMap != null && hashMap.containsKey(string)) {
                deviceConnectStateView = addNewDeviceVH.f12363a;
                intValue = this.f12109j.get(string).intValue();
            }
            ViewGroup.LayoutParams layoutParams = addNewDeviceVH.f12363a.getLayoutParams();
            int b = C10547m.m25752b(addNewDeviceVH.f12363a.getContext(), 20.0f);
            layoutParams.width = b;
            layoutParams.height = b;
            addNewDeviceVH.f12363a.setLayoutParams(layoutParams);
        } else if (addNewDeviceVH.getItemViewType() != 2) {
            if (h0 != null) {
                String U = this.f12108i ? h0.mo23397U() : h0.mo23391R();
                addNewDeviceVH.f12363a.setState(4);
                if (this.f12104e.contains(h0.mo23372G())) {
                    addNewDeviceVH.f12363a.setChecked(true);
                } else {
                    addNewDeviceVH.f12363a.setChecked(false);
                }
                addNewDeviceVH.f12363a.setClickable(false);
                addNewDeviceVH.f12364b.setText(U);
                addNewDeviceVH.itemView.setOnClickListener(new C5802a(h0, addNewDeviceVH));
                return;
            }
            return;
        } else if (h0 != null) {
            String U2 = this.f12108i ? h0.mo23397U() : h0.mo23391R();
            addNewDeviceVH.f12363a.setClickable(false);
            addNewDeviceVH.f12364b.setText(U2);
            if (h0 instanceof C6047m) {
                C6047m mVar = (C6047m) h0;
                HashMap<String, Integer> hashMap2 = this.f12109j;
                if (hashMap2 == null || !hashMap2.containsKey(mVar.mo23372G())) {
                    if (mVar.mo27806W1()) {
                        addNewDeviceVH.f12363a.setState(2);
                    } else if (h0.mo23403Y() == -1) {
                        addNewDeviceVH.f12363a.setState(0);
                    } else if (h0.mo23299A() == 0) {
                        addNewDeviceVH.f12363a.setState(3);
                    } else {
                        addNewDeviceVH.f12363a.setState(1);
                    }
                    ViewGroup.LayoutParams layoutParams2 = addNewDeviceVH.f12363a.getLayoutParams();
                    int b2 = C10547m.m25752b(addNewDeviceVH.f12363a.getContext(), 20.0f);
                    layoutParams2.width = b2;
                    layoutParams2.height = b2;
                    addNewDeviceVH.f12363a.setLayoutParams(layoutParams2);
                }
                intValue = this.f12109j.get(mVar.mo23372G()).intValue();
                deviceConnectStateView = addNewDeviceVH.f12363a;
            } else {
                return;
            }
        } else {
            return;
        }
        deviceConnectStateView.setState(intValue);
        ViewGroup.LayoutParams layoutParams22 = addNewDeviceVH.f12363a.getLayoutParams();
        int b22 = C10547m.m25752b(addNewDeviceVH.f12363a.getContext(), 20.0f);
        layoutParams22.width = b22;
        layoutParams22.height = b22;
        addNewDeviceVH.f12363a.setLayoutParams(layoutParams22);
    }

    /* renamed from: j */
    public AddNewDeviceVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AddNewDeviceVH(LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.list_item_device_new, viewGroup, false));
    }

    /* renamed from: k */
    public void mo27127k(C5803b bVar) {
        this.f12105f = bVar;
    }

    /* renamed from: l */
    public void mo27128l(HashMap<String, Integer> hashMap) {
        this.f12109j = hashMap;
    }

    /* renamed from: m */
    public void mo27129m(boolean z) {
        this.f12108i = z;
    }

    /* renamed from: n */
    public void mo27130n(int i) {
        this.f12107h = i;
    }
}
