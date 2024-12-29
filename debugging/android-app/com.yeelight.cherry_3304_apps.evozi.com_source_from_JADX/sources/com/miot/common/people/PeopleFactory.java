package com.miot.common.people;

public class PeopleFactory {
    public static People createOauthPeople(String str, String str2, long j, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("accessToken is null");
        } else if (str2 != null) {
            People people = new People(str, str2);
            people.setOauth(true);
            people.setExpiresIn(Long.valueOf(j));
            people.setMacKey(str3);
            people.setMacAlgorithm(str4);
            return people;
        } else {
            throw new NullPointerException("userId is null");
        }
    }

    public static People createOauthPeople(String str, String str2, String str3, long j, String str4, String str5) {
        People createOauthPeople = createOauthPeople(str, str3, j, str4, str5);
        createOauthPeople.setRefreshToken(str2);
        return createOauthPeople;
    }

    public static People createPeople(String str, String str2, String str3, long j) {
        if (str == null) {
            throw new NullPointerException("accessToken is null");
        } else if (str2 != null) {
            People people = new People(str, str2);
            people.setOauth(false);
            people.setServiceSecurity(str3);
            people.setTimeDiff(Long.valueOf(j));
            return people;
        } else {
            throw new NullPointerException("userId is null");
        }
    }
}
