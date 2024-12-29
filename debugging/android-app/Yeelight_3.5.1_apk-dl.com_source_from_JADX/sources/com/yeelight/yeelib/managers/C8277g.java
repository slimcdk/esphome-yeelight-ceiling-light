package com.yeelight.yeelib.managers;

import com.yeelight.yeelib.device.DeviceType;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.yeelight.yeelib.managers.g */
class C8277g {
    /* renamed from: a */
    public static DeviceType m19534a(String str) {
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
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 17;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
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
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = '*';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = '+';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = ',';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = '0';
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '1';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '2';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '3';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '4';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '5';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '6';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '7';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = '8';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = '9';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = ':';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = ';';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '<';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '=';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '>';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = '?';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = '@';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'B';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'C';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'D';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'J';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'K';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
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
            case -190173984:
                if (str.equals("yeelink.gateway.v1")) {
                    c = 'R';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = 'S';
                    break;
                }
                break;
            case 174464231:
                if (str.equals("virtual.yeelink.light.ceiling")) {
                    c = 'T';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'U';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '[';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = ']';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = '^';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = '_';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = '`';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = 'a';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 'b';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'c';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'd';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'e';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'f';
                    break;
                }
                break;
            case 2086270815:
                if (str.equals("virtual.yeelink.light.mijia.ceiling")) {
                    c = 'g';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'h';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'i';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'j';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 31:
            case ' ':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '+':
            case ',':
            case '/':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'E':
            case 'G':
            case 'I':
            case 'J':
            case 'K':
            case 'M':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
                return DeviceType.MI_WIFI_BLE;
            case 17:
                return DeviceType.YEELIGHT_BLE;
            case 26:
            case 27:
            case 28:
            case 30:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '-':
            case '.':
            case '9':
            case ':':
            case 'D':
            case 'F':
            case 'H':
            case 'L':
            case 'O':
            case 'P':
            case '_':
            case '`':
            case 'a':
                return DeviceType.MI_WIFI;
            case '%':
            case '0':
            case '1':
            case '8':
            case 'Q':
            case 'b':
            case 'c':
            case 'h':
            case 'i':
            case 'j':
                return DeviceType.MI_BLE_MESH;
            case '*':
                return DeviceType.YEELIGHT_BLE_MESH;
            default:
                return DeviceType.UNKNOWN;
        }
    }
}
