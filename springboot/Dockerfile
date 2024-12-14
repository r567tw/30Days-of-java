# 使用 Maven 官方映像進行構建
FROM maven:3.8.6-eclipse-temurin-17 AS builder

WORKDIR /app

# 複製 pom.xml 和 src
COPY pom.xml .
COPY src ./src

# 使用 Maven 構建 Spring Boot 項目
RUN mvn clean package -DskipTests

# 使用 eclipse-temurin 作為運行時映像
FROM eclipse-temurin:17-jdk

WORKDIR /app

# 從 builder 階段複製構建的 jar 文件
COPY --from=builder /app/target/*.jar /app/app.jar

# 安裝 spring-boot-devtools，允許 hot reload
# RUN mvn dependency:copy-dependencies -DincludeGroupIds=org.springframework.boot -DincludeArtifactIds=spring-boot-devtools

# 運行 Spring Boot 應用
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
