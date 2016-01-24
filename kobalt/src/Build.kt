
import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.java.javaProject
import com.beust.kobalt.plugin.kotlin.kotlinCompiler
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.repos

val repos = repos()


val p = javaProject {

    name = "KotlinPlayground"
    group = "com.example"
    artifactId = name
    version = "0.1"

    sourceDirectories {
        path("src")
    }



    assemble {
        jar {
        }
    }

    application {
        mainClass = "JT"
//        mainClass = "KT"
//        mainClass = "main.KT"
//        mainClass = "main.MainKt"
    }


}


