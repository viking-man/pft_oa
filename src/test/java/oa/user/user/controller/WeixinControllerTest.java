package oa.user.user.controller;

import org.springframework.util.Assert;
import param.GlobleConstant;
import param.WeiXinConstant;
import weixin.AesException;
import weixin.WXBizMsgCrypt;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/14-9:47
 */
public class WeixinControllerTest {

    public static void main(String[] args) throws AesException {
        WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(WeiXinConstant.WEIXIN_Token, WeiXinConstant.WEIXIN_EncodingAESKey, WeiXinConstant.WEIXIN_CorpID);
        String sEchoStr = wxcpt.VerifyURL("a3d8ab742076b33bdd82d7509307bc467ae5775f", "1505286344", "1914669602", "mZ7xWuvj6bgPg6KgLAQRkpR5TVYfezjca7+pnMWuw+6JYGYeUrp3ycVPD70ApzLQ4nfLcNgu7od/hhB2FRj/Cw==");
        Assert.notNull(sEchoStr);
    }
}