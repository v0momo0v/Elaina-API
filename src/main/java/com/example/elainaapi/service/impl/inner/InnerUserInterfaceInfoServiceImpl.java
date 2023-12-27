package com.example.elainaapi.service.impl.inner;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elainaapi.mapper.UserInterfaceInfoMapper;
import com.example.elainaapi.service.UserInterfaceInfoService;
import com.example.elainaapicommon.model.entity.UserInterfaceInfo;
import com.example.elainaapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author 86158
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2023-12-15 00:10:47
*/
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}




