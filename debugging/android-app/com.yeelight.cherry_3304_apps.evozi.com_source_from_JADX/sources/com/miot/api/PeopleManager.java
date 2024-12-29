package com.miot.api;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;

public class PeopleManager {
    private static final String TAG = "PeopleManager";
    private IPeopleManager mIPeopleManager;

    public PeopleManager(IPeopleManager iPeopleManager) {
        this.mIPeopleManager = iPeopleManager;
    }

    public void deletePeople() {
        IPeopleManager iPeopleManager = this.mIPeopleManager;
        if (iPeopleManager != null) {
            try {
                iPeopleManager.deletePeople();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public People getPeople() {
        IPeopleManager iPeopleManager = this.mIPeopleManager;
        if (iPeopleManager == null) {
            return null;
        }
        try {
            return iPeopleManager.getPeople();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isLogin() {
        return getPeople() != null;
    }

    public void savePeople(@NonNull People people) {
        IPeopleManager iPeopleManager = this.mIPeopleManager;
        if (iPeopleManager != null) {
            try {
                iPeopleManager.savePeople(people);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public void setIPeopleManager(IPeopleManager iPeopleManager) {
        this.mIPeopleManager = iPeopleManager;
    }
}
