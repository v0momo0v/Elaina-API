package com.example.elainaapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elainaapi.common.ErrorCode;
import com.example.elainaapi.exception.BusinessException;
import com.example.elainaapi.service.InterfaceInfoService;
import com.example.elainaapi.mapper.InterfaceInfoMapper;
import com.example.elainaapicommon.model.entity.InterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 86158
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-12-10 23:02:24
*/
@Service
@Slf4j
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        if(add&&StringUtils.isAnyBlank(name)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if(StringUtils.isNotBlank(name)&&name.length()>50){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"名称过长");
        }
    }
}




