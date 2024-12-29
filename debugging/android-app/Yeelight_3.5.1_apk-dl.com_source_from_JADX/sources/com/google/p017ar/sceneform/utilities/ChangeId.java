package com.google.p017ar.sceneform.utilities;

/* renamed from: com.google.ar.sceneform.utilities.ChangeId */
public class ChangeId {
    public static final int EMPTY_ID = 0;

    /* renamed from: id */
    private int f3454id = 0;

    public boolean checkChanged(int i) {
        return this.f3454id != i && !isEmpty();
    }

    public int get() {
        return this.f3454id;
    }

    public boolean isEmpty() {
        return this.f3454id == 0;
    }

    public void update() {
        int i = this.f3454id + 1;
        this.f3454id = i;
        if (i == 0) {
            this.f3454id = i + 1;
        }
    }
}
