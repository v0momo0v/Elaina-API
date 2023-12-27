package com.example.elainaapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elainaapicommon.model.entity.UserInterfaceInfo;

public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);
    boolean invokeCount(long interfaceInfoId, long userId);
}
