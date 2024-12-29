package com.miot.service.common.task;

import com.miot.common.people.People;

public class HeadProcessor implements IProcessor<People> {
    public MiotError process(People people) {
        return people == null ? MiotError.ACCOUNT_NOT_LOGIN : MiotError.f4701OK;
    }
}
