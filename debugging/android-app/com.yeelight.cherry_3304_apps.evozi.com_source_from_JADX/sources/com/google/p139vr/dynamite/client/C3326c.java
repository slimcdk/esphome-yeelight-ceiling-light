package com.google.p139vr.dynamite.client;

/* renamed from: com.google.vr.dynamite.client.c */
public final class C3326c extends Exception {

    /* renamed from: a */
    private final int f6428a = 1;

    public C3326c(int i) {
    }

    public final String getMessage() {
        int i = this.f6428a;
        String str = i != 1 ? i != 2 ? "Unknown error" : "Package obsolete" : "Package not available";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("LoaderException{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
