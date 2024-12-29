package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.deviceViewHolder.AddNewDeviceVH;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.DeviceConnectStateView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter */
public class AddDeviceCursorAdapter extends RecyclerViewCursorAdapter<AddNewDeviceVH> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<String> f11704e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5866b f11705f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f11706g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f11707h = 1;

    /* renamed from: i */
    private boolean f11708i = false;

    /* renamed from: j */
    private HashMap<String, Integer> f11709j = null;

    /* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter$a */
    class C5865a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3010c f11710a;

        /* renamed from: b */
        final /* synthetic */ AddNewDeviceVH f11711b;

        C5865a(C3010c cVar, AddNewDeviceVH addNewDeviceVH) {
            this.f11710a = cVar;
            this.f11711b = addNewDeviceVH;
        }

        public void onClick(View view) {
            if (AddDeviceCursorAdapter.this.f11704e.contains(this.f11710a.mo23185G())) {
                this.f11711b.f11957a.setChecked(false);
                AddDeviceCursorAdapter.this.f11704e.remove(this.f11710a.mo23185G());
                int unused = AddDeviceCursorAdapter.this.f11706g = -1;
            } else {
                this.f11711b.f11957a.setChecked(true);
                if (!AddDeviceCursorAdapter.this.f11704e.isEmpty() && AddDeviceCursorAdapter.this.f11707h == 1) {
                    AddDeviceCursorAdapter.this.f11704e.clear();
                }
                AddDeviceCursorAdapter.this.notifyDataSetChanged();
                int unused2 = AddDeviceCursorAdapter.this.f11706g = this.f11711b.getAdapterPosition();
                AddDeviceCursorAdapter.this.f11704e.add(this.f11710a.mo23185G());
            }
            if (AddDeviceCursorAdapter.this.f11705f != null) {
                AddDeviceCursorAdapter.this.f11705f.mo30170a(AddDeviceCursorAdapter.this.f11704e);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.AddDeviceCursorAdapter$b */
    public interface C5866b {
        /* renamed from: a */
        void mo30170a(List<String> list);
    }

    public AddDeviceCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor);
    }

    /* renamed from: b */
    public void mo31092b(Cursor cursor) {
        super.mo31092b(cursor);
        if (cursor.getCount() == 0) {
            this.f11704e.clear();
        }
    }

    public int getItemViewType(int i) {
        return this.f11707h;
    }

    /* renamed from: i */
    public void mo31093c(AddNewDeviceVH addNewDeviceVH, Cursor cursor) {
        int intValue;
        DeviceConnectStateView deviceConnectStateView;
        String string = cursor.getString(cursor.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
        C3010c j0 = YeelightDeviceManager.m7794j0(string);
        if (addNewDeviceVH.getItemViewType() == 4) {
            addNewDeviceVH.f11958b.setText(string);
            HashMap<String, Integer> hashMap = this.f11709j;
            if (hashMap != null && hashMap.containsKey(string)) {
                deviceConnectStateView = addNewDeviceVH.f11957a;
                intValue = this.f11709j.get(string).intValue();
            }
            ViewGroup.LayoutParams layoutParams = addNewDeviceVH.f11957a.getLayoutParams();
            int b = C9193k.m22151b(addNewDeviceVH.f11957a.getContext(), 20.0f);
            layoutParams.width = b;
            layoutParams.height = b;
            addNewDeviceVH.f11957a.setLayoutParams(layoutParams);
        } else if (addNewDeviceVH.getItemViewType() != 2) {
            if (j0 != null) {
                String U = this.f11708i ? j0.mo23210U() : j0.mo23204R();
                addNewDeviceVH.f11957a.setState(4);
                if (this.f11704e.contains(j0.mo23185G())) {
                    addNewDeviceVH.f11957a.setChecked(true);
                } else {
                    addNewDeviceVH.f11957a.setChecked(false);
                }
                addNewDeviceVH.f11957a.setClickable(false);
                addNewDeviceVH.f11958b.setText(U);
                addNewDeviceVH.itemView.setOnClickListener(new C5865a(j0, addNewDeviceVH));
                return;
            }
            return;
        } else if (j0 != null) {
            String U2 = this.f11708i ? j0.mo23210U() : j0.mo23204R();
            addNewDeviceVH.f11957a.setClickable(false);
            addNewDeviceVH.f11958b.setText(U2);
            if (j0 instanceof PrivateMeshDeviceBase) {
                PrivateMeshDeviceBase privateMeshDeviceBase = (PrivateMeshDeviceBase) j0;
                HashMap<String, Integer> hashMap2 = this.f11709j;
                if (hashMap2 == null || !hashMap2.containsKey(privateMeshDeviceBase.mo23185G())) {
                    if (privateMeshDeviceBase.mo31636W1()) {
                        addNewDeviceVH.f11957a.setState(2);
                    } else if (j0.mo23216Y() == -1) {
                        addNewDeviceVH.f11957a.setState(0);
                    } else if (j0.mo23113A() == 0) {
                        addNewDeviceVH.f11957a.setState(3);
                    } else {
                        addNewDeviceVH.f11957a.setState(1);
                    }
                    ViewGroup.LayoutParams layoutParams2 = addNewDeviceVH.f11957a.getLayoutParams();
                    int b2 = C9193k.m22151b(addNewDeviceVH.f11957a.getContext(), 20.0f);
                    layoutParams2.width = b2;
                    layoutParams2.height = b2;
                    addNewDeviceVH.f11957a.setLayoutParams(layoutParams2);
                }
                intValue = this.f11709j.get(privateMeshDeviceBase.mo23185G()).intValue();
                deviceConnectStateView = addNewDeviceVH.f11957a;
            } else {
                return;
            }
        } else {
            return;
        }
        deviceConnectStateView.setState(intValue);
        ViewGroup.LayoutParams layoutParams22 = addNewDeviceVH.f11957a.getLayoutParams();
        int b22 = C9193k.m22151b(addNewDeviceVH.f11957a.getContext(), 20.0f);
        layoutParams22.width = b22;
        layoutParams22.height = b22;
        addNewDeviceVH.f11957a.setLayoutParams(layoutParams22);
    }

    /* renamed from: j */
    public AddNewDeviceVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AddNewDeviceVH(LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.list_item_device_new, viewGroup, false));
    }

    /* renamed from: k */
    public void mo31096k(C5866b bVar) {
        this.f11705f = bVar;
    }

    /* renamed from: l */
    public void mo31097l(HashMap<String, Integer> hashMap) {
        this.f11709j = hashMap;
    }

    /* renamed from: m */
    public void mo31098m(boolean z) {
        this.f11708i = z;
    }

    /* renamed from: n */
    public void mo31099n(int i) {
        this.f11707h = i;
    }
}
