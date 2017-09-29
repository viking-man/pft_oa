package util;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-20:07
 */
public abstract class HttpsUtil {

    public static String sendHttpsRequest(String requesrUrl, String method) {
        try {
            URL url = new URL(requesrUrl);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();

            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);

            httpsURLConnection.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream(), "UTF-8"));
            String line;
            // 读取返回的内容
            StringBuffer result = new StringBuffer();
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
