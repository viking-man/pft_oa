package context;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-15:02
 */
public class LoginTokenContextHolder {

    private static final ConcurrentMap<String, LoginTokenContext> tokenMap = new ConcurrentHashMap<String, LoginTokenContext>();

    public static void addToken(String key, LoginTokenContext context) {
        tokenMap.put(key, context);
    }

    public static LoginTokenContext getToken(String key) {
        return tokenMap.get(key);
    }

    public static void clear() {
        tokenMap.clear();
    }
}
