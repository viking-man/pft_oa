package common.error;

import javax.enterprise.inject.Model;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/14-14:03
 */
public class BasicException extends Exception {

    public BasicException(String message) {
        super(message);
    }
}
