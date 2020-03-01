package com.es2.bridge;

import java.util.HashMap;
import java.util.UUID;

public class APIRequest {
    protected HashMap<String, APIServiceInterface> services = new HashMap<String, APIServiceInterface>();

    public APIRequest() {
    }

    public String addService(APIServiceInterface service) {
        String serviceId = UUID.randomUUID().toString(); // Get random ID
        this.services.put(serviceId, service);

        return serviceId;

    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if(services.containsKey(serviceId) == false) {
            throw new ServiceNotFoundException();
        }

        return services.get(serviceId).getContent(contentId);
    }

    public String setContent(String serviceId, String content) throws ServiceNotFoundException{
        if(services.containsKey(serviceId) == false) {
            throw new ServiceNotFoundException();
        }

        return services.get(serviceId).setContent(content);
    }
}
