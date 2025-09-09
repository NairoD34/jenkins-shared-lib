def call(String version = null) {
    def gitCommit = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
    def timestamp = new Date().format('yyyyMMdd-HHmm')
    
    if (version) {
        return "${version}-${gitCommit}"
    } else {
        return "${timestamp}-${gitCommit}"
    }
}
