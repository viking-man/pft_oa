package weixin;

import com.alibaba.fastjson.JSON;
import param.GlobleConstant;
import param.HttpConst;
import util.HttpsUtil;
import weixin.entity.AccessTokenEntity;
import weixin.entity.UseridEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:54
 */
public class WXTokenUtil {

    public static AccessTokenEntity getAccesstoken(String corpid, String corpsecret) {

        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + corpid + "&corpsecret=" + corpsecret;

        String result = HttpsUtil.sendHttpsRequest(url, "GET");

        String resp = result.toString();
        AccessTokenEntity accessTokenEntity = JSON.parseObject(resp, AccessTokenEntity.class);

        return accessTokenEntity;
    }

    public static UseridEntity getUserid(String accessToken, String code) {
        String url = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token="
                + accessToken + "&code=" + code;
        String result = HttpsUtil.sendHttpsRequest(url, HttpConst.METHOD_GET);
        return JSON.parseObject(result, UseridEntity.class);
    }
}
