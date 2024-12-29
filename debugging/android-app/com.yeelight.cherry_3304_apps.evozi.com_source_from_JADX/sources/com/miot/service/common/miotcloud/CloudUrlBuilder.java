package com.miot.service.common.miotcloud;

import com.miot.common.config.AppConfiguration;

public class CloudUrlBuilder {
    private boolean mIsPreview;
    private AppConfiguration.Locale mLocale;
    private Server mServer;

    /* renamed from: com.miot.service.common.miotcloud.CloudUrlBuilder$1 */
    static /* synthetic */ class C36281 {
        static final /* synthetic */ int[] $SwitchMap$com$miot$common$config$AppConfiguration$Locale;

        /* renamed from: $SwitchMap$com$miot$service$common$miotcloud$CloudUrlBuilder$Server */
        static final /* synthetic */ int[] f6704xfe535340;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.miot.common.config.AppConfiguration$Locale[] r0 = com.miot.common.config.AppConfiguration.Locale.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$miot$common$config$AppConfiguration$Locale = r0
                r1 = 1
                com.miot.common.config.AppConfiguration$Locale r2 = com.miot.common.config.AppConfiguration.Locale.cn     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$miot$common$config$AppConfiguration$Locale     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.config.AppConfiguration$Locale r3 = com.miot.common.config.AppConfiguration.Locale.sg     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = $SwitchMap$com$miot$common$config$AppConfiguration$Locale     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.config.AppConfiguration$Locale r3 = com.miot.common.config.AppConfiguration.Locale.us     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = $SwitchMap$com$miot$common$config$AppConfiguration$Locale     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.config.AppConfiguration$Locale r3 = com.miot.common.config.AppConfiguration.Locale.de     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = $SwitchMap$com$miot$common$config$AppConfiguration$Locale     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.config.AppConfiguration$Locale r3 = com.miot.common.config.AppConfiguration.Locale.ru     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = $SwitchMap$com$miot$common$config$AppConfiguration$Locale     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.common.config.AppConfiguration$Locale r3 = com.miot.common.config.AppConfiguration.Locale.i2     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.miot.service.common.miotcloud.CloudUrlBuilder$Server[] r2 = com.miot.service.common.miotcloud.CloudUrlBuilder.Server.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6704xfe535340 = r2
                com.miot.service.common.miotcloud.CloudUrlBuilder$Server r3 = com.miot.service.common.miotcloud.CloudUrlBuilder.Server.api     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f6704xfe535340     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.miot.service.common.miotcloud.CloudUrlBuilder$Server r2 = com.miot.service.common.miotcloud.CloudUrlBuilder.Server.openapp     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.miotcloud.CloudUrlBuilder.C36281.<clinit>():void");
        }
    }

    public enum Server {
        api,
        openapp
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String build() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int[] r1 = com.miot.service.common.miotcloud.CloudUrlBuilder.C36281.f6704xfe535340
            com.miot.service.common.miotcloud.CloudUrlBuilder$Server r2 = r5.mServer
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 2
            if (r1 == r2) goto L_0x0019
            if (r1 == r3) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.String r1 = "https"
            goto L_0x001b
        L_0x0019:
            java.lang.String r1 = "http"
        L_0x001b:
            r0.append(r1)
        L_0x001e:
            java.lang.String r1 = "://"
            r0.append(r1)
            boolean r1 = r5.mIsPreview
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = "pv."
            r0.append(r1)
        L_0x002c:
            int[] r1 = com.miot.service.common.miotcloud.CloudUrlBuilder.C36281.$SwitchMap$com$miot$common$config$AppConfiguration$Locale
            com.miot.common.config.AppConfiguration$Locale r4 = r5.mLocale
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x0051
            r4 = 3
            if (r1 == r4) goto L_0x004e
            r4 = 4
            if (r1 == r4) goto L_0x004b
            r4 = 5
            if (r1 == r4) goto L_0x0048
            r4 = 6
            if (r1 == r4) goto L_0x0045
            goto L_0x0056
        L_0x0045:
            java.lang.String r1 = "i2."
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "ru."
            goto L_0x0053
        L_0x004b:
            java.lang.String r1 = "de."
            goto L_0x0053
        L_0x004e:
            java.lang.String r1 = "us."
            goto L_0x0053
        L_0x0051:
            java.lang.String r1 = "sg."
        L_0x0053:
            r0.append(r1)
        L_0x0056:
            int[] r1 = com.miot.service.common.miotcloud.CloudUrlBuilder.C36281.f6704xfe535340
            com.miot.service.common.miotcloud.CloudUrlBuilder$Server r4 = r5.mServer
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r2) goto L_0x0068
            if (r1 == r3) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.String r1 = "openapp.io.mi.com/openapp"
            goto L_0x006a
        L_0x0068:
            java.lang.String r1 = "api.io.mi.com/app"
        L_0x006a:
            r0.append(r1)
        L_0x006d:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.common.miotcloud.CloudUrlBuilder.build():java.lang.String");
    }

    public CloudUrlBuilder setLocale(AppConfiguration.Locale locale) {
        this.mLocale = locale;
        return this;
    }

    public CloudUrlBuilder setPreview(boolean z) {
        this.mIsPreview = z;
        return this;
    }

    public CloudUrlBuilder setServer(Server server) {
        this.mServer = server;
        return this;
    }
}
