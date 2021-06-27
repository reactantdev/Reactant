dependencies {
    compileOnly("org.spigotmc:spigot-api:${System.getProperty("spigotAPIVersion")}")
}

tasks.generateSpigotPluginConfig {
    spigotPluginConfig {
        main = "dev.reactant.config.ReactantConfig"
    }
}
