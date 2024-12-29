package com.yeelight.cherry.p141ui.deviceViewHolder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.DeviceConnectStateView;

/* renamed from: com.yeelight.cherry.ui.deviceViewHolder.NetworkViewHolder */
public class NetworkViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public DeviceConnectStateView f11959a;

    /* renamed from: b */
    public TextView f11960b;

    public NetworkViewHolder(View view) {
        super(view);
        DeviceConnectStateView deviceConnectStateView = (DeviceConnectStateView) view.findViewById(C12225R$id.state_view);
        this.f11959a = deviceConnectStateView;
        deviceConnectStateView.setState(4);
        this.f11960b = (TextView) view.findViewById(C12225R$id.name);
    }
}
