package pl.wgie.ClaimBPMS.rest;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CamundaRestController implements CommandLineRunner {

    @Autowired
    RestTemplate camunda;

    private String camundaEndpoint = "http://localhost:8080/engine-rest/process-definition/WatchMunster/start";

    private void callRestService() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>("{}", headers);
        System.out.println(entity.getHeaders());
        System.out.println(entity.getBody());

        ResponseEntity<JsonNode> sth = camunda.exchange(camundaEndpoint, HttpMethod.POST, entity, JsonNode.class);//postForEntity(camundaEndpoint, entity, JsonNode.class);
        System.out.println(sth.getStatusCode());
    }

    @Override
    public void run(String... args) throws Exception {
        callRestService();
    }
}
