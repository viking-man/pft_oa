package util;

import java.util.UUID;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-12:12
 */
public abstract class UuidUtil {
    /**
     * 获取新的32位不重复MsgId,采用uuid算法<br>
     * 格式如：ad36fb37599f4f879042e49eae73f25a
     *
     * @return 32位不重复MsgId
     */
    public static String getNewMsgId() {
        String s = UUID.randomUUID().toString();
        // 去掉“-”符号
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
                + s.substring(19, 23) + s.substring(24);
    }
}
