package com.wei;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Controller
public class FlowApplication {
    private static final Logger log = LoggerFactory.getLogger(FlowApplication.class);

    private static final String ENV_KEY = "env";
    private static final String PROFILE_KEY = "profile";

    @Value("${ruoyi.name:}")
    private String appName;
    @Value("${spring.profiles.active:}")
    private String env;
    @Value("${server.port:}")
    private Integer port;


    public static void main(String[] args) {
        initEnvironment(args);
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(FlowApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  AGS工作流启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }

    /**
     * args[0]:环境标识(dev/qa/prd)
     * args[1]:profile
     */
    private static void initEnvironment(String... args) {
        if (args == null || args.length <= 0) {
            return;
        }

        String env = args[0].trim();
        System.setProperty(ENV_KEY, env);

        String profile = null;
        if (args.length >= 2) {
            profile = args[1].trim();
            System.setProperty(PROFILE_KEY, profile);
        }
        log.info("env: {}, profile: {}", env, profile);
    }

    @RequestMapping(value = "/", method = GET)
    @ResponseBody
    public Map<String, Object> index() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("appName", appName);
        map.put("env", env);
        map.put("port", port);
        return map;
    }
}
