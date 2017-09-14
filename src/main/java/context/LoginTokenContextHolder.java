package context;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-15:02
 */
public class LoginTokenContextHolder {

    private static final Map<String, LoginTokenContext> tokenMap = new HashMap<String, LoginTokenContext>();

    public static void addToken(String key, LoginTokenContext context) {
        tokenMap.put(key, context);
    }

    public static LoginTokenContext getToken(String key) {
        return tokenMap.get(key);
    }
}
