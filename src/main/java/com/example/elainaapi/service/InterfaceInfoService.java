package com.example.elainaapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elainaapicommon.model.entity.InterfaceInfo;

/**
* @author 86158
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-12-10 23:02:24
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
