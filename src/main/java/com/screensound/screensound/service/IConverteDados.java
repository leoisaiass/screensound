package com.screensound.screensound.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
