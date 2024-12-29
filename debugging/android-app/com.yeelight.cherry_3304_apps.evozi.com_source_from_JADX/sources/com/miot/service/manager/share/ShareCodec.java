package com.miot.service.manager.share;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.device.Device;
import com.miot.common.people.Account;
import com.miot.common.share.ShareStatus;
import com.miot.common.share.SharedRequest;
import com.miot.common.share.SharedRequestBean;
import com.miot.common.share.SharedUser;
import com.miot.common.share.SharedUserBean;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import org.json.JSONObject;

public class ShareCodec {
    public static SharedUser decodeShareUser(JSONObject jSONObject) {
        String userId;
        SharedUserBean create = SharedUserBean.create(jSONObject);
        if (create == null || (userId = create.getUserId()) == null) {
            return null;
        }
        Account account = new Account(userId);
        account.setUserName(create.getUserName());
        account.setIcon(create.getIcon());
        SharedUser sharedUser = new SharedUser();
        sharedUser.setAccount(account);
        sharedUser.setShareTime((long) create.getShareTime());
        if (create.getShareStatus() < 2) {
            sharedUser.setStatus(ShareStatus.values()[create.getShareStatus()]);
        }
        return sharedUser;
    }

    public static SharedRequest decodeSharedRequest(Context context, JSONObject jSONObject) {
        int invitedId;
        Device createFrom;
        SharedRequestBean create = SharedRequestBean.create(jSONObject);
        if (!(create == null || (invitedId = create.getInvitedId()) == 0)) {
            String messageId = create.getMessageId();
            if (!TextUtils.isEmpty(messageId) && (createFrom = DeviceFactory.createFrom(context, create)) != null) {
                SharedRequest sharedRequest = new SharedRequest(invitedId, messageId, create.getOwnerId(), create.getOwnerName());
                sharedRequest.setShareTime(create.getShareTime());
                sharedRequest.setExpireTime(create.getExpireTime());
                if (create.getShareStatus() < 2) {
                    sharedRequest.setShareStatus(ShareStatus.values()[create.getShareStatus()]);
                }
                sharedRequest.setSharedDevice(createFrom);
                return sharedRequest;
            }
        }
        return null;
    }
}
