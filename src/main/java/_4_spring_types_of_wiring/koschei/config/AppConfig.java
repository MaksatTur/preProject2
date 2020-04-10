package _4_spring_types_of_wiring.koschei.config;

import _4_spring_types_of_wiring.koschei.models.Egg6;
import _4_spring_types_of_wiring.koschei.models.Island2;
import _4_spring_types_of_wiring.koschei.models.Needle7;
import _4_spring_types_of_wiring.koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "_4_spring_types_of_wiring.koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }
}
