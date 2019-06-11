/**
 * Copyright (C), 2015-2019, 重庆了赢科技有限公司
 * FileName: AppConfig
 * Author:   萧毅
 * Date:     2019/6/11 15:27
 * Description:
 */
package com.snow.i18n.config;

import com.snow.i18n.service.I18nService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


import java.util.Locale;

@Configuration
public class AppConfig  {


    @Bean
    public I18nService i18nService() {
        return new I18nService(messageSource());
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        Locale.setDefault(Locale.CHINESE);
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("i18n/messages");// name of the resource bundle
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        return source;
    }

}