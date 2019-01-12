package org.yjq.aigou.service.impl;

import org.yjq.aigou.domain.User;
import org.yjq.aigou.mapper.UserMapper;
import org.yjq.aigou.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yjqtest
 * @since 2019-01-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
