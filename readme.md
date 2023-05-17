# Spring PetClinic Sample Application

Spring Boot ではなく、Spring Framework で OpenTelemetry を計装するテストとして下記サンプルアプリケーションをフォークして使用する。
Original: <https://github.com/spring-petclinic/spring-framework-petclinic>

## ローカルでの起動方法

### With Maven command line

```bash
git clone https://github.com/spring-petclinic/spring-framework-petclinic.git
cd spring-framework-petclinic
./mvnw jetty:run-war
# For Windows : ./mvnw.cmd jetty:run-war
```

You can then access petclinic here: [http://localhost:8080/](http://localhost:8080/)
