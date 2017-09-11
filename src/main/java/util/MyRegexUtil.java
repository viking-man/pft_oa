package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-9:57
 */
public abstract class MyRegexUtil {

    /**
     * 使用正在表达式模型对表达式进行批评
     *
     * @param pattern 表达式模型
     * @param value   表达式
     * @return 成功 true,失败 false
     */
    public static boolean patternMatch(String pattern, String value) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(value);
        return matcher.matches();
    }
}
