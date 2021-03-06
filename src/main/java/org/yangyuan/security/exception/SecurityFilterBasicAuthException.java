package org.yangyuan.security.exception;

import org.yangyuan.security.exception.common.FilterException;

/**
 * http basic authentication认证失败异常
 * @author yangyuan
 * @date 2018年4月12日
 */
public class SecurityFilterBasicAuthException extends FilterException{
    private static final long serialVersionUID = 8393729605818992366L;
    
    public SecurityFilterBasicAuthException() {
        super();
    }

    public SecurityFilterBasicAuthException(String s) {
        super(s);
    }

    public SecurityFilterBasicAuthException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public SecurityFilterBasicAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityFilterBasicAuthException(Throwable cause) {
        super(cause);
    }
    
}
