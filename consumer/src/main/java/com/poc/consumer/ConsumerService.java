package com.poc.consumer;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restCaller;

    public String getBooksFromProducer() {
        String json = this.restCaller.getForEntity("http://localhost:8086/producer/books", String.class).getBody().toString();
        JSONObject jsonObject = new JSONObject(json);
        JSONArray array = jsonObject.getJSONArray("entries");
        JSONArray edited = new JSONArray();
        for (int i = 0; i < array.length(); i++) {
            JSONObject temp = array.getJSONObject(i);
            temp.remove("url");
            temp.remove("seed_count");
            temp.remove("full_url");
            edited.put(temp);
        }

        return edited.toString();
    }

}


