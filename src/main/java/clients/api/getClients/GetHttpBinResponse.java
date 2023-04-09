package clients.api.getClients;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetHttpBinResponse {

    private Args args;
    private Headers headers;
    private String origin;
    private String url;

    @Getter
    public static class Headers{
        @SerializedName("Accept")
        private String accept;
        @SerializedName("Accept-Encoding")
        private String acceptEncoding;
        @SerializedName("Host")
        private String host;
        @SerializedName("Postman-Token")
        private String postmanToken;
        @SerializedName("User-Agent")
        private String userAgent;
        @SerializedName("X-Amzn-Trace-Id")
        private String xAmznTraceId;
    }

    private class Args{
    }

}
