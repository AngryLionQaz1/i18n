package com.snow.i18n.util;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class LocaleUtils {

    private LocaleUtils() {
    }

    public static Locale getCurrentLocale() {
        Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale.getDisplayLanguage());
        return locale;
    }
}
