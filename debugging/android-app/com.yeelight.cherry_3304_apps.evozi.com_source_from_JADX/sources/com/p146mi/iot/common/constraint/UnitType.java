package com.p146mi.iot.common.constraint;

/* renamed from: com.mi.iot.common.constraint.UnitType */
public enum UnitType {
    UNDEFINED("undefined"),
    PERCENTAGE("percentage"),
    CELSIUS("celsius"),
    LUX("lux"),
    UNITLESS("unitless"),
    SECONDS("seconds"),
    ARC_DEGREES("arcdegrees");
    
    private String string;

    private UnitType(String str) {
        this.string = str;
    }

    public static UnitType retrieveType(String str) {
        for (UnitType unitType : values()) {
            if (unitType.toString().equals(str)) {
                return unitType;
            }
        }
        return UNDEFINED;
    }

    public String toString() {
        return this.string;
    }
}
