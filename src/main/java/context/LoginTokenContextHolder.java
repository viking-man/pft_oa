package context;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-15:02
 */
public class LoginTokenContextHolder {

    private static final InheritableThreadLocal<LoginTokenContext> holder = new InheritableThreadLocal<LoginTokenContext>();

    public static LoginTokenContext getLoginContext() {
        return holder.get();
    }

    public static void setLoginContext(LoginTokenContext loginContext) {
        holder.set(loginContext);

    }

    public static void clearLoginContext() {
        holder.set(null);
    }
}
