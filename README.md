# Prueba Técnica Konecta

## Prerequisitos

- **Java** (versión 8 o superior)
- **Maven**
- **MySQL**

## Compilación

Desde el directorio `pruebatecnica` ejecute:

```bash
mvn package
```

Esto generará el archivo `.jar` dentro de la carpeta `target`.

## Endpoints disponibles

- `GET /api/empleados` – Lista todos los empleados.
- `POST /api/empleados` – Crea un nuevo empleado.
- `GET /api/solicitudes` – Lista las solicitudes.
