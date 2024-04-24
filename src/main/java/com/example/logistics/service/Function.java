package com.example.logistics.service;

public interface Function<T, E> {

    T callback(E e);

}