package util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void send0kHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
