package context;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-15:02
 */
public class WeixinContextHolder {

    private static final ConcurrentMap<String, WeixinContext> tokenMap = new ConcurrentHashMap<String, WeixinContext>();

    public static void addToken(String key, WeixinContext context) {
        tokenMap.put(key, context);
    }

    public static WeixinContext getToken(String key) {
        return tokenMap.get(key);
    }
}
