package com.nk.springboot.service.impl;

import com.nk.springboot.entity.CltLoginLog;
import com.nk.springboot.mapper.CltLoginLogMapper;
import com.nk.springboot.service.ICltLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登陆日志 服务实现类
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Service
public class CltLoginLogServiceImpl extends ServiceImpl<CltLoginLogMapper, CltLoginLog> implements ICltLoginLogService {

}
