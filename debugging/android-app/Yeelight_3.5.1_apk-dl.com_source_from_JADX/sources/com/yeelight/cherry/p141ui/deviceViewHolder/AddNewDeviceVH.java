package com.yeelight.cherry.p141ui.deviceViewHolder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.DeviceConnectStateView;

/* renamed from: com.yeelight.cherry.ui.deviceViewHolder.AddNewDeviceVH */
public class AddNewDeviceVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public DeviceConnectStateView f11957a;

    /* renamed from: b */
    public TextView f11958b;

    public AddNewDeviceVH(View view) {
        super(view);
        this.f11957a = (DeviceConnectStateView) view.findViewById(C12225R$id.state_view);
        this.f11958b = (TextView) view.findViewById(C12225R$id.name);
    }
}
