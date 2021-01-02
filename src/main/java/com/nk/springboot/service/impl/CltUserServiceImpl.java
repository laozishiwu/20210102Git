package com.nk.springboot.service.impl;

import com.nk.springboot.entity.CltUser;
import com.nk.springboot.mapper.CltUserMapper;
import com.nk.springboot.service.ICltUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Service
public class CltUserServiceImpl extends ServiceImpl<CltUserMapper, CltUser> implements ICltUserService {

}
