package com.yeelight.yeelib.device;

import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.yeelight.yeelib.device.base.C3010c;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;
import p223w3.C10566a;
import p223w3.C10595a0;
import p223w3.C10622a1;
import p223w3.C10663b1;
import p223w3.C10721c1;
import p223w3.C10744d;
import p223w3.C10797d1;
import p223w3.C10803e;
import p223w3.C10859e1;
import p223w3.C10865f;
import p223w3.C10916f1;
import p223w3.C10922g;
import p223w3.C10965g0;
import p223w3.C10997g1;
import p223w3.C10998h;
import p223w3.C11041h0;
import p223w3.C11078h1;
import p223w3.C11107i;
import p223w3.C11138i0;
import p223w3.C11165i1;
import p223w3.C11195j;
import p223w3.C11223j0;
import p223w3.C11250j1;
import p223w3.C11280k;
import p223w3.C11311k0;
import p223w3.C11338k1;
import p223w3.C11363l;
import p223w3.C11406l1;
import p223w3.C11421m;
import p223w3.C11452m1;
import p223w3.C11480n;
import p223w3.C11511o;
import p223w3.C11542p;
import p223w3.C11571p0;
import p223w3.C11581q;
import p223w3.C11641s;
import p223w3.C11671t;
import p223w3.C11699u;
import p223w3.C11733v;
import p223w3.C11766w;
import p223w3.C11796w0;
import p223w3.C11819x;
import p223w3.C11842x0;
import p223w3.C11864y;
import p223w3.C11888y0;
import p223w3.C11913z0;

/* renamed from: com.yeelight.yeelib.device.b */
public class C6088b {
    /* renamed from: a */
    public static C3010c m17785a(AbstractDevice abstractDevice) {
        if (abstractDevice == null) {
            return null;
        }
        String deviceModel = abstractDevice.getDeviceModel();
        deviceModel.hashCode();
        char c = 65535;
        switch (deviceModel.hashCode()) {
            case -1644531059:
                if (deviceModel.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (deviceModel.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (deviceModel.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (deviceModel.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (deviceModel.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (deviceModel.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (deviceModel.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (deviceModel.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (deviceModel.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (deviceModel.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (deviceModel.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (deviceModel.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (deviceModel.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (deviceModel.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (deviceModel.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (deviceModel.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (deviceModel.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1350780909:
                if (deviceModel.equals("yeelink.plug.plug")) {
                    c = 17;
                    break;
                }
                break;
            case -1317475940:
                if (deviceModel.equals("yeelink.light.ceil26")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475939:
                if (deviceModel.equals("yeelink.light.ceil27")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475937:
                if (deviceModel.equals("yeelink.light.ceil29")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475915:
                if (deviceModel.equals("yeelink.light.ceil30")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475914:
                if (deviceModel.equals("yeelink.light.ceil31")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475913:
                if (deviceModel.equals("yeelink.light.ceil32")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475912:
                if (deviceModel.equals("yeelink.light.ceil33")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475910:
                if (deviceModel.equals("yeelink.light.ceil35")) {
                    c = 25;
                    break;
                }
                break;
            case -1308146495:
                if (deviceModel.equals("yeelink.light.color1")) {
                    c = 26;
                    break;
                }
                break;
            case -1308146494:
                if (deviceModel.equals("yeelink.light.color2")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146493:
                if (deviceModel.equals("yeelink.light.color3")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146492:
                if (deviceModel.equals("yeelink.light.color4")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146491:
                if (deviceModel.equals("yeelink.light.color5")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146490:
                if (deviceModel.equals("yeelink.light.color6")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146488:
                if (deviceModel.equals("yeelink.light.color8")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146447:
                if (deviceModel.equals("yeelink.light.colora")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146446:
                if (deviceModel.equals("yeelink.light.colorb")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146445:
                if (deviceModel.equals("yeelink.light.colorc")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146443:
                if (deviceModel.equals("yeelink.light.colore")) {
                    c = '$';
                    break;
                }
                break;
            case -1282176368:
                if (deviceModel.equals("yeelink.light.dn2grp")) {
                    c = '%';
                    break;
                }
                break;
            case -1235140472:
                if (deviceModel.equals("yeelink.light.fancl1")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140471:
                if (deviceModel.equals("yeelink.light.fancl2")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140468:
                if (deviceModel.equals("yeelink.light.fancl5")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140467:
                if (deviceModel.equals("yeelink.light.fancl6")) {
                    c = ')';
                    break;
                }
                break;
            case -1119332198:
                if (deviceModel.equals("yeelink.wifispeaker.v1")) {
                    c = '*';
                    break;
                }
                break;
            case -1063384694:
                if (deviceModel.equals("yeelink.light.lamp10")) {
                    c = '+';
                    break;
                }
                break;
            case -1063384689:
                if (deviceModel.equals("yeelink.light.lamp15")) {
                    c = ',';
                    break;
                }
                break;
            case -1063384687:
                if (deviceModel.equals("yeelink.light.lamp17")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384685:
                if (deviceModel.equals("yeelink.light.lamp19")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1035626052:
                if (deviceModel.equals("yeelink.light.mb1grp")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1035596261:
                if (deviceModel.equals("yeelink.light.mb2grp")) {
                    c = '0';
                    break;
                }
                break;
            case -948847040:
                if (deviceModel.equals("yeelink.light.panel1")) {
                    c = '1';
                    break;
                }
                break;
            case -948847038:
                if (deviceModel.equals("yeelink.light.panel3")) {
                    c = '2';
                    break;
                }
                break;
            case -939061393:
                if (deviceModel.equals("yeelink.light.plate2")) {
                    c = '3';
                    break;
                }
                break;
            case -888668266:
                if (deviceModel.equals("yilai.light.ceiling1")) {
                    c = '4';
                    break;
                }
                break;
            case -888668265:
                if (deviceModel.equals("yilai.light.ceiling2")) {
                    c = '5';
                    break;
                }
                break;
            case -888668264:
                if (deviceModel.equals("yilai.light.ceiling3")) {
                    c = '6';
                    break;
                }
                break;
            case -850921852:
                if (deviceModel.equals("yeelink.light.sp1grp")) {
                    c = '7';
                    break;
                }
                break;
            case -845289556:
                if (deviceModel.equals("yeelink.light.strip1")) {
                    c = '8';
                    break;
                }
                break;
            case -845289555:
                if (deviceModel.equals("yeelink.light.strip2")) {
                    c = '9';
                    break;
                }
                break;
            case -845289553:
                if (deviceModel.equals("yeelink.light.strip4")) {
                    c = ':';
                    break;
                }
                break;
            case -845289551:
                if (deviceModel.equals("yeelink.light.strip6")) {
                    c = ';';
                    break;
                }
                break;
            case -845289549:
                if (deviceModel.equals("yeelink.light.strip8")) {
                    c = '<';
                    break;
                }
                break;
            case -845289508:
                if (deviceModel.equals("yeelink.light.stripa")) {
                    c = '=';
                    break;
                }
                break;
            case -458141175:
                if (deviceModel.equals("yeelink.light.ceila")) {
                    c = '>';
                    break;
                }
                break;
            case -458141174:
                if (deviceModel.equals("yeelink.light.ceilb")) {
                    c = '?';
                    break;
                }
                break;
            case -458141173:
                if (deviceModel.equals("yeelink.light.ceilc")) {
                    c = '@';
                    break;
                }
                break;
            case -458141172:
                if (deviceModel.equals("yeelink.light.ceild")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141171:
                if (deviceModel.equals("yeelink.light.ceile")) {
                    c = 'B';
                    break;
                }
                break;
            case -449944730:
                if (deviceModel.equals("yeelink.light.lamp1")) {
                    c = 'C';
                    break;
                }
                break;
            case -449944729:
                if (deviceModel.equals("yeelink.light.lamp2")) {
                    c = 'D';
                    break;
                }
                break;
            case -449944728:
                if (deviceModel.equals("yeelink.light.lamp3")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944727:
                if (deviceModel.equals("yeelink.light.lamp4")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944726:
                if (deviceModel.equals("yeelink.light.lamp5")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944724:
                if (deviceModel.equals("yeelink.light.lamp7")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944723:
                if (deviceModel.equals("yeelink.light.lamp8")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944722:
                if (deviceModel.equals("yeelink.light.lamp9")) {
                    c = 'J';
                    break;
                }
                break;
            case -448603205:
                if (deviceModel.equals("yeelink.light.mono1")) {
                    c = 'K';
                    break;
                }
                break;
            case -448603204:
                if (deviceModel.equals("yeelink.light.mono2")) {
                    c = 'L';
                    break;
                }
                break;
            case -448603202:
                if (deviceModel.equals("yeelink.light.mono4")) {
                    c = 'M';
                    break;
                }
                break;
            case -448603201:
                if (deviceModel.equals("yeelink.light.mono5")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603157:
                if (deviceModel.equals("yeelink.light.monoa")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603156:
                if (deviceModel.equals("yeelink.light.monob")) {
                    c = 'P';
                    break;
                }
                break;
            case -443031172:
                if (deviceModel.equals("yeelink.light.spot1")) {
                    c = 'Q';
                    break;
                }
                break;
            case -295895630:
                if (deviceModel.equals("yeelink.controller.v1")) {
                    c = 'R';
                    break;
                }
                break;
            case -190173984:
                if (deviceModel.equals("yeelink.gateway.v1")) {
                    c = 'S';
                    break;
                }
                break;
            case -190173936:
                if (deviceModel.equals("yeelink.gateway.va")) {
                    c = 'T';
                    break;
                }
                break;
            case 674030242:
                if (deviceModel.equals("yeelink.curtain.ctmt1")) {
                    c = 'U';
                    break;
                }
                break;
            case 922669543:
                if (deviceModel.equals("yeelink.light.ceiling1")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669544:
                if (deviceModel.equals("yeelink.light.ceiling2")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669545:
                if (deviceModel.equals("yeelink.light.ceiling3")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669546:
                if (deviceModel.equals("yeelink.light.ceiling4")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669547:
                if (deviceModel.equals("yeelink.light.ceiling5")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669548:
                if (deviceModel.equals("yeelink.light.ceiling6")) {
                    c = '[';
                    break;
                }
                break;
            case 922669549:
                if (deviceModel.equals("yeelink.light.ceiling7")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669550:
                if (deviceModel.equals("yeelink.light.ceiling8")) {
                    c = ']';
                    break;
                }
                break;
            case 922669551:
                if (deviceModel.equals("yeelink.light.ceiling9")) {
                    c = '^';
                    break;
                }
                break;
            case 1201756974:
                if (deviceModel.equals("yeelink.light.ct2")) {
                    c = '_';
                    break;
                }
                break;
            case 1201757021:
                if (deviceModel.equals("yeelink.light.cta")) {
                    c = '`';
                    break;
                }
                break;
            case 1201757023:
                if (deviceModel.equals("yeelink.light.ctc")) {
                    c = 'a';
                    break;
                }
                break;
            case 1201766335:
                if (deviceModel.equals("yeelink.light.ml1")) {
                    c = 'b';
                    break;
                }
                break;
            case 1201766336:
                if (deviceModel.equals("yeelink.light.ml2")) {
                    c = 'c';
                    break;
                }
                break;
            case 1623724661:
                if (deviceModel.equals("yeelink.light.bslamp1")) {
                    c = 'd';
                    break;
                }
                break;
            case 1623724662:
                if (deviceModel.equals("yeelink.light.bslamp2")) {
                    c = 'e';
                    break;
                }
                break;
            case 1623724663:
                if (deviceModel.equals("yeelink.light.bslamp3")) {
                    c = 'f';
                    break;
                }
                break;
            case 2102612488:
                if (deviceModel.equals("yeelink.light.meshbulb1")) {
                    c = 'g';
                    break;
                }
                break;
            case 2102612489:
                if (deviceModel.equals("yeelink.light.meshbulb2")) {
                    c = 'h';
                    break;
                }
                break;
            case 2146130361:
                if (deviceModel.equals("yeelink.light.dnlight2")) {
                    c = 'i';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C10566a(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 1:
                return new C11406l1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 2:
                return new C10922g(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 24:
            case '>':
            case '[':
            case '\\':
            case ']':
            case '^':
                return new C11480n(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 8:
            case 9:
            case 22:
            case 'V':
            case 'X':
                return new C11542p(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 11:
            case 12:
                return new C10998h(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 13:
            case 14:
            case 15:
            case 'Z':
                return new C11421m(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 17:
                return new C10797d1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 20:
                return new C11107i(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 25:
            case 'B':
                return new C11280k(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 26:
            case 30:
            case '!':
                return new C11733v(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 27:
            case 31:
                return new C11641s(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 28:
                return new C11671t(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 29:
            case ' ':
                return new C11699u(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '\"':
            case '#':
            case '$':
                return new C11766w(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '/':
            case '0':
            case '7':
            case 'Q':
            case 'U':
            case 'b':
            case 'c':
            case 'g':
            case 'h':
            case 'i':
                return new C10997g1(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getDeviceModel(), abstractDevice.getOwnership());
            case '*':
                return new C10916f1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '+':
                return new C10965g0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case ',':
                return new C11041h0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '-':
            case 'E':
            case 'G':
                return new C11913z0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '.':
            case 'f':
                return new C10803e(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '1':
                return new C10622a1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '2':
                return new C10663b1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '3':
                return new C10721c1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '4':
            case '5':
            case '6':
                return new C11452m1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '8':
                return new C11250j1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '9':
                return new C11078h1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case ':':
                return new C11338k1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case ';':
            case '<':
            case '=':
                return new C11165i1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '?':
            case '@':
                return new C11581q(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'A':
                return new C11511o(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'C':
            case 'F':
                return new C11311k0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'D':
                return new C10595a0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'H':
            case 'I':
                return new C11138i0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'J':
                return new C11223j0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'K':
            case 'L':
                return new C11842x0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'M':
            case 'N':
                return new C11796w0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'O':
            case 'P':
                return new C11888y0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'R':
                return new C10859e1(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getOwnership());
            case 'S':
            case 'T':
                return new C11571p0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'W':
                return new C11195j(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getOwnership());
            case 'Y':
                return new C11363l(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '_':
                return new C11819x(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '`':
            case 'a':
                return new C11864y(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'd':
                return new C10865f(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'e':
                return new C10744d(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C3010c m17786b(String str, String str2, String str3, Device.Ownership ownership) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 17;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 25;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 26;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '$';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '%';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = ')';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = '*';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = '+';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = ',';
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '0';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '1';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '2';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '3';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '4';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '5';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '6';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = '7';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = '8';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '9';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = ':';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = ';';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '<';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '=';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = '>';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = '?';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = '@';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'B';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'C';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'D';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'J';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'K';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'L';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'M';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'P';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'Q';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = 'R';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'S';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'T';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = 'U';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = '[';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = ']';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = '^';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = '_';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = '`';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'a';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'b';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'c';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'd';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'e';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'f';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'g';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C10566a(str2, str3, str, ownership);
            case 1:
                return new C11406l1(str2, str3, str, ownership);
            case 2:
                return new C10922g(str2, str3, str, ownership);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 24:
            case '>':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
                return new C11480n(str2, str3, str, ownership);
            case 8:
            case 9:
            case 22:
            case 'T':
            case 'V':
                return new C11542p(str2, str3, str, ownership);
            case 11:
            case 12:
                return new C10998h(str2, str3, str, ownership);
            case 13:
            case 14:
            case 15:
            case 'X':
                return new C11421m(str2, str3, str, ownership);
            case 17:
                return new C10797d1(str2, str3, str, ownership);
            case 20:
                return new C11107i(str2, str3, str, ownership);
            case 25:
            case 'B':
                return new C11280k(str2, str3, str, ownership);
            case 26:
            case 30:
            case '!':
                return new C11733v(str2, str3, str, ownership);
            case 27:
            case 31:
                return new C11641s(str2, str3, str, ownership);
            case 28:
                return new C11671t(str2, str3, str, ownership);
            case 29:
            case ' ':
                return new C11699u(str2, str3, str, ownership);
            case '\"':
            case '#':
            case '$':
                return new C11766w(str2, str3, str, ownership);
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '/':
            case '0':
            case '7':
            case 'Q':
            case 'S':
            case '`':
            case 'a':
            case 'e':
            case 'f':
            case 'g':
                return new C10997g1(str2, str3, str, ownership);
            case '*':
                return new C10916f1(str2, str3, str, ownership);
            case '+':
                return new C10965g0(str2, str3, str, ownership);
            case ',':
                return new C11041h0(str2, str3, str, ownership);
            case '-':
            case 'E':
            case 'G':
                return new C11913z0(str2, str3, str, ownership);
            case '.':
            case 'd':
                return new C10803e(str2, str3, str, ownership);
            case '1':
                return new C10622a1(str2, str3, str, ownership);
            case '2':
                return new C10663b1(str2, str3, str, ownership);
            case '3':
                return new C10721c1(str2, str3, str, ownership);
            case '4':
            case '5':
            case '6':
                return new C11452m1(str2, str3, str, ownership);
            case '8':
                return new C11250j1(str2, str3, str, ownership);
            case '9':
                return new C11078h1(str2, str3, str, ownership);
            case ':':
                return new C11338k1(str2, str3, str, ownership);
            case ';':
            case '<':
            case '=':
                return new C11165i1(str2, str3, str, ownership);
            case '?':
            case '@':
                return new C11581q(str2, str3, str, ownership);
            case 'A':
                return new C11511o(str2, str3, str, ownership);
            case 'C':
            case 'F':
                return new C11311k0(str2, str3, str, ownership);
            case 'D':
                return new C10595a0(str2, str3, str, ownership);
            case 'H':
            case 'I':
                return new C11138i0(str2, str3, str, ownership);
            case 'J':
                return new C11223j0(str2, str3, str, ownership);
            case 'K':
            case 'L':
                return new C11842x0(str2, str3, str, ownership);
            case 'M':
            case 'N':
                return new C11796w0(str2, str3, str, ownership);
            case 'O':
            case 'P':
                return new C11888y0(str2, str3, str, ownership);
            case 'R':
                return new C11571p0(str2, str3, str, ownership);
            case 'U':
                return new C11195j(str2, str3, ownership);
            case 'W':
                return new C11363l(str2, str3, str, ownership);
            case ']':
                return new C11819x(str2, str3, str, ownership);
            case '^':
            case '_':
                return new C11864y(str2, str3, str, ownership);
            case 'b':
                return new C10865f(str2, str3, str, ownership);
            case 'c':
                return new C10744d(str2, str3, str, ownership);
            default:
                return null;
        }
    }
}
