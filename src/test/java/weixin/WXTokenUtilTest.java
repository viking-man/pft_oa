package weixin;

import org.springframework.util.Assert;
import param.GlobleConstant;
import weixin.entity.AccessTokenEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-20:41
 */
public class WXTokenUtilTest {

    public static void main(String[] args) {
        AccessTokenEntity accesstoken = WXTokenUtil.getAccesstoken(GlobleConstant.WEIXIN_CorpID, GlobleConstant.WEIXIN_Secret);
        System.out.println(accesstoken.getAccess_token());
        Assert.notNull(accesstoken);

    }

}