# keycloak-demo

## Run Keycloak using a Docker container

```sh
$ docker run -p 8090:8080 -e KEYCLOAK_USER=carloselpapa10 -e KEYCLOAK_PASSWORD=123456 jboss/keycloak
$ User: carloselpapa10
$ PWD: 123456
```

Note: You can see further information through this link. (https://hub.docker.com/r/jboss/keycloak/)

## Keyclock settings

Once, we logged in to the Keyclock platform, we need to create multiple things mentioned as follow:

	- Realm
	- Rol
	- User
	- Client

Note: You can see further details in this link (https://www.keycloak.org/docs/latest/getting_started/index.html)

To configure spring boot with Keycloack, follow this link (https://www.baeldung.com/spring-boot-keycloak)

Note: the POST request we need to establish to get access_token and refresh_token from keycloac uses x-www-form-urlencoded NOT Json.

### MSc Carlos Avendaño
[Linkedin](https://www.linkedin.com/in/carlos-alberto-avenda%C3%B1o-arango-534b0a137/)

