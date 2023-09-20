# roomDB

# 1. Agregar dependencias y Plugin build.gradle(:app)

dependencies {

    def room_version = "2.5.0"

    //Room components
    implementation("androidx.room:room-runtime:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    androidTestImplementation "androidx.room:room-testing:2.5.2"

    //Lifecycle components
    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
    implementation "androidx.lifecycle:lifecycle-common-java8:2.6.2"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2"

    // Kotlin components
    api "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5"
    api "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5"

    ...
}

plugins {
    ...
    id 'kotlin-kapt'
}

# 2. Crear entidad  User.kt

# 3. Crear DAO  UserDao.kt

# 4. Crear Database  AppDatabase.kt

# 5. Crear Repository  UserRepository.kt

# 6. Crear ViewModel  UserViewModel.kt

# 7. Crear y seleccionar datos FirstFragment.kt 
     fun insertDataToDatabase()
     Nota: Al correr la app, dar clic en botón NEXT para crear y mostrar registro en consola.

# Opcional

Instalar Manejador Base de Datos <DB Browser for SQLite> 

¿Dónde se encuentra mi BD físicamente?

En el menú lateral derecho de Android, 
- Abrir Device File Explorer > data > data > com.example.myapplication > databases

¿Cómo la puedo consultar?

- Copiar los siguientes archivo a la ubicación que quieras.

user_database
user_database-shm
user_database-wal

- Abrir manejador de Base de Datos
1. Clic en Open Database, seleccionar archivo <user_database>
2. Cambiar a pestaña Browser y en el menú desplegable <tabla> seleccionar <user_tabla> 











