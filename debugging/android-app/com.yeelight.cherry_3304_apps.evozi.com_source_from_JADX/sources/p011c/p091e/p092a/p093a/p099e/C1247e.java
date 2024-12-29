package p011c.p091e.p092a.p093a.p099e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.miot.service.manager.timer.TimerCodec;
import java.net.URLEncoder;
import p011c.p091e.p092a.p093a.p094a.C1223a;
import p011c.p091e.p092a.p093a.p094a.p095b.C1225a;
import p011c.p091e.p092a.p093a.p096b.C1228a;
import p011c.p091e.p092a.p093a.p097c.C1230b;
import p011c.p091e.p092a.p093a.p097c.C1231c;
import p011c.p091e.p092a.p093a.p097c.C1232d;
import p011c.p091e.p092a.p093a.p097c.C1233e;
import p011c.p091e.p092a.p093a.p097c.C1234f;
import p011c.p091e.p092a.p093a.p098d.C1235a;
import p011c.p091e.p092a.p093a.p098d.C1240d;
import p011c.p091e.p092a.p093a.p098d.C1241e;
import p011c.p091e.p092a.p093a.p100f.C1249b;
import p011c.p091e.p092a.p093a.p100f.C1254g;

/* renamed from: c.e.a.a.e.e */
final class C1247e implements C1242a {

    /* renamed from: e */
    private static String f2207e;

    /* renamed from: a */
    private Context f2208a;

    /* renamed from: b */
    private String f2209b;

    /* renamed from: c */
    private boolean f2210c = false;

    /* renamed from: d */
    private boolean f2211d = false;

    C1247e(Context context, String str, boolean z) {
        C1249b.m3234a("MicroMsg.SDK.WXApiImplV10", "<init>, appId = " + str + ", checkSignature = " + z);
        this.f2208a = context;
        this.f2209b = str;
        this.f2210c = z;
    }

    /* renamed from: d */
    private boolean m3209d(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: f */
    private boolean m3210f(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: h */
    private boolean m3211h(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: i */
    private boolean m3212i(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), (String[]) null, (String) null, new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: j */
    private boolean m3213j(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_scan_qrcode_result")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: k */
    private boolean m3214k(Context context, C1228a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f2209b, "2", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C1231c) aVar).f2173c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: l */
    private boolean m3215l(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_scene"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), sb.toString(), sb2.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: m */
    private boolean m3216m(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_show_type"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: n */
    private boolean m3217n(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_scene"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: o */
    private boolean m3218o(Context context, C1228a aVar) {
        C1232d dVar = (C1232d) aVar;
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f2176e);
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f2209b, dVar.f2174c, dVar.f2175d, sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: p */
    private boolean m3219p(Context context, C1228a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f2209b, "3", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C1233e) aVar).f2177c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: q */
    private boolean m3220q(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: r */
    private boolean m3221r(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), (String[]) null, (String) null, new String[0], (String) null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: s */
    private boolean m3222s(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), (String[]) null, (String) null, new String[]{this.f2209b, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: t */
    private boolean m3223t(Context context, C1228a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f2209b, "4", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C1234f) aVar).f2178c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: u */
    private boolean m3224u(Context context, Bundle bundle) {
        if (f2207e == null) {
            f2207e = new C1243b(context).getString("_wxapp_pay_entry_classname_", (String) null);
            C1249b.m3234a("MicroMsg.SDK.WXApiImplV10", "pay, set wxappPayEntryClassname = " + f2207e);
            if (f2207e == null) {
                try {
                    f2207e = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", (String) null);
                } catch (Exception e) {
                    C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + e.getMessage());
                }
            }
            if (f2207e == null) {
                C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        C1223a.C1224a aVar = new C1223a.C1224a();
        aVar.f2159e = bundle;
        aVar.f2155a = "com.tencent.mm";
        aVar.f2156b = f2207e;
        return C1223a.m3165a(context, aVar);
    }

    /* renamed from: v */
    private boolean m3225v(Context context, C1228a aVar) {
        C1230b bVar = (C1230b) aVar;
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f2209b, TimerCodec.ENABLE, String.valueOf(bVar.f2170c), bVar.f2171d, bVar.f2172e}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo10055a() {
        if (!this.f2211d) {
            try {
                PackageInfo packageInfo = this.f2208a.getPackageManager().getPackageInfo("com.tencent.mm", 64);
                if (packageInfo == null) {
                    return false;
                }
                return C1246d.m3207a(this.f2208a, packageInfo.signatures, this.f2210c);
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
    }

    /* renamed from: b */
    public final boolean mo10056b(String str) {
        return mo10080g(str, 0);
    }

    /* renamed from: c */
    public final boolean mo10057c(C1228a aVar) {
        StringBuilder sb;
        String str;
        String str2;
        if (!this.f2211d) {
            if (!C1246d.m3208b(this.f2208a, "com.tencent.mm", this.f2210c)) {
                str2 = "sendReq failed for wechat app signature check failed";
            } else if (!aVar.mo10046a()) {
                str2 = "sendReq checkArgs fail";
            } else {
                C1249b.m3236c("MicroMsg.SDK.WXApiImplV10", "sendReq, req type = " + aVar.mo10048c());
                Bundle bundle = new Bundle();
                aVar.mo10049d(bundle);
                if (aVar.mo10048c() == 5) {
                    return m3224u(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 7) {
                    return m3215l(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 8) {
                    return m3217n(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 10) {
                    return m3216m(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 9) {
                    return m3211h(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 16) {
                    return m3212i(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 11) {
                    return m3221r(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 12) {
                    return m3222s(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 13) {
                    return m3220q(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 14) {
                    return m3209d(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 15) {
                    return m3210f(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 17) {
                    return m3213j(this.f2208a, bundle);
                }
                if (aVar.mo10048c() == 18) {
                    return m3225v(this.f2208a, aVar);
                }
                if (aVar.mo10048c() == 19) {
                    return m3218o(this.f2208a, aVar);
                }
                if (aVar.mo10048c() == 20) {
                    return m3214k(this.f2208a, aVar);
                }
                if (aVar.mo10048c() == 21) {
                    return m3219p(this.f2208a, aVar);
                }
                if (aVar.mo10048c() == 22) {
                    return m3223t(this.f2208a, aVar);
                }
                if (aVar.mo10048c() == 2 && bundle.getInt("_wxapi_sendmessagetowx_req_media_type") == 36) {
                    C1235a aVar2 = (C1235a) aVar;
                    if (mo10079e() < 620756993) {
                        C1241e eVar = new C1241e();
                        eVar.f2196a = bundle.getString("_wxminiprogram_webpageurl");
                        aVar2.f2179c.f2187e = eVar;
                    } else {
                        C1240d dVar = (C1240d) aVar2.f2179c.f2187e;
                        dVar.f2192b += "@app";
                        String str3 = dVar.f2193c;
                        if (!C1254g.m3240a(str3)) {
                            String[] split = str3.split("\\?");
                            if (split.length > 1) {
                                sb = new StringBuilder();
                                sb.append(split[0]);
                                sb.append(".html?");
                                str = split[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(split[0]);
                                str = ".html";
                            }
                            sb.append(str);
                            dVar.f2193c = sb.toString();
                        }
                    }
                    aVar2.f2180d = 0;
                    aVar.mo10049d(bundle);
                }
                C1223a.C1224a aVar3 = new C1223a.C1224a();
                aVar3.f2159e = bundle;
                aVar3.f2157c = "weixin://sendreq?appid=" + this.f2209b;
                aVar3.f2155a = "com.tencent.mm";
                aVar3.f2156b = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                return C1223a.m3165a(this.f2208a, aVar3);
            }
            C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", str2);
            return false;
        }
        throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
    }

    /* renamed from: e */
    public final int mo10079e() {
        if (this.f2211d) {
            throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        } else if (!mo10055a()) {
            C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
            return 0;
        } else {
            int i = new C1243b(this.f2208a).getInt("_build_info_sdk_int_", 0);
            if (i != 0) {
                return i;
            }
            try {
                return this.f2208a.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
            } catch (Exception e) {
                C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + e.getMessage());
                return i;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo10080g(String str, long j) {
        if (this.f2211d) {
            throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        } else if (!C1246d.m3208b(this.f2208a, "com.tencent.mm", this.f2210c)) {
            C1249b.m3235b("MicroMsg.SDK.WXApiImplV10", "register app failed for wechat app signature check failed");
            return false;
        } else {
            C1249b.m3234a("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + str);
            if (str != null) {
                this.f2209b = str;
            }
            C1249b.m3234a("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + str);
            if (str != null) {
                this.f2209b = str;
            }
            C1249b.m3234a("MicroMsg.SDK.WXApiImplV10", "register app " + this.f2208a.getPackageName());
            C1225a.C1226a aVar = new C1225a.C1226a();
            aVar.f2160a = "com.tencent.mm";
            aVar.f2161b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
            aVar.f2162c = "weixin://registerapp?appid=" + this.f2209b;
            aVar.f2163d = j;
            return C1225a.m3166a(this.f2208a, aVar);
        }
    }
}
