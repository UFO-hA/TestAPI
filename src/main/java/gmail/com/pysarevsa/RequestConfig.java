package gmail.com.pysarevsa;

import java.util.Map;

public class RequestConfig {
    private Map<String, String> queryParams;
    private String uri;

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(Map<String, String> queryParams) {
        this.queryParams = queryParams;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

