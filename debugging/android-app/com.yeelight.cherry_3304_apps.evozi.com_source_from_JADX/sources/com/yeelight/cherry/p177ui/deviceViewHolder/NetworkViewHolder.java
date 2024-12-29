package com.yeelight.cherry.p177ui.deviceViewHolder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.DeviceConnectStateView;

/* renamed from: com.yeelight.cherry.ui.deviceViewHolder.NetworkViewHolder */
public class NetworkViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public DeviceConnectStateView f12365a;

    /* renamed from: b */
    public TextView f12366b;

    public NetworkViewHolder(View view) {
        super(view);
        DeviceConnectStateView deviceConnectStateView = (DeviceConnectStateView) view.findViewById(C11745R$id.state_view);
        this.f12365a = deviceConnectStateView;
        deviceConnectStateView.setState(4);
        this.f12366b = (TextView) view.findViewById(C11745R$id.name);
    }
}
