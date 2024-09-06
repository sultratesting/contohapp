# Gunakan image Java dan Maven untuk build
FROM maven:3.3-jdk-8

# Set working directory di dalam container
WORKDIR /app

# Salin semua file dari direktori host ke container
COPY demo /app

# Jalankan perintah Maven untuk membangun dan menjalankan test
RUN mvn clean install