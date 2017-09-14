package context;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-15:02
 */
public class WeixinBindContextHolder {

    private static final ConcurrentMap<String, WeixinBindContext> tokenMap = new ConcurrentHashMap<String, WeixinBindContext>();

    public static void addToken(String key, WeixinBindContext context) {
        tokenMap.put(key, context);
    }

    public static WeixinBindContext getToken(String key) {
        return tokenMap.get(key);
    }
}
