package com.example.arz;

import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class ApiClient {

//    private static Retrofit retrofit = null;

    final HttpParams httpParams = new BasicHttpParams();

    private static ApiClient instance = null;
    private Api myApi;

    private ApiClient() {
//        OkHttpClient client = new OkHttpClient();

//        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
        OkHttpClient client = new OkHttpClient();
//
//        client.setConnectTimeout(10, TimeUnit.SECONDS);
//        client.setReadTimeout(30, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://178.63.184.227/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(Api.class);
    }

    public static synchronized ApiClient getInstance() {
        if (instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }

    public Api getMyApi() {
        return myApi;
    }
//    static Retrofit getClient() {
//
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
//
//
//        retrofit = new Retrofit.Builder()
////                .baseUrl("http://192.168.43.11:5000/getcontactjson?imei=358436073896700")
//                .baseUrl("http://192.168.43.11:5000/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build();
//
//
//
//        return retrofit;
//    }
}
