package com.google.p107ar.sceneform.utilities;

/* renamed from: com.google.ar.sceneform.utilities.ChangeId */
public class ChangeId {
    public static final int EMPTY_ID = 0;

    /* renamed from: id */
    private int f5379id = 0;

    public boolean checkChanged(int i) {
        return this.f5379id != i && !isEmpty();
    }

    public int get() {
        return this.f5379id;
    }

    public boolean isEmpty() {
        return this.f5379id == 0;
    }

    public void update() {
        int i = this.f5379id + 1;
        this.f5379id = i;
        if (i == 0) {
            this.f5379id = i + 1;
        }
    }
}
