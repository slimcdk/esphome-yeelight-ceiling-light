package com.miot.service.people;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.miot.api.IPeopleManager;
import com.miot.common.people.People;
import com.miot.service.common.constant.BroadcastConstants;
import com.miot.service.common.manager.ServiceManager;
import com.miot.service.people.RegisterPeopleTask;
import java.util.concurrent.ThreadPoolExecutor;

public class PeopleManagerImpl extends IPeopleManager.Stub {
    private static final String TAG = "PeopleManagerImpl";
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public ThreadPoolExecutor mExecutor;
    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals(BroadcastConstants.ACTION_REGISTER_PUSH_SUCCEED)) {
                PeopleManagerImpl.this.mExecutor.execute(new RegisterPeopleTask(PeopleManagerImpl.this.mContext, PeopleManagerImpl.this.getPeople(), RegisterPeopleTask.Type.register));
            }
        }
    };

    public PeopleManagerImpl(Context context, ThreadPoolExecutor threadPoolExecutor) {
        this.mContext = context;
        this.mExecutor = threadPoolExecutor;
    }

    public int deletePeople() {
        ServiceManager.getInstance().deletePeople();
        return 0;
    }

    public People getPeople() {
        return ServiceManager.getInstance().getPeople();
    }

    public void registerPeople() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BroadcastConstants.ACTION_REGISTER_PUSH_SUCCEED);
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mReceiver, intentFilter);
    }

    public int savePeople(People people) {
        ServiceManager.getInstance().savePeople(people);
        return 0;
    }

    public void unregisterPeople() {
        LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mReceiver);
    }
}
