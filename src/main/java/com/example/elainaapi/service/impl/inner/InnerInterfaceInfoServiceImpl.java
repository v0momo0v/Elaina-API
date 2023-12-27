package com.example.elainaapi.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elainaapi.common.ErrorCode;
import com.example.elainaapi.exception.BusinessException;
import com.example.elainaapi.mapper.InterfaceInfoMapper;
import com.example.elainaapicommon.model.entity.InterfaceInfo;
import com.example.elainaapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author 86158
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-12-10 23:02:24
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(Long id) {
        if(id==null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}




