def call(String message, String status = 'INFO') {
    echo "📧 Notification [${status}]: ${message}"
    
    // Ici tu peux ajouter l'intégration Slack/Email plus tard
    if (status == 'SUCCESS') {
        echo "✅ Build réussi ! ${message}"
    } else if (status == 'FAILURE') {
        echo "❌ Build échoué ! ${message}"
    } else {
        echo "ℹ️ ${message}"
    }
}
