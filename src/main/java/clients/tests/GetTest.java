package clients.tests;
import clients.api.getClients.GetHttpBinClient;
import clients.api.getClients.GetHttpBinResponse;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class GetTest {
    private final String EXPECTED_HOST="httpbin.org";
    private final String EXPECTED_ACCEPT_ENCODING="gzip";

    @Test
    void getHttpBinTest(){
        GetHttpBinResponse getHttpBinResponse = new GetHttpBinClient().getHttpBinResponse();
        GetHttpBinResponse.Headers headersInResponseBody = getHttpBinResponse.getHeaders();
        String actualAcceptEncoding = headersInResponseBody.getAcceptEncoding();
        String actualHost = headersInResponseBody.getHost();
        System.out.println("the response is "+ actualAcceptEncoding);
        System.out.println("the response is "+ actualHost);
        assertEquals(actualAcceptEncoding.equals(EXPECTED_ACCEPT_ENCODING), true);
        assertEquals(actualHost.equals(EXPECTED_HOST), true);
    }
}
