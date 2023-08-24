package ru.alexandr.sb_hw_1_1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alexandr.sb_hw_1_1.DevProfile;
import ru.alexandr.sb_hw_1_1.ProductionProfile;
import ru.alexandr.sb_hw_1_1.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean()
    @ConditionalOnProperty(prefix = "ru.alexandr.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean()
    @ConditionalOnProperty(prefix = "ru.alexandr.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
