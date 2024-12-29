package com.yeelight.cherry.p177ui.deviceViewHolder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.DeviceConnectStateView;

/* renamed from: com.yeelight.cherry.ui.deviceViewHolder.AddNewDeviceVH */
public class AddNewDeviceVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public DeviceConnectStateView f12363a;

    /* renamed from: b */
    public TextView f12364b;

    public AddNewDeviceVH(View view) {
        super(view);
        this.f12363a = (DeviceConnectStateView) view.findViewById(C11745R$id.state_view);
        this.f12364b = (TextView) view.findViewById(C11745R$id.name);
    }
}
