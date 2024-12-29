package com.miot.common.people;

import java.util.Objects;

public class PeopleFactory {
    public static People createOauthPeople(String str, String str2, long j, String str3, String str4) {
        Objects.requireNonNull(str, "accessToken is null");
        Objects.requireNonNull(str2, "userId is null");
        People people = new People(str, str2);
        people.setOauth(true);
        people.setExpiresIn(Long.valueOf(j));
        people.setMacKey(str3);
        people.setMacAlgorithm(str4);
        return people;
    }

    public static People createOauthPeople(String str, String str2, String str3, long j, String str4, String str5) {
        People createOauthPeople = createOauthPeople(str, str3, j, str4, str5);
        createOauthPeople.setRefreshToken(str2);
        return createOauthPeople;
    }

    public static People createPeople(String str, String str2, String str3, long j) {
        Objects.requireNonNull(str, "accessToken is null");
        Objects.requireNonNull(str2, "userId is null");
        People people = new People(str, str2);
        people.setOauth(false);
        people.setServiceSecurity(str3);
        people.setTimeDiff(Long.valueOf(j));
        return people;
    }
}
