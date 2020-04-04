package com.github.yiuman.citrus.security.authenticate;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * 身份验证接口
 *
 * @author yiuman
 * @date 2020/3/27
 */
public interface AuthenticateService {

    /**
     * 通过登录模式对应的对象进行认证
     *
     * @param authenticateModeObject 登录模式对应的对象 如：password模式对应LoginEntity;
     * @return 认证对象
     * @throws AuthenticationException 认证异常
     */
    Authentication authenticate(Object authenticateModeObject) throws AuthenticationException;

    /**
     * 解析当前请求的用户信息
     *
     * @param token 令牌
     * @param identity identity身份标识
     */
    Optional<Authentication> resolve(String token ,String identity);


    /**
     * 登出
     *
     * @param authentication 身份认证信息
     */
    void logout(Authentication authentication);

    /**
     * 支持的认证模式，与请求的参数mode对应，表示支持的授权模式
     */
    String supportMode();


    Class<?> supportEntityType();

}