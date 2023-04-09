package clients.api.getClients;

import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetHttpBinClient{

    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://httpbin.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GetHttpBinService service = retrofit.create(GetHttpBinService.class);


    @SneakyThrows
    public GetHttpBinResponse getHttpBinResponse() {
        Call<GetHttpBinResponse> getResponseCall = service.getHttp();
        GetHttpBinResponse getHttpBinResponse = getResponseCall.execute().body();
        return getHttpBinResponse;
    }

}
