package com.miot.service.common.task;

public interface IProcessor<T> {
    MiotError process(T t);
}
