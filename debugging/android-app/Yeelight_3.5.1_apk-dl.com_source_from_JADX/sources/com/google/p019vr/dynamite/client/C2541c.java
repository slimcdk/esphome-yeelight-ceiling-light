package com.google.p019vr.dynamite.client;

/* renamed from: com.google.vr.dynamite.client.c */
public final class C2541c extends Exception {

    /* renamed from: a */
    private final int f4287a = 1;

    public C2541c(int i) {
    }

    public final String getMessage() {
        int i = this.f4287a;
        String str = i != 1 ? i != 2 ? "Unknown error" : "Package obsolete" : "Package not available";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("LoaderException{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
