package com.example.elainaapi;

import com.example.elainaapi.service.UserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ElainaApiApplicationTests {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    void contextLoads() {
        boolean b = userInterfaceInfoService.invokeCount(1, 1);
        Assertions.assertTrue(b);
    }

}
