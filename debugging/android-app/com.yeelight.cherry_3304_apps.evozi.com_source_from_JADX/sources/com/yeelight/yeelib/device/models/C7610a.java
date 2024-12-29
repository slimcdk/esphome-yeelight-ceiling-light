package com.yeelight.yeelib.device.models;

import com.telink.bluetooth.light.C3967a;

/* renamed from: com.yeelight.yeelib.device.models.a */
public enum C7610a {
    ONOFF("4340"),
    COLOR("4341"),
    BRIGHTNESS("4342"),
    COLORTEMPERATURE("4343"),
    INQIRY("4344"),
    STATUSNOTIFITATION("4345"),
    SETALARM("4346"),
    READALARM("4347"),
    DELETEALAARM("4348"),
    ALARMNOTIFICATION("4349"),
    COLORLFOW("434A"),
    COLORTIMERANDLIGHTNESS("434B"),
    READCOLORLFOW("434C"),
    COLORFLOWNOTIFICATION("434d"),
    SCENEMODE("434e"),
    READSCENEMODE("434f"),
    SCENENOTIFICATION("4350"),
    LIGHTNAME("4351"),
    READLIGHTNAME("4352"),
    LIGHTNAMENOTIFICATION("4353"),
    ENABLEBEACON("4354"),
    ADDBEACON("4355"),
    DELETEBEACON("4356"),
    READALLBEACON("4364"),
    ALLBEACONNOTIFICATION("4365"),
    READSINGLEBEACON("4357"),
    SINGLEBEACONNOTIFICATION("4358"),
    SETGRADUAL("4359"),
    READGRADUAL("435a"),
    GRADUALNOTIFICATION("435b"),
    READVERSION("435c"),
    VERSIONNOTIFICATION("435d"),
    READSERIALNUMBER("435e"),
    SERIALNUMBER("435f"),
    SETLAMPTIME("4360"),
    READLAMPTIME("4361"),
    LAMPTIMERNOTIFICATION("4362"),
    AUTHORIZATIONNOTIFICATION("4363"),
    SETNIGHTLIGHT("436f"),
    READNIGHTLIGHT("4370"),
    NIGHTLIGHTNOTIFICATION("4371"),
    DELETEAUTHORIZE("4372"),
    DELETESCENE("4373"),
    READFIRSTSTARTUP("4377"),
    READFIRSTSTARTUPNOTIFICATION("4378"),
    RESET("4374"),
    SETDELAYTIME("437f"),
    READDELAYTIME("4380"),
    DELAYTIMENOTIFICATION("4381"),
    SIMPLECOLORFLOW("437c"),
    COMMANDRESPONSE("4382"),
    WAKEUPSET("4388"),
    WAKEUPREAD("4389"),
    WAKEUPNOTIFICAION("438a"),
    WAKEUPDELETE("438b"),
    READRECORDS("438c"),
    RECORDSNOTIFICATION1("438d"),
    RECORDSNOTIFICATION2("438e"),
    RECORDSNOTIFICATION3("438f"),
    RECORDSNOTIFICATION4("4390"),
    RECORDSNOTIFICATION5("4391"),
    READGINGKOBATTERY("43a0"),
    BATTERYNOTIFICATION("43a1"),
    GINGKOEXITFACTORY("43a2"),
    GINGKOQUERYFACTORY("43a3"),
    FACTORYNOTIFICATION("43a4"),
    BEACON_COMMAND_ADD_SUCCESS("ff00"),
    BEACON_COMMAND_READ_END("ef00"),
    BEACON_COMMAND_STATUS_ON("ae01"),
    BEACON_COMMAND_STATUS_OFF("ae00"),
    SWITCH_OAD("4366"),
    REQUEST_OTA("8001"),
    REQUEST_OTA_RESP("8101"),
    SYNC_ID("8002"),
    SYNC_ID_RESP("8102"),
    CHECK_CRC("8004"),
    CHECK_CRC_RESP("8104"),
    WRITE_FLASH("8005"),
    WRITE_FLASH_RESP("8105"),
    FINISH_OTA("8007"),
    FINISH_OTA_RESP("8107"),
    TELINK_STATUS_NOTIFICATION(C3967a.BLE_GATT_OP_CTRL_DB.name()),
    UNKNOWN("0000");
    

    /* renamed from: a */
    public String f15566a;

    private C7610a(String str) {
        this.f15566a = "";
        this.f15566a = str;
    }

    /* renamed from: a */
    public static C7610a m22469a(String str) {
        for (C7610a aVar : values()) {
            if (aVar.f15566a.equals(str)) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    /* renamed from: b */
    public static String m22470b(String str) {
        for (C7610a aVar : values()) {
            if (aVar.f15566a.equals(str)) {
                return aVar.name();
            }
        }
        return "UNKNOWN_MESSAGE";
    }
}
