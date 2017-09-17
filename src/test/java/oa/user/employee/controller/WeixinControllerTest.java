package oa.user.employee.controller;

import org.springframework.util.Assert;
import param.GlobleConstant;
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
        WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(GlobleConstant.WEIXIN_Token, GlobleConstant.WEIXIN_EncodingAESKey, GlobleConstant.WEIXIN_CorpID);
        String sEchoStr = wxcpt.VerifyURL("a3d8ab742076b33bdd82d7509307bc467ae5775f", "1505286344", "1914669602", "mZ7xWuvj6bgPg6KgLAQRkpR5TVYfezjca7+pnMWuw+6JYGYeUrp3ycVPD70ApzLQ4nfLcNgu7od/hhB2FRj/Cw==");
        Assert.notNull(sEchoStr);
    }
}