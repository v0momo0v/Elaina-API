package com.example.elainaapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elainaapi.common.ErrorCode;
import com.example.elainaapi.exception.BusinessException;
import com.example.elainaapi.mapper.UserInterfaceInfoMapper;
import com.example.elainaapi.service.UserInterfaceInfoService;
import com.example.elainaapicommon.model.entity.UserInterfaceInfo;
import org.springframework.stereotype.Service;

/**
* @author 86158
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2023-12-15 00:10:47
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if(add&&(userInterfaceInfo.getInterfaceInfoId()<0||userInterfaceInfo.getUserId()<0)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"接口或用户不存在");
        }
        if(userInterfaceInfo.getLeftNum()<0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"剩余次数不能小于0");
        }
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        if(interfaceInfoId<=0||userId<=0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.setSql("leftNum=leftNum-1,totalNum=totalNum+1");
        updateWrapper.eq("interfaceInfoId",interfaceInfoId);
        updateWrapper.eq("userId",userId);
        return this.update(updateWrapper);
    }
}




