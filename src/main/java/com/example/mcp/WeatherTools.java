package com.example.mcp;

import io.openliberty.mcp.annotations.Tool;
import io.openliberty.mcp.annotations.ToolArg;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class WeatherTools {
    
    @Inject
    private WeatherToolsClient weatherClient;
    
    @Tool(name = "getForecast", description = "Get weather forecast for a location.")
    public String getForecast(@ToolArg(name = "latitude", description = "Latitude of the location") String latitude,
                              @ToolArg(name = "longitude", description = "Longitude of the location") String longitude) {
        return weatherClient.getForecast(
                Double.parseDouble(latitude),
                Double.parseDouble(longitude),
                4,
                "temperature_2m,snowfall,rain,precipitation,precipitation_probability");
    }
}
