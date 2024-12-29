package com.yeelight.yeelib.p150c;

import com.miot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p183m.C6227a;
import com.yeelight.yeelib.p150c.p183m.C6269a1;
import com.yeelight.yeelib.p150c.p183m.C6318b1;
import com.yeelight.yeelib.p150c.p183m.C6357c1;
import com.yeelight.yeelib.p150c.p183m.C6363d;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p150c.p183m.C6424e;
import com.yeelight.yeelib.p150c.p183m.C6477e1;
import com.yeelight.yeelib.p150c.p183m.C6478f;
import com.yeelight.yeelib.p150c.p183m.C6513f0;
import com.yeelight.yeelib.p150c.p183m.C6545f1;
import com.yeelight.yeelib.p150c.p183m.C6574g;
import com.yeelight.yeelib.p150c.p183m.C6617g0;
import com.yeelight.yeelib.p150c.p183m.C6654g1;
import com.yeelight.yeelib.p150c.p183m.C6684h;
import com.yeelight.yeelib.p150c.p183m.C6727h0;
import com.yeelight.yeelib.p150c.p183m.C6754h1;
import com.yeelight.yeelib.p150c.p183m.C6784i;
import com.yeelight.yeelib.p150c.p183m.C6815i0;
import com.yeelight.yeelib.p150c.p183m.C6842i1;
import com.yeelight.yeelib.p150c.p183m.C6867j;
import com.yeelight.yeelib.p150c.p183m.C6895j0;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p150c.p183m.C6937k;
import com.yeelight.yeelib.p150c.p183m.C6980k1;
import com.yeelight.yeelib.p150c.p183m.C7008l;
import com.yeelight.yeelib.p150c.p183m.C7039m;
import com.yeelight.yeelib.p150c.p183m.C7070n;
import com.yeelight.yeelib.p150c.p183m.C7101o;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p150c.p183m.C7140p;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import com.yeelight.yeelib.p150c.p183m.C7260t;
import com.yeelight.yeelib.p150c.p183m.C7294u;
import com.yeelight.yeelib.p150c.p183m.C7327v;
import com.yeelight.yeelib.p150c.p183m.C7357v0;
import com.yeelight.yeelib.p150c.p183m.C7380w;
import com.yeelight.yeelib.p150c.p183m.C7403w0;
import com.yeelight.yeelib.p150c.p183m.C7425x;
import com.yeelight.yeelib.p150c.p183m.C7449x0;
import com.yeelight.yeelib.p150c.p183m.C7474y0;
import com.yeelight.yeelib.p150c.p183m.C7497z;
import com.yeelight.yeelib.p150c.p183m.C7524z0;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.yeelight.yeelib.c.b */
public class C5979b {
    /* renamed from: a */
    public static C4198d m17534a(AbstractDevice abstractDevice) {
        if (abstractDevice == null) {
            return null;
        }
        String deviceModel = abstractDevice.getDeviceModel();
        char c = 65535;
        switch (deviceModel.hashCode()) {
            case -1644531059:
                if (deviceModel.equals("yeelink.bhf_light.v1")) {
                    c = '^';
                    break;
                }
                break;
            case -1494338802:
                if (deviceModel.equals("yeelink.switch.sw1")) {
                    c = 'b';
                    break;
                }
                break;
            case -1462015191:
                if (deviceModel.equals("yeelink.light.ceiling10")) {
                    c = ']';
                    break;
                }
                break;
            case -1462015190:
                if (deviceModel.equals("yeelink.light.ceiling11")) {
                    c = 'D';
                    break;
                }
                break;
            case -1462015189:
                if (deviceModel.equals("yeelink.light.ceiling12")) {
                    c = 'E';
                    break;
                }
                break;
            case -1462015188:
                if (deviceModel.equals("yeelink.light.ceiling13")) {
                    c = 'F';
                    break;
                }
                break;
            case -1462015187:
                if (deviceModel.equals("yeelink.light.ceiling14")) {
                    c = 'G';
                    break;
                }
                break;
            case -1462015186:
                if (deviceModel.equals("yeelink.light.ceiling15")) {
                    c = 'H';
                    break;
                }
                break;
            case -1462015185:
                if (deviceModel.equals("yeelink.light.ceiling16")) {
                    c = '9';
                    break;
                }
                break;
            case -1462015184:
                if (deviceModel.equals("yeelink.light.ceiling17")) {
                    c = ':';
                    break;
                }
                break;
            case -1462015183:
                if (deviceModel.equals("yeelink.light.ceiling18")) {
                    c = 'I';
                    break;
                }
                break;
            case -1462015182:
                if (deviceModel.equals("yeelink.light.ceiling19")) {
                    c = 'X';
                    break;
                }
                break;
            case -1462015160:
                if (deviceModel.equals("yeelink.light.ceiling20")) {
                    c = 'Y';
                    break;
                }
                break;
            case -1462015159:
                if (deviceModel.equals("yeelink.light.ceiling21")) {
                    c = '=';
                    break;
                }
                break;
            case -1462015158:
                if (deviceModel.equals("yeelink.light.ceiling22")) {
                    c = '>';
                    break;
                }
                break;
            case -1462015157:
                if (deviceModel.equals("yeelink.light.ceiling23")) {
                    c = '?';
                    break;
                }
                break;
            case -1462015156:
                if (deviceModel.equals("yeelink.light.ceiling24")) {
                    c = 'J';
                    break;
                }
                break;
            case -1350780909:
                if (deviceModel.equals("yeelink.plug.plug")) {
                    c = 'c';
                    break;
                }
                break;
            case -1317475940:
                if (deviceModel.equals("yeelink.light.ceil26")) {
                    c = 'K';
                    break;
                }
                break;
            case -1317475939:
                if (deviceModel.equals("yeelink.light.ceil27")) {
                    c = 'L';
                    break;
                }
                break;
            case -1317475937:
                if (deviceModel.equals("yeelink.light.ceil29")) {
                    c = 'Q';
                    break;
                }
                break;
            case -1317475915:
                if (deviceModel.equals("yeelink.light.ceil30")) {
                    c = 'M';
                    break;
                }
                break;
            case -1317475914:
                if (deviceModel.equals("yeelink.light.ceil31")) {
                    c = ';';
                    break;
                }
                break;
            case -1317475913:
                if (deviceModel.equals("yeelink.light.ceil32")) {
                    c = 'N';
                    break;
                }
                break;
            case -1317475912:
                if (deviceModel.equals("yeelink.light.ceil33")) {
                    c = 'O';
                    break;
                }
                break;
            case -1308146495:
                if (deviceModel.equals("yeelink.light.color1")) {
                    c = 7;
                    break;
                }
                break;
            case -1308146494:
                if (deviceModel.equals("yeelink.light.color2")) {
                    c = 13;
                    break;
                }
                break;
            case -1308146493:
                if (deviceModel.equals("yeelink.light.color3")) {
                    c = 10;
                    break;
                }
                break;
            case -1308146492:
                if (deviceModel.equals("yeelink.light.color4")) {
                    c = 15;
                    break;
                }
                break;
            case -1308146491:
                if (deviceModel.equals("yeelink.light.color5")) {
                    c = 8;
                    break;
                }
                break;
            case -1308146490:
                if (deviceModel.equals("yeelink.light.color6")) {
                    c = 14;
                    break;
                }
                break;
            case -1308146488:
                if (deviceModel.equals("yeelink.light.color8")) {
                    c = 16;
                    break;
                }
                break;
            case -1308146447:
                if (deviceModel.equals("yeelink.light.colora")) {
                    c = 9;
                    break;
                }
                break;
            case -1308146446:
                if (deviceModel.equals("yeelink.light.colorb")) {
                    c = 11;
                    break;
                }
                break;
            case -1308146445:
                if (deviceModel.equals("yeelink.light.colorc")) {
                    c = 12;
                    break;
                }
                break;
            case -1282176368:
                if (deviceModel.equals("yeelink.light.dn2grp")) {
                    c = 23;
                    break;
                }
                break;
            case -1235140472:
                if (deviceModel.equals("yeelink.light.fancl1")) {
                    c = 30;
                    break;
                }
                break;
            case -1235140471:
                if (deviceModel.equals("yeelink.light.fancl2")) {
                    c = 31;
                    break;
                }
                break;
            case -1235140468:
                if (deviceModel.equals("yeelink.light.fancl5")) {
                    c = ' ';
                    break;
                }
                break;
            case -1235140467:
                if (deviceModel.equals("yeelink.light.fancl6")) {
                    c = '!';
                    break;
                }
                break;
            case -1119332198:
                if (deviceModel.equals("yeelink.wifispeaker.v1")) {
                    c = 'a';
                    break;
                }
                break;
            case -1063384694:
                if (deviceModel.equals("yeelink.light.lamp10")) {
                    c = '0';
                    break;
                }
                break;
            case -1063384689:
                if (deviceModel.equals("yeelink.light.lamp15")) {
                    c = '1';
                    break;
                }
                break;
            case -1063384687:
                if (deviceModel.equals("yeelink.light.lamp17")) {
                    c = '4';
                    break;
                }
                break;
            case -1063384685:
                if (deviceModel.equals("yeelink.light.lamp19")) {
                    c = 'U';
                    break;
                }
                break;
            case -1035626052:
                if (deviceModel.equals("yeelink.light.mb1grp")) {
                    c = 24;
                    break;
                }
                break;
            case -1035596261:
                if (deviceModel.equals("yeelink.light.mb2grp")) {
                    c = 25;
                    break;
                }
                break;
            case -948847040:
                if (deviceModel.equals("yeelink.light.panel1")) {
                    c = 6;
                    break;
                }
                break;
            case -948847038:
                if (deviceModel.equals("yeelink.light.panel3")) {
                    c = '\"';
                    break;
                }
                break;
            case -888668266:
                if (deviceModel.equals("yilai.light.ceiling1")) {
                    c = '$';
                    break;
                }
                break;
            case -888668265:
                if (deviceModel.equals("yilai.light.ceiling2")) {
                    c = '%';
                    break;
                }
                break;
            case -888668264:
                if (deviceModel.equals("yilai.light.ceiling3")) {
                    c = '&';
                    break;
                }
                break;
            case -850921852:
                if (deviceModel.equals("yeelink.light.sp1grp")) {
                    c = 26;
                    break;
                }
                break;
            case -845289556:
                if (deviceModel.equals("yeelink.light.strip1")) {
                    c = '\'';
                    break;
                }
                break;
            case -845289555:
                if (deviceModel.equals("yeelink.light.strip2")) {
                    c = '(';
                    break;
                }
                break;
            case -845289553:
                if (deviceModel.equals("yeelink.light.strip4")) {
                    c = '#';
                    break;
                }
                break;
            case -845289551:
                if (deviceModel.equals("yeelink.light.strip6")) {
                    c = ')';
                    break;
                }
                break;
            case -845289508:
                if (deviceModel.equals("yeelink.light.stripa")) {
                    c = '*';
                    break;
                }
                break;
            case -458141175:
                if (deviceModel.equals("yeelink.light.ceila")) {
                    c = 'P';
                    break;
                }
                break;
            case -458141174:
                if (deviceModel.equals("yeelink.light.ceilb")) {
                    c = 'Z';
                    break;
                }
                break;
            case -458141173:
                if (deviceModel.equals("yeelink.light.ceilc")) {
                    c = '[';
                    break;
                }
                break;
            case -458141172:
                if (deviceModel.equals("yeelink.light.ceild")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case -449944730:
                if (deviceModel.equals("yeelink.light.lamp1")) {
                    c = '+';
                    break;
                }
                break;
            case -449944729:
                if (deviceModel.equals("yeelink.light.lamp2")) {
                    c = '2';
                    break;
                }
                break;
            case -449944728:
                if (deviceModel.equals("yeelink.light.lamp3")) {
                    c = '3';
                    break;
                }
                break;
            case -449944727:
                if (deviceModel.equals("yeelink.light.lamp4")) {
                    c = ',';
                    break;
                }
                break;
            case -449944726:
                if (deviceModel.equals("yeelink.light.lamp5")) {
                    c = '5';
                    break;
                }
                break;
            case -449944724:
                if (deviceModel.equals("yeelink.light.lamp7")) {
                    c = '-';
                    break;
                }
                break;
            case -449944723:
                if (deviceModel.equals("yeelink.light.lamp8")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -449944722:
                if (deviceModel.equals("yeelink.light.lamp9")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -448603205:
                if (deviceModel.equals("yeelink.light.mono1")) {
                    c = 0;
                    break;
                }
                break;
            case -448603204:
                if (deviceModel.equals("yeelink.light.mono2")) {
                    c = 1;
                    break;
                }
                break;
            case -448603202:
                if (deviceModel.equals("yeelink.light.mono4")) {
                    c = 2;
                    break;
                }
                break;
            case -448603201:
                if (deviceModel.equals("yeelink.light.mono5")) {
                    c = 3;
                    break;
                }
                break;
            case -448603157:
                if (deviceModel.equals("yeelink.light.monoa")) {
                    c = 4;
                    break;
                }
                break;
            case -448603156:
                if (deviceModel.equals("yeelink.light.monob")) {
                    c = 5;
                    break;
                }
                break;
            case -443031172:
                if (deviceModel.equals("yeelink.light.spot1")) {
                    c = 22;
                    break;
                }
                break;
            case -295895630:
                if (deviceModel.equals("yeelink.controller.v1")) {
                    c = '6';
                    break;
                }
                break;
            case -190173984:
                if (deviceModel.equals("yeelink.gateway.v1")) {
                    c = '_';
                    break;
                }
                break;
            case -190173936:
                if (deviceModel.equals("yeelink.gateway.va")) {
                    c = '`';
                    break;
                }
                break;
            case 674030242:
                if (deviceModel.equals("yeelink.curtain.ctmt1")) {
                    c = 29;
                    break;
                }
                break;
            case 922669543:
                if (deviceModel.equals("yeelink.light.ceiling1")) {
                    c = '7';
                    break;
                }
                break;
            case 922669544:
                if (deviceModel.equals("yeelink.light.ceiling2")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669545:
                if (deviceModel.equals("yeelink.light.ceiling3")) {
                    c = '8';
                    break;
                }
                break;
            case 922669546:
                if (deviceModel.equals("yeelink.light.ceiling4")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669547:
                if (deviceModel.equals("yeelink.light.ceiling5")) {
                    c = '<';
                    break;
                }
                break;
            case 922669548:
                if (deviceModel.equals("yeelink.light.ceiling6")) {
                    c = '@';
                    break;
                }
                break;
            case 922669549:
                if (deviceModel.equals("yeelink.light.ceiling7")) {
                    c = 'A';
                    break;
                }
                break;
            case 922669550:
                if (deviceModel.equals("yeelink.light.ceiling8")) {
                    c = 'B';
                    break;
                }
                break;
            case 922669551:
                if (deviceModel.equals("yeelink.light.ceiling9")) {
                    c = 'C';
                    break;
                }
                break;
            case 1201756974:
                if (deviceModel.equals("yeelink.light.ct2")) {
                    c = 17;
                    break;
                }
                break;
            case 1201757021:
                if (deviceModel.equals("yeelink.light.cta")) {
                    c = 18;
                    break;
                }
                break;
            case 1201766335:
                if (deviceModel.equals("yeelink.light.ml1")) {
                    c = 27;
                    break;
                }
                break;
            case 1201766336:
                if (deviceModel.equals("yeelink.light.ml2")) {
                    c = 28;
                    break;
                }
                break;
            case 1623724661:
                if (deviceModel.equals("yeelink.light.bslamp1")) {
                    c = 'R';
                    break;
                }
                break;
            case 1623724662:
                if (deviceModel.equals("yeelink.light.bslamp2")) {
                    c = 'S';
                    break;
                }
                break;
            case 1623724663:
                if (deviceModel.equals("yeelink.light.bslamp3")) {
                    c = 'T';
                    break;
                }
                break;
            case 2102612488:
                if (deviceModel.equals("yeelink.light.meshbulb1")) {
                    c = 20;
                    break;
                }
                break;
            case 2102612489:
                if (deviceModel.equals("yeelink.light.meshbulb2")) {
                    c = 21;
                    break;
                }
                break;
            case 2146130361:
                if (deviceModel.equals("yeelink.light.dnlight2")) {
                    c = 19;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new C7403w0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 2:
            case 3:
                return new C7357v0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 4:
            case 5:
                return new C7449x0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 6:
                return new C7524z0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 7:
            case 8:
            case 9:
                return new C7294u(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 10:
                return new C7230s(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 11:
            case 12:
                return new C7327v(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 13:
            case 14:
                return new C7200r(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 15:
            case 16:
                return new C7260t(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 17:
                return new C7380w(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 18:
                return new C7425x(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '!':
                return new C6477e1(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getDeviceModel(), abstractDevice.getOwnership());
            case '\"':
                return new C6269a1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '#':
                return new C6842i1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '$':
            case '%':
            case '&':
                return new C6980k1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '\'':
                return new C6754h1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '(':
                return new C6545f1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case ')':
            case '*':
                return new C6654g1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '+':
            case ',':
                return new C6895j0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '-':
            case '.':
                return new C6727h0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '/':
                return new C6815i0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '0':
                return new C6513f0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '1':
                return new C6617g0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '2':
                return new C7497z(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '3':
            case '4':
            case '5':
                return new C7474y0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '6':
                return new C6357c1(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getOwnership());
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
                return new C7101o(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '<':
            case '=':
            case '>':
            case '?':
                return new C7008l(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
                return new C7039m(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'Q':
                return new C6784i(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'R':
                return new C6478f(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'S':
                return new C6363d(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'T':
            case 'U':
                return new C6424e(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'V':
                return new C6867j(abstractDevice.getDeviceId(), abstractDevice.getName(), abstractDevice.getOwnership());
            case 'W':
                return new C6937k(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'X':
            case 'Y':
                return new C6684h(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'Z':
            case '[':
                return new C7140p(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '\\':
                return new C7070n(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case ']':
                return new C6574g(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '^':
                return new C6227a(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case '_':
            case '`':
                return new C7130o0(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'a':
                return new C6418d1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'b':
                return new C6922j1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            case 'c':
                return new C6318b1(abstractDevice.getDeviceId(), abstractDevice.getName(), deviceModel, abstractDevice.getOwnership());
            default:
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yeelight.yeelib.p150c.p151i.C4198d m17535b(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.miot.common.device.Device.Ownership r4) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x0485;
                case -1494338802: goto L_0x047a;
                case -1462015191: goto L_0x046f;
                case -1462015190: goto L_0x0464;
                case -1462015189: goto L_0x0459;
                case -1462015188: goto L_0x044e;
                case -1462015187: goto L_0x0443;
                case -1462015186: goto L_0x0438;
                case -1462015185: goto L_0x042d;
                case -1462015184: goto L_0x0421;
                case -1462015183: goto L_0x0415;
                case -1462015182: goto L_0x0409;
                case -1462015160: goto L_0x03fd;
                case -1462015159: goto L_0x03f1;
                case -1462015158: goto L_0x03e5;
                case -1462015157: goto L_0x03d9;
                case -1462015156: goto L_0x03cd;
                case -1350780909: goto L_0x03c1;
                case -1317475940: goto L_0x03b5;
                case -1317475939: goto L_0x03a9;
                case -1317475937: goto L_0x039d;
                case -1317475915: goto L_0x0391;
                case -1317475914: goto L_0x0385;
                case -1317475913: goto L_0x0379;
                case -1317475912: goto L_0x036d;
                case -1308146495: goto L_0x0362;
                case -1308146494: goto L_0x0356;
                case -1308146493: goto L_0x034a;
                case -1308146492: goto L_0x033e;
                case -1308146491: goto L_0x0332;
                case -1308146490: goto L_0x0326;
                case -1308146488: goto L_0x031a;
                case -1308146447: goto L_0x030e;
                case -1308146446: goto L_0x0302;
                case -1308146445: goto L_0x02f6;
                case -1282176368: goto L_0x02ea;
                case -1235140472: goto L_0x02de;
                case -1235140471: goto L_0x02d2;
                case -1235140468: goto L_0x02c6;
                case -1235140467: goto L_0x02ba;
                case -1119332198: goto L_0x02ae;
                case -1063384694: goto L_0x02a2;
                case -1063384689: goto L_0x0296;
                case -1063384687: goto L_0x028a;
                case -1063384685: goto L_0x027e;
                case -1035626052: goto L_0x0272;
                case -1035596261: goto L_0x0266;
                case -948847040: goto L_0x025b;
                case -948847038: goto L_0x024f;
                case -888668266: goto L_0x0243;
                case -888668265: goto L_0x0237;
                case -888668264: goto L_0x022b;
                case -850921852: goto L_0x021f;
                case -845289556: goto L_0x0213;
                case -845289555: goto L_0x0207;
                case -845289553: goto L_0x01fb;
                case -845289551: goto L_0x01ef;
                case -845289508: goto L_0x01e3;
                case -458141175: goto L_0x01d7;
                case -458141174: goto L_0x01cb;
                case -458141173: goto L_0x01bf;
                case -458141172: goto L_0x01b3;
                case -449944730: goto L_0x01a7;
                case -449944729: goto L_0x019b;
                case -449944728: goto L_0x018f;
                case -449944727: goto L_0x0183;
                case -449944726: goto L_0x0177;
                case -449944724: goto L_0x016b;
                case -449944723: goto L_0x015f;
                case -449944722: goto L_0x0153;
                case -448603205: goto L_0x0148;
                case -448603204: goto L_0x013d;
                case -448603202: goto L_0x0132;
                case -448603201: goto L_0x0127;
                case -448603157: goto L_0x011c;
                case -448603156: goto L_0x0111;
                case -443031172: goto L_0x0105;
                case -190173936: goto L_0x00f9;
                case 674030242: goto L_0x00ed;
                case 922669543: goto L_0x00e1;
                case 922669544: goto L_0x00d5;
                case 922669545: goto L_0x00c9;
                case 922669546: goto L_0x00bd;
                case 922669547: goto L_0x00b1;
                case 922669548: goto L_0x00a5;
                case 922669549: goto L_0x0099;
                case 922669550: goto L_0x008d;
                case 922669551: goto L_0x0081;
                case 1201756974: goto L_0x0075;
                case 1201757021: goto L_0x0069;
                case 1201766335: goto L_0x005d;
                case 1201766336: goto L_0x0051;
                case 1623724661: goto L_0x0045;
                case 1623724662: goto L_0x0039;
                case 1623724663: goto L_0x002d;
                case 2102612488: goto L_0x0021;
                case 2102612489: goto L_0x0015;
                case 2146130361: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0490
        L_0x0009:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 19
            goto L_0x0491
        L_0x0015:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 21
            goto L_0x0491
        L_0x0021:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 20
            goto L_0x0491
        L_0x002d:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 84
            goto L_0x0491
        L_0x0039:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 83
            goto L_0x0491
        L_0x0045:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 82
            goto L_0x0491
        L_0x0051:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 28
            goto L_0x0491
        L_0x005d:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 27
            goto L_0x0491
        L_0x0069:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 18
            goto L_0x0491
        L_0x0075:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 17
            goto L_0x0491
        L_0x0081:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 66
            goto L_0x0491
        L_0x008d:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 65
            goto L_0x0491
        L_0x0099:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 64
            goto L_0x0491
        L_0x00a5:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 63
            goto L_0x0491
        L_0x00b1:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 59
            goto L_0x0491
        L_0x00bd:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 86
            goto L_0x0491
        L_0x00c9:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 55
            goto L_0x0491
        L_0x00d5:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 81
            goto L_0x0491
        L_0x00e1:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 54
            goto L_0x0491
        L_0x00ed:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 29
            goto L_0x0491
        L_0x00f9:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 95
            goto L_0x0491
        L_0x0105:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 22
            goto L_0x0491
        L_0x0111:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 5
            goto L_0x0491
        L_0x011c:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 4
            goto L_0x0491
        L_0x0127:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 3
            goto L_0x0491
        L_0x0132:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 2
            goto L_0x0491
        L_0x013d:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 1
            goto L_0x0491
        L_0x0148:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 0
            goto L_0x0491
        L_0x0153:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 47
            goto L_0x0491
        L_0x015f:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 46
            goto L_0x0491
        L_0x016b:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 45
            goto L_0x0491
        L_0x0177:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 52
            goto L_0x0491
        L_0x0183:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 44
            goto L_0x0491
        L_0x018f:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 51
            goto L_0x0491
        L_0x019b:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 50
            goto L_0x0491
        L_0x01a7:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 43
            goto L_0x0491
        L_0x01b3:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 91
            goto L_0x0491
        L_0x01bf:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 90
            goto L_0x0491
        L_0x01cb:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 89
            goto L_0x0491
        L_0x01d7:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 79
            goto L_0x0491
        L_0x01e3:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 42
            goto L_0x0491
        L_0x01ef:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 41
            goto L_0x0491
        L_0x01fb:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 35
            goto L_0x0491
        L_0x0207:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 40
            goto L_0x0491
        L_0x0213:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 39
            goto L_0x0491
        L_0x021f:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 26
            goto L_0x0491
        L_0x022b:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 38
            goto L_0x0491
        L_0x0237:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 37
            goto L_0x0491
        L_0x0243:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 36
            goto L_0x0491
        L_0x024f:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 34
            goto L_0x0491
        L_0x025b:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 6
            goto L_0x0491
        L_0x0266:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 25
            goto L_0x0491
        L_0x0272:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 24
            goto L_0x0491
        L_0x027e:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 85
            goto L_0x0491
        L_0x028a:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 53
            goto L_0x0491
        L_0x0296:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 49
            goto L_0x0491
        L_0x02a2:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 48
            goto L_0x0491
        L_0x02ae:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 93
            goto L_0x0491
        L_0x02ba:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 33
            goto L_0x0491
        L_0x02c6:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 32
            goto L_0x0491
        L_0x02d2:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 31
            goto L_0x0491
        L_0x02de:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 30
            goto L_0x0491
        L_0x02ea:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 23
            goto L_0x0491
        L_0x02f6:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 12
            goto L_0x0491
        L_0x0302:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 11
            goto L_0x0491
        L_0x030e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 9
            goto L_0x0491
        L_0x031a:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 16
            goto L_0x0491
        L_0x0326:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 14
            goto L_0x0491
        L_0x0332:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 8
            goto L_0x0491
        L_0x033e:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 15
            goto L_0x0491
        L_0x034a:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 10
            goto L_0x0491
        L_0x0356:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 13
            goto L_0x0491
        L_0x0362:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 7
            goto L_0x0491
        L_0x036d:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 78
            goto L_0x0491
        L_0x0379:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 77
            goto L_0x0491
        L_0x0385:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 58
            goto L_0x0491
        L_0x0391:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 76
            goto L_0x0491
        L_0x039d:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 80
            goto L_0x0491
        L_0x03a9:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 75
            goto L_0x0491
        L_0x03b5:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 74
            goto L_0x0491
        L_0x03c1:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 97
            goto L_0x0491
        L_0x03cd:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 73
            goto L_0x0491
        L_0x03d9:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 62
            goto L_0x0491
        L_0x03e5:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 61
            goto L_0x0491
        L_0x03f1:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 60
            goto L_0x0491
        L_0x03fd:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 88
            goto L_0x0491
        L_0x0409:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 87
            goto L_0x0491
        L_0x0415:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 72
            goto L_0x0491
        L_0x0421:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 57
            goto L_0x0491
        L_0x042d:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 56
            goto L_0x0491
        L_0x0438:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 71
            goto L_0x0491
        L_0x0443:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 70
            goto L_0x0491
        L_0x044e:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 69
            goto L_0x0491
        L_0x0459:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 68
            goto L_0x0491
        L_0x0464:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 67
            goto L_0x0491
        L_0x046f:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 92
            goto L_0x0491
        L_0x047a:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 96
            goto L_0x0491
        L_0x0485:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0490
            r0 = 94
            goto L_0x0491
        L_0x0490:
            r0 = -1
        L_0x0491:
            switch(r0) {
                case 0: goto L_0x0592;
                case 1: goto L_0x0592;
                case 2: goto L_0x058c;
                case 3: goto L_0x058c;
                case 4: goto L_0x0586;
                case 5: goto L_0x0586;
                case 6: goto L_0x0580;
                case 7: goto L_0x057a;
                case 8: goto L_0x057a;
                case 9: goto L_0x057a;
                case 10: goto L_0x0574;
                case 11: goto L_0x056e;
                case 12: goto L_0x056e;
                case 13: goto L_0x0568;
                case 14: goto L_0x0568;
                case 15: goto L_0x0562;
                case 16: goto L_0x0562;
                case 17: goto L_0x055c;
                case 18: goto L_0x0556;
                case 19: goto L_0x0550;
                case 20: goto L_0x0550;
                case 21: goto L_0x0550;
                case 22: goto L_0x0550;
                case 23: goto L_0x0550;
                case 24: goto L_0x0550;
                case 25: goto L_0x0550;
                case 26: goto L_0x0550;
                case 27: goto L_0x0550;
                case 28: goto L_0x0550;
                case 29: goto L_0x0550;
                case 30: goto L_0x0550;
                case 31: goto L_0x0550;
                case 32: goto L_0x0550;
                case 33: goto L_0x0550;
                case 34: goto L_0x054a;
                case 35: goto L_0x0544;
                case 36: goto L_0x053e;
                case 37: goto L_0x053e;
                case 38: goto L_0x053e;
                case 39: goto L_0x0538;
                case 40: goto L_0x0532;
                case 41: goto L_0x052c;
                case 42: goto L_0x052c;
                case 43: goto L_0x0526;
                case 44: goto L_0x0526;
                case 45: goto L_0x0520;
                case 46: goto L_0x0520;
                case 47: goto L_0x051a;
                case 48: goto L_0x0514;
                case 49: goto L_0x050e;
                case 50: goto L_0x0508;
                case 51: goto L_0x0502;
                case 52: goto L_0x0502;
                case 53: goto L_0x0502;
                case 54: goto L_0x04fc;
                case 55: goto L_0x04fc;
                case 56: goto L_0x04fc;
                case 57: goto L_0x04fc;
                case 58: goto L_0x04fc;
                case 59: goto L_0x04f6;
                case 60: goto L_0x04f6;
                case 61: goto L_0x04f6;
                case 62: goto L_0x04f6;
                case 63: goto L_0x04f0;
                case 64: goto L_0x04f0;
                case 65: goto L_0x04f0;
                case 66: goto L_0x04f0;
                case 67: goto L_0x04f0;
                case 68: goto L_0x04f0;
                case 69: goto L_0x04f0;
                case 70: goto L_0x04f0;
                case 71: goto L_0x04f0;
                case 72: goto L_0x04f0;
                case 73: goto L_0x04f0;
                case 74: goto L_0x04f0;
                case 75: goto L_0x04f0;
                case 76: goto L_0x04f0;
                case 77: goto L_0x04f0;
                case 78: goto L_0x04f0;
                case 79: goto L_0x04f0;
                case 80: goto L_0x04ea;
                case 81: goto L_0x04e4;
                case 82: goto L_0x04de;
                case 83: goto L_0x04d8;
                case 84: goto L_0x04d2;
                case 85: goto L_0x04d2;
                case 86: goto L_0x04cc;
                case 87: goto L_0x04c6;
                case 88: goto L_0x04c6;
                case 89: goto L_0x04c0;
                case 90: goto L_0x04c0;
                case 91: goto L_0x04ba;
                case 92: goto L_0x04b4;
                case 93: goto L_0x04ae;
                case 94: goto L_0x04a8;
                case 95: goto L_0x04a2;
                case 96: goto L_0x049c;
                case 97: goto L_0x0496;
                default: goto L_0x0494;
            }
        L_0x0494:
            r1 = 0
            return r1
        L_0x0496:
            com.yeelight.yeelib.c.m.b1 r0 = new com.yeelight.yeelib.c.m.b1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x049c:
            com.yeelight.yeelib.c.m.j1 r0 = new com.yeelight.yeelib.c.m.j1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04a2:
            com.yeelight.yeelib.c.m.o0 r0 = new com.yeelight.yeelib.c.m.o0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04a8:
            com.yeelight.yeelib.c.m.a r0 = new com.yeelight.yeelib.c.m.a
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04ae:
            com.yeelight.yeelib.c.m.d1 r0 = new com.yeelight.yeelib.c.m.d1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04b4:
            com.yeelight.yeelib.c.m.g r0 = new com.yeelight.yeelib.c.m.g
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04ba:
            com.yeelight.yeelib.c.m.n r0 = new com.yeelight.yeelib.c.m.n
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04c0:
            com.yeelight.yeelib.c.m.p r0 = new com.yeelight.yeelib.c.m.p
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04c6:
            com.yeelight.yeelib.c.m.h r0 = new com.yeelight.yeelib.c.m.h
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04cc:
            com.yeelight.yeelib.c.m.k r0 = new com.yeelight.yeelib.c.m.k
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04d2:
            com.yeelight.yeelib.c.m.e r0 = new com.yeelight.yeelib.c.m.e
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04d8:
            com.yeelight.yeelib.c.m.d r0 = new com.yeelight.yeelib.c.m.d
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04de:
            com.yeelight.yeelib.c.m.f r0 = new com.yeelight.yeelib.c.m.f
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04e4:
            com.yeelight.yeelib.c.m.j r1 = new com.yeelight.yeelib.c.m.j
            r1.<init>(r2, r3, r4)
            return r1
        L_0x04ea:
            com.yeelight.yeelib.c.m.i r0 = new com.yeelight.yeelib.c.m.i
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04f0:
            com.yeelight.yeelib.c.m.m r0 = new com.yeelight.yeelib.c.m.m
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04f6:
            com.yeelight.yeelib.c.m.l r0 = new com.yeelight.yeelib.c.m.l
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x04fc:
            com.yeelight.yeelib.c.m.o r0 = new com.yeelight.yeelib.c.m.o
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0502:
            com.yeelight.yeelib.c.m.y0 r0 = new com.yeelight.yeelib.c.m.y0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0508:
            com.yeelight.yeelib.c.m.z r0 = new com.yeelight.yeelib.c.m.z
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x050e:
            com.yeelight.yeelib.c.m.g0 r0 = new com.yeelight.yeelib.c.m.g0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0514:
            com.yeelight.yeelib.c.m.f0 r0 = new com.yeelight.yeelib.c.m.f0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x051a:
            com.yeelight.yeelib.c.m.i0 r0 = new com.yeelight.yeelib.c.m.i0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0520:
            com.yeelight.yeelib.c.m.h0 r0 = new com.yeelight.yeelib.c.m.h0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0526:
            com.yeelight.yeelib.c.m.j0 r0 = new com.yeelight.yeelib.c.m.j0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x052c:
            com.yeelight.yeelib.c.m.g1 r0 = new com.yeelight.yeelib.c.m.g1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0532:
            com.yeelight.yeelib.c.m.f1 r0 = new com.yeelight.yeelib.c.m.f1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0538:
            com.yeelight.yeelib.c.m.h1 r0 = new com.yeelight.yeelib.c.m.h1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x053e:
            com.yeelight.yeelib.c.m.k1 r0 = new com.yeelight.yeelib.c.m.k1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0544:
            com.yeelight.yeelib.c.m.i1 r0 = new com.yeelight.yeelib.c.m.i1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x054a:
            com.yeelight.yeelib.c.m.a1 r0 = new com.yeelight.yeelib.c.m.a1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0550:
            com.yeelight.yeelib.c.m.e1 r0 = new com.yeelight.yeelib.c.m.e1
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0556:
            com.yeelight.yeelib.c.m.x r0 = new com.yeelight.yeelib.c.m.x
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x055c:
            com.yeelight.yeelib.c.m.w r0 = new com.yeelight.yeelib.c.m.w
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0562:
            com.yeelight.yeelib.c.m.t r0 = new com.yeelight.yeelib.c.m.t
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0568:
            com.yeelight.yeelib.c.m.r r0 = new com.yeelight.yeelib.c.m.r
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x056e:
            com.yeelight.yeelib.c.m.v r0 = new com.yeelight.yeelib.c.m.v
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0574:
            com.yeelight.yeelib.c.m.s r0 = new com.yeelight.yeelib.c.m.s
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x057a:
            com.yeelight.yeelib.c.m.u r0 = new com.yeelight.yeelib.c.m.u
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0580:
            com.yeelight.yeelib.c.m.z0 r0 = new com.yeelight.yeelib.c.m.z0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0586:
            com.yeelight.yeelib.c.m.x0 r0 = new com.yeelight.yeelib.c.m.x0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x058c:
            com.yeelight.yeelib.c.m.v0 r0 = new com.yeelight.yeelib.c.m.v0
            r0.<init>(r2, r3, r1, r4)
            return r0
        L_0x0592:
            com.yeelight.yeelib.c.m.w0 r0 = new com.yeelight.yeelib.c.m.w0
            r0.<init>(r2, r3, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C5979b.m17535b(java.lang.String, java.lang.String, java.lang.String, com.miot.common.device.Device$Ownership):com.yeelight.yeelib.c.i.d");
    }
}
