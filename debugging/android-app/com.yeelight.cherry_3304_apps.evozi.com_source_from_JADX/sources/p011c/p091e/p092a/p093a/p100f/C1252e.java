package p011c.p091e.p092a.p093a.p100f;

/* renamed from: c.e.a.a.f.e */
public final class C1252e {
    /* renamed from: a */
    public static Object m3239a(int i, String str) {
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
                    C1249b.m3235b("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e.getMessage());
                    return null;
                }
            default:
                C1249b.m3235b("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                return null;
        }
    }
}
