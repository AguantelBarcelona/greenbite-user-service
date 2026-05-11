# GreenBite - User Service

Este microservicio es el encargado de la gestión de identidades, perfiles de usuario y preferencias de sostenibilidad dentro del ecosistema GreenBite.

## 🏗️ Rol en la Arquitectura
Dentro de la arquitectura de microservicios, el **User Service**:
- Gestiona la persistencia de datos de usuario (Patrón Database per Service).
- Expone endpoints consumidos por el **BFF**.
- Mantiene el aislamiento de la lógica de negocio de perfiles.

## 🛠️ Stack Tecnológico
- **Java**: 17/21
- **Framework**: Spring Boot 3.2.5
- **Gestor de Dependencias**: Maven
- **Puerto de ejecución**: 8081

## 🚀 Instalación y Compilación
Para compilar el proyecto y generar el archivo JAR:
\`\`\`bash
mvn clean install
\`\`\`

Para ejecutar el servicio localmente:
\`\`\`bash
mvn spring-boot:run
\`\`\`

---
*Desarrollado por Jairo Huaman - Vicente Sanchez - Braulio Sanchez*
EOF
