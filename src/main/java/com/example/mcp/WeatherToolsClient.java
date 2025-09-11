package com.example.mcp;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@RegisterRestClient(baseUri = "https://api.open-meteo.com/")
@Path("/v1")
public interface WeatherToolsClient {

    @GET
    @Path("forecast")
    String getForecast(@QueryParam("latitude") double latitude,
                       @QueryParam("longitude") double longitude,
                       @QueryParam("forecast_days") int days,
                       @QueryParam("hourly") String hourly);
}
