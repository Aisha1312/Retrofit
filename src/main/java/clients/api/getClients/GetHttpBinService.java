package clients.api.getClients;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface GetHttpBinService {

        @GET("/get")
        @Headers({
                "accept: application/json",
        })
        Call<GetHttpBinResponse> getHttp();
}
