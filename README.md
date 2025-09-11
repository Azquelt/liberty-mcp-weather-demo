## Liberty MCP Weather Demo

### Instructions

- Update `gradle.properties` with the path to your liberty server
- Start the server and deploy the app by running `./gradlew libertyStart`
- The server should start and the MCP endpoint is available at `http://localhost:9080/liberty-mcp-weather-demo/mcp`

### Shutdown

- Shut down the server with `./gradlew libertyStop`
- If you update or rebuild the liberty server, you must also run `./gradlew cleanDirs` to clean the liberty workspace directory
