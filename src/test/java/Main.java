
import com.Util;
import okhttp3.*;
import org.bouncycastle.util.encoders.Base64;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
/**
 * @author: Seayon
 * @date: 2017/12/31
 * @time: 18:45
 */

/**
 * JSON
 */
public class Main {
    public static void main(String[] args) {
        String sessionid = "zS7m19dyi83wQIJmpDKX5qWcumYPUx1f8KNkxk1LG8e8CIcZ8emXs2cx0XFslY1q8k1WctCLXCXGUrdk4wgC3VuQf1qsvIUH0LzxnB2zAmLZH3I2Kt4gVSLOrMcTp8xwBFNNfl9fNXrd4gq8qBy73w==";
        String score = "100";
        String times = "700";
        String result = Util.postData(score, sessionid);
        System.out.println(result);
    }
}
