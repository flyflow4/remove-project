package com.example.hoyo_project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration("commonSettingsConfig")
@PropertySources({
        @PropertySource("classpath:config/hoyo.html.settings.xml")
})
@ComponentScan("com.example")
public class CommonSettingsConfig {
}
