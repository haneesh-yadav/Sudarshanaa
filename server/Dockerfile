# ── Build Stage ──────────────────────────────────────────────────────────────
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
# Cache dependencies separately from source code
COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn -B package -DskipTests

# ── Runtime Stage ─────────────────────────────────────────────────────────────
FROM eclipse-temurin:17-jre-jammy

LABEL org.opencontainers.image.title="Sudarshanaaa-server" \
      org.opencontainers.image.description="Sudarshanaaa backend — Spring Boot 3 / Java 17" \
      org.opencontainers.image.vendor="Sudarshanaaa"

WORKDIR /app

# Run as a non-root user for container security
RUN addgroup --system appgroup && adduser --system --ingroup appgroup appuser
COPY --from=build /app/target/*.jar app.jar
RUN chown appuser:appgroup app.jar
USER appuser

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
