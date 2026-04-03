FROM eclipse-temurin:17

WORKDIR /app

COPY . .

CMD ["tail", "-f", "/dev/null"]