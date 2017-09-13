package util;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.cert.CertificateException;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-19:58
 */
public class SSLClient extends CloseableHttpClient {
    public SSLClient() throws Exception {
        super();
        SSLContext ctx = SSLContext.getInstance("TLS");
    }


    protected CloseableHttpResponse doExecute(HttpHost target, HttpRequest request, HttpContext context) throws IOException, ClientProtocolException {
        return null;
    }

    public void close() throws IOException {

    }

    public HttpParams getParams() {
        return null;
    }

    public ClientConnectionManager getConnectionManager() {
        return null;
    }
}
