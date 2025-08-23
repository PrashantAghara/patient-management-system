### RUN APPLICATION LOCALLY (DOCKER)
#### Create network
```shell
docker network create internal
```

#### Run PostgreSQL Image
```shell
docker run --name patient-service-db -p 5432:5432 -e POSTGRES_DB="db" -e POSTGRES_USER="admin" -e POSTGRES_PASSWORD="password" --network internal -v D:\spring-projects\db_volumes\patient-service-db:/var/lib/postgresql/data postgres
```

#### Build Java Application Image
```shell
 docker build -t patient-service:latest . 
```

#### Run the Java Application Image
```shell
 docker run --rm --name patient-service -p 4000:4000 -e SPRING_DATASOURCE_URL="jdbc:postgresql://patient-service-db:5432/db" -e SPRING_DATASOURCE_USERNAME="admin" -e SPRING_DATASOURCE_PASSWORD="password" -e SPRING_DATASOURCE_DRIVER_CLASS_NAME="org.postgresql.Driver" -e SPRING_JPA_HIBERNATE_DDL_AUTO="update" -e SPRING_SQL_INIT_MODE="always" --network internal patient-service:latest
```