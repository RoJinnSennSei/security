package org.yangyuan.security.core;

/**
 * 本地用户名、密码模式令牌实现
 * @author yangyuan
 * @date 2017年4月26日
 */
public class UsernamePasswordToken extends JdbcToken {
    /**
     * 密码
     */
    private final String passwrod;
    
    /**
     * remember固定为true的构造方法
     * @param username 用户名
     * @param passwrod 密码
     */
    public UsernamePasswordToken(String username, String passwrod){
        super(username, true);
        this.passwrod = passwrod;
    }
    
    /**
     * 自定义remember的构造方法
     * @param username 用户名
     * @param passwrod 密码
     * @param remember 记住我
     */
    public UsernamePasswordToken(String username, String passwrod, boolean remember){
        super(username, remember);
        this.passwrod = passwrod;
    }
    
    public String getPasswrod() {
        return passwrod;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(128);
        
        builder.append(super.toString());
        
        builder.append("[passwrod](");
        builder.append(getPasswrod());
        builder.append(")\n");
        
        return new String(builder);
    }
    
}
