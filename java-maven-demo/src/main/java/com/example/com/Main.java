package com.example.com;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main {

    public static void main(String [] args) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://www.app.sionnah.com/nodejsApp/dashboard/counts/1/Manager")
                .build();

        Response response = client.newCall(request).execute();
        String msg = response.body().string();
        System.out.println(msg);
    }
}


//https://www.app.sionnah.com/nodejsApp/dashboard/counts/1/Manager