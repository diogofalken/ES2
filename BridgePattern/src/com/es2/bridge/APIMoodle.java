package com.es2.bridge;


import java.util.LinkedHashMap;
import java.util.UUID;

public class APIMoodle implements APIServiceInterface {
    protected LinkedHashMap<String, String> content = new LinkedHashMap<String, String>();

    public APIMoodle() {
    }

    @Override
    public String getContent(String contentId) {
        String output = new String();

        // When this parameter is "0", returns the all contents concatenated
        if(contentId.equals("0"))
            for(String cur : content.values()) {
                output += cur;
            }
        else {
            output = content.get(contentId);
        }

        return output;
    }

    @Override
    public String setContent(String content) {
        String contentId = UUID.randomUUID().toString(); // Get random ID
        this.content.put(contentId, content); // Add the random ID and the content info to hashmap

        return contentId;
    }
}