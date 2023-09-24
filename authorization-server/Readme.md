# Test Basic Authorization Server
### Token Generation
* Go to Insomnia and open a new GET request
* From Auth Tab select "oauth2"
* Enter Following Informations:
  * Grant Type: Authorization Code
  * Authorization URL: http://localhost:9000/oauth2/authoriza
  * Access Token URL: http://localhost:9000/oauth2/token
  * Client ID: client (find from property file)
  * Client Secret: secret (find from property file)
  * Use PKCE
  * Redirect URL: http://test
  * Advanced Options:
    * Scope: openid profile
    * Credentials: As Basic Auth Header (default)
* Click Fetch Token Button below

### Token Testing
* In insomnia, open a new POST request
* In body tab, select Multipart form
* Add a mapping of token -> $access_token (copied from generation)
* In auth tab, select Basic
* Fill up the following informations:
  * Username: client (clientID: find from property file)
  * password: secret (cleint secret: find from property file)
