# Bookshelf App 📚

Aplicación móvil nativa para Android que permite explorar un catálogo de libros utilizando la **Google Books API**. La interfaz está construida con un enfoque declarativo y moderno para ofrecer una experiencia de usuario fluida.

## Características Principales
* **Búsqueda Dinámica:** Consumo de la API de Google Books (endpoint `/volumes`) para obtener resultados en tiempo real.
* **Carga de Imágenes:** Integración para mostrar las portadas de los libros de forma asíncrona.
* **Gestión de Estados:** Manejo de estados de carga, éxito y error en la conexión (incluyendo el manejo del código HTTP 429).
* **Seguridad:** Implementación de API Key privada a través de Google Cloud Console.

## Tecnologías Utilizadas
* **Lenguaje:** Kotlin
* **UI:** Jetpack Compose
* **Arquitectura:** MVVM (Model-View-ViewModel)
* **Red:** Retrofit2 y OkHttp
* **Serialización:** kotlinx.serialization
* **Carga de Imágenes:** Coil
* **Concurrencia:** Corrutinas (Coroutines)

