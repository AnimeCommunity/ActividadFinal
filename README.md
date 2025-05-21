# 📚 Java University Management System

Este proyecto es una aplicación en Java para gestionar profesores, estudiantes y clases de una universidad. Fue desarrollado como ejercicio final del módulo de fundamentos de Java del Bootcamp de Globant aplicando principios de programación orientada a objetos (OOP).

## 🧠 Funcionalidades

- Registrar y visualizar profesores (tiempo completo y medio tiempo)
- Crear y listar clases universitarias con su profesor y estudiantes
- Agregar estudiantes a clases existentes
- Crear nuevos estudiantes y clases
- Buscar las clases en las que está inscrito un estudiante por su ID
- Menú interactivo para realizar operaciones básicas

## 🏗️ Estructura del Proyecto

```bash
src/
├── com.globant.university/
│   ├── Main.java
│   ├── ui/
│   │   └── Menu.java
│   ├── model/
│   │   ├── Teacher.java
│   │   ├── FullTimeTeacher.java
│   │   ├── PartTimeTeacher.java
│   │   ├── Student.java
│   │   └── UniversityClass.java
│   └── service/
│       └── University.java
```

## 🧠 Tecnologías y conceptos aplicados

- Java 12
- Programación orientada a objetos (POO)
    - Encapsulación
    - Herencia
    - Polimorfismo
    - Clases abstractas
- Constructores y sobreescritura de métodos
- Uso de listas (ArrayList)
- Buenas prácticas con modificadores de acceso y nombres de paquetes

## Cómo ejecutar
1. Clona el repositorio:
```bash
git clone https://github.com/AnimeCommunity/ActividadFinal.git
```
2. Abre el proyecto en tu IDE preferido (VSCode, IntelliJ, NetBeans)
3. Ejecuta la clase Main.java ubicada en com.globant.unviersity/.

> [!NOTE]
> No se requiere base de datos ni dependencias externas

## Autores
- Santiago Pineda – @AnimeCommunity

## Licencia
Este proyecto es de uso académico. Puedes usarlo, modificarlo o distribuirlo libremente con fines educativos.