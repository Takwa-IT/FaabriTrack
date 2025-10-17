pipeline { 
    agent any 
     
    stages { 
        stage('Checkout') { 
            steps { 
                // Récupère le code source depuis le dépôt Git 
                git 'https://github.com/Takwa-IT/FaabriTrack.git' 
            } 
        } 
         
        stage('Build') { 
            steps { 
                // Compiler le code (exemple pour un projet Node.js) 
                sh 'npm install -g @angular/cli' 
            } 
        } 
         
        stage('Test') { 
            steps { 
                // Exécuter des tests unitaires 
                sh 'npm test' 
            } 
        } 
         
        stage('Archive') { 
            steps { 
                // Archiver un artefact (exemple pour un fichier 
zip) 
                archiveArtifacts artifacts: '**/dist/*.zip', 
allowEmptyArchive: true 
            } 
        } 
    } 
} 
