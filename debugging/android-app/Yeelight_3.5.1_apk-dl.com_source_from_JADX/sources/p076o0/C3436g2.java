package p076o0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p028e0.C3144c;

/* renamed from: o0.g2 */
public final class C3436g2 {

    /* renamed from: b */
    private static C3436g2 f5570b;
    @VisibleForTesting

    /* renamed from: c */
    static final byte[] f5571c = m9462d("0\u0005a0\u0003K\u0002\u0006\u0001DÓ0\u000b\u0006\t*H÷\r\u0001\u0001\u00050v1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00120\u0010\u0006\u0003U\u0004\u0003\u0013\tClockWork0\u001e\u0017\r140307220225Z\u0017\r380119031407Z0v1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00120\u0010\u0006\u0003U\u0004\u0003\u0013\tClockWork0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000º<9\u000bþYb¼ü<Æ'Z\u0015íÜÝ7:Uj\u000bâýC÷\u0018³\u0001Ò@'ãr\tÎýâ|&° Þ6}\u001aßãN§®7óõà&rzN\b(;ïvøöC¼\u0015'6 H?É·«R<ó½{f-*'L\u0000Øç\u0011è°&_í©uÜÈåB\u0013jbq.\u000b/9yQÛ$±W¡¿çÅkÎJ8\u000b%ú¹&c>¨\u00048à¶\u000b¹~.ú\u0005<2)Ùao¤½!{7C\u001fÍØí!§òðFà\u001c¼ZbãJ\u0015káZ\u0017ÿ\u0002\u0017dDÖ\u0013±\u001e×_\u0018î´ýäZã\u001cä¯¤68¶,\\ÒÛ\n\u0001Ä2a(äÅ\u0019z¾¬ÌmÂè­¤B_\u000fÕ¥¥X$a¿x\u0011á.Î\u000eê\u0006\u0003?T9íàqÿÄl òß¾##:dÁÎ\t­¡ËÎkö¼¢.JÀÉjluOì\u0018qØ{\u0010Á Þ`¼}wÞ0ÕN¸GÎk\u0012|\u0019\u001e§o\nFÁFó6¹4êºZ_\u001c\u0003d·RUD2Pýcªå{ë«à&?\t\bM\u0019D\u0006\f:Ù»ºyôÞ<+-7º³\rK¹\u0011ÜQià¯RôÓ=³òË\u001cR\u0002Rpa¿\u0001°BÐ~ä\u0011©ª 'ðDÚ(ÅÝØSW§\u001e9»Q³Wëor\u0018üÌ\u0017\u0018¦0gF1àU9\u001azgòZ b\u0001Ö\"¸Ð\tÝ\u0011Õ\u0006¢\u0003\u000f$'®gØ\u001b47yy\u0002\u0003\u0001\u0000\u00010\u000b\u0006\t*H÷\r\u0001\u0001\u0005\u0003\u0002\u0001\u0000¤Ä4aÈ5¥±\nÍ\u0001$7jÚ'C¬0\u0003Hg\u000b +­ã?/º*\u0007d\u0003µ\u000bèqÊ*²¾½»Ä\u0006Û\t9AÉ\u0017j\u000eFÿÿ\u0000\u0016\u0016\u0004DnÜá0þ\u0010\u001eã\u0005·~=©¢­4©Ò´Ú\u001b&ýZ[p\u001cÕlþédzä\u0014;¦|\u0002e±\u0014ò2¥ï\u0017ád¡I\u0017\u001c0½Z6«øóBÈã¯¼oICs\u0007}j\u0011×9\"\rZ×µ\u0019/\u001cþJr±¸Tuàé¾hrfe±+ôîÃ\"VTõáò+ëU¾fwÖ_\t-ù^þï\u000fÇêÊ]\u000e¾\u001dA\u0004\u001fç Ë20~9.\u0013ñ 9Ti0\u0002\u0017@-öÇ rçß8ºÃ×\"5oæTj|WßgÉ=+5T5ðù¡\u0013Î-ìÍm¡ÃKAì®Ö ëR0%Åà\u0004ì´Q¼EáHZÌ6¶I¯YLU\u001b\u000bÉ8ËÖ\u001aÕgY ÷:eá©È¤Û¬\u001eë\f)\t^ÞA\u0005{<®êN\u0016Å¹EKâY\u0011´¢\u001f?z¿Àgô\u0018.A¤ä4ð/í¯WrJU3WÚ_³ÍüùTÿØÉQwçu\u0004¦B¾\\Û á\u0000eü|h\u0012í'³¨\u0004×¤ÍÙ\fÓìË\u0005¨È`ÐV N´\u001e\u0005ý9\\\u001f§{³\u001d¥$4^\n½N\u0001µ\u0006OêºBÓ-Ôg>ÏÀ\u0017\u001d&éÍ\\FïÐ");
    @VisibleForTesting

    /* renamed from: d */
    static final byte[] f5572d = m9462d("0\u0003¿0\u0002§ \u0003\u0002\u0001\u0002\u0002\t\u0000ÚÃÙ\u0015sÓï0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u00000v1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00120\u0010\u0006\u0003U\u0004\u0003\f\tClockWork0\u001e\u0017\r140307220118Z\u0017\r410723220118Z0v1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00120\u0010\u0006\u0003U\u0004\u0003\f\tClockWork0\u0001\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\u000f\u00000\u0001\n\u0002\u0001\u0001\u0000Ü\u001doK(í80\u0014²öÚÿÓ\u001dÞ{\u001ec\b@e\u000bX±e£j®¶,qS.\u0004E\t¯\u001fºO\u0018dÃ§µÖSÌ\u0000\u0015\u0000\u0010áåfú7ªÿ\u00186]®{JÝ±óÌGp¢>bþµrÁi1Z¯Nôê¥®\u001fÍÖçåêÔ1\u0013tFF\f|(û2,\\\\z¨wÃp?à·~¶ n¬krê ­!\n°*\u001fÜüvbttA©?<ê\u0016ô\"Áã2A2~ÂÉ÷01.\u001bïî)\u000bE\u001a4,¬ï[\u0014rÖÙ~ùT(ÌÕï\u0004¸Äñõ\rÒBÕ]rXfP[^K\u001b\u001eY­\u001d/ H\u0015g;ÆæC)ìÄêÔÛd©k1ÛÉ\u0007\u0002\u0003\u0001\u0000\u0001£P0N0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014G\u0010¤<³êø?«!b \u0000Î,z0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014G\u0010¤<³êø?«!b \u0000Î,z0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001\u0000\u00079b\u000b¢}*\u000fTC­\u001b`\u001c)Ù\u0001(êü?Ö(__bj>ðWæî²¬\\¢æ\u0005Ê=3õk\u00002ÄGæP\u000f%½\u0017Êù\u00039@ÈîlÜµ;íä±òHçÐ çÊê¥2ÏÚþJ¥í@@ND÷[ïÒÊÛ5¸²\u001bxF^\u0017\"òzû+\u000bn\u0015DÄ«\fOe{\u0019×}SÉÏ¹î-OE¶Tà\u0012¼éäÂâÃÓQ\u0003Ø®M,ÁÈbxW®u?\u001d{\u0002£§\u0005xÆ\u0005ã\u0005\u001cl\u001d©I\u001aÎ\u0013»Ð}}Ô&Q®¤G5\rë@^ò«óf®/ÊXÒö¿\u001d¿K\u001cHà \u0001TßÏ\u0002%\u0012õ¡Ç\"s\u001dãðGÖø");

    /* renamed from: a */
    private final Context f5573a;

    @VisibleForTesting
    C3436g2(Context context) {
        this.f5573a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C3436g2 m9460a(Context context) {
        C0917i.m1419j(context);
        synchronized (C3436g2.class) {
            if (f5570b == null) {
                f5570b = new C3436g2(context);
            }
        }
        return f5570b;
    }

    @VisibleForTesting
    /* renamed from: c */
    static final boolean m9461c(PackageInfo packageInfo, boolean z) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr.length != 1) {
            return false;
        }
        signatureArr[0].toByteArray();
        if (z) {
            return m9463e(packageInfo, f5571c, f5572d);
        }
        return m9463e(packageInfo, f5571c);
    }

    /* renamed from: d */
    private static byte[] m9462d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    private static final boolean m9463e(PackageInfo packageInfo, byte[]... bArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return false;
        }
        byte[] byteArray = signatureArr[0].toByteArray();
        for (byte[] equals : bArr) {
            if (Arrays.equals(equals, byteArray)) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    /* renamed from: b */
    public final boolean mo24267b(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = C3144c.m8403a(this.f5573a).mo23629d("com.google.android.wearable.app.cn", 64);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        if (C0879d.m1230e(this.f5573a)) {
            return m9461c(packageInfo, true);
        }
        boolean c = m9461c(packageInfo, false);
        if (c || !m9461c(packageInfo, true)) {
            return c;
        }
        return false;
    }
}
