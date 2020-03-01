package com.es2.bridge;

public class APIRequestContentAggregator extends APIRequest {
    public APIRequestContentAggregator() {
    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if(services.containsKey(serviceId) == false) {
            throw new ServiceNotFoundException();
        }

        return services.get(serviceId).getContent(contentId);
    }
}
