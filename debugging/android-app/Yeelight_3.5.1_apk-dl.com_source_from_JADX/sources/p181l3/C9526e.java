package p181l3;

/* renamed from: l3.e */
public final class C9526e {
    /* renamed from: a */
    public static Object m23176a(int i, String str) {
        switch (i) {
            case 1:
                return Integer.valueOf(str);
            case 2:
                return Long.valueOf(str);
            case 3:
                return str;
            case 4:
                return Boolean.valueOf(str);
            case 5:
                return Float.valueOf(str);
            case 6:
                try {
                    return Double.valueOf(str);
                } catch (Exception e) {
                    C9523b.m23172b("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
                    return null;
                }
            default:
                C9523b.m23172b("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                return null;
        }
    }
}
