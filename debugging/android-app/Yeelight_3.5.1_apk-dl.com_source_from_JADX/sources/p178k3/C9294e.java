package p178k3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.miot.service.manager.timer.TimerCodec;
import java.net.URLEncoder;
import p154f3.C9029a;
import p159g3.C9049a;
import p164h3.C9091a;
import p169i3.C9101b;
import p169i3.C9102c;
import p169i3.C9103d;
import p169i3.C9104e;
import p169i3.C9105f;
import p174j3.C9178a;
import p174j3.C9181c;
import p181l3.C9523b;

/* renamed from: k3.e */
final class C9294e implements C9289a {

    /* renamed from: e */
    private static String f17212e;

    /* renamed from: a */
    private Context f17213a;

    /* renamed from: b */
    private String f17214b;

    /* renamed from: c */
    private boolean f17215c = false;

    /* renamed from: d */
    private boolean f17216d = false;

    C9294e(Context context, String str, boolean z) {
        C9523b.m23171a("MicroMsg.SDK.WXApiImplV10", "<init>, appId = " + str + ", checkSignature = " + z);
        this.f17213a = context;
        this.f17214b = str;
        this.f17215c = z;
    }

    /* renamed from: d */
    private boolean m22739d(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: f */
    private boolean m22740f(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: h */
    private boolean m22741h(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: i */
    private boolean m22742i(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), (String[]) null, (String) null, new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: j */
    private boolean m22743j(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_scan_qrcode_result")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: k */
    private boolean m22744k(Context context, C9091a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f17214b, "2", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C9102c) aVar).f16783c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: l */
    private boolean m22745l(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_scene"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), sb.toString(), sb2.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: m */
    private boolean m22746m(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_show_type"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: n */
    private boolean m22747n(Context context, Bundle bundle) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_scene"));
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: o */
    private boolean m22748o(Context context, C9091a aVar) {
        C9103d dVar = (C9103d) aVar;
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f16786e);
        Cursor query = contentResolver.query(parse, (String[]) null, (String) null, new String[]{this.f17214b, dVar.f16784c, dVar.f16785d, sb.toString()}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: p */
    private boolean m22749p(Context context, C9091a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f17214b, "3", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C9104e) aVar).f16787c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: q */
    private boolean m22750q(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: r */
    private boolean m22751r(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), (String[]) null, (String) null, new String[0], (String) null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: s */
    private boolean m22752s(Context context, Bundle bundle) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), (String[]) null, (String) null, new String[]{this.f17214b, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: t */
    private boolean m22753t(Context context, C9091a aVar) {
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f17214b, "4", URLEncoder.encode(String.format("url=%s", new Object[]{URLEncoder.encode(((C9105f) aVar).f16788c)}))}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: u */
    private boolean m22754u(Context context, Bundle bundle) {
        if (f17212e == null) {
            f17212e = new C9290b(context).getString("_wxapp_pay_entry_classname_", (String) null);
            C9523b.m23171a("MicroMsg.SDK.WXApiImplV10", "pay, set wxappPayEntryClassname = " + f17212e);
            if (f17212e == null) {
                try {
                    f17212e = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", (String) null);
                } catch (Exception e) {
                    C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + e.getMessage());
                }
            }
            if (f17212e == null) {
                C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        C9029a.C9030a aVar = new C9029a.C9030a();
        aVar.f16543e = bundle;
        aVar.f16539a = "com.tencent.mm";
        aVar.f16540b = f17212e;
        return C9029a.m21558a(context, aVar);
    }

    /* renamed from: v */
    private boolean m22755v(Context context, C9091a aVar) {
        C9101b bVar = (C9101b) aVar;
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), (String[]) null, (String) null, new String[]{this.f17214b, TimerCodec.ENABLE, String.valueOf(bVar.f16780c), bVar.f16781d, bVar.f16782e}, (String) null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo37800a(C9091a aVar) {
        String str;
        if (!this.f17216d) {
            if (!C9293d.m22738b(this.f17213a, "com.tencent.mm", this.f17215c)) {
                str = "sendReq failed for wechat app signature check failed";
            } else if (!aVar.mo37081a()) {
                str = "sendReq checkArgs fail";
            } else {
                C9523b.m23173c("MicroMsg.SDK.WXApiImplV10", "sendReq, req type = " + aVar.mo37083c());
                Bundle bundle = new Bundle();
                aVar.mo37084d(bundle);
                if (aVar.mo37083c() == 5) {
                    return m22754u(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 7) {
                    return m22745l(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 8) {
                    return m22747n(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 10) {
                    return m22746m(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 9) {
                    return m22741h(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 16) {
                    return m22742i(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 11) {
                    return m22751r(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 12) {
                    return m22752s(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 13) {
                    return m22750q(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 14) {
                    return m22739d(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 15) {
                    return m22740f(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 17) {
                    return m22743j(this.f17213a, bundle);
                }
                if (aVar.mo37083c() == 18) {
                    return m22755v(this.f17213a, aVar);
                }
                if (aVar.mo37083c() == 19) {
                    return m22748o(this.f17213a, aVar);
                }
                if (aVar.mo37083c() == 20) {
                    return m22744k(this.f17213a, aVar);
                }
                if (aVar.mo37083c() == 21) {
                    return m22749p(this.f17213a, aVar);
                }
                if (aVar.mo37083c() == 22) {
                    return m22753t(this.f17213a, aVar);
                }
                if (aVar.mo37083c() == 2 && bundle.getInt("_wxapi_sendmessagetowx_req_media_type") == 36) {
                    C9178a aVar2 = (C9178a) aVar;
                    if (mo37824e() < 620756993) {
                        new C9181c().f17003a = bundle.getString("_wxminiprogram_webpageurl");
                        throw null;
                    }
                    throw null;
                }
                C9029a.C9030a aVar3 = new C9029a.C9030a();
                aVar3.f16543e = bundle;
                aVar3.f16541c = "weixin://sendreq?appid=" + this.f17214b;
                aVar3.f16539a = "com.tencent.mm";
                aVar3.f16540b = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                return C9029a.m21558a(this.f17213a, aVar3);
            }
            C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", str);
            return false;
        }
        throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
    }

    /* renamed from: b */
    public final boolean mo37801b() {
        if (!this.f17216d) {
            try {
                PackageInfo packageInfo = this.f17213a.getPackageManager().getPackageInfo("com.tencent.mm", 64);
                if (packageInfo == null) {
                    return false;
                }
                return C9293d.m22737a(this.f17213a, packageInfo.signatures, this.f17215c);
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
    }

    /* renamed from: c */
    public final boolean mo37802c(String str) {
        return mo37825g(str, 0);
    }

    /* renamed from: e */
    public final int mo37824e() {
        if (this.f17216d) {
            throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        } else if (!mo37801b()) {
            C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
            return 0;
        } else {
            int i = new C9290b(this.f17213a).getInt("_build_info_sdk_int_", 0);
            if (i != 0) {
                return i;
            }
            try {
                return this.f17213a.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
            } catch (Exception e) {
                C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : " + e.getMessage());
                return i;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo37825g(String str, long j) {
        if (this.f17216d) {
            throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        } else if (!C9293d.m22738b(this.f17213a, "com.tencent.mm", this.f17215c)) {
            C9523b.m23172b("MicroMsg.SDK.WXApiImplV10", "register app failed for wechat app signature check failed");
            return false;
        } else {
            C9523b.m23171a("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + str);
            if (str != null) {
                this.f17214b = str;
            }
            C9523b.m23171a("MicroMsg.SDK.WXApiImplV10", "registerApp, appId = " + str);
            if (str != null) {
                this.f17214b = str;
            }
            C9523b.m23171a("MicroMsg.SDK.WXApiImplV10", "register app " + this.f17213a.getPackageName());
            C9049a.C9050a aVar = new C9049a.C9050a();
            aVar.f16615a = "com.tencent.mm";
            aVar.f16616b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
            aVar.f16617c = "weixin://registerapp?appid=" + this.f17214b;
            aVar.f16618d = j;
            return C9049a.m21680a(this.f17213a, aVar);
        }
    }
}
